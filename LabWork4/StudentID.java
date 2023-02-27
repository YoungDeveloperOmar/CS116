package LabWork4;

public class StudentID {
    private final String INSTITUTENAME = "Illinois Tech",firstName , lastName , aNumber;
    public StudentID() {
        this.firstName = "INVALID";
        this.lastName = "INVALID";
        this.aNumber = "INVALID";
    }
    public StudentID(String aNumber, String firstName, String lastName){
        if ( aNumber.equals("") || aNumber == null || firstName.equals("") || firstName==null || lastName.equals("") || lastName == null){
            this.aNumber = "INVALID";
            this.firstName = "INVALID";
            this.lastName = "INVALID";
        }else {
            this.aNumber = aNumber;
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
    public String getIInstituteName() {
        return INSTITUTENAME;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getANumber() {
        return aNumber;
    }
    public String toString() {
        return INSTITUTENAME + "\nStudentID\n"+getFirstName()+'\n'+getLastName()+'\n'+getANumber();
    }
}
