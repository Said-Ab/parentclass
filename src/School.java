public class School {
    private int idOfSchool;
    private String address;
    private int studentCount;


    public int getIdOfSchool() {
        return idOfSchool;
    }

    public void setIdOfSchool(int idOfSchool) {
        this.idOfSchool = idOfSchool;
    }

    public String getAddress() {
        return address;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public School() {
    }

    @Override
    public String toString() {
        return
                "\nid Of School=" + idOfSchool +
                "\naddress=" + address +
                "\nstudent Count=" + studentCount ;
    }
}
