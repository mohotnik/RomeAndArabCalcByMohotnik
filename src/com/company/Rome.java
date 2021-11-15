package com.company;

import java.util.Map;
import java.util.*;
import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class Rome extends Arab {
    public static int romanianToInteger(String romanianNumber)
    {
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        int result = 0;

        for(int i = 0; i < romanianNumber.length(); i++)
        {
            char ch = romanianNumber.charAt(i);

            if(i > 0 && numbersMap.get(ch) > numbersMap.get(romanianNumber.charAt(i - 1)))
            {
                result += numbersMap.get(ch) - 2 * numbersMap.get(romanianNumber.charAt(i-1));
            }

            else
                result += numbersMap.get(ch);
        }

        return result;
    }
    public static String getRomanNumber(int c) {
        return join("", nCopies(c, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C");
    }

    public static String RomeCalculate(String oper, String num1, String num2) {
        int number = romanianToInteger(num1);
        int number2 = romanianToInteger(num2);
        int m = ArabCalculate(oper, number, number2);
        String q = getRomanNumber(m);
        return q;
    }

}