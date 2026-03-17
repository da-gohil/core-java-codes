class Solution{
    public void printNumber(int currentNum, int num){

        if(currentNum > num){
            return;
        }
        
        printNumber(currentNum+1, num);
        System.out.println(currentNum + " ");

    }
}

public class RecursionWBackTracking{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int n = 10;

        s1.printNumber(1, n);
        System.out.println();
    }
}