package com.introduction;

public class CoreJavaBrushUps2 {

    public static void main(String[] Args) {

    int[] arrayNum2 = {1, 2, 3, 4, 5, 10, 11, 13, 16, 100, 122}; // Array of integers.

    // Print the numbers from the arrayNum2 which can be devided by 2 
    
         // for(int i=0; i<arrayNum2.length; i++)
            for( int s : arrayNum2)
            {
                if (s % 2 == 0) //so here we;re not mentioning indexing here the elements of the array will be directly stored in the variable s and we can check the condition for each element of the array.
                {
                    System.out.println(s);
                }
            }

}
}
