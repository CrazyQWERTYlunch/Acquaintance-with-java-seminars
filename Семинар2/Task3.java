import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        
        String text = inputText();
        
        System.out.println(text.equals(transText(text)));
    }


    public static String inputText() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Введите строку: ");
        String text = input.nextLine();
        
        input.close();
        
        System.out.println(text); // Вывод для более наглядного сравнения
        
        return text;
    } 


    public static String transText(String text) {
        String[] text1 = text.split("", 0);
        
        StringBuilder sb = new StringBuilder();
        for(int i = text1.length-1; i >= 0;i--){
            sb.append(text1[i]);
        }
        
        String text2 = sb.toString();
        
        System.out.println(text2); // Вывод для более наглядного сравнения
        
        return text2;
    }
    
}