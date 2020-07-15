import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your n?");
        int n = 0;
        //there is no point calculating first 2 elements
        while (n < 2)
            n = scan.nextInt();

        List<Double> f = calculateFib(n);

        printFib(f);

    }

    public static List<Double> calculateFib(int n){
        List<Double> fibonacci = new ArrayList();
        fibonacci.add(0.0);
        fibonacci.add(1.0);
        int i = 2;
        while(i < n){
            double var1 = fibonacci.get(i-2);
            double var2 = fibonacci.get(i-1);

            fibonacci.add(var1 + var2);
            i++;
        }

        return fibonacci;
    }

    public static void printFib(List<Double> f){
        for (Double var : f){
            System.out.printf("%.0f\n",var);

        }
    }


}
