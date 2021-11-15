package com.company;

public class Arab {
    public static int ArabCalculate(String oper, int num, int num2) {
        switch (oper) {
            case "+":
                return(num + num2);

            case "-":
                return(num - num2);

            case "*":
                return(num * num2);

            case "/":
                return (num / num2);

        }
        return num;
    }
}
