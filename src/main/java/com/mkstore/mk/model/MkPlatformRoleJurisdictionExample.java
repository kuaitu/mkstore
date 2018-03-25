package com.mkstore.mk.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MkPlatformRoleJurisdictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by JoinPlugin
     * Name of the database table represented by this class
     */
    public static final String TABLE = "mk_platform_role_jurisdiction";

    /**
     * This field was generated by JoinPlugin
     * SQL query alias of the database table represented by this class
     */
    public static final String ALIAS = "mk_platform_role_jurisdiction";

    /**
     * This field was generated by JoinPlugin
     * SQL query alias of the database table represented by this class
     */
    public static final String ALIAS_ = "mk_platform_role_jurisdiction.";

    private List<String> from;

    private Integer limit;

    private Integer offset;

    public MkPlatformRoleJurisdictionExample() {
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
        from = null;
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public List<String> getFrom() {
        return from;
    }

    public MkPlatformRoleJurisdictionExample addFromClause(String join) {
        if (join == null || (join = join.trim()).length() == 0) return this;
        if (from == null) from = new java.util.ArrayList<String>();
        from.add(join);
        return this;
    }

    /**
     * @param formatString A {@link java.util.Formatter format string} for join expression
     * @param firstArg First argument referenced by the format specifiers in the format string
     * @param secondAndFurtherArgs Second and further arguments referenced by the format specifiers in the format string
     */
    public MkPlatformRoleJurisdictionExample addFromClause(String formatString, Object firstArg, Object ... secondAndFurtherArgs) {
        if (formatString == null || (formatString = formatString.trim()).length() == 0) return this;
        if (from == null) from = new java.util.ArrayList<String>();
        Object[] temp = new Object[(secondAndFurtherArgs == null ? 0 : secondAndFurtherArgs.length) + 1];
        if (secondAndFurtherArgs != null) System.arraycopy(secondAndFurtherArgs, 0, temp, 1, secondAndFurtherArgs.length);
        temp[0] = firstArg;
        String formatted = String.format(formatString, temp);
        from.add(formatted);
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public MkPlatformRoleJurisdictionExample setLimitAndOffset(Integer limit, Integer offset) {
        if (limit != null && limit > 0) {
            this.limit = limit;
            this.offset = (offset != null && offset > 0) ? offset : null;
        } else {
            this.limit = this.offset = null;
        }
        return this;
    }

    public MkPlatformRoleJurisdictionExample setLimit(Integer limit) {
        return setLimitAndOffset(limit, null);
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

        public Criteria andPlatformRoleJurisdictionIdIsNull() {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdIsNotNull() {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id =", value, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdNotEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id <>", value, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdGreaterThan(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id >", value, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id >=", value, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdLessThan(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id <", value, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdLessThanOrEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id <=", value, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdIn(List<Integer> values) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id in", values, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdNotIn(List<Integer> values) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id not in", values, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdBetween(Integer value1, Integer value2) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id between", value1, value2, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleJurisdictionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_jurisdiction_id not between", value1, value2, "platformRoleJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdIsNull() {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdIsNotNull() {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id =", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdNotEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id <>", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdGreaterThan(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id >", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id >=", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdLessThan(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id <", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id <=", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdIn(List<Integer> values) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id in", values, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdNotIn(List<Integer> values) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id not in", values, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id between", value1, value2, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mk_platform_role_jurisdiction.platform_role_id not between", value1, value2, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdIsNull() {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdIsNotNull() {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id =", value, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdNotEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id <>", value, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdGreaterThan(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id >", value, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id >=", value, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdLessThan(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id <", value, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdLessThanOrEqualTo(Integer value) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id <=", value, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdIn(List<Integer> values) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id in", values, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdNotIn(List<Integer> values) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id not in", values, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdBetween(Integer value1, Integer value2) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id between", value1, value2, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andPlatformJurisdictionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mk_platform_role_jurisdiction.platform_jurisdiction_id not between", value1, value2, "platformJurisdictionId");
            return (Criteria) this;
        }

        public Criteria andEqualTo(String field, Object value) {
            if (value == null) return andIsNull(field);
            if (value instanceof java.util.Date) value = new java.sql.Date(((java.util.Date)value).getTime());
            addCriterion(field+" = ", value, field);
            return (Criteria)this;
        }

        public Criteria andNotEqualTo(String field, Object value) {
            if (value == null) return andIsNotNull(field);
            if (value instanceof java.util.Date) value = new java.sql.Date(((java.util.Date)value).getTime());
            addCriterion(field+" <> ", value, field);
            return (Criteria)this;
        }

        public Criteria andIsNull(String field) {
            addCriterion(field+" is null");
            return (Criteria)this;
        }

        public Criteria andIsNotNull(String field) {
            addCriterion(field+" is not null");
            return (Criteria)this;
        }

        public Criteria and(String condition) {
            addCriterion(condition);
            return (Criteria)this;
        }

        private List<Integer> arrayOfIntToListOfInteger(int[] values) {
            List<Integer> list = new ArrayList<Integer>();
            if (values != null) for (int i : values) list.add(i);
            return list;
        }

        private List<Integer> arrayOfLongToListOfInteger(long[] values) {
            List<Integer> list = new ArrayList<Integer>();
            if (values != null) for (long i : values) if (i >= Integer.MIN_VALUE && i <= Integer.MAX_VALUE) list.add((int)i);
            return list;
        }

        private List<Integer> arrayOfNumberToListOfInteger(Number[] values) {
            List<Integer> list = new ArrayList<Integer>();
            if (values != null) for (Number i : values) if (i != null && i.longValue() >= Integer.MIN_VALUE && i.longValue() <= Integer.MAX_VALUE) list.add(i.intValue());
            return list;
        }

        private List<Integer> setOfNumberToListOfInteger(Set<? extends Number> values) {
            List<Integer> list = new ArrayList<Integer>();
            if (values != null) for (Number i : values) if (i != null && i.longValue() >= Integer.MIN_VALUE && i.longValue() <= Integer.MAX_VALUE) list.add(i.intValue());
            return list;
        }

        public Criteria andPlatformRoleJurisdictionIdIn(int[] values) {
            return andPlatformRoleJurisdictionIdIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andPlatformRoleJurisdictionIdIn(long[] values) {
            return andPlatformRoleJurisdictionIdIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andPlatformRoleJurisdictionIdIn(Number[] values) {
            return andPlatformRoleJurisdictionIdIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformRoleJurisdictionIdIn(Set<? extends Number> values) {
            return andPlatformRoleJurisdictionIdIn(setOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformRoleJurisdictionIdNotIn(int[] values) {
            return andPlatformRoleJurisdictionIdNotIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andPlatformRoleJurisdictionIdNotIn(long[] values) {
            return andPlatformRoleJurisdictionIdNotIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andPlatformRoleJurisdictionIdNotIn(Number[] values) {
            return andPlatformRoleJurisdictionIdNotIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformRoleJurisdictionIdNotIn(Set<? extends Number> values) {
            return andPlatformRoleJurisdictionIdNotIn(setOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformRoleIdIn(int[] values) {
            return andPlatformRoleIdIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andPlatformRoleIdIn(long[] values) {
            return andPlatformRoleIdIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andPlatformRoleIdIn(Number[] values) {
            return andPlatformRoleIdIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformRoleIdIn(Set<? extends Number> values) {
            return andPlatformRoleIdIn(setOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformRoleIdNotIn(int[] values) {
            return andPlatformRoleIdNotIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andPlatformRoleIdNotIn(long[] values) {
            return andPlatformRoleIdNotIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andPlatformRoleIdNotIn(Number[] values) {
            return andPlatformRoleIdNotIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformRoleIdNotIn(Set<? extends Number> values) {
            return andPlatformRoleIdNotIn(setOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformJurisdictionIdIn(int[] values) {
            return andPlatformJurisdictionIdIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andPlatformJurisdictionIdIn(long[] values) {
            return andPlatformJurisdictionIdIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andPlatformJurisdictionIdIn(Number[] values) {
            return andPlatformJurisdictionIdIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformJurisdictionIdIn(Set<? extends Number> values) {
            return andPlatformJurisdictionIdIn(setOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformJurisdictionIdNotIn(int[] values) {
            return andPlatformJurisdictionIdNotIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andPlatformJurisdictionIdNotIn(long[] values) {
            return andPlatformJurisdictionIdNotIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andPlatformJurisdictionIdNotIn(Number[] values) {
            return andPlatformJurisdictionIdNotIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andPlatformJurisdictionIdNotIn(Set<? extends Number> values) {
            return andPlatformJurisdictionIdNotIn(setOfNumberToListOfInteger(values));
        }

        public Criteria andIf(String field, String operator, Object value) {
            return andIf(field, operator, value, null, null);
        }

        public Criteria andIf(String field, String operator, Object value, String beforeValue, String afterValue) {
            if (field == null || field.trim().length() == 0) { field = "null"; }
            if (operator == null) { addCriterion("1=2 /* "+field.replaceAll("[^0-9A-Za-z _.()]","")+".operator */ "); return (Criteria)this; }
            if (value == null) { addCriterion("1=2 /* "+field.replaceAll("[^0-9A-Za-z _.()]","")+".value */ "); return (Criteria)this; }
            if (value instanceof java.util.Date) value = new java.sql.Date(((java.util.Date)value).getTime());
            String condition = field + " "+operator+" ";
            Criterion c = new Criterion(condition, value);
            if (beforeValue != null) c.beforeValue = beforeValue;
            if (afterValue != null) c.afterValue = afterValue;
            criteria.add(c);
            return (Criteria)this;
        }

        public Criteria andRightIf(Object value, String operator, String field) {
            return andRightIf(value, operator, field, null, null);
        }

        public Criteria andRightIf(Object value, String operator, String field, String beforeValue, String afterValue) {
            if (field == null || field.trim().length() == 0) { field = "null"; }
            if (operator == null) { addCriterion("1=2 /* "+field.replaceAll("[^0-9A-Za-z _.()]","")+".operator */ "); return (Criteria)this; }
            if (value == null) { addCriterion("1=2 /* "+field.replaceAll("[^0-9A-Za-z _.()]","")+".value */ "); return (Criteria)this; }
            if (value instanceof java.util.Date) value = new java.sql.Date(((java.util.Date)value).getTime());
            String condition = " "+operator+" "+field;
            Criterion c = new Criterion(condition, value);
            if (beforeValue != null) c.beforeValue = beforeValue;
            if (afterValue != null) c.afterValue = afterValue;
            c.rightValue = true;
            criteria.add(c);
            return (Criteria)this;
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

        private String afterValue = "";

        private String beforeValue = "";

        private boolean rightValue;

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

        public String getAfterValue() {
            return afterValue;
        }

        public String getBeforeValue() {
            return beforeValue;
        }

        public boolean isRightValue() {
            return rightValue;
        }
    }
}