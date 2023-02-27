package LabWork4;

public class IDDatabaseApp {
    public static void main(String [] args){
        // Instantiate new database
        IDDatabase myDBase = new IDDatabase(6);

        // create and add some IDs to it
        StudentID ID1 = new StudentID("A00000001", "Jane", "Doe");
        myDBase.add(ID1);
        StudentID ID2 = new StudentID("A00000002", "John", "Doe");
        myDBase.add(ID2);
        ID1 = new StudentID("", "Janet", "Smith");
        myDBase.add(ID1);
        ID2 = new StudentID("", "", "Smith");
        myDBase.add(ID2);
        ID1 = new StudentID("A00111112", "Cate", "Blanchett");
        myDBase.add(ID1);
        StudentID ID3 = new StudentID("A10111115", "Keanu", "Reaves");
        myDBase.add(ID3);
        StudentID ID4 = new StudentID("A99999999", "Kanye", "West");
        myDBase.add(ID4);
        StudentID ID5 = new StudentID("A99456678", "Michael", "Jordan");
        myDBase.add(ID5);
        StudentID ID6 = new StudentID();
        myDBase.add(ID6);
        StudentID ID7 = new StudentID("A19436678", "Cristiano", "Ronaldo");
        myDBase.add(ID7);

        // list all names
        myDBase.listNames();

        // Display database "summary"
        System.out.println(myDBase.toString());
        // NOTE: it's the same as System.out.println(myDBase);
    }
}
