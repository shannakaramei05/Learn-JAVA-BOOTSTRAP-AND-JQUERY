package Operator;

import ObjectAssignment.Animal;
import ObjectAssignment.Dog;

public class Instance {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        if (a instanceof Animal) {
            System.out.println("a is a type of Animal");
        } else {
            System.out.println("a is NOT a type of Animal");
        }

        if (a instanceof Dog) {
            System.out.println("a is a type of Dog");
        } else {
            System.out.println("a is not a Type of Dog");
        }

        if (d instanceof Animal) {
            System.out.println("d is a type of Animal");
        } else {
            System.out.println("d is NOT a type of Animal");
        }

        if (d instanceof Dog) {
            System.out.println("d is a type of Dog");
        } else {
            System.out.println("d is NOT a type of Dog");
        }
    }
}
