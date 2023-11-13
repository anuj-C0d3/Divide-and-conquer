public class merge_sort {
public static void printArr(char[] arr, int n){
    for(int i =0; i<n; i++){
             System.out.print(arr[i]+" ");
    }
}
public static void mergeProceedure(char []arr, int l, int mid, int r){
    int i,j,k;
    int n1 = mid-l+1;
    int n2 = r-mid;
    char []lsubarray = new char[n1];
    char []rsubarray = new char[n2];
    for(i=0; i<n1; i++){
             lsubarray[i]=arr[l+i];   
    }
    for(j=0; j<n2; j++){
        rsubarray[j]=arr[mid+1+j];
    }
    i=0; j=0; k=l;
    while (i<n1&&j<n2) {
        if(lsubarray[i]<rsubarray[j]){
                arr[k]=lsubarray[i];
               
                i++;
        }
        else {
            arr[k]=rsubarray[j];
            j++;
            
        }
        k=k+1;
    }
    
        while(i<n1){
            arr[k]=lsubarray[i];
            i++;k++;
        }
    
        while(j<n2){
            arr[k]=rsubarray[j];
            j++;k++;
        
    }
}
public static void mergeSort(char []arr,int i,int j){
        int mid = i+(j-i)/2;
        if(i<j){
            mergeSort(arr, i, mid);
            mergeSort(arr, mid+1, j);
            mergeProceedure(arr,i,mid,j);
        }
}
    public static void main(String[] args) {
        char []arr = {'A','x','b','g','m','d'};
        int n = arr.length;
        System.out.println("Array before sorting.");
        printArr(arr,n);
        System.out.println("\nArray after sorting:");
        mergeSort(arr,0,n-1);
        printArr(arr, n);
    }

}