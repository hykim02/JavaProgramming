package 자바_기본_프로그래밍;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14; // 상수 선언

        double radius = 10.0; // 리터럴 기본 타입은 double
        double circleArea = radius*radius*PI;

        System.out.println("면적:" + circleArea);
    }
}
