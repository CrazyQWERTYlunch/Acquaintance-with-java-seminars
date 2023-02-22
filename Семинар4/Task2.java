import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = genList();
        menu(list);

    }



    public static void menu(LinkedList <Integer> list) {
        String text = String.format("Выберите действие:\n%s%s%s%s%s "
        ,"1. Вывести первый элемент.\n"
        ,"2. Вывести и удалить первый элемент.\n"
        ,"3. Переместить элемент в конец очереди.\n"
        ,"4. Вывести все элементы.\n"
        ,"5. Завершить работу.");
        Scanner input = new Scanner(System.in);
        
        int answer;
        
        do {
            System.out.println(text);
            answer = input.nextInt();

            switch(answer){
                
                case 1: first(list);
                break;
                case 2: dequeue(list);
                break;
                case 3: enqueue(list);
                break;
                case 4: prtList(list);
                break;
            }
        } while (answer != 5); 
        
        input.close();
    }

    public static LinkedList<Integer> genList() {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++){
            list.add(0,random.nextInt(20));
        } return list; 
    }




    public static void enqueue(LinkedList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Укажите номер, перемещаемого элемента: ");
        list.addLast(list.remove(input.nextInt()));
    // Что делать со сканером?
    }


    public static void dequeue(LinkedList<Integer> list) {
        int element = list.removeFirst();
        System.out.print("Удалённый элемент: ");
        System.out.println(element);
    }
    


    public static void first(LinkedList<Integer> list) {
        int element = list.element();
        System.out.print("Первый элемент: ");
        System.out.println(element); 
    }


    public static void prtList(LinkedList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        } System.out.println();
    }

}