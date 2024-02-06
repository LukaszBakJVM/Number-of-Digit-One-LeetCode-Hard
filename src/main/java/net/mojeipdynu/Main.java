package net.mojeipdynu;

import java.util.Arrays;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

    }

    public int countDigitOne(int n) {
        return (int) IntStream.rangeClosed(0,n)
                .mapToObj(i->Arrays.stream(String.valueOf(i).split("")))
                .flatMap(Function.identity())
                .filter(one->one.equals("1"))
                .count();


    }
}