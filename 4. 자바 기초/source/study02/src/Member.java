public class Member {
    private String id;
    private String name;
    private int point;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Member(String id, String name, int point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    void showInfo() {
        System.out.printf("회원아이디 : %s, 회원이름 : %s, 회원포인트 : %d%n", id, name, point);
    }
}
