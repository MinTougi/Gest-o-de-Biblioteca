package Member;

public class Professor extends Member {
    private String departament;

    public Professor(String member_name, String member_id, String departament) {
        super(member_name, member_id);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + departament;
    }


}
