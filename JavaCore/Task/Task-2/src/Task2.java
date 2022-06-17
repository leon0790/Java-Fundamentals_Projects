import java.util.Scanner;

public class Task2 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c;
        System.out.println("Ixtiyoriq uch xonali butun turdagi son kiriting!");

        //step-1.
        System.out.println("a = ");
        a = scan.nextInt();
        System.out.println("b = ");
        b = scan.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //step-2.
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
