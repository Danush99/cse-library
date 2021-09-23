package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {

        return operand1 - operand2;
    }


    public static int sumOfPrimes(int n){
        var sum = 0;
        if(n < 2){
            return 0;
        }
        for (int i =2; i< n; i++){
            var isPrime = true;
            for (int j=2; j< (int)Math.sqrt(i)+1; j++){
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
            }
        }
        return sum;
    }

    public static int factorial(int n){
        int factorial=1;
        for(int i=1; i<n+1; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int sumOfIntegers(int n){
        int summ =0 ;
        for(int i=1; i<n+1 ; i++){
            summ+=i;
        }
        return summ;
    }


}
