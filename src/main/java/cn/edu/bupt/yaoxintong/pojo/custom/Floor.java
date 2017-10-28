package cn.edu.bupt.yaoxintong.pojo.custom;

public class Floor {
    private Integer id;

    private String name;

    private Integer floor;

    private Integer medicineClassId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getMedicineClassId() {
        return medicineClassId;
    }

    public void setMedicineClassId(Integer medicineClassId) {
        this.medicineClassId = medicineClassId;
    }
}