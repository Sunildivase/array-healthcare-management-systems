package arrayhealthcaremanagementsystem.model;

public class Doctor {

    private int doctorId;
    private String fName;
    private String lName;
    private String gender;
    private int age;
    private String contactNo;
    private String speciality;

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", contactNo='" + contactNo + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
