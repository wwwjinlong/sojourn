package com.ziroom.minsu.entity.customer;

import com.asura.framework.base.entity.BaseEntity;

public class CustomerBaseMsgExtEntity extends BaseEntity{
    /**
	 * 序列id
	 */
	private static final long serialVersionUID = 4766579938808093445L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer_base_msg_ext.id
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer_base_msg_ext.fid
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    private String fid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer_base_msg_ext.uid
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer_base_msg_ext.customer_introduce
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    private String customerIntroduce;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_base_msg_ext.id
     *
     * @return the value of t_customer_base_msg_ext.id
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_base_msg_ext.id
     *
     * @param id the value for t_customer_base_msg_ext.id
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_base_msg_ext.fid
     *
     * @return the value of t_customer_base_msg_ext.fid
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    public String getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_base_msg_ext.fid
     *
     * @param fid the value for t_customer_base_msg_ext.fid
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_base_msg_ext.uid
     *
     * @return the value of t_customer_base_msg_ext.uid
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_base_msg_ext.uid
     *
     * @param uid the value for t_customer_base_msg_ext.uid
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer_base_msg_ext.customer_introduce
     *
     * @return the value of t_customer_base_msg_ext.customer_introduce
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    public String getCustomerIntroduce() {
        return customerIntroduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer_base_msg_ext.customer_introduce
     *
     * @param customerIntroduce the value for t_customer_base_msg_ext.customer_introduce
     *
     * @mbggenerated Thu May 26 17:34:18 CST 2016
     */
    public void setCustomerIntroduce(String customerIntroduce) {
        this.customerIntroduce = customerIntroduce == null ? null : customerIntroduce.trim();
    }
}