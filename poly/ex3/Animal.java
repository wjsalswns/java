package poly.ex3;

// 추상 클래스
public abstract class Animal {
    // 추상 메서드
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직인다.");
    }
}
