package Member;

public class Student extends Member {
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(String memberName, String memberId, String course) {
        super(memberName, memberId);
        this.course = course;
    }
}
