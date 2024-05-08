package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    // 기본 형태는 클래스를 따라감 (public)
    // 생성자를 직접 하나라도 만든 경우에는 자바에서 생성자를 만들어주지 않는다
    // 따라서 기본 생성자가 필요한 경우 직접 만들어야 한다
    MemberConstruct(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(String name, int age){
        // this로 한 번에 정리
        this(name, age, 50);
    }
}
