import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
    
        inputData();

    }
            

    public static void inputData() {
        
        LinkedList<Integer> save = new LinkedList<Integer>();

        Scanner input = new Scanner(System.in);
        
        String flag = null;                                                                                
        
        do{ 
            if ("cansel".equals(flag)){
                save = checkCansel(save, flag);
            }

            if(save.isEmpty() || save.getFirst() == 0){
                System.out.print("Введите первое число: ");
                save.addFirst(input.nextInt());
            } 
            else {
                System.out.print(save.getFirst()+"\n");
            }
                    
            
            System.out.print("Введите второе число: ");
            int secNum = input.nextInt();
            
            System.out.print("Введите действие, которое хотите произвести с числами: ");
            char symbol = input.next().charAt(0);
            
            
            String textLog = String.format("Введено новое выражение [%s %s %s], ",save.getFirst(),symbol,secNum);
            log(textLog);
            
            save.addFirst(Calculate(save.getFirst(),secNum,symbol));
            
            System.out.println("Для завершения работы наберите - end, для отмены последнего вычисления - cansel");
            flag = input.next().toString();
        }    
        while(!"end".equals(flag));
        
        
        input.close();

    }    



    public static int Calculate(int a, int b, char c) {
        
        int result = 0;
        
        if (c == '/'){
            if (b == 0){
                System.out.println("На ноль делить нельзя");
                log("в котором была предпринята попытка деления на ноль!\n");
                System.exit(a);
            } else result = a / b;
        } else if (c == '*'){
            result = a * b;
        } else if (c == '+'){
            result = a + b;
        } else if (c == '-'){
            result = a - b;
        } else System.out.println("Что-то пошло не так"); 
        
        String textLog = String.format("результатом которого является [%S]\n", result);
        log(textLog);

        System.out.println(result);
        
        return result;
    }




    public static LinkedList<Integer> checkCansel(LinkedList<Integer> save, String flag){
        
        Scanner input = new Scanner(System.in);
        
        do {
            int a;
            
            if(save.size() > 1){ 
                a = save.removeFirst();            
            } else {                
                save.addFirst(0);
                save.removeLast();
                
                log("Значение первого элемента было обнулено");                
                break;
            }

            String textlog = String.format("Значение 1 элемента изменено с [%s] на [%s]\n", a, save.getFirst());
            
            log("Была произведена операция отмены..");
            log(textlog);
            
            System.out.printf("Текущее значение 1 элемента = %s\n",save.getFirst());
            System.out.println("Написав - cansel вы можете ещё раз откатить значение");
            
            flag = input.next().toString();

        } while("cansel".equals(flag));
        // И здесь сканер
        return save;
    }


    public static void log(String text){
        
        String fileName = "Calclog.txt";
        
        try{
            FileWriter writer = new FileWriter(fileName,true);
            writer.write(text);
            writer.close();
        } catch (Exception e){
            System.out.println("Файла нет");
        }
    }
}

