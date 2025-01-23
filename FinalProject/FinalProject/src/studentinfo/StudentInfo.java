package studentinfo;


public class StudentInfo {
    private String Name;
    private String address;
    private double GPA;
    private StudentInfo NextStudent;

    public StudentInfo(){
        this.Name = "";
        this.address = "";
        this.GPA = 0;
        this.NextStudent = null;
    }

    public StudentInfo(String newName, String newAddr, double newGPA, StudentInfo newNext){
        this.Name = newName;
        this.address = newAddr;
        this.GPA = newGPA;
        this.NextStudent = newNext;
    }

    public StudentInfo(String newName, String newAddr, double newGPA){
        this.Name = newName;
        this.address = newAddr;
        this.GPA = newGPA;
        this.NextStudent = null;
    }
    public StudentInfo getNext(){
        return this.NextStudent;
    }

    public StudentInfo setNext(StudentInfo next){
        this.NextStudent = next;
        return this.NextStudent;
    }

    public String getName(){
        return this.Name;
    }
    public String getAddress(){
        return this.address;
    }
    public double getGPA(){
        return this.GPA;
    }

    public void setName(String newName){
        this.Name = newName;
    }
    public void setAddress(String newAddr){
        this.address = newAddr;
    }
    public void setGPA(Double newGPA){
        this.GPA = newGPA;
    }


}
