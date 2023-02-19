import java.util.Scanner;

public class task3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = input.nextInt();

        System.out.print("Введите второе число: ");
        int secNum = input.nextInt();

        System.out.print("Введите действие, которое хотите произвести с числами: ");
        char symbol = input.next().charAt(0);

        input.close();

        Calculate(firstNum,secNum,symbol);
    }
          

    public static void Calculate(int a, int b, char c) {
        int result = 0;
        
        if (c == '/'){
            if (a == 0){
                System.out.println("На ноль делить нельзя");
                System.exit(a);
            } else result = a / b;
        } else if (c == '*'){
            result = a * b;
        } else if (c == '+'){
            result = a + b;
        } else if (c == '-'){
            result = a - b;
        } else System.out.println("Что-то пошло не так"); 
        
        System.out.println(result);
    }
}
