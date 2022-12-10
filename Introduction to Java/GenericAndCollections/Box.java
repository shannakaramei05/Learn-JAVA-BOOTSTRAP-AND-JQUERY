package GenericAndCollections;

public class Box<T> {
    // Where T describes the Type of the object use
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    /*
     * EXPLANATION
     * T- > generic class declaration that replaces all instances of the use of an
     * object
     * 
     * __Common letters used by programemsrs often employ specific parameters
     * 
     * E : denotes an element and you will find it employed by the java Collection
     * framework.
     * 
     * K : denotes key and will be employed for pointing to various data object and
     * displaying the object information accrodingly
     * 
     * N : stands for number valie, where we aim to employ them as parameters for
     * the generic code.
     * 
     * T : denotes type. we can employ a particular type that we want to use in the
     * program and this will offer type safety, which is a characteristic feature of
     * generic in java
     * 
     * V : descrive valie. we can employ the type accordingly when we implement this
     * in a generic class or object
     * 
     * S,U,etc : denote that we are employing multiples types. The letters will be
     * denoting them successively. such as S forn 2nd and u for 3rd Types
     */

    public <U extends Number> void inspect(U u) {
        System.out.println("Tclass: " + t.getClass());
        System.out.println("Uclass : " + u.getClass());
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U : " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(15));
        integerBox.inspect(5);
    }
}
