package cn.edu.bupt.yaoxintong.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOrderExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberIsNull() {
            addCriterion("medicine_number is null");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberIsNotNull() {
            addCriterion("medicine_number is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberEqualTo(Integer value) {
            addCriterion("medicine_number =", value, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberNotEqualTo(Integer value) {
            addCriterion("medicine_number <>", value, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberGreaterThan(Integer value) {
            addCriterion("medicine_number >", value, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_number >=", value, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberLessThan(Integer value) {
            addCriterion("medicine_number <", value, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_number <=", value, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberIn(List<Integer> values) {
            addCriterion("medicine_number in", values, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberNotIn(List<Integer> values) {
            addCriterion("medicine_number not in", values, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberBetween(Integer value1, Integer value2) {
            addCriterion("medicine_number between", value1, value2, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_number not between", value1, value2, "medicineNumber");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(Float value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(Float value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(Float value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(Float value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(Float value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<Float> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<Float> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(Float value1, Float value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(Float value1, Float value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOperationIsNull() {
            addCriterion("order_operation is null");
            return (Criteria) this;
        }

        public Criteria andOrderOperationIsNotNull() {
            addCriterion("order_operation is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOperationEqualTo(String value) {
            addCriterion("order_operation =", value, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationNotEqualTo(String value) {
            addCriterion("order_operation <>", value, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationGreaterThan(String value) {
            addCriterion("order_operation >", value, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationGreaterThanOrEqualTo(String value) {
            addCriterion("order_operation >=", value, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationLessThan(String value) {
            addCriterion("order_operation <", value, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationLessThanOrEqualTo(String value) {
            addCriterion("order_operation <=", value, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationLike(String value) {
            addCriterion("order_operation like", value, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationNotLike(String value) {
            addCriterion("order_operation not like", value, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationIn(List<String> values) {
            addCriterion("order_operation in", values, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationNotIn(List<String> values) {
            addCriterion("order_operation not in", values, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationBetween(String value1, String value2) {
            addCriterion("order_operation between", value1, value2, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderOperationNotBetween(String value1, String value2) {
            addCriterion("order_operation not between", value1, value2, "orderOperation");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
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