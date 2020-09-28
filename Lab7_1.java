import java.util.Scanner;

public class Lab7_1 {
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        recursiontest1(in);
    }
    
    public static void recursiontest1(int x) {
            if(x==1) {
                return;
            }
            if(isEven(x)==true) {
                int temp = x/2;
                System.out.println(temp);
                recursiontest1(temp);
            } else {
                int temp = (x*3)+1;
                System.out.println(temp);
                recursiontest1(temp);
            }
        
    }
    public static boolean isEven(int x) {
        if (x%2==0) {
            return true;
        }
        return false;
    }

}