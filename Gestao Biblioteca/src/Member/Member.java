package Member;


import java.util.ArrayList;

public class Member {
    private String member_id;
    private final String member_name;
//    private final ArrayList<String> history = new ArrayList<>();

    private static final ArrayList<Member> members = new ArrayList<>();


    public Member(String memberName, String memberId) {
        this.member_name = memberName;
        this.member_id = memberId;
        members.add(this);
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public static Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMember_id().equalsIgnoreCase(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public static void removeMember(Member member) {
        members.remove(member);
    }
}
