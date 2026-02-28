class PrintNames{
    public void printName(String name,int count, int times){

        if(count == times){
            return;
        }

        System.out.println(name);
        printName(name, count + 1, times);
    }
}

public class RecursionCall{
    public static void main(String[] args) {
        PrintNames name1 = new PrintNames();
        int N = 14;
        String name = "Jay Swaminarayan";
        name1.printName(name,0, N);
    }
}

