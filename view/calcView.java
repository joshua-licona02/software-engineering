package view;

import java.util.Scanner;

public class calcView {
    
    private int num1, num2;

    public int getNum1(){

        Scanner obj1= new Scanner(System.in);

        System.out.println("Enter num 1: ");
        num1 = obj1.nextInt();

        return num1;
    }

    public int getNum2(){

        Scanner obj2= new Scanner(System.in);

        System.out.println("Enter num 2: ");
        num1 = obj2.nextInt();

        return num2;
    }
}
