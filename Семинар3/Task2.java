import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = genList();
        printList(list);
        System.out.printf("Max: %s, Min: %s, Arithmetic mean: %s",
        getMax(list),getMinMax(list),getdArMean(list));        
    }


    public static ArrayList<Integer> genList(){

        ArrayList <Integer> list = new ArrayList<Integer>();
        
        Random random = new Random();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите размер создаваемого списка: ");
        int size = sc.nextInt();
        
        sc.close();

        for (int i = 0; i < size; i++){
            list.add(random.nextInt(10));
        } return list;
    }


    public static int getMinMax(ArrayList<Integer> list){
        
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++){
            min = list.get(i) < min ? list.get(i) : min;
        } return min; 
    }


    public static int getMax(ArrayList<Integer> list){
        
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            max = list.get(i) > max ? list.get(i) : max;
        } return max; 
    }


    public static double getdArMean(ArrayList<Integer> list){
        
        double arMean = 0;
        int sum = 0;

        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        arMean = sum/list.size();
        return arMean;
    }


    public static void printList(ArrayList<Integer> list) {
        
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
        } System.out.println();
    }
}
