class FindLength{
    
    public int findLengthOfInput(String s){
        
        if(s == null) return 0;
        return s.length();
    }
}

public class FindLengthOfString {
    public static void main(String[] args){
    FindLength ipString1 = new FindLength();
    String s = "Hello World";   

    System.out.println(ipString1.findLengthOfInput(s));
    }
}

