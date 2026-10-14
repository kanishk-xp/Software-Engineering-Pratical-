
import java.util.Scanner;





/*public class assignment4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int k=1;
    int even=0,odd=0;
    do { 
        System.out.println("Please provide your number");
        int num=sc.nextInt();
        if(num%2==0)
            even+=num;
        else
            odd+=num;
        System.out.println("Do u want to enter more 1-->Yes 0-->no");
        k=sc.nextInt();
        

    } while (k==1);

    System.err.println("Sum of even number is :"+even);
    System.err.println("Sum of odd number is :"+odd);

    }
}*/


/*public class assignment4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please provide your number");
        int num=sc.nextInt();
        int factorial=1;
        while(num>=1){
            factorial=factorial*num;
            num--;
        }
        System.out.println("The factorial is :"+factorial);
    }
}*/


public class assignment4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"X"+i+"="+(num*i));
        }
    }
}
