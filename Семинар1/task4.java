import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        
        // System.out.print("Введите уравнение: ");
        // String[] text = input.nextLine().split(" ", 0);
        
        // input.close();
        
        // System.out.println(text[0].length());
        // System.out.println(text[0].contains("?"));

        String[] text = {"2?", "+", "?5", "=", "69"};
        
        
        if (text[0].indexOf('?') != -1){
            text[0] = text[0].replace('?', '0');
            int num1 = Integer.parseInt(text[0]);
        } else {
            int num1 = Integer.parseInt(text[0]);
        }
        
        
        int total = 69;
        for (int i = 0; i <= text.length;i++){
            if(text[i].indexOf('?') != -1){
                int temp = text[i].indexOf('?');
                text[i] = text[i].replace('?', '0');
                int num1 = Integer.parseInt(text[i]);
                total -= num1; 
                System.out.println(num1);
                System.out.println(total);
                String z = text[temp] + total%10;
                System.out.println(z);
            }
        }
    }
}   
        
    //     String []a = {"28","5?"};
    //     int indNum1 = a[0].indexOf('?');
    //     a[1] = a[1].replace('?', '0');
    //     int b = Integer.parseInt(a[0]);
    //     System.out.println(a[1].endsWith("?"));
    //     System.out.println(b);
    //     System.out.println(indNum1);
    //     System.out.println(a[1]);
    //     int num1 = Integer.parseInt(a[0]);
    // }




    // public static void RestoreExpression(String[] text){
    //     String[] 
    // }

