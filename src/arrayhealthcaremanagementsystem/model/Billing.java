package arrayhealthcaremanagementsystem.model;

public class Billing {

    private int bId;
    private int patientId;
    private int bill;
    private int totalBill;

    @Override
    public String toString() {
        return "Billing{" +
                "bId=" + bId +
                ", patientId=" + patientId +
                ", bill=" + bill +
                ", totalBill=" + totalBill +
                '}';
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }
}
