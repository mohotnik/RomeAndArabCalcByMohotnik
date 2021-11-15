package com.company;

import java.util.Scanner;
import com.company.Arab;
import com.company.Rome;

public class Main extends Check{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.next();
        String operation = scan.next();
        String num2 = scan.next();
        if (MainCheck(num1, num2, operation) == "ROME!"){
            System.out.println(RomeCalculate(operation, num1, num2));
        }
        else if (MainCheck(num1, num2, operation) == "ARAB!"){
            System.out.println(ArabCalculate(operation, Integer.parseInt(num1), Integer.parseInt(num2)));
        }
        else if (MainCheck(num1, num2, operation) == "UNKNOWN!"){
            System.out.println("throws Exception");
        }

    }
}
