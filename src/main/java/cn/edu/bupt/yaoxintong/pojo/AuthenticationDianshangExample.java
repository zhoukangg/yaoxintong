package cn.edu.bupt.yaoxintong.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationDianshangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthenticationDianshangExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andCorporateNameIsNull() {
            addCriterion("corporate_name is null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIsNotNull() {
            addCriterion("corporate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameEqualTo(String value) {
            addCriterion("corporate_name =", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotEqualTo(String value) {
            addCriterion("corporate_name <>", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThan(String value) {
            addCriterion("corporate_name >", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_name >=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThan(String value) {
            addCriterion("corporate_name <", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThanOrEqualTo(String value) {
            addCriterion("corporate_name <=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLike(String value) {
            addCriterion("corporate_name like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotLike(String value) {
            addCriterion("corporate_name not like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIn(List<String> values) {
            addCriterion("corporate_name in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotIn(List<String> values) {
            addCriterion("corporate_name not in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameBetween(String value1, String value2) {
            addCriterion("corporate_name between", value1, value2, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotBetween(String value1, String value2) {
            addCriterion("corporate_name not between", value1, value2, "corporateName");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andIcpFilingInformationIsNull() {
            addCriterion("icp_filing_information is null");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationIsNotNull() {
            addCriterion("icp_filing_information is not null");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationEqualTo(String value) {
            addCriterion("icp_filing_information =", value, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationNotEqualTo(String value) {
            addCriterion("icp_filing_information <>", value, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationGreaterThan(String value) {
            addCriterion("icp_filing_information >", value, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationGreaterThanOrEqualTo(String value) {
            addCriterion("icp_filing_information >=", value, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationLessThan(String value) {
            addCriterion("icp_filing_information <", value, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationLessThanOrEqualTo(String value) {
            addCriterion("icp_filing_information <=", value, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationLike(String value) {
            addCriterion("icp_filing_information like", value, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationNotLike(String value) {
            addCriterion("icp_filing_information not like", value, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationIn(List<String> values) {
            addCriterion("icp_filing_information in", values, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationNotIn(List<String> values) {
            addCriterion("icp_filing_information not in", values, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationBetween(String value1, String value2) {
            addCriterion("icp_filing_information between", value1, value2, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIcpFilingInformationNotBetween(String value1, String value2) {
            addCriterion("icp_filing_information not between", value1, value2, "icpFilingInformation");
            return (Criteria) this;
        }

        public Criteria andIdtsqcIsNull() {
            addCriterion("idtsqc is null");
            return (Criteria) this;
        }

        public Criteria andIdtsqcIsNotNull() {
            addCriterion("idtsqc is not null");
            return (Criteria) this;
        }

        public Criteria andIdtsqcEqualTo(String value) {
            addCriterion("idtsqc =", value, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcNotEqualTo(String value) {
            addCriterion("idtsqc <>", value, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcGreaterThan(String value) {
            addCriterion("idtsqc >", value, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcGreaterThanOrEqualTo(String value) {
            addCriterion("idtsqc >=", value, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcLessThan(String value) {
            addCriterion("idtsqc <", value, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcLessThanOrEqualTo(String value) {
            addCriterion("idtsqc <=", value, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcLike(String value) {
            addCriterion("idtsqc like", value, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcNotLike(String value) {
            addCriterion("idtsqc not like", value, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcIn(List<String> values) {
            addCriterion("idtsqc in", values, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcNotIn(List<String> values) {
            addCriterion("idtsqc not in", values, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcBetween(String value1, String value2) {
            addCriterion("idtsqc between", value1, value2, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andIdtsqcNotBetween(String value1, String value2) {
            addCriterion("idtsqc not between", value1, value2, "idtsqc");
            return (Criteria) this;
        }

        public Criteria andDmqmscIsNull() {
            addCriterion("dmqmsc is null");
            return (Criteria) this;
        }

        public Criteria andDmqmscIsNotNull() {
            addCriterion("dmqmsc is not null");
            return (Criteria) this;
        }

        public Criteria andDmqmscEqualTo(String value) {
            addCriterion("dmqmsc =", value, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscNotEqualTo(String value) {
            addCriterion("dmqmsc <>", value, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscGreaterThan(String value) {
            addCriterion("dmqmsc >", value, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscGreaterThanOrEqualTo(String value) {
            addCriterion("dmqmsc >=", value, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscLessThan(String value) {
            addCriterion("dmqmsc <", value, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscLessThanOrEqualTo(String value) {
            addCriterion("dmqmsc <=", value, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscLike(String value) {
            addCriterion("dmqmsc like", value, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscNotLike(String value) {
            addCriterion("dmqmsc not like", value, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscIn(List<String> values) {
            addCriterion("dmqmsc in", values, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscNotIn(List<String> values) {
            addCriterion("dmqmsc not in", values, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscBetween(String value1, String value2) {
            addCriterion("dmqmsc between", value1, value2, "dmqmsc");
            return (Criteria) this;
        }

        public Criteria andDmqmscNotBetween(String value1, String value2) {
            addCriterion("dmqmsc not between", value1, value2, "dmqmsc");
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