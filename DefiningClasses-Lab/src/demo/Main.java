package demo;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Pesho", 15);

        student.getGrades().add(5.5);
        student.getGrades().add(6d);
        student.getGrades().add(4.5);
        System.out.println(student.getGrades().stream().mapToDouble(g -> g).average().getAsDouble());

    }
}
