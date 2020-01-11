package com.jxc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendanceExample {
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

    public AttendanceExample() {
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

        public Criteria andCheckmonthIsNull() {
            addCriterion("checkmonth is null");
            return (Criteria) this;
        }

        public Criteria andCheckmonthIsNotNull() {
            addCriterion("checkmonth is not null");
            return (Criteria) this;
        }

        public Criteria andCheckmonthEqualTo(Date value) {
            addCriterionForJDBCDate("checkmonth =", value, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckmonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkmonth <>", value, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckmonthGreaterThan(Date value) {
            addCriterionForJDBCDate("checkmonth >", value, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckmonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkmonth >=", value, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckmonthLessThan(Date value) {
            addCriterionForJDBCDate("checkmonth <", value, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckmonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkmonth <=", value, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckmonthIn(List<Date> values) {
            addCriterionForJDBCDate("checkmonth in", values, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckmonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkmonth not in", values, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckmonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkmonth between", value1, value2, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckmonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkmonth not between", value1, value2, "checkmonth");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("checkdate is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("checkdate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterionForJDBCDate("checkdate =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkdate <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkdate >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkdate >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterionForJDBCDate("checkdate <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkdate <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterionForJDBCDate("checkdate in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkdate not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkdate between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkdate not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andStartworkIsNull() {
            addCriterion("startwork is null");
            return (Criteria) this;
        }

        public Criteria andStartworkIsNotNull() {
            addCriterion("startwork is not null");
            return (Criteria) this;
        }

        public Criteria andStartworkEqualTo(Date value) {
            addCriterionForJDBCDate("startwork =", value, "startwork");
            return (Criteria) this;
        }

        public Criteria andStartworkNotEqualTo(Date value) {
            addCriterionForJDBCDate("startwork <>", value, "startwork");
            return (Criteria) this;
        }

        public Criteria andStartworkGreaterThan(Date value) {
            addCriterionForJDBCDate("startwork >", value, "startwork");
            return (Criteria) this;
        }

        public Criteria andStartworkGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startwork >=", value, "startwork");
            return (Criteria) this;
        }

        public Criteria andStartworkLessThan(Date value) {
            addCriterionForJDBCDate("startwork <", value, "startwork");
            return (Criteria) this;
        }

        public Criteria andStartworkLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startwork <=", value, "startwork");
            return (Criteria) this;
        }

        public Criteria andStartworkIn(List<Date> values) {
            addCriterionForJDBCDate("startwork in", values, "startwork");
            return (Criteria) this;
        }

        public Criteria andStartworkNotIn(List<Date> values) {
            addCriterionForJDBCDate("startwork not in", values, "startwork");
            return (Criteria) this;
        }

        public Criteria andStartworkBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startwork between", value1, value2, "startwork");
            return (Criteria) this;
        }

        public Criteria andStartworkNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startwork not between", value1, value2, "startwork");
            return (Criteria) this;
        }

        public Criteria andEndworkIsNull() {
            addCriterion("endwork is null");
            return (Criteria) this;
        }

        public Criteria andEndworkIsNotNull() {
            addCriterion("endwork is not null");
            return (Criteria) this;
        }

        public Criteria andEndworkEqualTo(Date value) {
            addCriterionForJDBCDate("endwork =", value, "endwork");
            return (Criteria) this;
        }

        public Criteria andEndworkNotEqualTo(Date value) {
            addCriterionForJDBCDate("endwork <>", value, "endwork");
            return (Criteria) this;
        }

        public Criteria andEndworkGreaterThan(Date value) {
            addCriterionForJDBCDate("endwork >", value, "endwork");
            return (Criteria) this;
        }

        public Criteria andEndworkGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endwork >=", value, "endwork");
            return (Criteria) this;
        }

        public Criteria andEndworkLessThan(Date value) {
            addCriterionForJDBCDate("endwork <", value, "endwork");
            return (Criteria) this;
        }

        public Criteria andEndworkLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endwork <=", value, "endwork");
            return (Criteria) this;
        }

        public Criteria andEndworkIn(List<Date> values) {
            addCriterionForJDBCDate("endwork in", values, "endwork");
            return (Criteria) this;
        }

        public Criteria andEndworkNotIn(List<Date> values) {
            addCriterionForJDBCDate("endwork not in", values, "endwork");
            return (Criteria) this;
        }

        public Criteria andEndworkBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endwork between", value1, value2, "endwork");
            return (Criteria) this;
        }

        public Criteria andEndworkNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endwork not between", value1, value2, "endwork");
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

        public Criteria andLateEqualTo(Integer value) {
            addCriterion("late =", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotEqualTo(Integer value) {
            addCriterion("late <>", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThan(Integer value) {
            addCriterion("late >", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThanOrEqualTo(Integer value) {
            addCriterion("late >=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThan(Integer value) {
            addCriterion("late <", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThanOrEqualTo(Integer value) {
            addCriterion("late <=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateIn(List<Integer> values) {
            addCriterion("late in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotIn(List<Integer> values) {
            addCriterion("late not in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateBetween(Integer value1, Integer value2) {
            addCriterion("late between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLeaveearlyEqualTo(Integer value) {
            addCriterion("leaveearly =", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyNotEqualTo(Integer value) {
            addCriterion("leaveearly <>", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyGreaterThan(Integer value) {
            addCriterion("leaveearly >", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaveearly >=", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyLessThan(Integer value) {
            addCriterion("leaveearly <", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyLessThanOrEqualTo(Integer value) {
            addCriterion("leaveearly <=", value, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyIn(List<Integer> values) {
            addCriterion("leaveearly in", values, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyNotIn(List<Integer> values) {
            addCriterion("leaveearly not in", values, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyBetween(Integer value1, Integer value2) {
            addCriterion("leaveearly between", value1, value2, "leaveearly");
            return (Criteria) this;
        }

        public Criteria andLeaveearlyNotBetween(Integer value1, Integer value2) {
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