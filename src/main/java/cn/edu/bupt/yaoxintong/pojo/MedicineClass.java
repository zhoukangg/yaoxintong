package cn.edu.bupt.yaoxintong.pojo;

public class MedicineClass {
    private Integer id;

    private String name;

    private Integer level;

    private Integer farther;

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getFarther() {
        return farther;
    }

    public void setFarther(Integer farther) {
        this.farther = farther;
    }
}