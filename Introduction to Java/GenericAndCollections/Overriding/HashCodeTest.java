package GenericAndCollections.Overriding;

import java.io.Console;

public class HashCodeTest {
    public int myVar;

    HashCodeTest(int myVar) {
        this.myVar = myVar;
    }

    public boolean equals(Object o) {
        // We need to check if the object is instrace of Haschode class
        // if not we can safely return false
        if (o instanceof HashCodeTest) {
            HashCodeTest hTest = (HashCodeTest) o;
            if (hTest.myVar == this.myVar) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int hascode() {
        return (myVar * 23); // You can user ur own logic. we tried to multiply by a prime number
    }

    public static void main(String[] args) {
        HashCodeTest test = new HashCodeTest(5);
        System.out.println(test.hascode());

        String myName = "Naka";
        System.out.println(myName.hashCode());
    }
}
