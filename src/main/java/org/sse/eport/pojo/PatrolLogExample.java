package org.sse.eport.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatrolLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatrolLogExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPatrolIdIsNull() {
            addCriterion("PATROL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatrolIdIsNotNull() {
            addCriterion("PATROL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolIdEqualTo(Integer value) {
            addCriterion("PATROL_ID =", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotEqualTo(Integer value) {
            addCriterion("PATROL_ID <>", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdGreaterThan(Integer value) {
            addCriterion("PATROL_ID >", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PATROL_ID >=", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdLessThan(Integer value) {
            addCriterion("PATROL_ID <", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdLessThanOrEqualTo(Integer value) {
            addCriterion("PATROL_ID <=", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdIn(List<Integer> values) {
            addCriterion("PATROL_ID in", values, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotIn(List<Integer> values) {
            addCriterion("PATROL_ID not in", values, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdBetween(Integer value1, Integer value2) {
            addCriterion("PATROL_ID between", value1, value2, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PATROL_ID not between", value1, value2, "patrolId");
            return (Criteria) this;
        }

        public Criteria andEqIdIsNull() {
            addCriterion("EQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andEqIdIsNotNull() {
            addCriterion("EQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEqIdEqualTo(Integer value) {
            addCriterion("EQ_ID =", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdNotEqualTo(Integer value) {
            addCriterion("EQ_ID <>", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdGreaterThan(Integer value) {
            addCriterion("EQ_ID >", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQ_ID >=", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdLessThan(Integer value) {
            addCriterion("EQ_ID <", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdLessThanOrEqualTo(Integer value) {
            addCriterion("EQ_ID <=", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdIn(List<Integer> values) {
            addCriterion("EQ_ID in", values, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdNotIn(List<Integer> values) {
            addCriterion("EQ_ID not in", values, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdBetween(Integer value1, Integer value2) {
            addCriterion("EQ_ID between", value1, value2, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EQ_ID not between", value1, value2, "eqId");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeIsNull() {
            addCriterion("PATROL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeIsNotNull() {
            addCriterion("PATROL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PATROL_TIME =", value, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PATROL_TIME <>", value, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PATROL_TIME >", value, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PATROL_TIME >=", value, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeLessThan(Date value) {
            addCriterionForJDBCDate("PATROL_TIME <", value, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PATROL_TIME <=", value, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PATROL_TIME in", values, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PATROL_TIME not in", values, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PATROL_TIME between", value1, value2, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PATROL_TIME not between", value1, value2, "patrolTime");
            return (Criteria) this;
        }

        public Criteria andPatrolResultIsNull() {
            addCriterion("PATROL_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPatrolResultIsNotNull() {
            addCriterion("PATROL_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolResultEqualTo(String value) {
            addCriterion("PATROL_RESULT =", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultNotEqualTo(String value) {
            addCriterion("PATROL_RESULT <>", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultGreaterThan(String value) {
            addCriterion("PATROL_RESULT >", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultGreaterThanOrEqualTo(String value) {
            addCriterion("PATROL_RESULT >=", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultLessThan(String value) {
            addCriterion("PATROL_RESULT <", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultLessThanOrEqualTo(String value) {
            addCriterion("PATROL_RESULT <=", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultLike(String value) {
            addCriterion("PATROL_RESULT like", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultNotLike(String value) {
            addCriterion("PATROL_RESULT not like", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultIn(List<String> values) {
            addCriterion("PATROL_RESULT in", values, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultNotIn(List<String> values) {
            addCriterion("PATROL_RESULT not in", values, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultBetween(String value1, String value2) {
            addCriterion("PATROL_RESULT between", value1, value2, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultNotBetween(String value1, String value2) {
            addCriterion("PATROL_RESULT not between", value1, value2, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureIsNull() {
            addCriterion("PATROL_PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureIsNotNull() {
            addCriterion("PATROL_PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureEqualTo(String value) {
            addCriterion("PATROL_PICTURE =", value, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureNotEqualTo(String value) {
            addCriterion("PATROL_PICTURE <>", value, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureGreaterThan(String value) {
            addCriterion("PATROL_PICTURE >", value, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureGreaterThanOrEqualTo(String value) {
            addCriterion("PATROL_PICTURE >=", value, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureLessThan(String value) {
            addCriterion("PATROL_PICTURE <", value, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureLessThanOrEqualTo(String value) {
            addCriterion("PATROL_PICTURE <=", value, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureLike(String value) {
            addCriterion("PATROL_PICTURE like", value, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureNotLike(String value) {
            addCriterion("PATROL_PICTURE not like", value, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureIn(List<String> values) {
            addCriterion("PATROL_PICTURE in", values, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureNotIn(List<String> values) {
            addCriterion("PATROL_PICTURE not in", values, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureBetween(String value1, String value2) {
            addCriterion("PATROL_PICTURE between", value1, value2, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andPatrolPictureNotBetween(String value1, String value2) {
            addCriterion("PATROL_PICTURE not between", value1, value2, "patrolPicture");
            return (Criteria) this;
        }

        public Criteria andInsertByIsNull() {
            addCriterion("INSERT_BY is null");
            return (Criteria) this;
        }

        public Criteria andInsertByIsNotNull() {
            addCriterion("INSERT_BY is not null");
            return (Criteria) this;
        }

        public Criteria andInsertByEqualTo(String value) {
            addCriterion("INSERT_BY =", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByNotEqualTo(String value) {
            addCriterion("INSERT_BY <>", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByGreaterThan(String value) {
            addCriterion("INSERT_BY >", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByGreaterThanOrEqualTo(String value) {
            addCriterion("INSERT_BY >=", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByLessThan(String value) {
            addCriterion("INSERT_BY <", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByLessThanOrEqualTo(String value) {
            addCriterion("INSERT_BY <=", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByLike(String value) {
            addCriterion("INSERT_BY like", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByNotLike(String value) {
            addCriterion("INSERT_BY not like", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByIn(List<String> values) {
            addCriterion("INSERT_BY in", values, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByNotIn(List<String> values) {
            addCriterion("INSERT_BY not in", values, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByBetween(String value1, String value2) {
            addCriterion("INSERT_BY between", value1, value2, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByNotBetween(String value1, String value2) {
            addCriterion("INSERT_BY not between", value1, value2, "insertBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("INSERT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("INSERT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterionForJDBCDate("INSERT_TIME =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("INSERT_TIME <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("INSERT_TIME >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INSERT_TIME >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterionForJDBCDate("INSERT_TIME <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INSERT_TIME <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterionForJDBCDate("INSERT_TIME in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("INSERT_TIME not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INSERT_TIME between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INSERT_TIME not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
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