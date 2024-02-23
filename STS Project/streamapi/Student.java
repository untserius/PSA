public class Student {
    private long roll;
    private String name;
    private int marks;

    Student(int roll, String name,  int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public long getRoll(){
        return roll;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }
}
