import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
    
        LinkedList<Integer> list =  genList();
        
        System.out.print("Базовый список: ");
        prtList(list);
        
        Deque<Integer> newList = upheavalList(list);

        System.out.print("Перевернутый список: ");
        prtList(newList);
        
    }


    public static LinkedList<Integer> genList() {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        Random random = new Random();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Укажите желаемую длину списка: ");
        int size = input.nextInt();

        input.close();
        
        for (int i = 0; i < size; i++){
            list.add(0, random.nextInt(20));
        }
        return list; 

    }


    public static Deque<Integer> upheavalList(LinkedList<Integer> basList) {
        
        Deque <Integer> newList = new LinkedList<Integer>();
        
        while(!basList.isEmpty()){
            newList.addFirst(basList.pollFirst());
        }
        return newList;
    }


    
    public static void prtList(LinkedList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        } System.out.println();
    }

    public static void prtList(Deque<Integer> list){
        for (int item:list){
            System.out.print(item + " ");
        } System.out.println();
    }

} 