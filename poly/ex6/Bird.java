package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("까악");
    }

    @Override
    public void fly() {
        System.out.println("참새가 날아간다.");
    }
}
