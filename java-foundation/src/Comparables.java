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

        // Added toString() so you can see the output clearly
        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "'}";
        }
    }

    // 2. The main method acts as the entry point for the application
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(3, "C"));
        set.add(new Student(1, "A"));
        set.add(new Student(2, "B"));
        set.add(new Student(0, "K"));

        // 3. Print the set to verify the sorting
        for (Student s : set) {
            System.out.println(s);
        }
    }
}