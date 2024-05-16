package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 다형적 참조
        Parent poly = new Child();

        // poly.Childmethod();

        // 일시적 다운캐스팅 (부모타입 -> 자식타입)
        // 값 저장이 아닌 메서드 호출같은 건 일시적 다운캐스팅 사용
        ((Child) poly).childMethod();
    }
}
