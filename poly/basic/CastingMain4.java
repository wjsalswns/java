package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        // 다운캐스팅은 잘못하면 심각한 런타임 오류가 발생할 수 있다.
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        // 정확히 다형성을 했을 때 다운캐스팅을 사용해야 한다.
        // child2.childMethod();
    }
}
