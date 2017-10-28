package cn.edu.bupt.yaoxintong.pojo;

import java.util.ArrayList;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNull() {
            addCriterion("drug_name is null");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNotNull() {
            addCriterion("drug_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNameEqualTo(String value) {
            addCriterion("drug_name =", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotEqualTo(String value) {
            addCriterion("drug_name <>", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThan(String value) {
            addCriterion("drug_name >", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("drug_name >=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThan(String value) {
            addCriterion("drug_name <", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThanOrEqualTo(String value) {
            addCriterion("drug_name <=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLike(String value) {
            addCriterion("drug_name like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotLike(String value) {
            addCriterion("drug_name not like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameIn(List<String> values) {
            addCriterion("drug_name in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotIn(List<String> values) {
            addCriterion("drug_name not in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameBetween(String value1, String value2) {
            addCriterion("drug_name between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotBetween(String value1, String value2) {
            addCriterion("drug_name not between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Byte value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Byte value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Byte value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Byte value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Byte value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Byte> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Byte> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Byte value1, Byte value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Byte value1, Byte value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andDrugFormIsNull() {
            addCriterion("drug_form is null");
            return (Criteria) this;
        }

        public Criteria andDrugFormIsNotNull() {
            addCriterion("drug_form is not null");
            return (Criteria) this;
        }

        public Criteria andDrugFormEqualTo(String value) {
            addCriterion("drug_form =", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotEqualTo(String value) {
            addCriterion("drug_form <>", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormGreaterThan(String value) {
            addCriterion("drug_form >", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormGreaterThanOrEqualTo(String value) {
            addCriterion("drug_form >=", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormLessThan(String value) {
            addCriterion("drug_form <", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormLessThanOrEqualTo(String value) {
            addCriterion("drug_form <=", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormLike(String value) {
            addCriterion("drug_form like", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotLike(String value) {
            addCriterion("drug_form not like", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormIn(List<String> values) {
            addCriterion("drug_form in", values, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotIn(List<String> values) {
            addCriterion("drug_form not in", values, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormBetween(String value1, String value2) {
            addCriterion("drug_form between", value1, value2, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotBetween(String value1, String value2) {
            addCriterion("drug_form not between", value1, value2, "drugForm");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDrugType1IsNull() {
            addCriterion("drug_type_1 is null");
            return (Criteria) this;
        }

        public Criteria andDrugType1IsNotNull() {
            addCriterion("drug_type_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDrugType1EqualTo(String value) {
            addCriterion("drug_type_1 =", value, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1NotEqualTo(String value) {
            addCriterion("drug_type_1 <>", value, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1GreaterThan(String value) {
            addCriterion("drug_type_1 >", value, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1GreaterThanOrEqualTo(String value) {
            addCriterion("drug_type_1 >=", value, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1LessThan(String value) {
            addCriterion("drug_type_1 <", value, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1LessThanOrEqualTo(String value) {
            addCriterion("drug_type_1 <=", value, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1Like(String value) {
            addCriterion("drug_type_1 like", value, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1NotLike(String value) {
            addCriterion("drug_type_1 not like", value, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1In(List<String> values) {
            addCriterion("drug_type_1 in", values, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1NotIn(List<String> values) {
            addCriterion("drug_type_1 not in", values, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1Between(String value1, String value2) {
            addCriterion("drug_type_1 between", value1, value2, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType1NotBetween(String value1, String value2) {
            addCriterion("drug_type_1 not between", value1, value2, "drugType1");
            return (Criteria) this;
        }

        public Criteria andDrugType2IsNull() {
            addCriterion("drug_type_2 is null");
            return (Criteria) this;
        }

        public Criteria andDrugType2IsNotNull() {
            addCriterion("drug_type_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDrugType2EqualTo(String value) {
            addCriterion("drug_type_2 =", value, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2NotEqualTo(String value) {
            addCriterion("drug_type_2 <>", value, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2GreaterThan(String value) {
            addCriterion("drug_type_2 >", value, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2GreaterThanOrEqualTo(String value) {
            addCriterion("drug_type_2 >=", value, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2LessThan(String value) {
            addCriterion("drug_type_2 <", value, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2LessThanOrEqualTo(String value) {
            addCriterion("drug_type_2 <=", value, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2Like(String value) {
            addCriterion("drug_type_2 like", value, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2NotLike(String value) {
            addCriterion("drug_type_2 not like", value, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2In(List<String> values) {
            addCriterion("drug_type_2 in", values, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2NotIn(List<String> values) {
            addCriterion("drug_type_2 not in", values, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2Between(String value1, String value2) {
            addCriterion("drug_type_2 between", value1, value2, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType2NotBetween(String value1, String value2) {
            addCriterion("drug_type_2 not between", value1, value2, "drugType2");
            return (Criteria) this;
        }

        public Criteria andDrugType3IsNull() {
            addCriterion("drug_type_3 is null");
            return (Criteria) this;
        }

        public Criteria andDrugType3IsNotNull() {
            addCriterion("drug_type_3 is not null");
            return (Criteria) this;
        }

        public Criteria andDrugType3EqualTo(String value) {
            addCriterion("drug_type_3 =", value, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3NotEqualTo(String value) {
            addCriterion("drug_type_3 <>", value, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3GreaterThan(String value) {
            addCriterion("drug_type_3 >", value, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3GreaterThanOrEqualTo(String value) {
            addCriterion("drug_type_3 >=", value, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3LessThan(String value) {
            addCriterion("drug_type_3 <", value, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3LessThanOrEqualTo(String value) {
            addCriterion("drug_type_3 <=", value, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3Like(String value) {
            addCriterion("drug_type_3 like", value, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3NotLike(String value) {
            addCriterion("drug_type_3 not like", value, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3In(List<String> values) {
            addCriterion("drug_type_3 in", values, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3NotIn(List<String> values) {
            addCriterion("drug_type_3 not in", values, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3Between(String value1, String value2) {
            addCriterion("drug_type_3 between", value1, value2, "drugType3");
            return (Criteria) this;
        }

        public Criteria andDrugType3NotBetween(String value1, String value2) {
            addCriterion("drug_type_3 not between", value1, value2, "drugType3");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIsNull() {
            addCriterion("prescription_type is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIsNotNull() {
            addCriterion("prescription_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeEqualTo(String value) {
            addCriterion("prescription_type =", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotEqualTo(String value) {
            addCriterion("prescription_type <>", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeGreaterThan(String value) {
            addCriterion("prescription_type >", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("prescription_type >=", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLessThan(String value) {
            addCriterion("prescription_type <", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLessThanOrEqualTo(String value) {
            addCriterion("prescription_type <=", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLike(String value) {
            addCriterion("prescription_type like", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotLike(String value) {
            addCriterion("prescription_type not like", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIn(List<String> values) {
            addCriterion("prescription_type in", values, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotIn(List<String> values) {
            addCriterion("prescription_type not in", values, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeBetween(String value1, String value2) {
            addCriterion("prescription_type between", value1, value2, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotBetween(String value1, String value2) {
            addCriterion("prescription_type not between", value1, value2, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andImportTypeIsNull() {
            addCriterion("import_type is null");
            return (Criteria) this;
        }

        public Criteria andImportTypeIsNotNull() {
            addCriterion("import_type is not null");
            return (Criteria) this;
        }

        public Criteria andImportTypeEqualTo(String value) {
            addCriterion("import_type =", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeNotEqualTo(String value) {
            addCriterion("import_type <>", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeGreaterThan(String value) {
            addCriterion("import_type >", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("import_type >=", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeLessThan(String value) {
            addCriterion("import_type <", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeLessThanOrEqualTo(String value) {
            addCriterion("import_type <=", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeLike(String value) {
            addCriterion("import_type like", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeNotLike(String value) {
            addCriterion("import_type not like", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeIn(List<String> values) {
            addCriterion("import_type in", values, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeNotIn(List<String> values) {
            addCriterion("import_type not in", values, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeBetween(String value1, String value2) {
            addCriterion("import_type between", value1, value2, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeNotBetween(String value1, String value2) {
            addCriterion("import_type not between", value1, value2, "importType");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsIsNull() {
            addCriterion("drug_specifications is null");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsIsNotNull() {
            addCriterion("drug_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsEqualTo(String value) {
            addCriterion("drug_specifications =", value, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsNotEqualTo(String value) {
            addCriterion("drug_specifications <>", value, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsGreaterThan(String value) {
            addCriterion("drug_specifications >", value, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("drug_specifications >=", value, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsLessThan(String value) {
            addCriterion("drug_specifications <", value, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("drug_specifications <=", value, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsLike(String value) {
            addCriterion("drug_specifications like", value, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsNotLike(String value) {
            addCriterion("drug_specifications not like", value, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsIn(List<String> values) {
            addCriterion("drug_specifications in", values, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsNotIn(List<String> values) {
            addCriterion("drug_specifications not in", values, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsBetween(String value1, String value2) {
            addCriterion("drug_specifications between", value1, value2, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andDrugSpecificationsNotBetween(String value1, String value2) {
            addCriterion("drug_specifications not between", value1, value2, "drugSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductPlaceIsNull() {
            addCriterion("product_place is null");
            return (Criteria) this;
        }

        public Criteria andProductPlaceIsNotNull() {
            addCriterion("product_place is not null");
            return (Criteria) this;
        }

        public Criteria andProductPlaceEqualTo(String value) {
            addCriterion("product_place =", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceNotEqualTo(String value) {
            addCriterion("product_place <>", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceGreaterThan(String value) {
            addCriterion("product_place >", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("product_place >=", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceLessThan(String value) {
            addCriterion("product_place <", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceLessThanOrEqualTo(String value) {
            addCriterion("product_place <=", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceLike(String value) {
            addCriterion("product_place like", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceNotLike(String value) {
            addCriterion("product_place not like", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceIn(List<String> values) {
            addCriterion("product_place in", values, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceNotIn(List<String> values) {
            addCriterion("product_place not in", values, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceBetween(String value1, String value2) {
            addCriterion("product_place between", value1, value2, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceNotBetween(String value1, String value2) {
            addCriterion("product_place not between", value1, value2, "productPlace");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIsNull() {
            addCriterion("valid_period is null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIsNotNull() {
            addCriterion("valid_period is not null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodEqualTo(String value) {
            addCriterion("valid_period =", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotEqualTo(String value) {
            addCriterion("valid_period <>", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodGreaterThan(String value) {
            addCriterion("valid_period >", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("valid_period >=", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLessThan(String value) {
            addCriterion("valid_period <", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLessThanOrEqualTo(String value) {
            addCriterion("valid_period <=", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLike(String value) {
            addCriterion("valid_period like", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotLike(String value) {
            addCriterion("valid_period not like", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIn(List<String> values) {
            addCriterion("valid_period in", values, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotIn(List<String> values) {
            addCriterion("valid_period not in", values, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodBetween(String value1, String value2) {
            addCriterion("valid_period between", value1, value2, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotBetween(String value1, String value2) {
            addCriterion("valid_period not between", value1, value2, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessIsNull() {
            addCriterion("use_for_illness is null");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessIsNotNull() {
            addCriterion("use_for_illness is not null");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessEqualTo(String value) {
            addCriterion("use_for_illness =", value, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessNotEqualTo(String value) {
            addCriterion("use_for_illness <>", value, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessGreaterThan(String value) {
            addCriterion("use_for_illness >", value, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessGreaterThanOrEqualTo(String value) {
            addCriterion("use_for_illness >=", value, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessLessThan(String value) {
            addCriterion("use_for_illness <", value, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessLessThanOrEqualTo(String value) {
            addCriterion("use_for_illness <=", value, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessLike(String value) {
            addCriterion("use_for_illness like", value, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessNotLike(String value) {
            addCriterion("use_for_illness not like", value, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessIn(List<String> values) {
            addCriterion("use_for_illness in", values, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessNotIn(List<String> values) {
            addCriterion("use_for_illness not in", values, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessBetween(String value1, String value2) {
            addCriterion("use_for_illness between", value1, value2, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForIllnessNotBetween(String value1, String value2) {
            addCriterion("use_for_illness not between", value1, value2, "useForIllness");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleIsNull() {
            addCriterion("use_for_people is null");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleIsNotNull() {
            addCriterion("use_for_people is not null");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleEqualTo(String value) {
            addCriterion("use_for_people =", value, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleNotEqualTo(String value) {
            addCriterion("use_for_people <>", value, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleGreaterThan(String value) {
            addCriterion("use_for_people >", value, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("use_for_people >=", value, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleLessThan(String value) {
            addCriterion("use_for_people <", value, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleLessThanOrEqualTo(String value) {
            addCriterion("use_for_people <=", value, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleLike(String value) {
            addCriterion("use_for_people like", value, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleNotLike(String value) {
            addCriterion("use_for_people not like", value, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleIn(List<String> values) {
            addCriterion("use_for_people in", values, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleNotIn(List<String> values) {
            addCriterion("use_for_people not in", values, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleBetween(String value1, String value2) {
            addCriterion("use_for_people between", value1, value2, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseForPeopleNotBetween(String value1, String value2) {
            addCriterion("use_for_people not between", value1, value2, "useForPeople");
            return (Criteria) this;
        }

        public Criteria andUseFunctionIsNull() {
            addCriterion("use_function is null");
            return (Criteria) this;
        }

        public Criteria andUseFunctionIsNotNull() {
            addCriterion("use_function is not null");
            return (Criteria) this;
        }

        public Criteria andUseFunctionEqualTo(String value) {
            addCriterion("use_function =", value, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionNotEqualTo(String value) {
            addCriterion("use_function <>", value, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionGreaterThan(String value) {
            addCriterion("use_function >", value, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("use_function >=", value, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionLessThan(String value) {
            addCriterion("use_function <", value, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionLessThanOrEqualTo(String value) {
            addCriterion("use_function <=", value, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionLike(String value) {
            addCriterion("use_function like", value, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionNotLike(String value) {
            addCriterion("use_function not like", value, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionIn(List<String> values) {
            addCriterion("use_function in", values, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionNotIn(List<String> values) {
            addCriterion("use_function not in", values, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionBetween(String value1, String value2) {
            addCriterion("use_function between", value1, value2, "useFunction");
            return (Criteria) this;
        }

        public Criteria andUseFunctionNotBetween(String value1, String value2) {
            addCriterion("use_function not between", value1, value2, "useFunction");
            return (Criteria) this;
        }

        public Criteria andDosageUseIsNull() {
            addCriterion("dosage_use is null");
            return (Criteria) this;
        }

        public Criteria andDosageUseIsNotNull() {
            addCriterion("dosage_use is not null");
            return (Criteria) this;
        }

        public Criteria andDosageUseEqualTo(String value) {
            addCriterion("dosage_use =", value, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseNotEqualTo(String value) {
            addCriterion("dosage_use <>", value, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseGreaterThan(String value) {
            addCriterion("dosage_use >", value, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseGreaterThanOrEqualTo(String value) {
            addCriterion("dosage_use >=", value, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseLessThan(String value) {
            addCriterion("dosage_use <", value, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseLessThanOrEqualTo(String value) {
            addCriterion("dosage_use <=", value, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseLike(String value) {
            addCriterion("dosage_use like", value, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseNotLike(String value) {
            addCriterion("dosage_use not like", value, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseIn(List<String> values) {
            addCriterion("dosage_use in", values, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseNotIn(List<String> values) {
            addCriterion("dosage_use not in", values, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseBetween(String value1, String value2) {
            addCriterion("dosage_use between", value1, value2, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andDosageUseNotBetween(String value1, String value2) {
            addCriterion("dosage_use not between", value1, value2, "dosageUse");
            return (Criteria) this;
        }

        public Criteria andStorageConditionIsNull() {
            addCriterion("Storage_condition is null");
            return (Criteria) this;
        }

        public Criteria andStorageConditionIsNotNull() {
            addCriterion("Storage_condition is not null");
            return (Criteria) this;
        }

        public Criteria andStorageConditionEqualTo(String value) {
            addCriterion("Storage_condition =", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotEqualTo(String value) {
            addCriterion("Storage_condition <>", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionGreaterThan(String value) {
            addCriterion("Storage_condition >", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionGreaterThanOrEqualTo(String value) {
            addCriterion("Storage_condition >=", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionLessThan(String value) {
            addCriterion("Storage_condition <", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionLessThanOrEqualTo(String value) {
            addCriterion("Storage_condition <=", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionLike(String value) {
            addCriterion("Storage_condition like", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotLike(String value) {
            addCriterion("Storage_condition not like", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionIn(List<String> values) {
            addCriterion("Storage_condition in", values, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotIn(List<String> values) {
            addCriterion("Storage_condition not in", values, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionBetween(String value1, String value2) {
            addCriterion("Storage_condition between", value1, value2, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotBetween(String value1, String value2) {
            addCriterion("Storage_condition not between", value1, value2, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("product_weight is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("product_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(String value) {
            addCriterion("product_weight =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(String value) {
            addCriterion("product_weight <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(String value) {
            addCriterion("product_weight >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(String value) {
            addCriterion("product_weight >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(String value) {
            addCriterion("product_weight <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(String value) {
            addCriterion("product_weight <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLike(String value) {
            addCriterion("product_weight like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotLike(String value) {
            addCriterion("product_weight not like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<String> values) {
            addCriterion("product_weight in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<String> values) {
            addCriterion("product_weight not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(String value1, String value2) {
            addCriterion("product_weight between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(String value1, String value2) {
            addCriterion("product_weight not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}