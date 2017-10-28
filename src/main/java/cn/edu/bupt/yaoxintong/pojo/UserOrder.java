package cn.edu.bupt.yaoxintong.pojo;

import java.util.Date;

public class UserOrder {
    private String id;

    private String userId;

    private String medicineName;

    private Float price;

    private Integer medicineNumber;

    private Float payPrice;

    private String orderStatus;

    private String orderOperation;

    private Date orderDate;

    private String businessName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getMedicineNumber() {
        return medicineNumber;
    }

    public void setMedicineNumber(Integer medicineNumber) {
        this.medicineNumber = medicineNumber;
    }

    public Float getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Float payPrice) {
        this.payPrice = payPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderOperation() {
        return orderOperation;
    }

    public void setOrderOperation(String orderOperation) {
        this.orderOperation = orderOperation == null ? null : orderOperation.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }
}