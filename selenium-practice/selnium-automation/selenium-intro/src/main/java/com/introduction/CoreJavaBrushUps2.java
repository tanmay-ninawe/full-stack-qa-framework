package com.introduction;

import java.util.Arrays;

public class CoreJavaBrushUps2 {

    public static void main(String[] Args) {

    int[] arrayNum2 = {1, 2, 3, 4, 5, 10, 11, 13, 16, 100, 122}; // Array of integers.

    // If-else conditions
        // Print the numbers from the arrayNum2 which can be devided by 2 
         // using regular for loop to print the numbers from the arrayNum2 which can be devided by 2
            for(int i=0; i<arrayNum2.length; i++)
                {
                    if(arrayNum2[i] % 2 == 0)
                    {
                        // System.out.println(arrayNum2[i]);
                    }
                }


         // using enhanced for loop to print the numbers from the arrayNum2 which can be devided by 2
            for( int s : arrayNum2)
            {
                if (s % 2 == 0) //so here we;re not mentioning indexing here the elements of the array will be directly stored in the variable s and we can check the condition for each element of the array.
                {
                    // System.out.println(s);
                }
            }

/*  ====================================
Practice questions : 
=========================================*/
                // Print all numbers greater than 10
                    int[] numbers = {5, 10, 15, 20, 25};
                        for (int num : numbers)
                        {
                            if(num > 10)
                            {
                                // System.out.println(num);
                            }
                        };

                
                
                // Print all names that start with letter 'A'
                String[] names = {"Tanmay", "Rahul", "Amit", "Priya", "Ambani Sir"};
                    
                            for( String name : names)
                            {
                                if(name.startsWith("A"))
                                {
                                    System.out.println(name);
                                }
                            };
                


                // Print sum of all numbers in array
                int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                        int sumall = 0;
                        for (int sum : numbers1)
                        { 
                            sumall = sumall + sum;
                         }
                         System.out.println(sumall);





                // Find and print the largest number
                int[] numbers2 = {3, 7, 2, 9, 4, 1, 8};
                        
                    //method 1
                        Arrays.sort(numbers2); // arrange the elements in accending manner 
                        // System.out.println("Largest number from the array is :"+numbers2[numbers2.length-1]);

                    //method 2
                        int Largest = numbers2[0];
                        for(int i=1; i<numbers2.length; i++)
                        {
                            if(numbers2[i]>Largest) 
                                Largest = numbers2[i];
                        }
                         System.out.println("Largest numb is :" + Largest);



                // Print each number and its index both
                // Expected output:
                // Index 0 = 10
                // Index 1 = 20
                // Index 2 = 30...
                int[] numbers3 = {10, 20, 30, 40, 50};
                int index = 0; 
                    for( int s :numbers3){
                        // System.out.println("Index " + index + "=" + s);
                        index++;
                        }


                for(int i=0; i<numbers3.length; i++)
                {   
                    System.out.println("index " + i + "=" + numbers3[i]);
                }



                    }             
}