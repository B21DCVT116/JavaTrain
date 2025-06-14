
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

    private String name;
    private int age;
    static int numberOfStudent;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }

    public void display() {
        if (age >= 18) {
            System.out.println(name);
        }
    }
}

public class ELAB2302_StudentClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> st = new ArrayList<>();
        try {
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                String tmp = sc.nextLine();
                int age = Integer.parseInt(tmp);
                st.add(new Student(name, age));
            }
        } catch (Exception e) {
        }
        for (Student stu : st) {
            stu.display();
        }
        System.out.println(Student.numberOfStudent);
        sc.close();
    }
}
