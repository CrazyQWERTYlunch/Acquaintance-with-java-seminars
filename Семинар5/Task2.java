import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        String [] startList = new String[] {"Иван Иванов", "Светлана Петрова"
                                            ,"Кристина Белова","Анна Мусина"
                                            ,"Анна Крутова", "Иван Юрин"
                                            ,"Петр Лыков","Павел Чернов"
                                            ,"Петр Чернышов","Мария Федорова"
                                            ,"Марина Светлова","Мария Савина"
                                            ,"Мария Рыкова","Марина Лугова"
                                            ,"Анна Владимирова","Иван Мечников"
                                            ,"Петр Петин","Иван Ежов"};

        ArrayList<String> nameList = getName(startList);
        convertToMap(nameList);
    }


    public static ArrayList <String> getName(String[] list){
        
        ArrayList <String> nameList = new ArrayList<>();
        
        for (String name:list){
            String [] tempList = name.split(" ");
            nameList.add(tempList[0]);
        }
        return nameList;
    }


    public static void convertToMap(ArrayList<String> nameList) {
        
        Map <String,Integer> nameCount = new HashMap<>();

        for (int i = 0; i < nameList.size();i++){
            
            int count = 1;
            
            if (!nameCount.containsKey(nameList.get(i))){
                
                for (int j = i+1; j < nameList.size();j++){

                    if (nameList.get(i).equals(nameList.get(j))){
                        count++;
                    }
     
                    nameCount.put(nameList.get(i), count);
                }
            }
        } 
        ArrayList<Integer> listCount  = sortValue(nameCount);
        printBook(nameCount,listCount);
    }


    public static ArrayList<Integer> sortValue(Map<String, Integer> map){
        
        ArrayList<Integer> listCount = new ArrayList<>();
        
        for(var item: map.entrySet()) {
            if (!listCount.contains(item.getValue())) listCount.add(item.getValue());
        }
    
        listCount.sort(null);   
        return listCount;
    }


    public static void printBook(Map<String, Integer> nameCount, ArrayList<Integer> listCount) {
        
        for (int i = listCount.size()-1; i > -1; i--){
            
            for (var item: nameCount.entrySet()){        
                if (listCount.get(i) == item.getValue()) System.out.printf("%s : %d \n", item.getKey(), item.getValue());
            }
        }
    }

}
