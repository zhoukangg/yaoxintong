package cn.edu.bupt.yaoxintong.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClaimOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClaimOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andClaimPriceIsNull() {
            addCriterion("claim_price is null");
            return (Criteria) this;
        }

        public Criteria andClaimPriceIsNotNull() {
            addCriterion("claim_price is not null");
            return (Criteria) this;
        }

        public Criteria andClaimPriceEqualTo(Double value) {
            addCriterion("claim_price =", value, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimPriceNotEqualTo(Double value) {
            addCriterion("claim_price <>", value, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimPriceGreaterThan(Double value) {
            addCriterion("claim_price >", value, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("claim_price >=", value, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimPriceLessThan(Double value) {
            addCriterion("claim_price <", value, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimPriceLessThanOrEqualTo(Double value) {
            addCriterion("claim_price <=", value, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimPriceIn(List<Double> values) {
            addCriterion("claim_price in", values, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimPriceNotIn(List<Double> values) {
            addCriterion("claim_price not in", values, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimPriceBetween(Double value1, Double value2) {
            addCriterion("claim_price between", value1, value2, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimPriceNotBetween(Double value1, Double value2) {
            addCriterion("claim_price not between", value1, value2, "claimPrice");
            return (Criteria) this;
        }

        public Criteria andClaimDateIsNull() {
            addCriterion("claim_date is null");
            return (Criteria) this;
        }

        public Criteria andClaimDateIsNotNull() {
            addCriterion("claim_date is not null");
            return (Criteria) this;
        }

        public Criteria andClaimDateEqualTo(Date value) {
            addCriterion("claim_date =", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateNotEqualTo(Date value) {
            addCriterion("claim_date <>", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateGreaterThan(Date value) {
            addCriterion("claim_date >", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateGreaterThanOrEqualTo(Date value) {
            addCriterion("claim_date >=", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateLessThan(Date value) {
            addCriterion("claim_date <", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateLessThanOrEqualTo(Date value) {
            addCriterion("claim_date <=", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateIn(List<Date> values) {
            addCriterion("claim_date in", values, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateNotIn(List<Date> values) {
            addCriterion("claim_date not in", values, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateBetween(Date value1, Date value2) {
            addCriterion("claim_date between", value1, value2, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateNotBetween(Date value1, Date value2) {
            addCriterion("claim_date not between", value1, value2, "claimDate");
            return (Criteria) this;
        }

        public Criteria andMedicineNameIsNull() {
            addCriterion("medicine_name is null");
            return (Criteria) this;
        }

        public Criteria andMedicineNameIsNotNull() {
            addCriterion("medicine_name is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineNameEqualTo(String value) {
            addCriterion("medicine_name =", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameNotEqualTo(String value) {
            addCriterion("medicine_name <>", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameGreaterThan(String value) {
            addCriterion("medicine_name >", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_name >=", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameLessThan(String value) {
            addCriterion("medicine_name <", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameLessThanOrEqualTo(String value) {
            addCriterion("medicine_name <=", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameLike(String value) {
            addCriterion("medicine_name like", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameNotLike(String value) {
            addCriterion("medicine_name not like", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameIn(List<String> values) {
            addCriterion("medicine_name in", values, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameNotIn(List<String> values) {
            addCriterion("medicine_name not in", values, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameBetween(String value1, String value2) {
            addCriterion("medicine_name between", value1, value2, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameNotBetween(String value1, String value2) {
            addCriterion("medicine_name not between", value1, value2, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreIsNull() {
            addCriterion("medicine_store is null");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreIsNotNull() {
            addCriterion("medicine_store is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreEqualTo(String value) {
            addCriterion("medicine_store =", value, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreNotEqualTo(String value) {
            addCriterion("medicine_store <>", value, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreGreaterThan(String value) {
            addCriterion("medicine_store >", value, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_store >=", value, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreLessThan(String value) {
            addCriterion("medicine_store <", value, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreLessThanOrEqualTo(String value) {
            addCriterion("medicine_store <=", value, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreLike(String value) {
            addCriterion("medicine_store like", value, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreNotLike(String value) {
            addCriterion("medicine_store not like", value, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreIn(List<String> values) {
            addCriterion("medicine_store in", values, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreNotIn(List<String> values) {
            addCriterion("medicine_store not in", values, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreBetween(String value1, String value2) {
            addCriterion("medicine_store between", value1, value2, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andMedicineStoreNotBetween(String value1, String value2) {
            addCriterion("medicine_store not between", value1, value2, "medicineStore");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andClaimKindIsNull() {
            addCriterion("claim_kind is null");
            return (Criteria) this;
        }

        public Criteria andClaimKindIsNotNull() {
            addCriterion("claim_kind is not null");
            return (Criteria) this;
        }

        public Criteria andClaimKindEqualTo(String value) {
            addCriterion("claim_kind =", value, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindNotEqualTo(String value) {
            addCriterion("claim_kind <>", value, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindGreaterThan(String value) {
            addCriterion("claim_kind >", value, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindGreaterThanOrEqualTo(String value) {
            addCriterion("claim_kind >=", value, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindLessThan(String value) {
            addCriterion("claim_kind <", value, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindLessThanOrEqualTo(String value) {
            addCriterion("claim_kind <=", value, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindLike(String value) {
            addCriterion("claim_kind like", value, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindNotLike(String value) {
            addCriterion("claim_kind not like", value, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindIn(List<String> values) {
            addCriterion("claim_kind in", values, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindNotIn(List<String> values) {
            addCriterion("claim_kind not in", values, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindBetween(String value1, String value2) {
            addCriterion("claim_kind between", value1, value2, "claimKind");
            return (Criteria) this;
        }

        public Criteria andClaimKindNotBetween(String value1, String value2) {
            addCriterion("claim_kind not between", value1, value2, "claimKind");
            return (Criteria) this;
        }

        public Criteria andBillIsNull() {
            addCriterion("bill is null");
            return (Criteria) this;
        }

        public Criteria andBillIsNotNull() {
            addCriterion("bill is not null");
            return (Criteria) this;
        }

        public Criteria andBillEqualTo(String value) {
            addCriterion("bill =", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotEqualTo(String value) {
            addCriterion("bill <>", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThan(String value) {
            addCriterion("bill >", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThanOrEqualTo(String value) {
            addCriterion("bill >=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThan(String value) {
            addCriterion("bill <", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThanOrEqualTo(String value) {
            addCriterion("bill <=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLike(String value) {
            addCriterion("bill like", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotLike(String value) {
            addCriterion("bill not like", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillIn(List<String> values) {
            addCriterion("bill in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotIn(List<String> values) {
            addCriterion("bill not in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillBetween(String value1, String value2) {
            addCriterion("bill between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotBetween(String value1, String value2) {
            addCriterion("bill not between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andClaimReasonIsNull() {
            addCriterion("claim_reason is null");
            return (Criteria) this;
        }

        public Criteria andClaimReasonIsNotNull() {
            addCriterion("claim_reason is not null");
            return (Criteria) this;
        }

        public Criteria andClaimReasonEqualTo(String value) {
            addCriterion("claim_reason =", value, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonNotEqualTo(String value) {
            addCriterion("claim_reason <>", value, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonGreaterThan(String value) {
            addCriterion("claim_reason >", value, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonGreaterThanOrEqualTo(String value) {
            addCriterion("claim_reason >=", value, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonLessThan(String value) {
            addCriterion("claim_reason <", value, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonLessThanOrEqualTo(String value) {
            addCriterion("claim_reason <=", value, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonLike(String value) {
            addCriterion("claim_reason like", value, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonNotLike(String value) {
            addCriterion("claim_reason not like", value, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonIn(List<String> values) {
            addCriterion("claim_reason in", values, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonNotIn(List<String> values) {
            addCriterion("claim_reason not in", values, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonBetween(String value1, String value2) {
            addCriterion("claim_reason between", value1, value2, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimReasonNotBetween(String value1, String value2) {
            addCriterion("claim_reason not between", value1, value2, "claimReason");
            return (Criteria) this;
        }

        public Criteria andClaimStatusIsNull() {
            addCriterion("claim_status is null");
            return (Criteria) this;
        }

        public Criteria andClaimStatusIsNotNull() {
            addCriterion("claim_status is not null");
            return (Criteria) this;
        }

        public Criteria andClaimStatusEqualTo(String value) {
            addCriterion("claim_status =", value, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusNotEqualTo(String value) {
            addCriterion("claim_status <>", value, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusGreaterThan(String value) {
            addCriterion("claim_status >", value, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusGreaterThanOrEqualTo(String value) {
            addCriterion("claim_status >=", value, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusLessThan(String value) {
            addCriterion("claim_status <", value, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusLessThanOrEqualTo(String value) {
            addCriterion("claim_status <=", value, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusLike(String value) {
            addCriterion("claim_status like", value, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusNotLike(String value) {
            addCriterion("claim_status not like", value, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusIn(List<String> values) {
            addCriterion("claim_status in", values, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusNotIn(List<String> values) {
            addCriterion("claim_status not in", values, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusBetween(String value1, String value2) {
            addCriterion("claim_status between", value1, value2, "claimStatus");
            return (Criteria) this;
        }

        public Criteria andClaimStatusNotBetween(String value1, String value2) {
            addCriterion("claim_status not between", value1, value2, "claimStatus");
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