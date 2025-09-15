package org.example;

import java.util.function.BiFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VarInLambda {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> add = (var a, var b) -> a + b;
        System.out.println(add.apply(5,7));
    }
}