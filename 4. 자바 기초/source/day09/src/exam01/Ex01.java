package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {
        Class<Person> cls = Person.class; // Class 클래스 객체

        System.out.println("---- 생성자 ----");
        for (Constructor constructor : cls.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        System.out.println("---- 멤버 변수 ----");
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("---- 메서드 ----");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
