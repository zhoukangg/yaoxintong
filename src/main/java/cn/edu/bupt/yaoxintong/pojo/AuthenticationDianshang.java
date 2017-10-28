package cn.edu.bupt.yaoxintong.pojo;

import java.util.Date;

public class AuthenticationDianshang {
    private String enterpriseName;

    private String address;

    private String contacts;

    private String contactPhone;

    private String icp;

    private String drugTradingLicense;

    private String drugAdministrationLicense;

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

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp == null ? null : icp.trim();
    }

    public String getDrugTradingLicense() {
        return drugTradingLicense;
    }

    public void setDrugTradingLicense(String drugTradingLicense) {
        this.drugTradingLicense = drugTradingLicense == null ? null : drugTradingLicense.trim();
    }

    public String getDrugAdministrationLicense() {
        return drugAdministrationLicense;
    }

    public void setDrugAdministrationLicense(String drugAdministrationLicense) {
        this.drugAdministrationLicense = drugAdministrationLicense == null ? null : drugAdministrationLicense.trim();
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