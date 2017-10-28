package cn.edu.bupt.yaoxintong.pojo;

public class Authentication {
    private String id;

    private String businessId;

    private String companyName;

    private String companyType;

    private String contact;

    private String phone;

    private String license;

    private String health;

    private String icpInformation;

    private String foodDistributionLicense;

    private String intnetLicense;

    private String goodSupplyingPractice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health == null ? null : health.trim();
    }

    public String getIcpInformation() {
        return icpInformation;
    }

    public void setIcpInformation(String icpInformation) {
        this.icpInformation = icpInformation == null ? null : icpInformation.trim();
    }

    public String getFoodDistributionLicense() {
        return foodDistributionLicense;
    }

    public void setFoodDistributionLicense(String foodDistributionLicense) {
        this.foodDistributionLicense = foodDistributionLicense == null ? null : foodDistributionLicense.trim();
    }

    public String getIntnetLicense() {
        return intnetLicense;
    }

    public void setIntnetLicense(String intnetLicense) {
        this.intnetLicense = intnetLicense == null ? null : intnetLicense.trim();
    }

    public String getGoodSupplyingPractice() {
        return goodSupplyingPractice;
    }

    public void setGoodSupplyingPractice(String goodSupplyingPractice) {
        this.goodSupplyingPractice = goodSupplyingPractice == null ? null : goodSupplyingPractice.trim();
    }
}