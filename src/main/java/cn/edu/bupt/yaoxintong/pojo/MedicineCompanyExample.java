package cn.edu.bupt.yaoxintong.pojo;

import java.util.ArrayList;
import java.util.List;

public class MedicineCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineCompanyExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andProductionAddressIsNull() {
            addCriterion("production_address is null");
            return (Criteria) this;
        }

        public Criteria andProductionAddressIsNotNull() {
            addCriterion("production_address is not null");
            return (Criteria) this;
        }

        public Criteria andProductionAddressEqualTo(String value) {
            addCriterion("production_address =", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressNotEqualTo(String value) {
            addCriterion("production_address <>", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressGreaterThan(String value) {
            addCriterion("production_address >", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressGreaterThanOrEqualTo(String value) {
            addCriterion("production_address >=", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressLessThan(String value) {
            addCriterion("production_address <", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressLessThanOrEqualTo(String value) {
            addCriterion("production_address <=", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressLike(String value) {
            addCriterion("production_address like", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressNotLike(String value) {
            addCriterion("production_address not like", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressIn(List<String> values) {
            addCriterion("production_address in", values, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressNotIn(List<String> values) {
            addCriterion("production_address not in", values, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressBetween(String value1, String value2) {
            addCriterion("production_address between", value1, value2, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressNotBetween(String value1, String value2) {
            addCriterion("production_address not between", value1, value2, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionRangeIsNull() {
            addCriterion("production_range is null");
            return (Criteria) this;
        }

        public Criteria andProductionRangeIsNotNull() {
            addCriterion("production_range is not null");
            return (Criteria) this;
        }

        public Criteria andProductionRangeEqualTo(String value) {
            addCriterion("production_range =", value, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeNotEqualTo(String value) {
            addCriterion("production_range <>", value, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeGreaterThan(String value) {
            addCriterion("production_range >", value, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeGreaterThanOrEqualTo(String value) {
            addCriterion("production_range >=", value, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeLessThan(String value) {
            addCriterion("production_range <", value, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeLessThanOrEqualTo(String value) {
            addCriterion("production_range <=", value, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeLike(String value) {
            addCriterion("production_range like", value, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeNotLike(String value) {
            addCriterion("production_range not like", value, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeIn(List<String> values) {
            addCriterion("production_range in", values, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeNotIn(List<String> values) {
            addCriterion("production_range not in", values, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeBetween(String value1, String value2) {
            addCriterion("production_range between", value1, value2, "productionRange");
            return (Criteria) this;
        }

        public Criteria andProductionRangeNotBetween(String value1, String value2) {
            addCriterion("production_range not between", value1, value2, "productionRange");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNull() {
            addCriterion("issue_date is null");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNotNull() {
            addCriterion("issue_date is not null");
            return (Criteria) this;
        }

        public Criteria andIssueDateEqualTo(String value) {
            addCriterion("issue_date =", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotEqualTo(String value) {
            addCriterion("issue_date <>", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThan(String value) {
            addCriterion("issue_date >", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThanOrEqualTo(String value) {
            addCriterion("issue_date >=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThan(String value) {
            addCriterion("issue_date <", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThanOrEqualTo(String value) {
            addCriterion("issue_date <=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLike(String value) {
            addCriterion("issue_date like", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotLike(String value) {
            addCriterion("issue_date not like", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateIn(List<String> values) {
            addCriterion("issue_date in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotIn(List<String> values) {
            addCriterion("issue_date not in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateBetween(String value1, String value2) {
            addCriterion("issue_date between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotBetween(String value1, String value2) {
            addCriterion("issue_date not between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineIsNull() {
            addCriterion("effective_deadline is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineIsNotNull() {
            addCriterion("effective_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineEqualTo(String value) {
            addCriterion("effective_deadline =", value, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineNotEqualTo(String value) {
            addCriterion("effective_deadline <>", value, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineGreaterThan(String value) {
            addCriterion("effective_deadline >", value, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("effective_deadline >=", value, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineLessThan(String value) {
            addCriterion("effective_deadline <", value, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineLessThanOrEqualTo(String value) {
            addCriterion("effective_deadline <=", value, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineLike(String value) {
            addCriterion("effective_deadline like", value, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineNotLike(String value) {
            addCriterion("effective_deadline not like", value, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineIn(List<String> values) {
            addCriterion("effective_deadline in", values, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineNotIn(List<String> values) {
            addCriterion("effective_deadline not in", values, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineBetween(String value1, String value2) {
            addCriterion("effective_deadline between", value1, value2, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andEffectiveDeadlineNotBetween(String value1, String value2) {
            addCriterion("effective_deadline not between", value1, value2, "effectiveDeadline");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityIsNull() {
            addCriterion("issuing_authority is null");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityIsNotNull() {
            addCriterion("issuing_authority is not null");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityEqualTo(String value) {
            addCriterion("issuing_authority =", value, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityNotEqualTo(String value) {
            addCriterion("issuing_authority <>", value, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityGreaterThan(String value) {
            addCriterion("issuing_authority >", value, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("issuing_authority >=", value, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityLessThan(String value) {
            addCriterion("issuing_authority <", value, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityLessThanOrEqualTo(String value) {
            addCriterion("issuing_authority <=", value, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityLike(String value) {
            addCriterion("issuing_authority like", value, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityNotLike(String value) {
            addCriterion("issuing_authority not like", value, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityIn(List<String> values) {
            addCriterion("issuing_authority in", values, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityNotIn(List<String> values) {
            addCriterion("issuing_authority not in", values, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityBetween(String value1, String value2) {
            addCriterion("issuing_authority between", value1, value2, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuingAuthorityNotBetween(String value1, String value2) {
            addCriterion("issuing_authority not between", value1, value2, "issuingAuthority");
            return (Criteria) this;
        }

        public Criteria andIssuerIsNull() {
            addCriterion("issuer is null");
            return (Criteria) this;
        }

        public Criteria andIssuerIsNotNull() {
            addCriterion("issuer is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerEqualTo(String value) {
            addCriterion("issuer =", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotEqualTo(String value) {
            addCriterion("issuer <>", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerGreaterThan(String value) {
            addCriterion("issuer >", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("issuer >=", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLessThan(String value) {
            addCriterion("issuer <", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLessThanOrEqualTo(String value) {
            addCriterion("issuer <=", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLike(String value) {
            addCriterion("issuer like", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotLike(String value) {
            addCriterion("issuer not like", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerIn(List<String> values) {
            addCriterion("issuer in", values, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotIn(List<String> values) {
            addCriterion("issuer not in", values, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerBetween(String value1, String value2) {
            addCriterion("issuer between", value1, value2, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotBetween(String value1, String value2) {
            addCriterion("issuer not between", value1, value2, "issuer");
            return (Criteria) this;
        }

        public Criteria andRegulatorIsNull() {
            addCriterion("regulator is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorIsNotNull() {
            addCriterion("regulator is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorEqualTo(String value) {
            addCriterion("regulator =", value, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorNotEqualTo(String value) {
            addCriterion("regulator <>", value, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorGreaterThan(String value) {
            addCriterion("regulator >", value, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorGreaterThanOrEqualTo(String value) {
            addCriterion("regulator >=", value, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorLessThan(String value) {
            addCriterion("regulator <", value, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorLessThanOrEqualTo(String value) {
            addCriterion("regulator <=", value, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorLike(String value) {
            addCriterion("regulator like", value, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorNotLike(String value) {
            addCriterion("regulator not like", value, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorIn(List<String> values) {
            addCriterion("regulator in", values, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorNotIn(List<String> values) {
            addCriterion("regulator not in", values, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorBetween(String value1, String value2) {
            addCriterion("regulator between", value1, value2, "regulator");
            return (Criteria) this;
        }

        public Criteria andRegulatorNotBetween(String value1, String value2) {
            addCriterion("regulator not between", value1, value2, "regulator");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNull() {
            addCriterion("supervisor is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNotNull() {
            addCriterion("supervisor is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorEqualTo(String value) {
            addCriterion("supervisor =", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotEqualTo(String value) {
            addCriterion("supervisor <>", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThan(String value) {
            addCriterion("supervisor >", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThanOrEqualTo(String value) {
            addCriterion("supervisor >=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThan(String value) {
            addCriterion("supervisor <", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThanOrEqualTo(String value) {
            addCriterion("supervisor <=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLike(String value) {
            addCriterion("supervisor like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotLike(String value) {
            addCriterion("supervisor not like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorIn(List<String> values) {
            addCriterion("supervisor in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotIn(List<String> values) {
            addCriterion("supervisor not in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorBetween(String value1, String value2) {
            addCriterion("supervisor between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotBetween(String value1, String value2) {
            addCriterion("supervisor not between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeIsNull() {
            addCriterion("credit_organization_code is null");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeIsNotNull() {
            addCriterion("credit_organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeEqualTo(String value) {
            addCriterion("credit_organization_code =", value, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeNotEqualTo(String value) {
            addCriterion("credit_organization_code <>", value, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeGreaterThan(String value) {
            addCriterion("credit_organization_code >", value, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_organization_code >=", value, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeLessThan(String value) {
            addCriterion("credit_organization_code <", value, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("credit_organization_code <=", value, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeLike(String value) {
            addCriterion("credit_organization_code like", value, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeNotLike(String value) {
            addCriterion("credit_organization_code not like", value, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeIn(List<String> values) {
            addCriterion("credit_organization_code in", values, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeNotIn(List<String> values) {
            addCriterion("credit_organization_code not in", values, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeBetween(String value1, String value2) {
            addCriterion("credit_organization_code between", value1, value2, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andCreditOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("credit_organization_code not between", value1, value2, "creditOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andReportCallIsNull() {
            addCriterion("report_call is null");
            return (Criteria) this;
        }

        public Criteria andReportCallIsNotNull() {
            addCriterion("report_call is not null");
            return (Criteria) this;
        }

        public Criteria andReportCallEqualTo(String value) {
            addCriterion("report_call =", value, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallNotEqualTo(String value) {
            addCriterion("report_call <>", value, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallGreaterThan(String value) {
            addCriterion("report_call >", value, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallGreaterThanOrEqualTo(String value) {
            addCriterion("report_call >=", value, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallLessThan(String value) {
            addCriterion("report_call <", value, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallLessThanOrEqualTo(String value) {
            addCriterion("report_call <=", value, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallLike(String value) {
            addCriterion("report_call like", value, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallNotLike(String value) {
            addCriterion("report_call not like", value, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallIn(List<String> values) {
            addCriterion("report_call in", values, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallNotIn(List<String> values) {
            addCriterion("report_call not in", values, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallBetween(String value1, String value2) {
            addCriterion("report_call between", value1, value2, "reportCall");
            return (Criteria) this;
        }

        public Criteria andReportCallNotBetween(String value1, String value2) {
            addCriterion("report_call not between", value1, value2, "reportCall");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeIsNull() {
            addCriterion("classification_code is null");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeIsNotNull() {
            addCriterion("classification_code is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeEqualTo(String value) {
            addCriterion("classification_code =", value, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeNotEqualTo(String value) {
            addCriterion("classification_code <>", value, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeGreaterThan(String value) {
            addCriterion("classification_code >", value, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("classification_code >=", value, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeLessThan(String value) {
            addCriterion("classification_code <", value, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeLessThanOrEqualTo(String value) {
            addCriterion("classification_code <=", value, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeLike(String value) {
            addCriterion("classification_code like", value, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeNotLike(String value) {
            addCriterion("classification_code not like", value, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeIn(List<String> values) {
            addCriterion("classification_code in", values, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeNotIn(List<String> values) {
            addCriterion("classification_code not in", values, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeBetween(String value1, String value2) {
            addCriterion("classification_code between", value1, value2, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andClassificationCodeNotBetween(String value1, String value2) {
            addCriterion("classification_code not between", value1, value2, "classificationCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesIsNull() {
            addCriterion("provinces_cities is null");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesIsNotNull() {
            addCriterion("provinces_cities is not null");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesEqualTo(String value) {
            addCriterion("provinces_cities =", value, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesNotEqualTo(String value) {
            addCriterion("provinces_cities <>", value, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesGreaterThan(String value) {
            addCriterion("provinces_cities >", value, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesGreaterThanOrEqualTo(String value) {
            addCriterion("provinces_cities >=", value, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesLessThan(String value) {
            addCriterion("provinces_cities <", value, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesLessThanOrEqualTo(String value) {
            addCriterion("provinces_cities <=", value, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesLike(String value) {
            addCriterion("provinces_cities like", value, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesNotLike(String value) {
            addCriterion("provinces_cities not like", value, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesIn(List<String> values) {
            addCriterion("provinces_cities in", values, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesNotIn(List<String> values) {
            addCriterion("provinces_cities not in", values, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesBetween(String value1, String value2) {
            addCriterion("provinces_cities between", value1, value2, "provincesCities");
            return (Criteria) this;
        }

        public Criteria andProvincesCitiesNotBetween(String value1, String value2) {
            addCriterion("provinces_cities not between", value1, value2, "provincesCities");
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

        public Criteria andLegalRepresentativeIsNull() {
            addCriterion("legal_representative is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNotNull() {
            addCriterion("legal_representative is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeEqualTo(String value) {
            addCriterion("legal_representative =", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotEqualTo(String value) {
            addCriterion("legal_representative <>", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThan(String value) {
            addCriterion("legal_representative >", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative >=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThan(String value) {
            addCriterion("legal_representative <", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative <=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLike(String value) {
            addCriterion("legal_representative like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotLike(String value) {
            addCriterion("legal_representative not like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIn(List<String> values) {
            addCriterion("legal_representative in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotIn(List<String> values) {
            addCriterion("legal_representative not in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeBetween(String value1, String value2) {
            addCriterion("legal_representative between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotBetween(String value1, String value2) {
            addCriterion("legal_representative not between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonIsNull() {
            addCriterion("responsible_person is null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonIsNotNull() {
            addCriterion("responsible_person is not null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonEqualTo(String value) {
            addCriterion("responsible_person =", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotEqualTo(String value) {
            addCriterion("responsible_person <>", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonGreaterThan(String value) {
            addCriterion("responsible_person >", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_person >=", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonLessThan(String value) {
            addCriterion("responsible_person <", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonLessThanOrEqualTo(String value) {
            addCriterion("responsible_person <=", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonLike(String value) {
            addCriterion("responsible_person like", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotLike(String value) {
            addCriterion("responsible_person not like", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonIn(List<String> values) {
            addCriterion("responsible_person in", values, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotIn(List<String> values) {
            addCriterion("responsible_person not in", values, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonBetween(String value1, String value2) {
            addCriterion("responsible_person between", value1, value2, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotBetween(String value1, String value2) {
            addCriterion("responsible_person not between", value1, value2, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerIsNull() {
            addCriterion("quality_officer is null");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerIsNotNull() {
            addCriterion("quality_officer is not null");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerEqualTo(String value) {
            addCriterion("quality_officer =", value, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerNotEqualTo(String value) {
            addCriterion("quality_officer <>", value, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerGreaterThan(String value) {
            addCriterion("quality_officer >", value, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerGreaterThanOrEqualTo(String value) {
            addCriterion("quality_officer >=", value, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerLessThan(String value) {
            addCriterion("quality_officer <", value, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerLessThanOrEqualTo(String value) {
            addCriterion("quality_officer <=", value, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerLike(String value) {
            addCriterion("quality_officer like", value, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerNotLike(String value) {
            addCriterion("quality_officer not like", value, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerIn(List<String> values) {
            addCriterion("quality_officer in", values, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerNotIn(List<String> values) {
            addCriterion("quality_officer not in", values, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerBetween(String value1, String value2) {
            addCriterion("quality_officer between", value1, value2, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andQualityOfficerNotBetween(String value1, String value2) {
            addCriterion("quality_officer not between", value1, value2, "qualityOfficer");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("registered_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("registered_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("registered_address =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("registered_address <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("registered_address >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("registered_address >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("registered_address <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("registered_address <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("registered_address like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("registered_address not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("registered_address in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("registered_address not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("registered_address between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("registered_address not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andHotIsNull() {
            addCriterion("hot is null");
            return (Criteria) this;
        }

        public Criteria andHotIsNotNull() {
            addCriterion("hot is not null");
            return (Criteria) this;
        }

        public Criteria andHotEqualTo(Integer value) {
            addCriterion("hot =", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotEqualTo(Integer value) {
            addCriterion("hot <>", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThan(Integer value) {
            addCriterion("hot >", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("hot >=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThan(Integer value) {
            addCriterion("hot <", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThanOrEqualTo(Integer value) {
            addCriterion("hot <=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotIn(List<Integer> values) {
            addCriterion("hot in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotIn(List<Integer> values) {
            addCriterion("hot not in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotBetween(Integer value1, Integer value2) {
            addCriterion("hot between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotBetween(Integer value1, Integer value2) {
            addCriterion("hot not between", value1, value2, "hot");
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