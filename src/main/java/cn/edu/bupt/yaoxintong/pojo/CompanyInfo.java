package cn.edu.bupt.yaoxintong.pojo;

public class CompanyInfo {
    private String id;

    private String companyName;

    private String phoneNumble;

    private String address;

    private String disclaimer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getPhoneNumble() {
        return phoneNumble;
    }

    public void setPhoneNumble(String phoneNumble) {
        this.phoneNumble = phoneNumble == null ? null : phoneNumble.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer == null ? null : disclaimer.trim();
    }
}