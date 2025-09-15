package org.example;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello Java 11     ";

        System.out.println("isBlank: " + str.isBlank());
        System.out.println("strip: '" + str.strip() + "'");
        System.out.println("stripLeading: '" + str.stripLeading() + "'");
        System.out.println("stripTrailing: '" + str.stripTrailing() + "'");

        String empty = "    ";
        System.out.println("isBlank: "+ empty.isBlank());

        String multiline = "Line1\nLine2\nLine3";
        multiline.lines().forEach(System.out::println);

        String repeated = "Hi".repeat(3);
        System.out.println("Repeat: "+ repeated);
    }
}
