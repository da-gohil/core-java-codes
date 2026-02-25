class WhileLoopFactorial{
    
    public static void main(String [] args){
        int number = Integer.parseInt(args[0]);
        int factorial = 1;

        while(number > 0){
            factorial = factorial * number;
            number--;

        }
        System.out.println("Factorial of input number " + factorial);
    }
}