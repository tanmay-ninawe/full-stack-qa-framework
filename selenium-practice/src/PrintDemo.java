public class PrintDemo {
        
        static int a = 5; // this is a static variable and it can be accessed by all the methods in the class

    public static void main(String[] args) {
     
// the output will be in one line because we are using print method and it will not move to next line 
// until we use println method.
        System.out.print("This programm is with withoun new line 'println'");
        System.out.print("This is second line is with withoun new line 'println'");
        System.out.println("This is third line is with with new line 'println'");




// the output will be in three line because we are using println method and it will move to next line after each print statement.
        System.out.println("This programm is with with new line 'println'");
        System.out.println("This is second line is with with new line 'println'");
        System.out.println("This is third line is with with new line 'println'");


// Print Numbers 
        System.out.println(2);
        System.out.println(3);  
        System.out.println(4);


//Print String
        System.out.println("Hello World + 1" + 2);

//String concatenation
        System.out.println("Hello World + 1" + 2 +  + 3);
        System.out.println("Hello World + 1" + (2 + 3));



//Variables, Data Types, Operators and Literals

        int a = 5;
            System.out.println(a);

        String hello = "This is the String value";
            System.out.println(hello);
    }


    public static void localVariable () {

        int t = 5213;

        System.out.println(t);
    }




    public static void staticVariable () {

        System.out.println(a);
    }
}



