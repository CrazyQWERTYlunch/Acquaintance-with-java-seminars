import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        LinkedList <Integer> list = genList();

        printList(list);
        printList(sortList(list));
    }


    public static LinkedList<Integer> genList(){

        LinkedList <Integer> list = new LinkedList<Integer>();
        
        Random random = new Random();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите размер создаваемого списка: ");
        int size = sc.nextInt();
        
        sc.close();

        for (int i = 0; i < size; i++){
            list.add(random.nextInt(10));
        } return list;
    }


    public static LinkedList<Integer> sortList( LinkedList<Integer> list){

        for (int i = 0; i <list.size(); i++){
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        } return list;
    }

    public static void printList(LinkedList<Integer> list) {
        
        for (int i =0; i < list.size();i++){
            System.out.print(list.get(i)+ " ");
        } System.out.println();
    }

}