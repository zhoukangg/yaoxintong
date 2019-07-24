package cn.edu.bupt.yaoxintong.pojo;

public class Medicine {
    private String id;

    private String drugName;

    private String brand;

    private String manufacturer;

    private String licenseNumber;

    private Byte recommend;

    private String drugForm;

    private String type;

    private String drugType1;

    private String drugType2;

    private String drugType3;

    private String prescriptionType;

    private String importType;

    private String drugSpecifications;

    private String productPlace;

    private String validPeriod;

    private String useForIllness;

    private String useForPeople;

    private String useFunction;

    private String dosageUse;

    private String storageCondition;

    private String productWeight;

    private Double price;

    private Integer hot;
    private Integer authentication;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    public Byte getRecommend() {
        return recommend;
    }

    public void setRecommend(Byte recommend) {
        this.recommend = recommend;
    }

    public String getDrugForm() {
        return drugForm;
    }

    public void setDrugForm(String drugForm) {
        this.drugForm = drugForm == null ? null : drugForm.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDrugType1() {
        return drugType1;
    }

    public void setDrugType1(String drugType1) {
        this.drugType1 = drugType1 == null ? null : drugType1.trim();
    }

    public String getDrugType2() {
        return drugType2;
    }

    public void setDrugType2(String drugType2) {
        this.drugType2 = drugType2 == null ? null : drugType2.trim();
    }

    public String getDrugType3() {
        return drugType3;
    }

    public void setDrugType3(String drugType3) {
        this.drugType3 = drugType3 == null ? null : drugType3.trim();
    }

    public String getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(String prescriptionType) {
        this.prescriptionType = prescriptionType == null ? null : prescriptionType.trim();
    }

    public String getImportType() {
        return importType;
    }

    public void setImportType(String importType) {
        this.importType = importType == null ? null : importType.trim();
    }

    public String getDrugSpecifications() {
        return drugSpecifications;
    }

    public void setDrugSpecifications(String drugSpecifications) {
        this.drugSpecifications = drugSpecifications == null ? null : drugSpecifications.trim();
    }

    public String getProductPlace() {
        return productPlace;
    }

    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace == null ? null : productPlace.trim();
    }

    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod == null ? null : validPeriod.trim();
    }

    public String getUseForIllness() {
        return useForIllness;
    }

    public void setUseForIllness(String useForIllness) {
        this.useForIllness = useForIllness == null ? null : useForIllness.trim();
    }

    public String getUseForPeople() {
        return useForPeople;
    }

    public void setUseForPeople(String useForPeople) {
        this.useForPeople = useForPeople == null ? null : useForPeople.trim();
    }

    public String getUseFunction() {
        return useFunction;
    }

    public void setUseFunction(String useFunction) {
        this.useFunction = useFunction == null ? null : useFunction.trim();
    }

    public String getDosageUse() {
        return dosageUse;
    }

    public void setDosageUse(String dosageUse) {
        this.dosageUse = dosageUse == null ? null : dosageUse.trim();
    }

    public String getStorageCondition() {
        return storageCondition;
    }

    public void setStorageCondition(String storageCondition) {
        this.storageCondition = storageCondition == null ? null : storageCondition.trim();
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight == null ? null : productWeight.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Integer getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Integer authentication) {
        this.authentication = authentication;
    }
}