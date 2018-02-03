package com.ziroom.minsu.entity.customer;

import java.util.Date;

import com.asura.framework.base.entity.BaseEntity;

/**
 * 
 * <p>客户银行卡信息</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author bushujie
 * @since 1.0
 * @version 1.0
 */
public class CustomerBankCardMsgEntity extends BaseEntity{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -4591378863238277365L;

	//自增id
    private Integer id;

	//逻辑id
    private String fid;
    
	//用户uid
    private String uid;

	//开户人姓名
    private String bankcardHolder;

	//银行名称
    private String bankName;

	//分行名称
    private String branchName;

	//银行卡号
    private String bankcardNo;

	//创建时间
    private Date createDate;

	//最后更新时间
    private Date lastModifyDate;

	//是否删除 0：否，1：是
    private Integer isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_bankcard_msg.id
     *
     * @return the value of t_customer_bankcard_msg.id
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_bankcard_msg.id
     *
     * @param id the value for t_customer_bankcard_msg.id
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_bankcard_msg.uid
     *
     * @return the value of t_customer_bankcard_msg.uid
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_bankcard_msg.uid
     *
     * @param uid the value for t_customer_bankcard_msg.uid
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_bankcard_msg.bankcard_holder
     *
     * @return the value of t_customer_bankcard_msg.bankcard_holder
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public String getBankcardHolder() {
        return bankcardHolder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_bankcard_msg.bankcard_holder
     *
     * @param bankcardHolder the value for t_customer_bankcard_msg.bankcard_holder
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public void setBankcardHolder(String bankcardHolder) {
        this.bankcardHolder = bankcardHolder == null ? null : bankcardHolder.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_bankcard_msg.bank_name
     *
     * @return the value of t_customer_bankcard_msg.bank_name
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_bankcard_msg.bank_name
     *
     * @param bankName the value for t_customer_bankcard_msg.bank_name
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_bankcard_msg.branch_name
     *
     * @return the value of t_customer_bankcard_msg.branch_name
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_bankcard_msg.branch_name
     *
     * @param branchName the value for t_customer_bankcard_msg.branch_name
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_bankcard_msg.bankcard_no
     *
     * @return the value of t_customer_bankcard_msg.bankcard_no
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public String getBankcardNo() {
        return bankcardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_bankcard_msg.bankcard_no
     *
     * @param bankcardNo the value for t_customer_bankcard_msg.bankcard_no
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo == null ? null : bankcardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_bankcard_msg.create_date
     *
     * @return the value of t_customer_bankcard_msg.create_date
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_bankcard_msg.create_date
     *
     * @param createDate the value for t_customer_bankcard_msg.create_date
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_bankcard_msg.last_modify_date
     *
     * @return the value of t_customer_bankcard_msg.last_modify_date
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_bankcard_msg.last_modify_date
     *
     * @param lastModifyDate the value for t_customer_bankcard_msg.last_modify_date
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_bankcard_msg.is_del
     *
     * @return the value of t_customer_bankcard_msg.is_del
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_bankcard_msg.is_del
     *
     * @param isDel the value for t_customer_bankcard_msg.is_del
     *
     * @mbggenerated Thu Apr 21 20:20:14 CST 2016
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
    
    /**
	 * @return the fid
	 */
	public String getFid() {
		return fid;
	}

	/**
	 * @param fid the fid to set
	 */
	public void setFid(String fid) {
		this.fid = fid;
	}
}