import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int cal;
        int remainder;
        
        System.out.println(" enter 2 number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:- ");
        n1 = sc.nextInt();
        System.out.println("enter second number:- ");
        n2 = sc.nextInt();
        System.out.println("Select Operation:-");
        System.out.println("1 - Add");
        System.out.println("2 - Substract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("Enter Operation Number");

        Scanner s= new Scanner(System.in);
        n3 = s.nextInt();
        
        if(n3 == 1){
            cal = n1 + n2;
            System.out.println("Sum of two numbers:- " + cal);
        }
        else if (n3==2) {
            cal = n1 - n2;
            System.out.println("Substract of two numbers:- "+ cal);
        }
        else if (n3==3) {
            cal = n1 * n2;
            System.out.println("Multiply of two numbers:- "+ cal);
        }
        else if (n3==4) {
            cal = n1 / n2;
            remainder = n1 % n2; 
            System.out.println("Divide of two numbers:- "+ cal);
            System.out.println("Remainder of two numbers:- "+ remainder);
        }
    }
}
