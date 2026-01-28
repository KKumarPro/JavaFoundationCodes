import java.util.TreeSet;

public class Comparables {
    static class Student implements Comparable<Student> {
        int id;
        String name;

        Student(int ID, String n) {
            this.id = ID;
            this.name = n;
        }

        @Override
        public int compareTo(Student s) {
            return this.id - s.id;
        }

        @Override
        public String toString() {
            return "Student id=" + id + ", name=" + name;
        }
    }

    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(3, "C"));
        set.add(new Student(1, "A"));
        set.add(new Student(2, "B"));
        set.add(new Student(0, "K"));

        for (Student s : set) {
            System.out.println(s);
        }
    }
}