import java.util.Scanner;

public class task1{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число сумму и произведение которого хотите узнать: ");
        int n = input.nextInt();
        input.close();
        SumOfNumbers(n);
        ProductNumbers(n);
    }


    public static void SumOfNumbers(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            result += i;
        } System.out.printf("Сумма чисел до числа %s составляет %s!\n", n, result);
    }


    public static void ProductNumbers(int n){
        int result = 1;
        if (n == 0) result = 0;
        for(int i = 1; i <= n; i++){
            result *= i;
        } System.out.printf("Произведение чисел до числа %s составляет %s!", n, result);
    }

}