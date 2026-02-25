import java.util.NoSuchElementException;
import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        if(sc == null) return;
        try{
            if(sc.hasNextInt()){
                int number = sc.nextInt();
                System.out.println("The number entered is : " + number);
            }else{
                System.err.println("Input is not an integer");
            }
        }catch(NoSuchElementException | IllegalStateException e){
                System.err.println("Error reading Input " + e);
        }
    }
}

class IOusingScanner{
    public static void main(String [] args){
        Solution sol = new Solution();
    
        try(Scanner scan = new Scanner(System.in)){
            sol.printNumber(scan);
        }
    }
}