package construct;

public class MemberInitMain4 {
    public static void main(String[] args) {
        // 이렇게 생성자를 만들면
        // 메서드를 계속 호출해야 한다는 문제점을 해결해주고,
        // 값을 안 넣었을 때 null값이 들어가는 것이 아닌 오류를 띄워준다
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct s : members){
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}
