import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args){
        
        Set<Laptop> unicLaptop = intitLaptop();

        Map<Integer, String> mapCrit = mapFilters();

        findLap(unicLaptop,mapCrit);
    
    }


    public static Set<Laptop> intitLaptop() {
        Laptop laptop1 = new Laptop("Lenovo IdealPad 5", 8, 256, "Windows 11", "blue");
        Laptop laptop2 = new Laptop("Honor MagicBook 16", 16, 512, "no", "gray");
        Laptop laptop3 = new Laptop("Apple MacBook Air 13", 8, 256, "MacOs", "golden");
        Laptop laptop4 = new Laptop("HP 250 G7", 4, 1024, "no", "black");
        Laptop laptop5 = new Laptop("Xiomi RedmiBook 15", 8, 256, "Windows 11", "gray");

        Set<Laptop> unicLaptop = new HashSet<Laptop>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);
     
        return unicLaptop;
    }       

    public static Map<Integer, String> mapFilters() {
        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "Объём ОЗУ");
        mapCrit.put(2, "Объем HDD");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "Цвет");
        mapCrit.put(5, "Название");
        return mapCrit;
    }

    public static void findLap(Set<Laptop> unicLaptop,Map<Integer, String> mapCrit) {
        
        Scanner sc = new Scanner(System.in);
        
        String userFilter;
        
        do {
            
            System.out.printf("Укажите фильтры поиска:\n1. %s\n2. %s\n3. %s\n4. %s\n5. %s\n6. Итоги фильтраций\n7. Выход\n",
        mapCrit.get(1),mapCrit.get(2),mapCrit.get(3),mapCrit.get(4),mapCrit.get(5));

             userFilter = sc.nextLine();
            
             switch(userFilter){
                case "1":
                unicLaptop = ramFilter(unicLaptop, sc);
                break;
                case "2":
                unicLaptop = hddFilter(unicLaptop, sc);
                break;
                case "3":
                unicLaptop = osFilter(unicLaptop, sc);
                break;
                case "4":
                unicLaptop = colourFilter(unicLaptop, sc);
                break;
                case "5":
                unicLaptop = nameFilter(unicLaptop, sc);
                break;
                case "6":
                prtFilters(unicLaptop);
                break;
            }
        } while(!"7".equalsIgnoreCase(userFilter));

        sc.close();
    }


    public static void prtFilters(Set<Laptop> userFilter){
        if (userFilter.isEmpty()){
            System.out.println("Ни одна модель не подходит");
        }
        for(Laptop lap: userFilter) {
                System.out.println(lap.toString());
            }   
    }     
    

    public static Set<Laptop> ramFilter( Set<Laptop> unicLaptop, Scanner sc){
        Set<Laptop> saveFilter = new HashSet<Laptop>(); 

        System.out.println("Укажите желаемый объём ОЗУ: ");
        int ramUser = sc.nextInt();
        
        for(Laptop lap: unicLaptop) {
            if (lap.getRam() >= ramUser) {
                saveFilter.add(lap);
                System.out.println(lap.toString());
            } 
        }         
        return saveFilter;
    }


    public static Set<Laptop> hddFilter(Set<Laptop> unicLaptop, Scanner sc) {
        Set<Laptop> saveFilter = new HashSet<Laptop>(); 

        System.out.println("Укажите желаемый объём HDD: ");
        int hddUser = sc.nextInt();
        
        for(Laptop lap: unicLaptop) {
            if (lap.getHardDiskCap() >= hddUser) {
                saveFilter.add(lap);
                System.out.println(lap.toString());
            }   
        }
        return saveFilter;        
    }


    public static Set<Laptop> osFilter(Set<Laptop> unicLaptop, Scanner sc) {
        Set<Laptop> saveFilter = new HashSet<Laptop>(); 
        
        System.out.println("Укажите желаемую ОС: ");
        String osUser = sc.nextLine();
        
        for(Laptop lap: unicLaptop) {
            if (lap.getOs().equalsIgnoreCase(osUser)) {
                saveFilter.add(lap);
                System.out.println(lap.toString());
            }   
        }    
        return saveFilter;        
    }


    public static Set<Laptop> nameFilter(Set<Laptop> unicLaptop, Scanner sc) {
        Set<Laptop> saveFilter = new HashSet<Laptop>(); 
        
        System.out.println("Укажите модель ноутбука: ");
        String nameUser = sc.nextLine();
        
        for(Laptop lap: unicLaptop) {
            if (lap.getName().equalsIgnoreCase(nameUser)) {
                saveFilter.add(lap);
                System.out.println(lap.toString());
            }   
        }    
        return saveFilter;        
    }


    public static Set<Laptop> colourFilter(Set<Laptop> unicLaptop, Scanner sc) {
        
        Set<Laptop> saveFilter = new HashSet<Laptop>(); 
        
        System.out.println("Укажите цвет ноутбука: ");
        String colourUser = sc.nextLine();
        
        for(Laptop lap: unicLaptop) {
            if (lap.getColour().equalsIgnoreCase(colourUser)) {
                saveFilter.add(lap);
                System.out.println(lap.toString());
            }   
        }    
        return saveFilter;        
    }

}

