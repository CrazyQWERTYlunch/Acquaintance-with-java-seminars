import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException{
        String[] phrase = {"Студент "," получил "," по предмету "};
        String fileName = "text_task2.txt";
        
        StringBuilder sb = new StringBuilder();
        
        Scanner sc = new Scanner(new File(fileName));

        for(int i = 0; i < phrase.length; i++){
            sb.append(phrase[i]);
            sb.append(sc.next());
        }
        
        sb.append('.');
        sc.close();

        System.out.println(sb.toString());

    }
}
