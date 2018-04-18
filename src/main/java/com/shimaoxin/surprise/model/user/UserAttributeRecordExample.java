package com.shimaoxin.surprise.model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAttributeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAttributeRecordExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andEventidIsNull() {
            addCriterion("eventid is null");
            return (Criteria) this;
        }

        public Criteria andEventidIsNotNull() {
            addCriterion("eventid is not null");
            return (Criteria) this;
        }

        public Criteria andEventidEqualTo(String value) {
            addCriterion("eventid =", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotEqualTo(String value) {
            addCriterion("eventid <>", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThan(String value) {
            addCriterion("eventid >", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThanOrEqualTo(String value) {
            addCriterion("eventid >=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThan(String value) {
            addCriterion("eventid <", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThanOrEqualTo(String value) {
            addCriterion("eventid <=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLike(String value) {
            addCriterion("eventid like", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotLike(String value) {
            addCriterion("eventid not like", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidIn(List<String> values) {
            addCriterion("eventid in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotIn(List<String> values) {
            addCriterion("eventid not in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidBetween(String value1, String value2) {
            addCriterion("eventid between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotBetween(String value1, String value2) {
            addCriterion("eventid not between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andAttributenameIsNull() {
            addCriterion("attributeName is null");
            return (Criteria) this;
        }

        public Criteria andAttributenameIsNotNull() {
            addCriterion("attributeName is not null");
            return (Criteria) this;
        }

        public Criteria andAttributenameEqualTo(String value) {
            addCriterion("attributeName =", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameNotEqualTo(String value) {
            addCriterion("attributeName <>", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameGreaterThan(String value) {
            addCriterion("attributeName >", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameGreaterThanOrEqualTo(String value) {
            addCriterion("attributeName >=", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameLessThan(String value) {
            addCriterion("attributeName <", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameLessThanOrEqualTo(String value) {
            addCriterion("attributeName <=", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameLike(String value) {
            addCriterion("attributeName like", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameNotLike(String value) {
            addCriterion("attributeName not like", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameIn(List<String> values) {
            addCriterion("attributeName in", values, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameNotIn(List<String> values) {
            addCriterion("attributeName not in", values, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameBetween(String value1, String value2) {
            addCriterion("attributeName between", value1, value2, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameNotBetween(String value1, String value2) {
            addCriterion("attributeName not between", value1, value2, "attributename");
            return (Criteria) this;
        }

        public Criteria andChangevalueIsNull() {
            addCriterion("changeValue is null");
            return (Criteria) this;
        }

        public Criteria andChangevalueIsNotNull() {
            addCriterion("changeValue is not null");
            return (Criteria) this;
        }

        public Criteria andChangevalueEqualTo(Integer value) {
            addCriterion("changeValue =", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueNotEqualTo(Integer value) {
            addCriterion("changeValue <>", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueGreaterThan(Integer value) {
            addCriterion("changeValue >", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeValue >=", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueLessThan(Integer value) {
            addCriterion("changeValue <", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueLessThanOrEqualTo(Integer value) {
            addCriterion("changeValue <=", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueIn(List<Integer> values) {
            addCriterion("changeValue in", values, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueNotIn(List<Integer> values) {
            addCriterion("changeValue not in", values, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueBetween(Integer value1, Integer value2) {
            addCriterion("changeValue between", value1, value2, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueNotBetween(Integer value1, Integer value2) {
            addCriterion("changeValue not between", value1, value2, "changevalue");
            return (Criteria) this;
        }

        public Criteria andValuebeforeIsNull() {
            addCriterion("valueBefore is null");
            return (Criteria) this;
        }

        public Criteria andValuebeforeIsNotNull() {
            addCriterion("valueBefore is not null");
            return (Criteria) this;
        }

        public Criteria andValuebeforeEqualTo(Integer value) {
            addCriterion("valueBefore =", value, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValuebeforeNotEqualTo(Integer value) {
            addCriterion("valueBefore <>", value, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValuebeforeGreaterThan(Integer value) {
            addCriterion("valueBefore >", value, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValuebeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("valueBefore >=", value, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValuebeforeLessThan(Integer value) {
            addCriterion("valueBefore <", value, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValuebeforeLessThanOrEqualTo(Integer value) {
            addCriterion("valueBefore <=", value, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValuebeforeIn(List<Integer> values) {
            addCriterion("valueBefore in", values, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValuebeforeNotIn(List<Integer> values) {
            addCriterion("valueBefore not in", values, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValuebeforeBetween(Integer value1, Integer value2) {
            addCriterion("valueBefore between", value1, value2, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValuebeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("valueBefore not between", value1, value2, "valuebefore");
            return (Criteria) this;
        }

        public Criteria andValueafterIsNull() {
            addCriterion("valueAfter is null");
            return (Criteria) this;
        }

        public Criteria andValueafterIsNotNull() {
            addCriterion("valueAfter is not null");
            return (Criteria) this;
        }

        public Criteria andValueafterEqualTo(Integer value) {
            addCriterion("valueAfter =", value, "valueafter");
            return (Criteria) this;
        }

        public Criteria andValueafterNotEqualTo(Integer value) {
            addCriterion("valueAfter <>", value, "valueafter");
            return (Criteria) this;
        }

        public Criteria andValueafterGreaterThan(Integer value) {
            addCriterion("valueAfter >", value, "valueafter");
            return (Criteria) this;
        }

        public Criteria andValueafterGreaterThanOrEqualTo(Integer value) {
            addCriterion("valueAfter >=", value, "valueafter");
            return (Criteria) this;
        }

        public Criteria andValueafterLessThan(Integer value) {
            addCriterion("valueAfter <", value, "valueafter");
            return (Criteria) this;
        }

        public Criteria andValueafterLessThanOrEqualTo(Integer value) {
            addCriterion("valueAfter <=", value, "valueafter");
            return (Criteria) this;
        }

        public Criteria andValueafterIn(List<Integer> values) {
            addCriterion("valueAfter in", values, "valueafter");
            return (Criteria) this;
        }

        public Criteria andValueafterNotIn(List<Integer> values) {
            addCriterion("valueAfter not in", values, "valueafter");
            return (Criteria) this;
        }

        public Criteria andValueafterBetween(Integer value1, Integer value2) {
            addCriterion("valueAfter between", value1, value2, "valueafter");
            return (Criteria) this;
        }

        public Criteria andValueafterNotBetween(Integer value1, Integer value2) {
            addCriterion("valueAfter not between", value1, value2, "valueafter");
            return (Criteria) this;
        }

        public Criteria andChangetypeIsNull() {
            addCriterion("changeType is null");
            return (Criteria) this;
        }

        public Criteria andChangetypeIsNotNull() {
            addCriterion("changeType is not null");
            return (Criteria) this;
        }

        public Criteria andChangetypeEqualTo(String value) {
            addCriterion("changeType =", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotEqualTo(String value) {
            addCriterion("changeType <>", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeGreaterThan(String value) {
            addCriterion("changeType >", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeGreaterThanOrEqualTo(String value) {
            addCriterion("changeType >=", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLessThan(String value) {
            addCriterion("changeType <", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLessThanOrEqualTo(String value) {
            addCriterion("changeType <=", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLike(String value) {
            addCriterion("changeType like", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotLike(String value) {
            addCriterion("changeType not like", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeIn(List<String> values) {
            addCriterion("changeType in", values, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotIn(List<String> values) {
            addCriterion("changeType not in", values, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeBetween(String value1, String value2) {
            addCriterion("changeType between", value1, value2, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotBetween(String value1, String value2) {
            addCriterion("changeType not between", value1, value2, "changetype");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
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