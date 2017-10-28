package cn.edu.bupt.yaoxintong.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthenticationExample() {
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(String value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(String value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(String value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(String value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLike(String value) {
            addCriterion("business_id like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotLike(String value) {
            addCriterion("business_id not like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<String> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<String> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(String value1, String value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(String value1, String value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andHealthIsNull() {
            addCriterion("health is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("health is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("health =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("health <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("health >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("health >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("health <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("health <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("health like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("health not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("health in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("health not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("health between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("health not between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andIcpInformationIsNull() {
            addCriterion("icp_information is null");
            return (Criteria) this;
        }

        public Criteria andIcpInformationIsNotNull() {
            addCriterion("icp_information is not null");
            return (Criteria) this;
        }

        public Criteria andIcpInformationEqualTo(String value) {
            addCriterion("icp_information =", value, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationNotEqualTo(String value) {
            addCriterion("icp_information <>", value, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationGreaterThan(String value) {
            addCriterion("icp_information >", value, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationGreaterThanOrEqualTo(String value) {
            addCriterion("icp_information >=", value, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationLessThan(String value) {
            addCriterion("icp_information <", value, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationLessThanOrEqualTo(String value) {
            addCriterion("icp_information <=", value, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationLike(String value) {
            addCriterion("icp_information like", value, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationNotLike(String value) {
            addCriterion("icp_information not like", value, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationIn(List<String> values) {
            addCriterion("icp_information in", values, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationNotIn(List<String> values) {
            addCriterion("icp_information not in", values, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationBetween(String value1, String value2) {
            addCriterion("icp_information between", value1, value2, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andIcpInformationNotBetween(String value1, String value2) {
            addCriterion("icp_information not between", value1, value2, "icpInformation");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseIsNull() {
            addCriterion("food_distribution_license is null");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseIsNotNull() {
            addCriterion("food_distribution_license is not null");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseEqualTo(String value) {
            addCriterion("food_distribution_license =", value, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseNotEqualTo(String value) {
            addCriterion("food_distribution_license <>", value, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseGreaterThan(String value) {
            addCriterion("food_distribution_license >", value, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("food_distribution_license >=", value, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseLessThan(String value) {
            addCriterion("food_distribution_license <", value, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseLessThanOrEqualTo(String value) {
            addCriterion("food_distribution_license <=", value, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseLike(String value) {
            addCriterion("food_distribution_license like", value, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseNotLike(String value) {
            addCriterion("food_distribution_license not like", value, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseIn(List<String> values) {
            addCriterion("food_distribution_license in", values, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseNotIn(List<String> values) {
            addCriterion("food_distribution_license not in", values, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseBetween(String value1, String value2) {
            addCriterion("food_distribution_license between", value1, value2, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicenseNotBetween(String value1, String value2) {
            addCriterion("food_distribution_license not between", value1, value2, "foodDistributionLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseIsNull() {
            addCriterion("intnet_license is null");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseIsNotNull() {
            addCriterion("intnet_license is not null");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseEqualTo(String value) {
            addCriterion("intnet_license =", value, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseNotEqualTo(String value) {
            addCriterion("intnet_license <>", value, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseGreaterThan(String value) {
            addCriterion("intnet_license >", value, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("intnet_license >=", value, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseLessThan(String value) {
            addCriterion("intnet_license <", value, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseLessThanOrEqualTo(String value) {
            addCriterion("intnet_license <=", value, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseLike(String value) {
            addCriterion("intnet_license like", value, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseNotLike(String value) {
            addCriterion("intnet_license not like", value, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseIn(List<String> values) {
            addCriterion("intnet_license in", values, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseNotIn(List<String> values) {
            addCriterion("intnet_license not in", values, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseBetween(String value1, String value2) {
            addCriterion("intnet_license between", value1, value2, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andIntnetLicenseNotBetween(String value1, String value2) {
            addCriterion("intnet_license not between", value1, value2, "intnetLicense");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeIsNull() {
            addCriterion("good_supplying_practice is null");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeIsNotNull() {
            addCriterion("good_supplying_practice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeEqualTo(String value) {
            addCriterion("good_supplying_practice =", value, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeNotEqualTo(String value) {
            addCriterion("good_supplying_practice <>", value, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeGreaterThan(String value) {
            addCriterion("good_supplying_practice >", value, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeGreaterThanOrEqualTo(String value) {
            addCriterion("good_supplying_practice >=", value, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeLessThan(String value) {
            addCriterion("good_supplying_practice <", value, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeLessThanOrEqualTo(String value) {
            addCriterion("good_supplying_practice <=", value, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeLike(String value) {
            addCriterion("good_supplying_practice like", value, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeNotLike(String value) {
            addCriterion("good_supplying_practice not like", value, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeIn(List<String> values) {
            addCriterion("good_supplying_practice in", values, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeNotIn(List<String> values) {
            addCriterion("good_supplying_practice not in", values, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeBetween(String value1, String value2) {
            addCriterion("good_supplying_practice between", value1, value2, "goodSupplyingPractice");
            return (Criteria) this;
        }

        public Criteria andGoodSupplyingPracticeNotBetween(String value1, String value2) {
            addCriterion("good_supplying_practice not between", value1, value2, "goodSupplyingPractice");
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