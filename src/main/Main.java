package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задача 1
//        System.out.println("Hello World!");
//
//        //Задача 2
//
//        double d = 59.8;
//        byte b = 127;
//
//        //Задача 3
//
//        int[] myArray = {5, 6, 9, 6, 2};
//        int temp = myArray[0];
//        myArray[0] = myArray[myArray.length-1];
//        myArray[myArray.length-1] = temp;
//
//        //средний элемент
//        int average = myArray[myArray.length/2];
//        int sum = average+myArray[0];
//
//        System.out.println(sum);
//
//        //задача 4
        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int z = in.nextInt();
//        int av = (x+y+z)/3;
//        System.out.println(av);
//        double dc = Math.floor(av/2);
//        if (dc>3){
//            System.out.println("Программа выполнена корректно");
//        }
//
//        //задача 5
//        int a1 = in.nextInt();
//        int a2 = in.nextInt();
//        double a4;
//        char a3 = in.next().charAt(0);
//
//        switch (a3){
//            case '*': a4 = a1*a2;
//                System.out.println(a4);
//            break;
//            case '/': a4 = a1/a2;
//                System.out.println(a4);
//            break;
//            case '-': a4=a1-a2;
//                System.out.println(a4);
//            break;
//            case '+': a4=a1+a2;
//                System.out.println(a4);
//                break;
//            default: System.out.println("Введите одну из доступных операций: +, -, /, *");
//            break;
//        }

        //задача 6


        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int a6 = in.nextInt();
        switch (a6){
            case 1: System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - пуд, 3 - унции, 4 - английские фунты");
                int a7 = in.nextInt();
                System.out.println("Введите число");
                int a9 = in.nextInt();
                switch (a7){
                    case 1: System.out.println("Килограммы = "+ a9 +", Пуды = "+ a9*16.38 +", Унции = "+0.0283*a9+", Английские фунты = "+ a9*0.4536+" ");
                    break;
                    case 2: System.out.println("Килограммы = "+ a9/16.38 +", Пуды = "+ a9 +", Унции = "+0.0283*(a9/16.38)+", Английские фунты = "+ (a9/16.38)*0.4536+" ");
                    break;
                    case 3: System.out.println("Килограммы = "+ a9/0.0283 +", Пуды = "+ (a9/0.0283)*16.38 +", Унции = "+9+", Английские фунты = "+ (a9/0.0283)*0.4536+" ");
                    break;
                    case 4: System.out.println("Килограммы = "+ a9/0.4536 +", Пуды = "+ (a9/0.4536)*16.38 +", Унции = "+0.0283*(a9/0.4536)+", Английские фунты = "+ a9+" ");
                    break;
                    default:
                        break;
                }
            break;
            case 2: System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int a8 = in.nextInt();
                System.out.println("Введите число");
                int a10 = in.nextInt();
                switch (a8){
                    case 1: System.out.println("Метры = "+ a10 +", Мили = "+ a10*0.0006214 +", Ярды = "+1.0936*a10+", Футы = "+ a10*3.2808+" ");
                        break;
                    case 2: System.out.println("Метры = "+ a10/0.0006214 +", Мили = "+ a10 +", Ярды = "+1.0936*(a10/0.0006214)+", Футы = "+ (a10/0.0006214)*3.2808+" ");
                        break;
                        case 3: System.out.println("Метры = "+ a10/1.0936 +", Мили = "+ (a10/1.0936)*0.0006214 +", Ярды = "+a10+", Футы = "+ (a10/1.0936)*3.2808+" ");
                        break;
                    case 4: System.out.println("Метры = "+ a10/3.2808 +", Мили = "+ (a10/3.2808)*0.0006214 +", Ярды = "+(a10/3.2808)*1.0936+", Футы = "+ a10+" ");
                        break;
                    default:
                        break;
                }
            break;

        }

        //Задача 7

        int x = 1;
        int y = 157;
        int z = 361;
        System.out.println("Введите длину массива");
        int mas = in.nextInt();
        int[] mass = new int[mas];
        System.out.println("Введите числа в массив");
        for (int i=0; i<mass.length; i++){
            mass[i] = in.nextInt();
        }
        for (int i=0; i<mass.length; i++){
            if(mass[i]==x || mass[i]==y || mass[i]==z){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }

        //Задача 8
        System.out.println("Введите любое положительное число");
        int r = in.nextInt();
        int sum = 0;
        for(int i=0; i<r; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел:  "+ sum +" ");















    }
}
