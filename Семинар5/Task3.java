public class Task3 {
    

    public static void main(String[] args){

        int[] column = new int[8+1];
        int[] rup = new int[(2*8)+1]; 
        int[] lup = new int[(2*8)+1]; 
        int[] queen;

        queen = new int[8+1];

        backtrack(1, column,rup,lup,queen);
    }

    
  
  
  
    public static void backtrack(int i,int[] column, int[] rup, int[] lup,int[] queen) {
        
        if (i > 8) {
            showAnswer(queen);

        } else {
            
            for (int j = 1; j <= 8; j++) {
                if ((column[j] == 0) && (rup[i+j] == 0) && (lup[i-j+8] == 0)) {
                    queen[i] = j; 
                    column[j] = rup[i+j] = lup[i-j+8] = 1;
                    backtrack(i+1, column, rup, lup, queen);
                    column[j] = rup[i+j] = lup[i-j+8] = 0;
                }
            
            }
        }
    }

 

    public static void showAnswer(int[] queen) {
        
        System.out.println("________________________");
        System.out.println();
        
        for (int y = 1; y <= 8; y++) {
            for (int x = 1; x <= 8; x++) {
                
                if(queen[y]==x) {
                    System.out.print("|Q|");
                } else {
                    System.out.print("|*|");
                }
            }
            System.out.println();
        }
        System.out.println("________________________");
        System.out.println();
    }


}
    
      
    
    
    
 