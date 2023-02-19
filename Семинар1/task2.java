public class task2 {
    public static void main(String[] args){
        int n = 1000;
        GetPrimeNumbers(n);
     
    }

    public static void GetPrimeNumbers(int n){
        System.out.printf("%s %s %s ", 1,2,3);

        for(int i = 5; i <= n; i += 2){
            int x = (i/2)+2;
            for(int j = 3 ; j <= x; j += 2){
                if (j >= x-2) {
                    System.out.print(i + " ");
                    break;
                } else if (i % j == 0) break;
            }
        }
    }
}

//TODO:подумай как сделать через стрингбилдер!