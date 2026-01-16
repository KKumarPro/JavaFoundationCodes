public class Student {
    public static void main(String[] args)
    {
        StudentInfo si1 = new StudentInfo(312, "Karan", 97.26f);
        si1.disp();
        si1.setMarks(100.00f);
        si1.getMarks();
    }

}
class StudentInfo
{
    int id;
    String name;
    private float marks;

    StudentInfo(int id, String n, float m){
        this.id = id;
        this.name = n;
        this. marks = m;
    }
    public void setMarks(float m)
    {
        if(marks>0)
            this.marks = m;
    }
    public float getMarks()
    {
        System.out.println("Final Marks: "+marks);
        return marks;
    }

    void disp()
    {
        System.out.println("Student ID: " +id+ "  Student Name: " +name+ "  Student Marks: " +marks);
    }
}