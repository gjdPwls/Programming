/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10, 10, 5);
        double myArea = myCircle.getArea();
        double myCircumference = myCircle.getCircumference();

        System.out.printf("원 면적: %.2f\n", myArea);
        System.out.printf("원 둘레: %.2f\n", myCircumference);
    }
}