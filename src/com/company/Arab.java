package com.company;

public class Arab {//класс обработки двух арабских чисел
    public static int ArabCalculate(String oper, int num, int num2) {//главная функция класса
        switch (oper) {//какая операция - такое и действие
            case "+":
                return(num + num2);//сумма чисел

            case "-":
                return(num - num2);//разность чисел

            case "*":
                return(num * num2);//произведение чисел

            case "/":
                return (num / num2);//частное чисел

        }
        return num;//на случай ошибки
    }
}
