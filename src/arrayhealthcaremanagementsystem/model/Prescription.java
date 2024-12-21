package arrayhealthcaremanagementsystem.model;

public class Prescription {

    private int pId;
    private int patientId;
    private String prescriptionDetail;

    @Override
    public String toString() {
        return "Prescription{" +
                "pId=" + pId +
                ", patientId=" + patientId +
                ", prescriptionDetail='" + prescriptionDetail + '\'' +
                '}';
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPrescriptionDetail() {
        return prescriptionDetail;
    }

    public void setPrescriptionDetail(String prescriptionDetail) {
        this.prescriptionDetail = prescriptionDetail;
    }
}
