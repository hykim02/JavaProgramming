package 자바_기본_프로그래밍;

public class Hello {
    
    public static int sum(int n, int m) {
        return n + m;
    }

    // main() 메소드에서 실행 시작
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10); // 메소드 호출
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
