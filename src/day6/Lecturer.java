package day6;

public class Lecturer {

    private String fullName;
    private String subject;
    private int value;
    private String mark;

    public Lecturer(String fullName, String subject) {
        this.fullName = fullName;
        this.subject = subject;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluateStudent(Student student) {

        value = (int) (2 + Math.random() * 4);

        switch (value) {
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
                break;

            default:
                mark = " ";
        }
        System.out.println("Преподаватель " + fullName + " оценил студента с именем " + student.getFullName() + " по предмету " + subject + " на оценку " + mark);
    }
}
