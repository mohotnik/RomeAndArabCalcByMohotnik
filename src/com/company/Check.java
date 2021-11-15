package com.company;
import static com.company.Arab.ArabCalculate;
public class Check extends Rome {
    public static boolean IsArab(String num) {
        for (int i = 0; i < num.length(); i++) {
            if ((int)num.charAt(i) < 58 && (int)num.charAt(i) > 48){continue;}
            else {return false;}}
        return true;
    }
    public static boolean IsRome(String num) {
        for (int i = 0; i < num.length(); i++) {
            int Ni = (int)num.charAt(i);
            if (Ni == 73 || Ni == 86 || Ni == 88){continue;}
            else {return false;}}
        return true;
    }
    public static String MainCheck(String num, String num2, String oper){
        if (IsArab(num) && IsArab(num2)){
            return("ARAB!");
        }
        else if (IsRome(num) && IsRome(num2)){
            return("ROME!");
        }
        else {
            return("UNKNOWN!");
        }
    }
}

