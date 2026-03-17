public class InsertionSort{

    static void insertionSort(int[] arr, int i, int n){
        
        if(i == n) return;
        int j = i;

        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionSort(arr, i+1, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1,1,1,1,1,10,0,0,0,0,0,0,0,0,0,0};
        int n = arr.length;

        System.out.println("Before using Insertion Sort: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(arr, 0, n);
        System.out.println("After using Insertion Sort: ");

        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}