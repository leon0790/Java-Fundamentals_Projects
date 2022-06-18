import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c, max, min;
        System.out.println("Ixtiyoriq uch xonali butun turdagi son kiriting!");

        System.out.println("a = "); a = scan.nextInt();
        System.out.println("b = "); b = scan.nextInt();
        System.out.println("c = "); c = scan.nextInt();

        max = a;
        if (max < b) max = b;
        if (max < c) max = c;

        System.out.println("Maksimum qiymat = " + max);

        min = a;
        if (min > b) min = b;
        if (min > c) min = c;

        System.out.println("Minumum qiymat = " + min);

       if (max > b && b > min)
           System.out.println("Minumum qiymat = " + min + " O'rta qiymat = " + b + " Maksimum qiymat = " + max);
        if (max > c && c > min)
            System.out.println("Minumum qiymat = " + min + " O'rta qiymat = " + c + " Maksimum qiymat = " + max);
        if (max > a && a > min)
            System.out.println("Minumum qiymat = " + min + " O'rta qiymat = " + a + " Maksimum qiymat = " + max);


    }

//
}
