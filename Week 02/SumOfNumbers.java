class Solution{
    public int totalNumber(int num){

        if(num == 0 || num == 1){
            return num;
        }else{
            return num * (num + 1) / 2;
        }
        
    }
}

public class SumOfNumbers{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int n = 3;

        int total = s1.totalNumber(n);
        System.out.println(total);
    }
}