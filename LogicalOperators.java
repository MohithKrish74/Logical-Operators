package com.keyword;

import java.util.Scanner;

public class LogicalOperators
{
    public static void main(String[] args)
    {
        System.out.print("Enter the Mark: ");
        Scanner in =new Scanner(System.in);
        int Mark = in.nextInt();
        if (Mark>=90 && Mark<=100)
        {
            System.out.println("O Grade!!!");
        }
        else if(Mark<40 || Mark==0)
        {
            System.out.println("E Grade!!!");
        }
    }
}
