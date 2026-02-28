class PrintNums {
    public void printNum(int current, int number) {

        if (current > number)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next number
        printNum(current + 1, number);
    }
}

public class PrintNumbersRecursion {
    public static void main(String[] args) {
        PrintNums nums = new PrintNums();
        
        int n = 10;

        nums.printNum(1, n);   
        System.out.println();
    }
}