package com.introduction;

public class CoreJavaBrushUps1 {

    public static void main(String args[]) {

        // Data Types in Java
            int num = 5; // Integer data type for whole numbers.
            double price = 19.99; // Double data type for decimal numbers.
            String name = ("Tanmay Suresh Ninawe" + " is a software tester and automation engineer."); // String data type for text.with concatenation.
            char grade = 'A'; // Character data type like single characters.
            boolean isJavaFun = true;
            float decimalNum = 69.69f; // Float data type for decimal numbers with less precision than double.
            long bigNum = 123456789L; // Long data type for larger whole numbers.
            
        // Output the values
            System.out.println("Integer: " + num);
            System.out.println("Double: " + price);
            System.out.println("String: " + name);
            System.out.println("Character: " + grade);
            System.out.println("Boolean: " + isJavaFun);
            System.out.println("Float: " + decimalNum);
            System.out.println("Long: " + bigNum);


        //Arrays in java - Arrays can store multiple values in a single variable. 

        // Method 1 of declaring an array.
            int[] arrayNum = new int[5]; // Declaring an array of integers with a size of 5.
            arrayNum[0] = 1;
            arrayNum[1] = 2;
            arrayNum[2] = 3;
            arrayNum[3] = 4;
            arrayNum[4] = 5;

            String[] StringArray = new String[3]; // Declaring an array of strings with a size of 3.
            StringArray[0] = "Amar";
            StringArray[1] = "Akbar"; 
            StringArray[2] = "Anthony";


        // Method 2 of declaring an array.
            int[] arrayName2 = {1, 2, 3, 4, 5}; // Array of integers.
                System.out.println("First element of arrayName2: " + arrayName2[0]); // Accessing the first element of the array.

            String[] names = {"Amar", "Akbar", "Anthony"}; // Array of strings
                System.out.println("First element from the names arrays is : " + names[0]); // Accessing the first element of the array.


        //For loop for arrayNum
            for(int i = 0; i<arrayNum.length; i++) // 
            {
                System.out.println(arrayNum[i]);
            }


        // for loop for arrayName2
            for(int i=0; i<arrayName2.length; i++)
            {
                System.out.println(arrayName2[i]);
            }


        // for loop for StringArray
            for(int i=0; i<StringArray.length; i++)
            {
                System.out.println(StringArray[i]);
            }


        //Enhanced for loop for names array
            for( String s : names)
            {
                System.out.println(s);
            }


        // star pattern
            for (int i=1; i<=5;i++)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

    }

}
