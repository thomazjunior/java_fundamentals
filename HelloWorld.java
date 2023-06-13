class HelloWorld {
    public static void main(String[] args) {
        String helloWorld = "Hello world";
        System.out.println(helloWorld);

        /**
         * 1. Variables:
         * In Java, a variable is a named storage location that holds a value of a
         * specific data type. It allows you to store and manipulate data within a
         * program. To declare a variable, you specify the data type, followed by the
         * variable name.
         */

        int num1 = 2;
        int num2 = 20;

        /**
         * 2. Data Types:
         * Java has two categories of data types: primitive and reference types.
         * a) Primitive Data Types:
         * Numeric types: byte, short, int, long, float, double
         * Character type: char
         * Boolean type: boolean
         * 
         * b) Reference Data Types:
         * Reference types refer to objects. They include classes, interfaces, and
         * arrays. Reference types hold references to objects rather than actual data.
         */

        // Primitive Data Types
        int age = 25; // declaring an integer variable named "age" and assigning a value
        char grade = 'A'; // declaring a character variable named "grade" and assigning a value
        boolean isStudent = true; // declaring a boolean variable named "isStudent" and assigning a value

        // Reference Data Types
        String name = "John"; // declaring a string variable named "name" and assigning a value

        /**
         * 3. Type Conversion/Casting:
         * Java provides two types of type conversion: implicit (widening) and explicit
         * (narrowing). Implicit conversion occurs automatically when a narrower data
         * type is assigned to a wider data type. Explicit conversion requires manual
         * casting and is necessary when assigning a wider data type to a narrower data
         * type.
         * a) Widening Conversion (Implicit):
         * Widening conversion occurs when a value of a narrower data type is assigned
         * to a variable of a wider data type. It happens automatically without any loss
         * of data.
         * 
         * b) Narrowing Conversion (Explicit):
         * Narrowing conversion involves manually casting a value of a wider data type
         * to a variable of a narrower data type. It may result in loss of data or
         * precision.
         */

        int num = 10;
        double result = num; // int to double (widening conversion)

        double decimal = 3.14;
        int rounded = (int) decimal; // double to int (narrowing conversion)

        /**
         * 4. Type Promotion:
         * Type promotion refers to the automatic conversion of operands to a common
         * data type before performing certain operations, such as arithmetic
         * operations.
         * 
         */
    }
}