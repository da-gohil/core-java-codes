class Solution{

    public void printCharacters(String str){
        
        for(int i=0; i <str.length(); i++){
            System.out.print(str.charAt(i));
        }   
    }
}

public class StringAccess {
    public static void main(String[] args) {
        String s = "Hello World";
        Solution s1 = new Solution();
        s1.printCharacters(s);
    }
}
