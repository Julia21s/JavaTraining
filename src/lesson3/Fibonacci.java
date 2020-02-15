package lesson3;

public class Fibonacci {
    public static void main(String[] args) {

        int[] fibCycles = {7,2,0,-7,-34,20,4,1,88,93};

        for(int i:fibCycles){
            printFibonacciNumbers(i);
        }

    }

    static void printFibonacciNumbers(int fibMax){
        System.out.println("For the number "+fibMax+" : ");
        if(fibMax<1||fibMax>93) System.out.println("Please enter a positive number more than 0 and less then 93");
        long fibNumber = 0L;
        long fibNumberNext = 1L;
        long fibTmp;
        for(int i=0;i<fibMax;i++) {
            System.out.print(fibNumber);
            if (i < (fibMax - 1)) {
                System.out.print(", ");
            } else {
                System.out.println(";");
            }

            fibTmp = fibNumber;
            fibNumber = fibNumberNext;
            fibNumberNext += fibTmp;
        }
    }
}
