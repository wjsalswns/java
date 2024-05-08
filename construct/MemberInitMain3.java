package construct;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        // 메서드를 이용한 초기화 1
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        // 메서드를 이용한 초기화 2
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for(MemberInit s : members){
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}
