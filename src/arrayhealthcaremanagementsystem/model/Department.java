package arrayhealthcaremanagementsystem.model;

public class Department {

    private int deptId;
    private String depName;
    private int doctorId;
    private int hospitalId;

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", depName='" + depName + '\'' +
                ", doctorId=" + doctorId +
                ", hospitalId=" + hospitalId +
                '}';
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }
}
