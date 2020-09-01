package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Bill", "A-I");
        Teacher teacher = new Teacher("Joahn","Math");
        System.out.println("Student's group is " + student.getGroup());
        System.out.println("Teacher's subject is " + teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
