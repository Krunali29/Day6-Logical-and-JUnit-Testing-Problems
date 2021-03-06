package com.bridgelabz.ProgramsForJUnitTesting;
//Programs for J Unit Testing
//Que.7
//Write Binary.java to read an integer as an Input, convert to Binary using toBinary function and perform the following functions.
import java.util.Scanner;
public class Binary
{
    static void showArr(int[] arr)
    {
        // System.out.println("array is ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    //to check the for power of 2
    static boolean powerOf2(int n)
    {
        // calculate power of 2 using math.pow
        // check if is equal to given no
        // stops if pow is greater than given number
        int i = 0, temp = (int) Math.pow(2, i);
        while (temp < n)
        {
            if (temp == n)
            {
                return true;
            }
            i++;
        }
        return false;
    }
    //Function to swap nibbles in array
    static int[] swapNibbles(int[] arr)
    {
        // swap nibbles at first and last of the array
        // j is used for saving last 4 index of the array
        int temp, j = arr.length - 4;
        for (int i = 0; i < 4; i++)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
        return arr;
    }
    //main function/method to test Binary class
    public static void main(String[] args)
    {

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("enter a no");
            int[] binary = Util.toBinary(s.nextInt());
            System.out.println("binary is ");
            Binary.showArr(binary);
            s.close();
            Binary.swapNibbles(binary);
            System.out.println("after swapping ");
            showArr(binary);
            int swapDec = Util.toDecimal(binary);
            System.out.println("decimal of swapped binary is " + swapDec);

            if (powerOf2(swapDec))
                System.out.println("its power of 2");
            else
                System.out.println("not power of 2");

        } catch (Exception e) {
            System.out.println("enter input as integer ");
        }

    }
}
