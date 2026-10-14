
import java.util.Scanner;

public class assignment5 {
    public static int avg3() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your number 1");
        int a=sc.nextInt();
        System.out.println("Please enter your number 2");
        int b=sc.nextInt();
        System.out.println("Please enter your number 3");
        int c=sc.nextInt();
        return (a+b+c)/3;

    }

    public static boolean iseven(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }


    public static boolean palendrome(int n){
        int num=n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        if(num==rev)
            return true;
        else
            return false;
    }


    public static int sumofnum(int n){
        int num=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }




    public static void main(String[] args) {
        System.out.println(avg3());
        System.out.println(iseven(5));
        System.out.println(palendrome(565));
        System.out.println(sumofnum(123));
    }
}
