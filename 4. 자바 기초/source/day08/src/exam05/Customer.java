package exam05;

import java.util.Objects;

public class Customer extends java.lang.Object {
    private int id; // 고객 번호
    private String name; // 고객명
    private String email; // 이메일

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) { // equals 메서드 재정의 - id, name, email이 같을 때 true 반환
        if (obj instanceof Customer customer) {
            if (id == customer.id && name.equals(customer.name) && email.equals(customer.email)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() { // hashCode 메서드 재정의 - 중복 제거를 위해
        return Objects.hash(id, name, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
