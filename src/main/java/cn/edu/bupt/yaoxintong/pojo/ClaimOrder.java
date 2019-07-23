package cn.edu.bupt.yaoxintong.pojo;

import java.util.Date;

public class ClaimOrder {
    private String id;

    private String orderId;

    private Double claimPrice;

    private Date claimDate;

    private String medicineName;

    private String medicineStore;

    private String invoice;

    private String claimKind;

    private String bill;

    private String claimReason;

    private String claimStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Double getClaimPrice() {
        return claimPrice;
    }

    public void setClaimPrice(Double claimPrice) {
        this.claimPrice = claimPrice;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public String getMedicineStore() {
        return medicineStore;
    }

    public void setMedicineStore(String medicineStore) {
        this.medicineStore = medicineStore == null ? null : medicineStore.trim();
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public String getClaimKind() {
        return claimKind;
    }

    public void setClaimKind(String claimKind) {
        this.claimKind = claimKind == null ? null : claimKind.trim();
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill == null ? null : bill.trim();
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason == null ? null : claimReason.trim();
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus == null ? null : claimStatus.trim();
    }
}