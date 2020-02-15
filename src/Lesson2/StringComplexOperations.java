package Lesson2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringComplexOperations {
    public static void main(String[] args) throws IOException
    {
        int n=0;
        String inStr = "";
<<<<<<< HEAD
        //Reading input parameters
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        while (inStr.equals("")) {
            System.out.println("Please, enter a string more than 1 character length");
            inStr = reader.readLine();
        }

        System.out.println("Please, enter character number");
        while (n==0) {
            try {
                n = Integer.parseInt(reader.readLine());
                if (n > 0) System.out.println(eachNth(inStr, n));
                    else {
                    n = 0;
                    System.out.println("Please enter positive value");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong numeric format. Please enter positive value.");
            }
        }
=======

        Boolean goOn = true; //We want to execute out method
        //Reading input parameters
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        do {

            do {
                System.out.println("Please, enter a string more than 1 character length");
                inStr = reader.readLine();
            } while (inStr.equals(""));

            System.out.println("Please, enter character number");
            do {
                try {
                    n = Integer.parseInt(reader.readLine());
                    if (n > 0) {
                        //Executing the method to show the value to the user
                        System.out.println("Result: " + eachNth(inStr, n));
                        System.out.println("Do you wish to repeat? (Y/N)");
                        inStr = reader.readLine();
                        if (!inStr.toLowerCase().equals("y")) {goOn = false;} // we don't want to execute out method
                    } else {
                        n = 0;
                        System.out.println("Please enter positive value");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Wrong numeric format. Please enter positive value.");
                    n=0;
                }
            } while (n == 0);
        }while(goOn==true);
>>>>>>> origin/master
    }
    public static String eachNth (String inStr, int n) {
        String outStr = "";
        int inStrLength = inStr.length();
        for(int i=0;i<inStrLength; i+=n) {
            outStr += inStr.charAt(i);
        }
        return outStr;

    }
}
