package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 메서드를 추가
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자를 만들어주지 않아도 기본 생성자를 자바가 만들어주어 생략해준다
    public MemberInit(){}
}
