package com.mkstore.mk.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class MkPlatformRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by JoinPlugin
     * Name of the database table represented by this class
     */
    public static final String TABLE = "mk_platform_role";

    /**
     * This field was generated by JoinPlugin
     * SQL query alias of the database table represented by this class
     */
    public static final String ALIAS = "mk_platform_role";

    /**
     * This field was generated by JoinPlugin
     * SQL query alias of the database table represented by this class
     */
    public static final String ALIAS_ = "mk_platform_role.";

    private List<String> from;

    private Integer limit;

    private Integer offset;

    public MkPlatformRoleExample() {
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

    public MkPlatformRoleExample addFromClause(String join) {
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
    public MkPlatformRoleExample addFromClause(String formatString, Object firstArg, Object ... secondAndFurtherArgs) {
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

    public MkPlatformRoleExample setLimitAndOffset(Integer limit, Integer offset) {
        if (limit != null && limit > 0) {
            this.limit = limit;
            this.offset = (offset != null && offset > 0) ? offset : null;
        } else {
            this.limit = this.offset = null;
        }
        return this;
    }

    public MkPlatformRoleExample setLimit(Integer limit) {
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

        public Criteria andPlatformRoleIdIsNull() {
            addCriterion("mk_platform_role.platform_role_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdIsNotNull() {
            addCriterion("mk_platform_role.platform_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdEqualTo(Integer value) {
            addCriterion("mk_platform_role.platform_role_id =", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdNotEqualTo(Integer value) {
            addCriterion("mk_platform_role.platform_role_id <>", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdGreaterThan(Integer value) {
            addCriterion("mk_platform_role.platform_role_id >", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mk_platform_role.platform_role_id >=", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdLessThan(Integer value) {
            addCriterion("mk_platform_role.platform_role_id <", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("mk_platform_role.platform_role_id <=", value, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdIn(List<Integer> values) {
            addCriterion("mk_platform_role.platform_role_id in", values, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdNotIn(List<Integer> values) {
            addCriterion("mk_platform_role.platform_role_id not in", values, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("mk_platform_role.platform_role_id between", value1, value2, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andPlatformRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mk_platform_role.platform_role_id not between", value1, value2, "platformRoleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("mk_platform_role.role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("mk_platform_role.role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("mk_platform_role.role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("mk_platform_role.role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("mk_platform_role.role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("mk_platform_role.role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("mk_platform_role.role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("mk_platform_role.role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("mk_platform_role.role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("mk_platform_role.role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("mk_platform_role.role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("mk_platform_role.role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("mk_platform_role.role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("mk_platform_role.role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeIsNull() {
            addCriterion("mk_platform_role.role_describe is null");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeIsNotNull() {
            addCriterion("mk_platform_role.role_describe is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeEqualTo(String value) {
            addCriterion("mk_platform_role.role_describe =", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeNotEqualTo(String value) {
            addCriterion("mk_platform_role.role_describe <>", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeGreaterThan(String value) {
            addCriterion("mk_platform_role.role_describe >", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("mk_platform_role.role_describe >=", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeLessThan(String value) {
            addCriterion("mk_platform_role.role_describe <", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeLessThanOrEqualTo(String value) {
            addCriterion("mk_platform_role.role_describe <=", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeLike(String value) {
            addCriterion("mk_platform_role.role_describe like", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeNotLike(String value) {
            addCriterion("mk_platform_role.role_describe not like", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeIn(List<String> values) {
            addCriterion("mk_platform_role.role_describe in", values, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeNotIn(List<String> values) {
            addCriterion("mk_platform_role.role_describe not in", values, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeBetween(String value1, String value2) {
            addCriterion("mk_platform_role.role_describe between", value1, value2, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeNotBetween(String value1, String value2) {
            addCriterion("mk_platform_role.role_describe not between", value1, value2, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIsNull() {
            addCriterion("mk_platform_role.role_status is null");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIsNotNull() {
            addCriterion("mk_platform_role.role_status is not null");
            return (Criteria) this;
        }

        public Criteria andRoleStatusEqualTo(String value) {
            addCriterion("mk_platform_role.role_status =", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotEqualTo(String value) {
            addCriterion("mk_platform_role.role_status <>", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusGreaterThan(String value) {
            addCriterion("mk_platform_role.role_status >", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mk_platform_role.role_status >=", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLessThan(String value) {
            addCriterion("mk_platform_role.role_status <", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLessThanOrEqualTo(String value) {
            addCriterion("mk_platform_role.role_status <=", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLike(String value) {
            addCriterion("mk_platform_role.role_status like", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotLike(String value) {
            addCriterion("mk_platform_role.role_status not like", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIn(List<String> values) {
            addCriterion("mk_platform_role.role_status in", values, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotIn(List<String> values) {
            addCriterion("mk_platform_role.role_status not in", values, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusBetween(String value1, String value2) {
            addCriterion("mk_platform_role.role_status between", value1, value2, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotBetween(String value1, String value2) {
            addCriterion("mk_platform_role.role_status not between", value1, value2, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("mk_platform_role.add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("mk_platform_role.add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("mk_platform_role.add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("mk_platform_role.add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("mk_platform_role.add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mk_platform_role.add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("mk_platform_role.add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("mk_platform_role.add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("mk_platform_role.add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("mk_platform_role.add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("mk_platform_role.add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("mk_platform_role.add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("mk_platform_role.is_admin is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("mk_platform_role.is_admin is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(String value) {
            addCriterion("mk_platform_role.is_admin =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(String value) {
            addCriterion("mk_platform_role.is_admin <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(String value) {
            addCriterion("mk_platform_role.is_admin >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(String value) {
            addCriterion("mk_platform_role.is_admin >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(String value) {
            addCriterion("mk_platform_role.is_admin <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(String value) {
            addCriterion("mk_platform_role.is_admin <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLike(String value) {
            addCriterion("mk_platform_role.is_admin like", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotLike(String value) {
            addCriterion("mk_platform_role.is_admin not like", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<String> values) {
            addCriterion("mk_platform_role.is_admin in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<String> values) {
            addCriterion("mk_platform_role.is_admin not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(String value1, String value2) {
            addCriterion("mk_platform_role.is_admin between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(String value1, String value2) {
            addCriterion("mk_platform_role.is_admin not between", value1, value2, "isAdmin");
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