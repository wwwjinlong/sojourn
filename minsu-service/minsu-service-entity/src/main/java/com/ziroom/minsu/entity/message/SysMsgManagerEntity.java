package com.ziroom.minsu.entity.message;

import java.util.Date;

import com.asura.framework.base.entity.BaseEntity;

public class SysMsgManagerEntity extends BaseEntity{
    /**
	 * 序列id
	 */
	private static final long serialVersionUID = -5197425465612097982L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.id
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.fid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private String fid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.create_uid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private String createUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.msg_title
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private String msgTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.msg_content
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private String msgContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.is_release
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private Integer isRelease;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.is_del
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private Integer isDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.msg_target_type
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private Integer msgTargetType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.msg_target_uid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private String msgTargetUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.modify_uid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private String modifyUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.create_time
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_msg_manager.last_modify_date
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    private Date lastModifyDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.id
     *
     * @return the value of t_sys_msg_manager.id
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.id
     *
     * @param id the value for t_sys_msg_manager.id
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.fid
     *
     * @return the value of t_sys_msg_manager.fid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public String getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.fid
     *
     * @param fid the value for t_sys_msg_manager.fid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.create_uid
     *
     * @return the value of t_sys_msg_manager.create_uid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public String getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.create_uid
     *
     * @param createUid the value for t_sys_msg_manager.create_uid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.msg_title
     *
     * @return the value of t_sys_msg_manager.msg_title
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public String getMsgTitle() {
        return msgTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.msg_title
     *
     * @param msgTitle the value for t_sys_msg_manager.msg_title
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.msg_content
     *
     * @return the value of t_sys_msg_manager.msg_content
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.msg_content
     *
     * @param msgContent the value for t_sys_msg_manager.msg_content
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.is_release
     *
     * @return the value of t_sys_msg_manager.is_release
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public Integer getIsRelease() {
        return isRelease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.is_release
     *
     * @param isRelease the value for t_sys_msg_manager.is_release
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setIsRelease(Integer isRelease) {
        this.isRelease = isRelease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.is_del
     *
     * @return the value of t_sys_msg_manager.is_del
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.is_del
     *
     * @param isDel the value for t_sys_msg_manager.is_del
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.msg_target_type
     *
     * @return the value of t_sys_msg_manager.msg_target_type
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public Integer getMsgTargetType() {
        return msgTargetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.msg_target_type
     *
     * @param msgTargetType the value for t_sys_msg_manager.msg_target_type
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setMsgTargetType(Integer msgTargetType) {
        this.msgTargetType = msgTargetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.msg_target_uid
     *
     * @return the value of t_sys_msg_manager.msg_target_uid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public String getMsgTargetUid() {
        return msgTargetUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.msg_target_uid
     *
     * @param msgTargetUid the value for t_sys_msg_manager.msg_target_uid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setMsgTargetUid(String msgTargetUid) {
        this.msgTargetUid = msgTargetUid == null ? null : msgTargetUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.modify_uid
     *
     * @return the value of t_sys_msg_manager.modify_uid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public String getModifyUid() {
        return modifyUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.modify_uid
     *
     * @param modifyUid the value for t_sys_msg_manager.modify_uid
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setModifyUid(String modifyUid) {
        this.modifyUid = modifyUid == null ? null : modifyUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.create_time
     *
     * @return the value of t_sys_msg_manager.create_time
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.create_time
     *
     * @param createTime the value for t_sys_msg_manager.create_time
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_msg_manager.last_modify_date
     *
     * @return the value of t_sys_msg_manager.last_modify_date
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_msg_manager.last_modify_date
     *
     * @param lastModifyDate the value for t_sys_msg_manager.last_modify_date
     *
     * @mbggenerated Sat Apr 16 18:48:23 CST 2016
     */
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}