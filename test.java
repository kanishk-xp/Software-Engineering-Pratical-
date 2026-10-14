
/*import java.util.Scanner;

public class test {
    public static void main(String args []) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int dummy =number;
        number=0;
        while(dummy!=0){
            int reminder=dummy%10;
            dummy=dummy/10;
            number=(number*10)+reminder;
        }
        System.out.println("The reverse number is : "+number);
    }
}*/
//boilerplate code

public class test{
    public static void main(String[] args) {
        int n=5;
        char alpha='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(alpha);
                alpha=(char)(alpha+1);
            }
        System.out.println();
        }
    }
}