package GenericAndCollections.Overriding;

public class Teacher {
    int roolNo;
    String name;
    String subject;

    Teacher(int rollNo, String name, String subject) {
        this.roolNo = rollNo;
        this.name = name;
        this.subject = subject;
    }

    // overridng the toString() method
    public String toString() {
        return roolNo + " " + name + " " + subject;
    }

    public static void main(String[] args) {
        Teacher teacherOne = new Teacher(1, "Berd", "Math");
        Teacher teacherTwo = new Teacher(2, "Jack", "Physic");

        System.out.println("TeacherOne : " + teacherOne.toString());
        System.out.println("TeacherTwo : " + teacherTwo.toString());
    }

}
