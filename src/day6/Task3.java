package day6;

public class Task3 {
    public static void main(String[] args) {

        Student student = new Student("Иванов Иван");
        Lecturer lecturer = new Lecturer("Марья Михайловна", "сопромат");
        lecturer.evaluateStudent(student);
    }
}
