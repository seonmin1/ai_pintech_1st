package exam02;

public class Ex03 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        System.out.println(System.identityHashCode(sb));

        sb.append("ABC");
        System.out.println(System.identityHashCode(sb));

        sb.append("DEF");
        System.out.println(System.identityHashCode(sb));

        sb.append("GHI");
        System.out.println(System.identityHashCode(sb));

        String str = sb.toString(); // toString()을 통해 문자열로 변환
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
    }
}
