package LabWork4;

public class IDDatabase {
    private int numberOfIDs = 0;
    private final int MAX_DATABASE_SIZE;
    private StudentID[] IDList;

    public IDDatabase(){
        MAX_DATABASE_SIZE = 5;
        IDList = new StudentID[MAX_DATABASE_SIZE];
    }
    public IDDatabase(int dataBaseSize){
        if (dataBaseSize >= 0){
            MAX_DATABASE_SIZE = dataBaseSize;
            IDList = new StudentID[MAX_DATABASE_SIZE];
        }else{
            MAX_DATABASE_SIZE = 5;
            IDList = new StudentID[MAX_DATABASE_SIZE];
        }

    }
    public int getNumberOfIDs() {
        return numberOfIDs;
    }


    public boolean add(StudentID newStudent){

        if ( newStudent == null || newStudent.getANumber().equals("INVALID") || getNumberOfIDs() >= MAX_DATABASE_SIZE){
            return false;
        }
        IDList[numberOfIDs] = newStudent;
        numberOfIDs++;
        return true;
    }
    public void listNames(){
        if ( IDList != null){
            for( int i = 0; i< getNumberOfIDs(); i++){
                System.out.println( "ID " + i + ": "+ IDList[i].getFirstName() + " " + IDList[i].getLastName());
            }
        }else{
            System.out.println("ERROR: empty database.");
        }
    }
    public String toString(){
        String dataBaseSum = "\nDatabase:\n\n";
        if (numberOfIDs == 0 ){
            dataBaseSum += "ID List: empty\n";
        }
        for ( int i = 0; i< IDList.length ; i++){
            dataBaseSum += IDList[i].getIInstituteName()+ "\nStudentID\n"+ IDList[i].getFirstName()+'\n'+IDList[i].getLastName()+'\n'+IDList[i].getANumber() + "\n\n";
        }
        return dataBaseSum;
    }
}
