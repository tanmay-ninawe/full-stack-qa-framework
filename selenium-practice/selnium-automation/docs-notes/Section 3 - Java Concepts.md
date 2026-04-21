 Introduction to Java variables and Data types with examples- 

# Variables & Datatypes Summary with Example
- Variables store data in your program, like numbers, text, or logical values.
- Every variable must be declared with a datatype that tells Java what kind of data it holds (e.g., integer, text).

Data Types : 
- int age = 22; 
- char grade = 'B';
- boolean isActive = false;
- String name = "Tanmay Suresh Ninawe";		
- float height = 5.7f;  		→  Use 'f' for - float values.  Decimal values can be stored in both data types.
- double salary = 60000.75;             → Decimal values can be stored in both data types.

// String concatenation
- System.out.println(Name + " this is my Full name stored in Name variable");



# Arrays : 
- Arrays can store multiple values in a single variable. 
- Syntax : they’re 2 method to initialize array 	
> Method 1 : 
-   int[] arrayName = new int[10]; 
	- 		→ here arrayName is Variable name.
	- 		→ int[] : we;re telling java this is an array of integer datatypes.
	- 		→ new : is a memory allocation for this array. 
	-		→ int[5] : this is the length. Or this array will hold 10 values .
// assigning the values in array index
int[] arrayName = new int[10]; 
arrayName[0] = 1;
arrayName[1] = 5;
arrayName[2] = 18;
		|
		|
arrayName[9] = 2;

Method 2 : 

Int[] intValues = {1, 5, 18, 3 ……., 11, 2};
		→ to access the items from this given array use 
			System.out.println(intValues[2]);  
				→ output will be 18 as because at 2nd index 18 is there in array
