package com.company;
//import static com.company.Arab.ArabCalculate;
public class Check extends Rome {//В классе Check работают методы из класса Rome
    public static boolean IsArab(String num) {//Метод проверки на то, что число арабское
        for (int i = 0; i < num.length(); i++) {//Бежим по числу
            if ((int)num.charAt(i) < 58 && (int)num.charAt(i) > 48){continue;}//проверяем что каждый символ строки числа является цифрой
            else {return false;}}//если хоть один символ из строки - не цифра - это не арабское число
        return true;//все ок
    }
    public static boolean IsRome(String num) {//Метод проверки на то, что число - римское
        for (int i = 0; i < num.length(); i++) {//Бежим по каждому символу строки, в которой хранится число
            int Ni = (int)num.charAt(i);//смотрим на код символа, на котором мы сейчас остановились
            if (Ni == 73 || Ni == 86 || Ni == 88){continue;}//если этот символ из алфавита римских цифр то всё ок
            else {return false;}}//если не из римских то это не римское число
        return true;//все ок
    }
    public static String MainCheck(String num, String num2, String oper){//Метод главной проверки
        if (IsArab(num) && IsArab(num2)){//Проверка на то, что оба числа арабские
            return("ARAB!");//АРАБСКИЕ
        }
        else if (IsRome(num) && IsRome(num2)){//Оба числа - римские
            return("ROME!");//РИМСКИЕ
        }
        else {//Не АРАБСКИЕ и не РИМСКИЕ, а значит:
            return("UNKNOWN!");//НЕКОРРЕКТНЫЙ ВВОД
        }
    }
}

