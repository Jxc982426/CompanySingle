package com.jxc.pojo;

import java.util.ArrayList;
import java.util.List;

public class SalaryExample {
    private int startRow;
    private int pageSize;

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryExample() {
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

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Integer value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Integer value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Integer value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Integer value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Integer value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Integer> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Integer> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Integer value1, Integer value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andEnoIsNull() {
            addCriterion("eno is null");
            return (Criteria) this;
        }

        public Criteria andEnoIsNotNull() {
            addCriterion("eno is not null");
            return (Criteria) this;
        }

        public Criteria andEnoEqualTo(Integer value) {
            addCriterion("eno =", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoNotEqualTo(Integer value) {
            addCriterion("eno <>", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoGreaterThan(Integer value) {
            addCriterion("eno >", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("eno >=", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoLessThan(Integer value) {
            addCriterion("eno <", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoLessThanOrEqualTo(Integer value) {
            addCriterion("eno <=", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoIn(List<Integer> values) {
            addCriterion("eno in", values, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoNotIn(List<Integer> values) {
            addCriterion("eno not in", values, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoBetween(Integer value1, Integer value2) {
            addCriterion("eno between", value1, value2, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoNotBetween(Integer value1, Integer value2) {
            addCriterion("eno not between", value1, value2, "eno");
            return (Criteria) this;
        }

        public Criteria andDnoIsNull() {
            addCriterion("dno is null");
            return (Criteria) this;
        }

        public Criteria andDnoIsNotNull() {
            addCriterion("dno is not null");
            return (Criteria) this;
        }

        public Criteria andDnoEqualTo(Integer value) {
            addCriterion("dno =", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotEqualTo(Integer value) {
            addCriterion("dno <>", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoGreaterThan(Integer value) {
            addCriterion("dno >", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dno >=", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoLessThan(Integer value) {
            addCriterion("dno <", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoLessThanOrEqualTo(Integer value) {
            addCriterion("dno <=", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoIn(List<Integer> values) {
            addCriterion("dno in", values, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotIn(List<Integer> values) {
            addCriterion("dno not in", values, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoBetween(Integer value1, Integer value2) {
            addCriterion("dno between", value1, value2, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotBetween(Integer value1, Integer value2) {
            addCriterion("dno not between", value1, value2, "dno");
            return (Criteria) this;
        }

        public Criteria andMsalIsNull() {
            addCriterion("msal is null");
            return (Criteria) this;
        }

        public Criteria andMsalIsNotNull() {
            addCriterion("msal is not null");
            return (Criteria) this;
        }

        public Criteria andMsalEqualTo(Double value) {
            addCriterion("msal =", value, "msal");
            return (Criteria) this;
        }

        public Criteria andMsalNotEqualTo(Double value) {
            addCriterion("msal <>", value, "msal");
            return (Criteria) this;
        }

        public Criteria andMsalGreaterThan(Double value) {
            addCriterion("msal >", value, "msal");
            return (Criteria) this;
        }

        public Criteria andMsalGreaterThanOrEqualTo(Double value) {
            addCriterion("msal >=", value, "msal");
            return (Criteria) this;
        }

        public Criteria andMsalLessThan(Double value) {
            addCriterion("msal <", value, "msal");
            return (Criteria) this;
        }

        public Criteria andMsalLessThanOrEqualTo(Double value) {
            addCriterion("msal <=", value, "msal");
            return (Criteria) this;
        }

        public Criteria andMsalIn(List<Double> values) {
            addCriterion("msal in", values, "msal");
            return (Criteria) this;
        }

        public Criteria andMsalNotIn(List<Double> values) {
            addCriterion("msal not in", values, "msal");
            return (Criteria) this;
        }

        public Criteria andMsalBetween(Double value1, Double value2) {
            addCriterion("msal between", value1, value2, "msal");
            return (Criteria) this;
        }

        public Criteria andMsalNotBetween(Double value1, Double value2) {
            addCriterion("msal not between", value1, value2, "msal");
            return (Criteria) this;
        }

        public Criteria andYsalIsNull() {
            addCriterion("ysal is null");
            return (Criteria) this;
        }

        public Criteria andYsalIsNotNull() {
            addCriterion("ysal is not null");
            return (Criteria) this;
        }

        public Criteria andYsalEqualTo(Double value) {
            addCriterion("ysal =", value, "ysal");
            return (Criteria) this;
        }

        public Criteria andYsalNotEqualTo(Double value) {
            addCriterion("ysal <>", value, "ysal");
            return (Criteria) this;
        }

        public Criteria andYsalGreaterThan(Double value) {
            addCriterion("ysal >", value, "ysal");
            return (Criteria) this;
        }

        public Criteria andYsalGreaterThanOrEqualTo(Double value) {
            addCriterion("ysal >=", value, "ysal");
            return (Criteria) this;
        }

        public Criteria andYsalLessThan(Double value) {
            addCriterion("ysal <", value, "ysal");
            return (Criteria) this;
        }

        public Criteria andYsalLessThanOrEqualTo(Double value) {
            addCriterion("ysal <=", value, "ysal");
            return (Criteria) this;
        }

        public Criteria andYsalIn(List<Double> values) {
            addCriterion("ysal in", values, "ysal");
            return (Criteria) this;
        }

        public Criteria andYsalNotIn(List<Double> values) {
            addCriterion("ysal not in", values, "ysal");
            return (Criteria) this;
        }

        public Criteria andYsalBetween(Double value1, Double value2) {
            addCriterion("ysal between", value1, value2, "ysal");
            return (Criteria) this;
        }

        public Criteria andYsalNotBetween(Double value1, Double value2) {
            addCriterion("ysal not between", value1, value2, "ysal");
            return (Criteria) this;
        }

        public Criteria andAwardIsNull() {
            addCriterion("award is null");
            return (Criteria) this;
        }

        public Criteria andAwardIsNotNull() {
            addCriterion("award is not null");
            return (Criteria) this;
        }

        public Criteria andAwardEqualTo(Double value) {
            addCriterion("award =", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotEqualTo(Double value) {
            addCriterion("award <>", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardGreaterThan(Double value) {
            addCriterion("award >", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardGreaterThanOrEqualTo(Double value) {
            addCriterion("award >=", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardLessThan(Double value) {
            addCriterion("award <", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardLessThanOrEqualTo(Double value) {
            addCriterion("award <=", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardIn(List<Double> values) {
            addCriterion("award in", values, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotIn(List<Double> values) {
            addCriterion("award not in", values, "award");
            return (Criteria) this;
        }

        public Criteria andAwardBetween(Double value1, Double value2) {
            addCriterion("award between", value1, value2, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotBetween(Double value1, Double value2) {
            addCriterion("award not between", value1, value2, "award");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNull() {
            addCriterion("sgrade is null");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNotNull() {
            addCriterion("sgrade is not null");
            return (Criteria) this;
        }

        public Criteria andSgradeEqualTo(Integer value) {
            addCriterion("sgrade =", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotEqualTo(Integer value) {
            addCriterion("sgrade <>", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThan(Integer value) {
            addCriterion("sgrade >", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgrade >=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThan(Integer value) {
            addCriterion("sgrade <", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThanOrEqualTo(Integer value) {
            addCriterion("sgrade <=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeIn(List<Integer> values) {
            addCriterion("sgrade in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotIn(List<Integer> values) {
            addCriterion("sgrade not in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeBetween(Integer value1, Integer value2) {
            addCriterion("sgrade between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("sgrade not between", value1, value2, "sgrade");
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