public class MyFriendDetailInfo extends MyFriendInfo { // MyFriendInfo 상속받음, 상위 클래스 - MyFriendInfo 하위 클래스 - MyFriendDetailInfo
    String address; // 주소 변수 정의
    String number; // 번호 변수 정의

    public MyFriendDetailInfo(String name, int age, String addreses, String number) {
        super(name, age); // 상위 클래스 name, age 값 호출
        this.address = addreses;
        this.number = number;
    }

    public void showMyFriendDetailInfo() { // 함수 정의
        showMyFriendInfo(); // 상위 클래스 함수 호출
        System.out.printf("주소 : %s%n번호 : %s%n", address, number);
    }

}
