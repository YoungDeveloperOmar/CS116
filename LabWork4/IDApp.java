package LabWork4;

public class IDApp {
    public static void main (String [] arguments){
        StudentID studentA = new StudentID("A00000001", "Jane", "Doe");
        StudentID studentB = new StudentID("A00000002", "John", "Doe");
        StudentID studentC = new StudentID("", "Janet", "Smith");
        StudentID studentD = new StudentID("", "", "Smith");
        StudentID studentE = new StudentID("", "", "");
        StudentID studentF = new StudentID("A00111112", "Cate", "Blanchett");
        StudentID studentG = new StudentID("A10111115", "Keanu", "Reaves");
        StudentID studentH = new StudentID();

        System.out.println("A:");
        System.out.println(studentA);
        System.out.println("B:");
        System.out.println(studentB);
        System.out.println("C:");
        System.out.println(studentC);
        System.out.println("D:");
        System.out.println(studentD);
        System.out.println("E:");
        System.out.println(studentE);
        System.out.println("F:");
        System.out.println(studentF);
        System.out.println("G:");
        System.out.println(studentG);
        System.out.println("H:");
        System.out.println(studentH);
    }
}