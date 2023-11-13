import java.util.ArrayList;
import java.util.Scanner;

public class Quik_sort {
  public static int partition(int []arr, int l , int h){
     int pivot = arr[l]; //assigning pivot element
    int i = l;           // initializing lower index
    for(int j = i+1; j<=h; j++){
      if(arr[j]<=pivot){        // compairision or jth element to pivot element
        i =i+1;
        int temp = arr[i];      /*swaping */
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
    int temp = arr[l];                  //swaping, pivot gets it's right position.
    arr[l]=arr[i];
    arr[i] = temp;
    return i;
  }
  public static void printArr(int [ ]arr, int n){
   for(int i=0; i<n; i++){
    System.out.print(arr[i]+" ");
   }
  }
  public static void QuickSort(int []arr, int l, int h){
    // Base case condition 
   if(l<h){
    int m = partition(arr,l,h);  //deviding array in two part
    QuickSort(arr, l, m-1);   // left half part
    QuickSort(arr, m+1, h);   // right half part
   }
  }
    public static void main(String[] args) {
      
        int [] arr ={23,34,54,32,21,67,54};
        int n= arr.length;
        System.out.println("Array before sorting: ");
        printArr(arr,n);
        System.out.println("\nArray after sorting: ");
        QuickSort(arr,0,n-1);
        printArr(arr, n);

    }
}
 