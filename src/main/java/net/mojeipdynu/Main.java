package net.mojeipdynu;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public int countDigitOne(int n) {
        if (n < 0) {
            return 0;
        }
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String s = str.append(i).toString();
            List<String> strings = Arrays.stream(s.split("")).filter(f -> f.equals("1")).toList();
            count += strings.size();
            str.setLength(0);
        }

        return count;

    }
}