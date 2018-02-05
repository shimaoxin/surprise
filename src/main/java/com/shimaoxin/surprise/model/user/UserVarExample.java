package com.shimaoxin.surprise.model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserVarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserVarExample() {
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

        public Criteria andClientidIsNull() {
            addCriterion("clientId is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientId is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(String value) {
            addCriterion("clientId =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(String value) {
            addCriterion("clientId <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(String value) {
            addCriterion("clientId >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(String value) {
            addCriterion("clientId >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(String value) {
            addCriterion("clientId <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(String value) {
            addCriterion("clientId <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLike(String value) {
            addCriterion("clientId like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotLike(String value) {
            addCriterion("clientId not like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<String> values) {
            addCriterion("clientId in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<String> values) {
            addCriterion("clientId not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(String value1, String value2) {
            addCriterion("clientId between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(String value1, String value2) {
            addCriterion("clientId not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andVarnameIsNull() {
            addCriterion("varName is null");
            return (Criteria) this;
        }

        public Criteria andVarnameIsNotNull() {
            addCriterion("varName is not null");
            return (Criteria) this;
        }

        public Criteria andVarnameEqualTo(String value) {
            addCriterion("varName =", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameNotEqualTo(String value) {
            addCriterion("varName <>", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameGreaterThan(String value) {
            addCriterion("varName >", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameGreaterThanOrEqualTo(String value) {
            addCriterion("varName >=", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameLessThan(String value) {
            addCriterion("varName <", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameLessThanOrEqualTo(String value) {
            addCriterion("varName <=", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameLike(String value) {
            addCriterion("varName like", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameNotLike(String value) {
            addCriterion("varName not like", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameIn(List<String> values) {
            addCriterion("varName in", values, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameNotIn(List<String> values) {
            addCriterion("varName not in", values, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameBetween(String value1, String value2) {
            addCriterion("varName between", value1, value2, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameNotBetween(String value1, String value2) {
            addCriterion("varName not between", value1, value2, "varname");
            return (Criteria) this;
        }

        public Criteria andVarvalueIsNull() {
            addCriterion("varValue is null");
            return (Criteria) this;
        }

        public Criteria andVarvalueIsNotNull() {
            addCriterion("varValue is not null");
            return (Criteria) this;
        }

        public Criteria andVarvalueEqualTo(Integer value) {
            addCriterion("varValue =", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueNotEqualTo(Integer value) {
            addCriterion("varValue <>", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueGreaterThan(Integer value) {
            addCriterion("varValue >", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("varValue >=", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueLessThan(Integer value) {
            addCriterion("varValue <", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueLessThanOrEqualTo(Integer value) {
            addCriterion("varValue <=", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueIn(List<Integer> values) {
            addCriterion("varValue in", values, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueNotIn(List<Integer> values) {
            addCriterion("varValue not in", values, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueBetween(Integer value1, Integer value2) {
            addCriterion("varValue between", value1, value2, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("varValue not between", value1, value2, "varvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueIsNull() {
            addCriterion("dayValue is null");
            return (Criteria) this;
        }

        public Criteria andDayvalueIsNotNull() {
            addCriterion("dayValue is not null");
            return (Criteria) this;
        }

        public Criteria andDayvalueEqualTo(Integer value) {
            addCriterion("dayValue =", value, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueNotEqualTo(Integer value) {
            addCriterion("dayValue <>", value, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueGreaterThan(Integer value) {
            addCriterion("dayValue >", value, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("dayValue >=", value, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueLessThan(Integer value) {
            addCriterion("dayValue <", value, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueLessThanOrEqualTo(Integer value) {
            addCriterion("dayValue <=", value, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueIn(List<Integer> values) {
            addCriterion("dayValue in", values, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueNotIn(List<Integer> values) {
            addCriterion("dayValue not in", values, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueBetween(Integer value1, Integer value2) {
            addCriterion("dayValue between", value1, value2, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andDayvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("dayValue not between", value1, value2, "dayvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueIsNull() {
            addCriterion("weekValue is null");
            return (Criteria) this;
        }

        public Criteria andWeekvalueIsNotNull() {
            addCriterion("weekValue is not null");
            return (Criteria) this;
        }

        public Criteria andWeekvalueEqualTo(Integer value) {
            addCriterion("weekValue =", value, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueNotEqualTo(Integer value) {
            addCriterion("weekValue <>", value, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueGreaterThan(Integer value) {
            addCriterion("weekValue >", value, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekValue >=", value, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueLessThan(Integer value) {
            addCriterion("weekValue <", value, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueLessThanOrEqualTo(Integer value) {
            addCriterion("weekValue <=", value, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueIn(List<Integer> values) {
            addCriterion("weekValue in", values, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueNotIn(List<Integer> values) {
            addCriterion("weekValue not in", values, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueBetween(Integer value1, Integer value2) {
            addCriterion("weekValue between", value1, value2, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andWeekvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("weekValue not between", value1, value2, "weekvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueIsNull() {
            addCriterion("monthValue is null");
            return (Criteria) this;
        }

        public Criteria andMonthvalueIsNotNull() {
            addCriterion("monthValue is not null");
            return (Criteria) this;
        }

        public Criteria andMonthvalueEqualTo(Integer value) {
            addCriterion("monthValue =", value, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueNotEqualTo(Integer value) {
            addCriterion("monthValue <>", value, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueGreaterThan(Integer value) {
            addCriterion("monthValue >", value, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthValue >=", value, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueLessThan(Integer value) {
            addCriterion("monthValue <", value, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueLessThanOrEqualTo(Integer value) {
            addCriterion("monthValue <=", value, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueIn(List<Integer> values) {
            addCriterion("monthValue in", values, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueNotIn(List<Integer> values) {
            addCriterion("monthValue not in", values, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueBetween(Integer value1, Integer value2) {
            addCriterion("monthValue between", value1, value2, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andMonthvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("monthValue not between", value1, value2, "monthvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueIsNull() {
            addCriterion("yearValue is null");
            return (Criteria) this;
        }

        public Criteria andYearvalueIsNotNull() {
            addCriterion("yearValue is not null");
            return (Criteria) this;
        }

        public Criteria andYearvalueEqualTo(Integer value) {
            addCriterion("yearValue =", value, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueNotEqualTo(Integer value) {
            addCriterion("yearValue <>", value, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueGreaterThan(Integer value) {
            addCriterion("yearValue >", value, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("yearValue >=", value, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueLessThan(Integer value) {
            addCriterion("yearValue <", value, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueLessThanOrEqualTo(Integer value) {
            addCriterion("yearValue <=", value, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueIn(List<Integer> values) {
            addCriterion("yearValue in", values, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueNotIn(List<Integer> values) {
            addCriterion("yearValue not in", values, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueBetween(Integer value1, Integer value2) {
            addCriterion("yearValue between", value1, value2, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andYearvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("yearValue not between", value1, value2, "yearvalue");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("lastTime is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("lastTime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Date value) {
            addCriterion("lastTime =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Date value) {
            addCriterion("lastTime <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Date value) {
            addCriterion("lastTime >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastTime >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Date value) {
            addCriterion("lastTime <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("lastTime <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Date> values) {
            addCriterion("lastTime in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Date> values) {
            addCriterion("lastTime not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Date value1, Date value2) {
            addCriterion("lastTime between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("lastTime not between", value1, value2, "lasttime");
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