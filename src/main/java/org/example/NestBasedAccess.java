package org.example;

public class NestBasedAccess {
    private String secret = "Java 11 Secret";

    class Inner {
        void reveal() {
            //Can access private member directly
            System.out.println(secret);
        }
    }

    public static void main(String[] args) {
        new NestBasedAccess().new Inner().reveal(); //Output: Java 11 Secret
    }
}
