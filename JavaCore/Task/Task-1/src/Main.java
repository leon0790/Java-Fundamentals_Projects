import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

//    public static void main(String[] args) {
//
//        int a, b, c, max, min;
//        System.out.println("Ixtiyoriq uch xonali butun turdagi son kiriting!");
//
//        System.out.println("a = "); a = scan.nextInt();
//        System.out.println("b = "); b = scan.nextInt();
//        System.out.println("c = "); c = scan.nextInt();
//
//        max = a;
//        if (max < b) max = b;
//        if (max < c) max = c;
//
//        System.out.println("Maksimum qiymat = " + max);
//
//        min = a;
//        if (min > b) min = b;
//        if (min > c) min = c;
//
//        System.out.println("Minumum qiymat = " + min);
//
//       if (max > b && b > min)
//           System.out.println("Minumum qiymat = " + min + " O'rta qiymat = " + b + " Maksimum qiymat = " + max);
//        if (max > c && c > min)
//            System.out.println("Minumum qiymat = " + min + " O'rta qiymat = " + c + " Maksimum qiymat = " + max);
//        if (max > a && a > min)
//            System.out.println("Minumum qiymat = " + min + " O'rta qiymat = " + a + " Maksimum qiymat = " + max);
//
//
//    }

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        Max max = new Max();
        Min min = new Min();

        System.out.println("Ixtiyoriy 3 xonali butun turdagi son kiriting!");

        System.out.println("a = "); obj1.setA(scan.nextInt());
        System.out.println("b = "); obj2.setB(scan.nextInt());
        System.out.println("c = "); obj3.setC(scan.nextInt());

        max.setMax(obj1.getA());
        if (max.getMax() < obj2.b) max.setMax(obj2.b);
        if (max.getMax() < obj3.c) max.setMax(obj3.c);

        System.out.println("Maksimum qiymat = " + max.getMax());

        min.setMin(obj1.a);
        if (min.getMin() > obj2.b) min.setMin(obj2.b);
        if (min.getMin() > obj3.c) min.setMin(obj3.c);

        System.out.println("Minumum qiymat = " + min.getMin());

       if (max.getMax() > obj2.b && obj2.b > min.getMin())
           System.out.println("Minumum qiymat = " + min.getMin() + " O'rta qiymat = " + obj2.b + " Maksimum qiymat = " + max.getMax());
        if (max.getMax() > obj3.c && obj3.c > min.getMin())
            System.out.println("Minumum qiymat = " + min.getMin() + " O'rta qiymat = " + obj3.c + " Maksimum qiymat = " + max.getMax());
        if (max.getMax() > obj1.a && obj1.a > min.getMin())
            System.out.println("Minumum qiymat = " + min.getMin() + " O'rta qiymat = " + obj1.a + " Maksimum qiymat = " + max.getMax());




    }
}
