import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Task1{
    public static void main(String[] args) {
    
        
        Map <String,String>guide = new HashMap<String,String>();
        genNumberBook(guide);
    
    
    }



    public static Map <String,String> genNumberBook(Map<String,String> quide) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Для завершения нажмите 'q' ");

        String choice;

        do{
            
            System.out.println("1 - Добавить номер.\n2 - Добавить человека.\n3 - Показать всё.\n4 - Выход.");            
            choice = input.nextLine();
            
            switch(choice){
                
                case "1": 
                addNumber(quide,input);
                break;
                
                case "2":
                addPerson(quide,input);
                break;

                case "3":
                printBook(quide);
                break;
            }

        } while(!"4".equals(choice));
        
        input.close();
        return quide;
    } 


    public static void addPerson(Map<String, String> quide, Scanner input) {
        
        System.out.println("Введите фамилию и имя:");
        String person = input.nextLine();
        
        System.out.println("Введите номер телефона: ");
        String number = input.nextLine();

        quide.put(person, number);
    }


    public static void addNumber(Map<String, String> quide, Scanner input) {
        
        System.out.println("Введите фамилию и имя:");
        String person = input.nextLine();
        
        
        if (quide.containsKey(person)){
            
            System.out.println("Введите добавляемый номер телефона: ");
            String number = input.nextLine();
            
            quide.put(person, quide.get(person) +" ; "+ number);
            }

        else {System.out.println("Этот человек ещё не был записан в вашу книжку");}
    }


    
    public static void printBook(Map<String, String> phoneBook) {
        for(var elem:phoneBook.entrySet()){
            System.out.println(elem.getKey() + " " + elem.getValue());
        }
    }
}