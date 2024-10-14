package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student.id = 1000; // 클래스명으로 직접 접근

        Class cls = Student.class;

        Student.staticMethod(); // 클래스명으로 직접 접근
    }
}
