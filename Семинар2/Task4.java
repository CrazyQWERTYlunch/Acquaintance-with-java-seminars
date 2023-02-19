import java.io.FileWriter;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        
        inputData();
    }
          

    public static void inputData() {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = input.nextInt();

        System.out.print("Введите второе число: ");
        int secNum = input.nextInt();

        System.out.print("Введите действие, которое хотите произвести с числами: ");
        char symbol = input.next().charAt(0);

        input.close();

        String textLog = String.format("Введено новое выражение [%s %s %s], ",firstNum,symbol,secNum);
        log(textLog);
  
        Calculate(firstNum,secNum,symbol);
    }


    public static void Calculate(int a, int b, char c) {
        
        int result = 0;
        
        if (c == '/'){
            if (a == 0){
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


