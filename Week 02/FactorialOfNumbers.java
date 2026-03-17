class Solution{
    public int calculateFact(int num){

        if (num == 0) return 1;
        
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }

        return fact;

    }
}

public class FactorialOfNumbers{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int n = 3;

        int total = s1.calculateFact(n);
        System.out.println(total);
    }
}