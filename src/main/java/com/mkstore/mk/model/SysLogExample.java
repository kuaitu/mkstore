package com.mkstore.mk.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class SysLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by JoinPlugin
     * Name of the database table represented by this class
     */
    public static final String TABLE = "sys_log";

    /**
     * This field was generated by JoinPlugin
     * SQL query alias of the database table represented by this class
     */
    public static final String ALIAS = "sys_log";

    /**
     * This field was generated by JoinPlugin
     * SQL query alias of the database table represented by this class
     */
    public static final String ALIAS_ = "sys_log.";

    private List<String> from;

    private Integer limit;

    private Integer offset;

    public SysLogExample() {
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

    public SysLogExample addFromClause(String join) {
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
    public SysLogExample addFromClause(String formatString, Object firstArg, Object ... secondAndFurtherArgs) {
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

    public SysLogExample setLimitAndOffset(Integer limit, Integer offset) {
        if (limit != null && limit > 0) {
            this.limit = limit;
            this.offset = (offset != null && offset > 0) ? offset : null;
        } else {
            this.limit = this.offset = null;
        }
        return this;
    }

    public SysLogExample setLimit(Integer limit) {
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

        public Criteria andLogIdIsNull() {
            addCriterion("sys_log.log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("sys_log.log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("sys_log.log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("sys_log.log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("sys_log.log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_log.log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("sys_log.log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_log.log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("sys_log.log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("sys_log.log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_log.log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_log.log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdIsNull() {
            addCriterion("sys_log.opt_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOptUserIdIsNotNull() {
            addCriterion("sys_log.opt_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptUserIdEqualTo(Integer value) {
            addCriterion("sys_log.opt_user_id =", value, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdNotEqualTo(Integer value) {
            addCriterion("sys_log.opt_user_id <>", value, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdGreaterThan(Integer value) {
            addCriterion("sys_log.opt_user_id >", value, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_log.opt_user_id >=", value, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdLessThan(Integer value) {
            addCriterion("sys_log.opt_user_id <", value, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_log.opt_user_id <=", value, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdIn(List<Integer> values) {
            addCriterion("sys_log.opt_user_id in", values, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdNotIn(List<Integer> values) {
            addCriterion("sys_log.opt_user_id not in", values, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_log.opt_user_id between", value1, value2, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_log.opt_user_id not between", value1, value2, "optUserId");
            return (Criteria) this;
        }

        public Criteria andOptUserNameIsNull() {
            addCriterion("sys_log.opt_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOptUserNameIsNotNull() {
            addCriterion("sys_log.opt_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOptUserNameEqualTo(String value) {
            addCriterion("sys_log.opt_user_name =", value, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameNotEqualTo(String value) {
            addCriterion("sys_log.opt_user_name <>", value, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameGreaterThan(String value) {
            addCriterion("sys_log.opt_user_name >", value, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_user_name >=", value, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameLessThan(String value) {
            addCriterion("sys_log.opt_user_name <", value, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameLessThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_user_name <=", value, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameLike(String value) {
            addCriterion("sys_log.opt_user_name like", value, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameNotLike(String value) {
            addCriterion("sys_log.opt_user_name not like", value, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameIn(List<String> values) {
            addCriterion("sys_log.opt_user_name in", values, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameNotIn(List<String> values) {
            addCriterion("sys_log.opt_user_name not in", values, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameBetween(String value1, String value2) {
            addCriterion("sys_log.opt_user_name between", value1, value2, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptUserNameNotBetween(String value1, String value2) {
            addCriterion("sys_log.opt_user_name not between", value1, value2, "optUserName");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNull() {
            addCriterion("sys_log.opt_type is null");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNotNull() {
            addCriterion("sys_log.opt_type is not null");
            return (Criteria) this;
        }

        public Criteria andOptTypeEqualTo(String value) {
            addCriterion("sys_log.opt_type =", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotEqualTo(String value) {
            addCriterion("sys_log.opt_type <>", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThan(String value) {
            addCriterion("sys_log.opt_type >", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_type >=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThan(String value) {
            addCriterion("sys_log.opt_type <", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_type <=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLike(String value) {
            addCriterion("sys_log.opt_type like", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotLike(String value) {
            addCriterion("sys_log.opt_type not like", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeIn(List<String> values) {
            addCriterion("sys_log.opt_type in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotIn(List<String> values) {
            addCriterion("sys_log.opt_type not in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeBetween(String value1, String value2) {
            addCriterion("sys_log.opt_type between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotBetween(String value1, String value2) {
            addCriterion("sys_log.opt_type not between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTableIsNull() {
            addCriterion("sys_log.opt_table is null");
            return (Criteria) this;
        }

        public Criteria andOptTableIsNotNull() {
            addCriterion("sys_log.opt_table is not null");
            return (Criteria) this;
        }

        public Criteria andOptTableEqualTo(String value) {
            addCriterion("sys_log.opt_table =", value, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableNotEqualTo(String value) {
            addCriterion("sys_log.opt_table <>", value, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableGreaterThan(String value) {
            addCriterion("sys_log.opt_table >", value, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableGreaterThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_table >=", value, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableLessThan(String value) {
            addCriterion("sys_log.opt_table <", value, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableLessThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_table <=", value, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableLike(String value) {
            addCriterion("sys_log.opt_table like", value, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableNotLike(String value) {
            addCriterion("sys_log.opt_table not like", value, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableIn(List<String> values) {
            addCriterion("sys_log.opt_table in", values, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableNotIn(List<String> values) {
            addCriterion("sys_log.opt_table not in", values, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableBetween(String value1, String value2) {
            addCriterion("sys_log.opt_table between", value1, value2, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTableNotBetween(String value1, String value2) {
            addCriterion("sys_log.opt_table not between", value1, value2, "optTable");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNull() {
            addCriterion("sys_log.opt_time is null");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNotNull() {
            addCriterion("sys_log.opt_time is not null");
            return (Criteria) this;
        }

        public Criteria andOptTimeEqualTo(Date value) {
            addCriterion("sys_log.opt_time =", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotEqualTo(Date value) {
            addCriterion("sys_log.opt_time <>", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThan(Date value) {
            addCriterion("sys_log.opt_time >", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_log.opt_time >=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThan(Date value) {
            addCriterion("sys_log.opt_time <", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_log.opt_time <=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeIn(List<Date> values) {
            addCriterion("sys_log.opt_time in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotIn(List<Date> values) {
            addCriterion("sys_log.opt_time not in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeBetween(Date value1, Date value2) {
            addCriterion("sys_log.opt_time between", value1, value2, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_log.opt_time not between", value1, value2, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyIsNull() {
            addCriterion("sys_log.opt_pri_key is null");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyIsNotNull() {
            addCriterion("sys_log.opt_pri_key is not null");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyEqualTo(String value) {
            addCriterion("sys_log.opt_pri_key =", value, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyNotEqualTo(String value) {
            addCriterion("sys_log.opt_pri_key <>", value, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyGreaterThan(String value) {
            addCriterion("sys_log.opt_pri_key >", value, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyGreaterThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_pri_key >=", value, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyLessThan(String value) {
            addCriterion("sys_log.opt_pri_key <", value, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyLessThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_pri_key <=", value, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyLike(String value) {
            addCriterion("sys_log.opt_pri_key like", value, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyNotLike(String value) {
            addCriterion("sys_log.opt_pri_key not like", value, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyIn(List<String> values) {
            addCriterion("sys_log.opt_pri_key in", values, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyNotIn(List<String> values) {
            addCriterion("sys_log.opt_pri_key not in", values, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyBetween(String value1, String value2) {
            addCriterion("sys_log.opt_pri_key between", value1, value2, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptPriKeyNotBetween(String value1, String value2) {
            addCriterion("sys_log.opt_pri_key not between", value1, value2, "optPriKey");
            return (Criteria) this;
        }

        public Criteria andOptTagIsNull() {
            addCriterion("sys_log.opt_tag is null");
            return (Criteria) this;
        }

        public Criteria andOptTagIsNotNull() {
            addCriterion("sys_log.opt_tag is not null");
            return (Criteria) this;
        }

        public Criteria andOptTagEqualTo(String value) {
            addCriterion("sys_log.opt_tag =", value, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagNotEqualTo(String value) {
            addCriterion("sys_log.opt_tag <>", value, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagGreaterThan(String value) {
            addCriterion("sys_log.opt_tag >", value, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagGreaterThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_tag >=", value, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagLessThan(String value) {
            addCriterion("sys_log.opt_tag <", value, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagLessThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_tag <=", value, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagLike(String value) {
            addCriterion("sys_log.opt_tag like", value, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagNotLike(String value) {
            addCriterion("sys_log.opt_tag not like", value, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagIn(List<String> values) {
            addCriterion("sys_log.opt_tag in", values, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagNotIn(List<String> values) {
            addCriterion("sys_log.opt_tag not in", values, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagBetween(String value1, String value2) {
            addCriterion("sys_log.opt_tag between", value1, value2, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptTagNotBetween(String value1, String value2) {
            addCriterion("sys_log.opt_tag not between", value1, value2, "optTag");
            return (Criteria) this;
        }

        public Criteria andOptContentIsNull() {
            addCriterion("sys_log.opt_content is null");
            return (Criteria) this;
        }

        public Criteria andOptContentIsNotNull() {
            addCriterion("sys_log.opt_content is not null");
            return (Criteria) this;
        }

        public Criteria andOptContentEqualTo(String value) {
            addCriterion("sys_log.opt_content =", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotEqualTo(String value) {
            addCriterion("sys_log.opt_content <>", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentGreaterThan(String value) {
            addCriterion("sys_log.opt_content >", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentGreaterThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_content >=", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentLessThan(String value) {
            addCriterion("sys_log.opt_content <", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentLessThanOrEqualTo(String value) {
            addCriterion("sys_log.opt_content <=", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentLike(String value) {
            addCriterion("sys_log.opt_content like", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotLike(String value) {
            addCriterion("sys_log.opt_content not like", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentIn(List<String> values) {
            addCriterion("sys_log.opt_content in", values, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotIn(List<String> values) {
            addCriterion("sys_log.opt_content not in", values, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentBetween(String value1, String value2) {
            addCriterion("sys_log.opt_content between", value1, value2, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotBetween(String value1, String value2) {
            addCriterion("sys_log.opt_content not between", value1, value2, "optContent");
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

        public Criteria andLogIdIn(int[] values) {
            return andLogIdIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andLogIdIn(long[] values) {
            return andLogIdIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andLogIdIn(Number[] values) {
            return andLogIdIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andLogIdIn(Set<? extends Number> values) {
            return andLogIdIn(setOfNumberToListOfInteger(values));
        }

        public Criteria andLogIdNotIn(int[] values) {
            return andLogIdNotIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andLogIdNotIn(long[] values) {
            return andLogIdNotIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andLogIdNotIn(Number[] values) {
            return andLogIdNotIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andLogIdNotIn(Set<? extends Number> values) {
            return andLogIdNotIn(setOfNumberToListOfInteger(values));
        }

        public Criteria andOptUserIdIn(int[] values) {
            return andOptUserIdIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andOptUserIdIn(long[] values) {
            return andOptUserIdIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andOptUserIdIn(Number[] values) {
            return andOptUserIdIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andOptUserIdIn(Set<? extends Number> values) {
            return andOptUserIdIn(setOfNumberToListOfInteger(values));
        }

        public Criteria andOptUserIdNotIn(int[] values) {
            return andOptUserIdNotIn(arrayOfIntToListOfInteger(values));
        }

        public Criteria andOptUserIdNotIn(long[] values) {
            return andOptUserIdNotIn(arrayOfLongToListOfInteger(values));
        }

        public Criteria andOptUserIdNotIn(Number[] values) {
            return andOptUserIdNotIn(arrayOfNumberToListOfInteger(values));
        }

        public Criteria andOptUserIdNotIn(Set<? extends Number> values) {
            return andOptUserIdNotIn(setOfNumberToListOfInteger(values));
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