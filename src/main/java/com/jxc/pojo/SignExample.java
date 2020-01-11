package com.jxc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SignExample {
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

    public SignExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFirstsignIsNull() {
            addCriterion("firstsign is null");
            return (Criteria) this;
        }

        public Criteria andFirstsignIsNotNull() {
            addCriterion("firstsign is not null");
            return (Criteria) this;
        }

        public Criteria andFirstsignEqualTo(Date value) {
            addCriterionForJDBCDate("firstsign =", value, "firstsign");
            return (Criteria) this;
        }

        public Criteria andFirstsignNotEqualTo(Date value) {
            addCriterionForJDBCDate("firstsign <>", value, "firstsign");
            return (Criteria) this;
        }

        public Criteria andFirstsignGreaterThan(Date value) {
            addCriterionForJDBCDate("firstsign >", value, "firstsign");
            return (Criteria) this;
        }

        public Criteria andFirstsignGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstsign >=", value, "firstsign");
            return (Criteria) this;
        }

        public Criteria andFirstsignLessThan(Date value) {
            addCriterionForJDBCDate("firstsign <", value, "firstsign");
            return (Criteria) this;
        }

        public Criteria andFirstsignLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstsign <=", value, "firstsign");
            return (Criteria) this;
        }

        public Criteria andFirstsignIn(List<Date> values) {
            addCriterionForJDBCDate("firstsign in", values, "firstsign");
            return (Criteria) this;
        }

        public Criteria andFirstsignNotIn(List<Date> values) {
            addCriterionForJDBCDate("firstsign not in", values, "firstsign");
            return (Criteria) this;
        }

        public Criteria andFirstsignBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstsign between", value1, value2, "firstsign");
            return (Criteria) this;
        }

        public Criteria andFirstsignNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstsign not between", value1, value2, "firstsign");
            return (Criteria) this;
        }

        public Criteria andLastsignIsNull() {
            addCriterion("lastsign is null");
            return (Criteria) this;
        }

        public Criteria andLastsignIsNotNull() {
            addCriterion("lastsign is not null");
            return (Criteria) this;
        }

        public Criteria andLastsignEqualTo(Date value) {
            addCriterionForJDBCDate("lastsign =", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastsign <>", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignGreaterThan(Date value) {
            addCriterionForJDBCDate("lastsign >", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastsign >=", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignLessThan(Date value) {
            addCriterionForJDBCDate("lastsign <", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastsign <=", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignIn(List<Date> values) {
            addCriterionForJDBCDate("lastsign in", values, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastsign not in", values, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastsign between", value1, value2, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastsign not between", value1, value2, "lastsign");
            return (Criteria) this;
        }

        public Criteria andSignweekIsNull() {
            addCriterion("signweek is null");
            return (Criteria) this;
        }

        public Criteria andSignweekIsNotNull() {
            addCriterion("signweek is not null");
            return (Criteria) this;
        }

        public Criteria andSignweekEqualTo(Integer value) {
            addCriterion("signweek =", value, "signweek");
            return (Criteria) this;
        }

        public Criteria andSignweekNotEqualTo(Integer value) {
            addCriterion("signweek <>", value, "signweek");
            return (Criteria) this;
        }

        public Criteria andSignweekGreaterThan(Integer value) {
            addCriterion("signweek >", value, "signweek");
            return (Criteria) this;
        }

        public Criteria andSignweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("signweek >=", value, "signweek");
            return (Criteria) this;
        }

        public Criteria andSignweekLessThan(Integer value) {
            addCriterion("signweek <", value, "signweek");
            return (Criteria) this;
        }

        public Criteria andSignweekLessThanOrEqualTo(Integer value) {
            addCriterion("signweek <=", value, "signweek");
            return (Criteria) this;
        }

        public Criteria andSignweekIn(List<Integer> values) {
            addCriterion("signweek in", values, "signweek");
            return (Criteria) this;
        }

        public Criteria andSignweekNotIn(List<Integer> values) {
            addCriterion("signweek not in", values, "signweek");
            return (Criteria) this;
        }

        public Criteria andSignweekBetween(Integer value1, Integer value2) {
            addCriterion("signweek between", value1, value2, "signweek");
            return (Criteria) this;
        }

        public Criteria andSignweekNotBetween(Integer value1, Integer value2) {
            addCriterion("signweek not between", value1, value2, "signweek");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNull() {
            addCriterion("signdate is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("signdate is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(Date value) {
            addCriterionForJDBCDate("signdate =", value, "signdate");

            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("signdate <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(Date value) {
            addCriterionForJDBCDate("signdate >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("signdate >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(Date value) {
            addCriterionForJDBCDate("signdate <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("signdate <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<Date> values) {
            addCriterionForJDBCDate("signdate in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("signdate not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("signdate between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("signdate not between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andLateIsNull() {
            addCriterion("late is null");
            return (Criteria) this;
        }

        public Criteria andLateIsNotNull() {
            addCriterion("late is not null");
            return (Criteria) this;
        }

        public Criteria andLateEqualTo(String value) {
            addCriterion("late =", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotEqualTo(String value) {
            addCriterion("late <>", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThan(String value) {
            addCriterion("late >", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThanOrEqualTo(String value) {
            addCriterion("late >=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThan(String value) {
            addCriterion("late <", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThanOrEqualTo(String value) {
            addCriterion("late <=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLike(String value) {
            addCriterion("late like", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotLike(String value) {
            addCriterion("late not like", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateIn(List<String> values) {
            addCriterion("late in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotIn(List<String> values) {
            addCriterion("late not in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateBetween(String value1, String value2) {
            addCriterion("late between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotBetween(String value1, String value2) {
            addCriterion("late not between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyIsNull() {
            addCriterion("leaveearly is null");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyIsNotNull() {
            addCriterion("leaveearly is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyEqualTo(String value) {
            addCriterion("leaveearly =", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyNotEqualTo(String value) {
            addCriterion("leaveearly <>", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyGreaterThan(String value) {
            addCriterion("leaveearly >", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyGreaterThanOrEqualTo(String value) {
            addCriterion("leaveearly >=", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyLessThan(String value) {
            addCriterion("leaveearly <", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyLessThanOrEqualTo(String value) {
            addCriterion("leaveearly <=", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyLike(String value) {
            addCriterion("leaveearly like", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyNotLike(String value) {
            addCriterion("leaveearly not like", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyIn(List<String> values) {
            addCriterion("leaveearly in", values, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyNotIn(List<String> values) {
            addCriterion("leaveearly not in", values, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyBetween(String value1, String value2) {
            addCriterion("leaveearly between", value1, value2, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyNotBetween(String value1, String value2) {
            addCriterion("leaveearly not between", value1, value2, "leaveearly");
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