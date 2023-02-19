import java.io.FileWriter;
import java.util.Scanner;


public class Task1{
    public static void main(String[] args){
        log("Новый запуск!");
        printArray();
    }

    public static int [] arrayGen(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Укажите длину массива: ");
        int size = sc.nextInt();
        
        int [] array = new int[size];
        
        for (int i = 0; i < size; i++){
            System.out.printf("Введите значение %s элемента массива: ", i+1);
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }


    public static int[] bubbleSort(){
        int[] array = arrayGen();
        String text = " ";
        for (int i = 0; i < array.length-1;i++){
            for (int j = 0; j < array.length-1-i;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    text = String.format("%s и %s элементы массива поменялись местами, теперь значение %s элемента: (%s), а %s: (%s).", j, j+1,j,array[j],j+1,array[j+1]);
                    log(text);
                } else {
                    text = String.format("Изменений не произошло, элемент %s по своему значению (%s) превосходит %s элемент (%s).",j+1,array[j+1],j,array[j]);
                    log(text); 
                }
            }
        } return array;
    }   



    public static void printArray(){
        int [] array = bubbleSort();
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }


    public static void log(String text){
        String fileName = "logtask1.txt";
        try{
            FileWriter writer = new FileWriter(fileName,true);
            writer.write(text +"\n");
            writer.close();
        } catch (Exception e){
            System.out.println("Файла нет");
        }

    }
}