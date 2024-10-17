public class MyFriendInfo {
    String name; // 이름 변수 정의
    int age; // 나이 변수 정의

    public MyFriendInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showMyFriendInfo() { // 함수 정의
        System.out.printf("이름 : %s%n나이 : %d%n", name, age);
    }
}
