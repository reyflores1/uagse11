import java.util.Scanner;

public class getNumbers{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("what's your name fam?");
       String x  = in.nextLine();
       System.out.println("Nice to meet you, " + x);
    }
}