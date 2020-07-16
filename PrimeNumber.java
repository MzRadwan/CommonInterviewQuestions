import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){

        //checks if given number is prime
        isThisPrime();
        //prints all prime numbers between 0 and given number
        findPrimeNumbers();

    }

    public static void findPrimeNumbers(){
        System.out.println("Enter the n: ");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 2;
        while (i <= n ){
            if(isPrime(i))
                System.out.print(i+"\t");
            i++;
        }
    }

    public static void isThisPrime(){

        System.out.println("Enter the number to check: ");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n){
        double sqrtN = Math.sqrt(n);
        boolean isPrime = true;
        int i = 2;
        while (i <= sqrtN){
            if ((n % i) == 0)
                isPrime = false;
            i++;
        }
        return isPrime;
    }
}

