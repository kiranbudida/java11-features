package org.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Java11");
        System.out.println("isEmpty: " + opt.isEmpty());

        Optional<String> emptyOpt = Optional.empty();
        System.out.println("isEmpty: " + emptyOpt.isEmpty());
    }
}
