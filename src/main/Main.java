package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Hello World!");

        //Задача 2

        double d = 59.8;
        byte b = 127;

        //Задача 3

        int[] myArray = {5, 6, 9, 6, 2};
        int temp = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = temp;

        //средний элемент
        int average = myArray[myArray.length/2];
        int sum = average+myArray[0];

        System.out.println(sum);

        //задача 4
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int av = (x+y+z)/3;
        System.out.println(av);
        double dc = Math.floor(av/2);
        if (dc>3){
            System.out.println("Программа выполнена корректно");
        }

        //задача 5
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        double a4;
        char a3 = in.next().charAt(0);

        switch (a3){
            case '*': a4 = a1*a2;
            break;
            case '/': a4 = a1/a2;
            break;
            case '-': a4=a1-a2;
            break;
            default: a4=a1+a2;
            break;
        }
        System.out.println(a4);










    }
}
