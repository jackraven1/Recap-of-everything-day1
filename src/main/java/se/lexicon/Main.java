package se.lexicon;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Variables: Used to Temporarily store data in computers Memory  */
        int age = 20; /* initializing a variable = giving it a value */
        /* int is a type of variables , age is an identifier = name of variable , 30 = value */

        //----------------------------------------------------------------------------
                                  /* Primitive Types */

                      /* we use primitive types to store simple values*/
        // For whole numbers we use :
        byte a = 1 ; // range [-128,127] , number of Bytes in memory = 1
        short b = 1 ; // range [-32K,32K] , number of Bytes in memory = 2
        int c = 1 ; // range [-2B,2B] , number of Bytes in memory = 4
        long d = 1L ; // range [Very large] , number of Bytes in memory = 8
        // For Decimal numbers we use :
        float e = 2.4F; // number of Bytes in memory = 4
        double f = 3.5 ; //  number of Bytes in memory = 8
        // For characters  like letters or symbolises we use :
        char g = '*' ; //  number of Bytes in memory = 2
        // for comparing we use :
        boolean h = true ; // True/False ,number of Bytes in memory = 2

                                         /* Tricks */

        // in java you can use _ to separate a long number to make it more readable
        int people = 12_334_565_67;
        long peoples = 3_233_456_567L;// we use l at the end of long so the compiler understand it's a long not int
        float pens = 2.3f;// we use f at the end of long so the compiler understand it's a float not double
        char star = '*'; // we use single ' when defining one character and ¨ when we have multiple characters
        boolean isRight = false; // naming for identifiers  followS camelcase naming convention

                                   /* Reference Types*/

                    /* we use reference types to store complex objects */
               /* any other type other of primitive type is reference type */
        Date now = new Date();
        //Date is a class , now is an object => so object is an instance of class
        // we use new to allocate memory of the reference type unlike primitive which is done automatically
        // we use dot . to access the members defined in a class
        System.out.println(now);
                          /* the deference between Primitive and Reference type */
        // primitive type are allocated independently in the memory
        // Reference type refer to address of an object in memory

        //------------------------------------------------------------------------------------------------
                                        /* Strings */

        String message = new String("jack");
        System.out.println(message);
        // since strings are used often in java you can create them like this instead
        String m = "hello";
        // we can join strings using + sign
        String mm = "hello" + "world";
        // since String is a class we can use its members using dot sign . examples :
        //.length(); // the length of strings
        // .trim(); remove white spaces from both ends
        // .toLowerCase() makes it all lower case
        // .contains() search
        // .split() divide a string into an array
                  /* !! in java String are immutable = cant be changed . so any changes will create new string !! */
        // we use \ to escape sequences so if we want to use ex ¨ in String we add \ before it :
        String ms = "jack \"is\" ";
        System.out.println(ms);
        // we us \n to make new line in a string, we use \t to add a tab in our string
        // ------------------------------------------------------------------------------------------------------------
                                              /* Arrays */
                   /* we use arrays to store a list of numbers or people or etc. */
        int [] numbers = new int[5]; // 5 is the size of this array
        numbers[0] = 1 ; // 0 is the first index of the array
        System.out.println(Arrays.toString(numbers));// we use to string to convert AN array to a string in order to print it
        // we can create an array in a short way if we now content of an array :
        int [] randoms = {1,2,3};
        System.out.println(randoms.length);// we use .length to print the size of an array
                     /* !! arrays have a fixed size = cant add or remove from them directly !! */
        //.sort help us sort our array
                          /* in java we can create multi-dimensional arrays */
        int [][] boxes = new int[2][3]; // 2 stands for rows , 3 for columns
        boxes [0][0] = 1;
        System.out.println(Arrays.deepToString(boxes));// we use deep-to-string to print multi-arrays.
        //-------------------------------------------------------------------------------------------------------------
        /* constants are used to keep the value from changing and that were we use final */
        final float pi = 3.14f;
        // ------------------------------------------------------------------------------------------------------------
                                      /* Arithmetic operators */
        // + , - , * , / , %  are arithmetic operators in java and used almost like real world math.
        // when  using / if u divided using a whole number u will get a whole number
        int result = 10 / 3 ;
        System.out.println(result);
        // to fix this we do this :
        double result2 = 10.0 / 3.0;// using double when u divide is better to get the right result
        // % gives you the remain of division
        // x++ , x-- are to increment or decrement by 1
        // += ,-=  is to add to the value or decrease from the values
        // the order of the math operations are the same as in real world math
//---------------------------------------------------------------------------------------------------------------------
                                 /* Casting */
        // implicit casting happens when there is no change of losing data
        // byte > short > int > long > float > double
        short x = 1 ;
        int y = x +2 ;
        System.out.println(y);
        // explicit casting happens when there could be some memory lose
        double testx = 1.1;
        int testy = (int)testx + 2;
        System.out.println(testy);

        // but what about strings
        String test1 = "123";
        int testz =Integer.parseInt(test1)+ 3;
        System.out.println(testz);
    // casting is very important because usually we take input from user as a string and we need to convert it in order to use it sometimes.
    // --------------------------------------------------------------------------------------------------------------------------------------------
                                                /* Math Class */
        int me = Math.round(2.1f); // to round the float into int
        System.out.println(me);
        int res = (int)Math.ceil(2.1f);// get the highest number of float
        System.out.println(res);
        int ress = (int)Math.floor(2.1f); // get the lowed number to float
        System.out.println(ress);
        int resu = Math.max(1,2); // compare between 2 numbers and choose the largest
        System.out.println(resu);
        int ras = (int)(Math.random()*100); // get a random number between 0 and 100
        System.out.println(ras);
//----------------------------------------------------------------------------------------------------------------------------------------------------
                                               /* Formating numbers */
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // its an abstract class so no need for new
        String money = currency.format(12345.56);// format the number into dollar
        System.out.println(money);

        NumberFormat percent = NumberFormat.getPercentInstance(); // get the percentage from a number
        String percent1 = percent.format(0.1);
        System.out.println(percent1);

 //------------------------------------------------------------------------------------------------------------------------------------------------------
                                               /* user input */

        Scanner scanner = new Scanner(System.in);// we use scanner to take input from user
        System.out.println("age= ");
        short age1 = scanner.nextShort();
        System.out.println("you are "+ age1);


    }
}