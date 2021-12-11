package com.company;

import java.util.Scanner;//считывание с экрана
import com.company.Arab;//обработка арабских чисел
import com.company.Rome;//обработка римских чисел

public class Main extends Check{//главный класс
    public static void main(String args[]) {//главная функция
        Scanner scan = new Scanner(System.in);//создание строки из потока ввода
        String num1 = scan.next();//считывание первого числа в строку
        String operation = scan.next();//считывание операции
        String num2 = scan.next();//считывание второго числа в строку
        if (MainCheck(num1, num2, operation) == "ROME!"){//Проверка на случай если оба числа римские
            System.out.println(RomeCalculate(operation, num1, num2));//Обрабокта римских чисел
        }
        else if (MainCheck(num1, num2, operation) == "ARAB!"){//Проверка на случай, если оба числа - арабские.
            System.out.println(ArabCalculate(operation, Integer.parseInt(num1), Integer.parseInt(num2)));//Обработка арабских чисел
        }
        else if (MainCheck(num1, num2, operation) == "UNKNOWN!"){//Некорректный ввод
            System.out.println("throws Exception");//Генерация исключения из-за некорректного ввода
        }

    }
}
