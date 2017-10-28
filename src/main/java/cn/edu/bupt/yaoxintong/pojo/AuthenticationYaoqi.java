package cn.edu.bupt.yaoxintong.pojo;

import java.util.Date;

public class AuthenticationYaoqi {
    private String enterpriseName;

    private String address;

    private String contacts;

    private String contactPhone;

    private String healthLicense;

    private String foodCirculationLicense;

    private String businessLicense;

    private Long certificateNumber;

    private Date authenticationStarttime;

    private Date validDate;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getHealthLicense() {
        return healthLicense;
    }

    public void setHealthLicense(String healthLicense) {
        this.healthLicense = healthLicense == null ? null : healthLicense.trim();
    }

    public String getFoodCirculationLicense() {
        return foodCirculationLicense;
    }

    public void setFoodCirculationLicense(String foodCirculationLicense) {
        this.foodCirculationLicense = foodCirculationLicense == null ? null : foodCirculationLicense.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public Long getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(Long certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public Date getAuthenticationStarttime() {
        return authenticationStarttime;
    }

    public void setAuthenticationStarttime(Date authenticationStarttime) {
        this.authenticationStarttime = authenticationStarttime;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }
}