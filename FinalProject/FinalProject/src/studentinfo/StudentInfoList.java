package studentinfo;

public class StudentInfoList {
    private StudentInfo listStart;

    private int getlengthHelper(StudentInfo List){
        if(List == null){
            return 0;
        }else{{
            return getlengthHelper(List.getNext()) + 1;
        }}
    }

    private StudentInfo getLastHelper(StudentInfo Node){
        if(Node == null){
            return this.listStart;
        }
        if(Node.getNext() == null){
            return Node;
        }
        return getLastHelper(Node.getNext());  
    }
    
    public StudentInfoList(){
        this.listStart = null;
    }

    public StudentInfoList(StudentInfo newList){
        this.listStart = newList;
    }

    public int getLength(){
        return getlengthHelper(listStart);
    }

    public StudentInfo getLast(){
        return getLastHelper(listStart);
    } 

    public StudentInfo getStart(){
        return this.listStart;
    }
    public void addItem(StudentInfo newItem){
        if(this.listStart == null){
            this.listStart = newItem;
        }else{
            this.getLast().setNext(newItem);
        }
    }
    public StudentInfo removeEnd(){
        StudentInfo Ending = this.getLast();
        this.getLast().setNext(null);
        return Ending;
    }

    public void SortAlpha(){
        StudentInfo currNode = this.listStart;
        int length = this.getLength();
        int iteration = 0;
        
        while (iteration < length){
            StudentInfo thisNode = this.listStart;
            StudentInfo nextNode = this.listStart.getNext();
            while(nextNode != null){
                if(thisNode.getName().charAt(0) > nextNode.getName().charAt(0)){
                    String tempName = thisNode.getName();
                    String tempAdr = thisNode.getAddress();
                    double tempgpa = thisNode.getGPA();
                    thisNode.setName(nextNode.getName());
                    thisNode.setAddress(nextNode.getAddress());
                    thisNode.setGPA(nextNode.getGPA());
                    nextNode.setName(tempName);
                    nextNode.setAddress(tempAdr);
                    nextNode.setGPA(tempgpa);
                }
                thisNode = nextNode;
                nextNode = nextNode.getNext();
                
            }
            iteration +=1;
        }

    }
}
