package com.yyk.hellper.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionEx {

    public static void main(String[] args) {
        printString(Member::getAge);
    }

    private static List<Member> list = Arrays.asList(
            new Member("yyk", 10),
            new Member("yyk1", 20)
    );

    public static void printString(Function<Member, Object> function){
        for(Member m : list){
            System.out.println(function.apply(m) + " ");
        }
        System.out.println();
    }
}
