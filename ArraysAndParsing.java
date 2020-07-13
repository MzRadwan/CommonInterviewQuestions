import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
using Array Lists and parsing from String to Integer and back
*/
public class Main {

    public static void main(String[] args){

        List<Integer> tab = new ArrayList<Integer>();
        Random gen = new Random();
        for(int i = 0; i < 10; i++){
            tab.add(gen.nextInt(10));
            System.out.print("\t"+tab.get(i));
        }

        System.out.println("\nSuma:" + change1(tab));

        List<Integer> returnedList = new ArrayList<Integer>();
        returnedList = change2(tab);

        for(Integer elem : returnedList){
            System.out.print("\t"+elem+"\n");

        }

        String text = "555";
        int number = Integer.valueOf(text);
        number *= 3;
        System.out.println(number);
        String text2 = Integer.toString(number);
        int number2 = Integer.parseInt(text2);
        number2 +=155;
        System.out.println(number2);
        text2 += " to jest napis";
        System.out.println(text2);

    }

    public static int change1(List<Integer> tab){

        int sumMul = 0;
        int sumAdd = 0;
        int sumTotal = 0;

        for (int i = 1; i < tab.size(); i +=3){
            sumMul += tab.get(i) * tab.get(i+1);
            sumAdd += tab.get(i-1);
        }
        sumTotal = sumAdd + sumMul;
        return sumTotal;
    }

    public static List<Integer> change2(List<Integer> tab){
        List<Integer> pom1 = new ArrayList<Integer>();
        List<Integer> pom2 = new ArrayList<Integer>();

        for (int i = 0; i < tab.size(); i +=2){
            pom1.add(tab.get(i));
            pom2.add(tab.get(i+1));
        }

        tab.clear();

        for (int i = 0; i < pom1.size(); i++){
            tab.add(pom1.get(i));
        }

        for (int i = 0; i < pom2.size(); i++){
            tab.add(pom2.get(i));
        }

        return tab;
    }
}
