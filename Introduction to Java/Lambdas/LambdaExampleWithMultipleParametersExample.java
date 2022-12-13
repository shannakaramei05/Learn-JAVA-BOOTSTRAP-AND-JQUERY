package Lambdas;

public class LambdaExampleWithMultipleParametersExample {
    interface reportCard {
        // adding multiple paramters in the lambda expression
        public int marksForSubjects(int math, int physics, int biology, int history, int chemistry);
    }

    public static void main(String[] args) {
        reportCard studentOne = (int math, int physics, int biology, int history,
                int chemistry) -> (math + physics + biology + history + chemistry);

        System.out.println(studentOne.marksForSubjects(80, 90, 80, 80, 90));

        reportCard studentTwo = (int math, int physics, int biology, int history,
                int chemistry) -> (math + physics + biology + history + chemistry);

        System.out.println(studentTwo.marksForSubjects(80, 90, 29, 40, 60));

        reportCard studentThree = (int math, int physics, int biology, int history,
                int chemistry) -> (math + physics + biology + history + chemistry);
        System.out.println(studentThree.marksForSubjects(90, 90, 49, 40, 60));

        reportCard studentFour = (int math, int physics, int biology, int history,
                int chemistry) -> (math + physics + biology + history + chemistry);
        System.out.println(studentFour.marksForSubjects(80, 90, 99, 90, 60));

        reportCard studentFive = (int math, int physics, int biology, int history,
                int chemistry) -> (math + physics + biology + history + chemistry);
        System.out.println(studentFive.marksForSubjects(80, 90, 80, 80, 90));
    }
}
