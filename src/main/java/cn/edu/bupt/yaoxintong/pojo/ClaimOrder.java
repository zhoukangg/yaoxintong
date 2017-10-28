package cn.edu.bupt.yaoxintong.pojo;

import java.util.Date;

public class ClaimOrder {
    private String claimId;

    private Double claimPrice;

    private Date claimDate;

    private String medicineStore;

    private String claimKind;

    private String bill;

    private String claimReason;

    private String claimStatus;

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId == null ? null : claimId.trim();
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

    public String getMedicineStore() {
        return medicineStore;
    }

    public void setMedicineStore(String medicineStore) {
        this.medicineStore = medicineStore == null ? null : medicineStore.trim();
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