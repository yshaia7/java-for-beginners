package com.example.hellowworld;

import java.io.PrintStream;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class HelloWorld {
    private static final int SIZE = 5;
    private PrintStream out;

    public static void main(String[] args){

        //welcomeMessage();

        //variableDeclare();

        //variableAsInput();

        //documentationPractice();

        //operatorsVariableLoopsConditions();

        //array();

        //stringClass();

    }

    private static void stringClass() {
        System.out.println("\nHello from string class, i am very powerful class");
        System.out.println("for more information check the next link" +
                "https://www.w3schools.com/java/java_strings.asp");
    }

    private static void array() {
        System.out.println("\nin java array a little diff");
        System.out.println("in C declare of array is like: int myIntArray[SIZE]");
        System.out.println("in Java declare of array is like: int[] myIntArray = new int[3]\n");
        int[] myIntArray = new int[SIZE];
        for(int i=0; i < SIZE; ++i){
            myIntArray[i] = i;
        }
        for(int i=0; i < SIZE; ++i){
            System.out.println(myIntArray[i]);
        }

        System.out.println("\nfor scan input to array in java check the next example");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[SIZE];
        for (int i = 0; i < myIntArray.length; i++)
        {
            System.out.println("Enter number\n");
            numbers[i] = input.nextDouble();
        }
        System.out.println("\nhere is the array output\n");
        for(int i=0; i < SIZE; ++i){
            System.out.println(numbers[i]);
        }

    }


    private static void operatorsVariableLoopsConditions() {
        System.out.println("\noperators variable loops conditions " +
                "are stay the same in java");
    }

    private static void documentationPractice() {
        System.out.println("\nlets check another documentation " +
                "https://www.programiz.com/java-programming/scanner");
        System.out.println("\nthat next documentation can helped" +
                "https://www.javatpoint.com/Scanner-class\n");
    }


    private static void variableAsInput() {
        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("in java scanner have many options. line example: ");
        System.out.println("enter your name");
        // takes input from the keyboard
        String name = input.nextLine();

        // prints the name
        System.out.println("My name is " + name);

        // closes the scanner
        input.close();
        System.out.println("don't forget to close the input :)");

        System.out.println("with scanner you can scan a lot of options");
        System.out.println("// read input from the input stream\n" +
                "Scanner sc1 = new Scanner(InputStream input);\n" +
                "\n" +
                "// read input from files\n" +
                "Scanner sc2 = new Scanner(File file);\n" +
                "\n" +
                "// read input from a string\n" +
                "Scanner sc3 = new Scanner(String str);");
    }


    private static void variableDeclare() {
        System.out.println("in java it is very simple, we don't need to specify which type to print\n");

        int numInt = 1;
        double numDbl = 1.0;
        long numL = 1;
        System.out.println("i am numInt " + numInt);
        System.out.println("i am numDbl "+ numDbl);
        System.out.println("i am numL\n" + numL);




    }

    private static void welcomeMessage() {

        System.out.println("\nhello and welcome to our first java class\n");

        System.out.println("we will start with the diff between C and java languages\n");

        System.out.println(" C is a Procedural Programming Language whereas Java is an Object-Oriented language.\n" +
                " C is middle level language while Java is high level language.\n" +
                " C does not support threading on the other hand Java has a feature of threading.\n" +
                " C supports pointers but Java does not support pointers.\n" +
                " In C garbage collection needs to managed manually while in Java, it is automatically managed by a garbage collector\n" +
                " C offers support for call by value and call by reference but Java only supports call by value.\n" +
                " In C language memory allocation can be done by malloc while in Java memory allocation can be done by the new keyword\n\n.");
    }


}
