class Solution{
    public void printNumber(int currentNum, int num){

        if(currentNum > num){
            return;
        }

        System.out.println(currentNum + " ");
        printNumber(currentNum+1, num);

    }
}

public class Recursion1{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int n = 10;

        s1.printNumber(1, n);
        System.out.println();
    }
}