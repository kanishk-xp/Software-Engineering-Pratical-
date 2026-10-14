
import java.util.Scanner;



/* public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide your number");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("Positive number "+num);
        } else{
            System.out.println("Negative number "+num);
        }

    }
} */


/*     
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please provide the week number");
        int num=sc.nextInt();
        switch (num) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default:
                System.out.println("A week only has 7 days bitshhhh");
        }
    }
}*/

/*
public class assignment2 {
    public static void main(String[] args) {
        double temp = 103.5;
        if (temp>100){
            System.out.println("Fever");
        } else{
            System.out.println("you are allright");
        }
    }
}*/

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0)&&(year%10!=0) || year%400==0){
            System.out.println("Leap Year");
        } else{
            System.out.println("Not Leap Year");
        }

    }
}