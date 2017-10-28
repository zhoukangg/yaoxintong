package cn.edu.bupt.yaoxintong.pojo.custom;

public class BodyPart {
    private Integer id;

    private String part;

    private String medicineClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part == null ? null : part.trim();
    }

    public String getMedicineClass() {
        return medicineClass;
    }

    public void setMedicineClass(String medicineClass) {
        this.medicineClass = medicineClass == null ? null : medicineClass.trim();
    }
}