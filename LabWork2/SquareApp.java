package LabWork2;

public class SquareApp {
    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square(2.0, new Point2D(1.0, 1.0));
        Square s3 = null;
        Square s4 = new Square(s2);
        Square s5 = new Square(3.0, new Point2D(3.0, 2.0));
        Square s6 = s2;
        Square s7 = new Square(s3);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        System.out.println("s5: " + s5);
        System.out.println("s6: " + s6);
        System.out.println("s7: " + s7);
        System.out.println();

        System.out.println("s1 refers to the same object as s2: " + (s1 == s2));
        System.out.println("s2 refers to the same object as s3: " + (s2 == s3));
        System.out.println("s4 refers to the same object as s2: " + (s4 == s2));
        System.out.println("s6 refers to the same object as s2: " + (s6 == s2));
        System.out.println("s7 refers to the same object as s1: " + (s7 == s1));
        System.out.println();
        System.out.println("object referred to by s1 represents the same square as object referred to by s2: " + (s1.equals(s2)));
        System.out.println("object referred to by s2 represents the same square as object referred to by s3: " + (s2.equals(s3)));
        System.out.println("object referred to by s4 represents the same square as object referred to by s2: " + (s4.equals(s2)));
        System.out.println("object referred to by s6 represents the same square as object referred to by s2: " + (s6.equals(s2)));
        System.out.println("object referred to by s7 represents the same square as object referred to by s1: " + (s7.equals(s1)));
    }
}
