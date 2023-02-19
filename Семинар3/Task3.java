import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int [] myArray = genArray();
        printArray(myArray);
        int[] newArray = mergeSorted(myArray,myArray.length);
        printArray(newArray);
    }


    public static int[] genArray() {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите размер создаваемого массива: ");
        int size = sc.nextInt();
        
        sc.close();
        
        Random random = new Random();
        int[] myArray = new int[size];
        
        for (int i = 0; i < size; i++){
            myArray[i] = random.nextInt(101);
        } return myArray;
    }


    public static int[] mergeSorted(int[] arr,int n){
        if (n < 2) {
            return arr;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
    
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        mergeSorted(l, mid);
        mergeSorted(r, n - mid);
    
        return merge(arr, l, r, mid, n - mid);
    }


    public static int[] merge(int[] a, int[] l, int[] r, int left, int right) {
    
        int i = 0, j = 0, k = 0;
        
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        } return a;
    }


    public static void printArray(int [] arr) {
        
        for (int i =0; i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        } System.out.println();
    }


}
