package com.jxc.pojo;

import java.util.ArrayList;
import java.util.List;

public class TransferExample {
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

    public TransferExample() {
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

        public Criteria andTnoIsNull() {
            addCriterion("tno is null");
            return (Criteria) this;
        }

        public Criteria andTnoIsNotNull() {
            addCriterion("tno is not null");
            return (Criteria) this;
        }

        public Criteria andTnoEqualTo(Integer value) {
            addCriterion("tno =", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotEqualTo(Integer value) {
            addCriterion("tno <>", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThan(Integer value) {
            addCriterion("tno >", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tno >=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThan(Integer value) {
            addCriterion("tno <", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThanOrEqualTo(Integer value) {
            addCriterion("tno <=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoIn(List<Integer> values) {
            addCriterion("tno in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotIn(List<Integer> values) {
            addCriterion("tno not in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoBetween(Integer value1, Integer value2) {
            addCriterion("tno between", value1, value2, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotBetween(Integer value1, Integer value2) {
            addCriterion("tno not between", value1, value2, "tno");
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

        public Criteria andOlddnoIsNull() {
            addCriterion("olddno is null");
            return (Criteria) this;
        }

        public Criteria andOlddnoIsNotNull() {
            addCriterion("olddno is not null");
            return (Criteria) this;
        }

        public Criteria andOlddnoEqualTo(Integer value) {
            addCriterion("olddno =", value, "olddno");
            return (Criteria) this;
        }

        public Criteria andOlddnoNotEqualTo(Integer value) {
            addCriterion("olddno <>", value, "olddno");
            return (Criteria) this;
        }

        public Criteria andOlddnoGreaterThan(Integer value) {
            addCriterion("olddno >", value, "olddno");
            return (Criteria) this;
        }

        public Criteria andOlddnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("olddno >=", value, "olddno");
            return (Criteria) this;
        }

        public Criteria andOlddnoLessThan(Integer value) {
            addCriterion("olddno <", value, "olddno");
            return (Criteria) this;
        }

        public Criteria andOlddnoLessThanOrEqualTo(Integer value) {
            addCriterion("olddno <=", value, "olddno");
            return (Criteria) this;
        }

        public Criteria andOlddnoIn(List<Integer> values) {
            addCriterion("olddno in", values, "olddno");
            return (Criteria) this;
        }

        public Criteria andOlddnoNotIn(List<Integer> values) {
            addCriterion("olddno not in", values, "olddno");
            return (Criteria) this;
        }

        public Criteria andOlddnoBetween(Integer value1, Integer value2) {
            addCriterion("olddno between", value1, value2, "olddno");
            return (Criteria) this;
        }

        public Criteria andOlddnoNotBetween(Integer value1, Integer value2) {
            addCriterion("olddno not between", value1, value2, "olddno");
            return (Criteria) this;
        }

        public Criteria andNewdnoIsNull() {
            addCriterion("newdno is null");
            return (Criteria) this;
        }

        public Criteria andNewdnoIsNotNull() {
            addCriterion("newdno is not null");
            return (Criteria) this;
        }

        public Criteria andNewdnoEqualTo(Integer value) {
            addCriterion("newdno =", value, "newdno");
            return (Criteria) this;
        }

        public Criteria andNewdnoNotEqualTo(Integer value) {
            addCriterion("newdno <>", value, "newdno");
            return (Criteria) this;
        }

        public Criteria andNewdnoGreaterThan(Integer value) {
            addCriterion("newdno >", value, "newdno");
            return (Criteria) this;
        }

        public Criteria andNewdnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("newdno >=", value, "newdno");
            return (Criteria) this;
        }

        public Criteria andNewdnoLessThan(Integer value) {
            addCriterion("newdno <", value, "newdno");
            return (Criteria) this;
        }

        public Criteria andNewdnoLessThanOrEqualTo(Integer value) {
            addCriterion("newdno <=", value, "newdno");
            return (Criteria) this;
        }

        public Criteria andNewdnoIn(List<Integer> values) {
            addCriterion("newdno in", values, "newdno");
            return (Criteria) this;
        }

        public Criteria andNewdnoNotIn(List<Integer> values) {
            addCriterion("newdno not in", values, "newdno");
            return (Criteria) this;
        }

        public Criteria andNewdnoBetween(Integer value1, Integer value2) {
            addCriterion("newdno between", value1, value2, "newdno");
            return (Criteria) this;
        }

        public Criteria andNewdnoNotBetween(Integer value1, Integer value2) {
            addCriterion("newdno not between", value1, value2, "newdno");
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