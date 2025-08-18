class Student {
    int[] marks;

    Student(int[] m) {
        marks = m;
    }

    void display() {
        for (int x : marks) {
            System.out.print(x + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(new int[]{10, 20, 30, 40});
        s.display();
    }
}
