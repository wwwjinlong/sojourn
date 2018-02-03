package com.ziroom.minsu.entity.house;

import java.util.Date;

import com.asura.framework.base.entity.BaseEntity;

/**
 * 
 * <p>房源跟进主表实体类</p>
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
public class HouseFollowEntity extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 506577149676398826L;

	/**
     * 自增id
     * This field corresponds to the database column t_house_follow.id
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private Integer id;

    /**
     * 逻辑fid
     * This field corresponds to the database column t_house_follow.fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private String fid;

    /**
     * 房源fid
     * This field corresponds to the database column t_house_follow.house_base_fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private String houseBaseFid;

    /**
     * 房间fid
     * This field corresponds to the database column t_house_follow.room_fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private String roomFid;

    /**
     * 出租方式 0：整租，1：合租
     * This field corresponds to the database column t_house_follow.rent_way
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private Integer rentWay;

    /**
     * 审核状态时间
     * This field corresponds to the database column t_house_follow.audit_status_time
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private Date auditStatusTime;

    /**
     * 审核不通过原因 10：照片原因需预约摄影师 11：房东信息原因 13：房源品质原因 15：其他原因 16：照片原因不需预约摄影师 17：房源物理信息原因 18：房源描述信息原因
     * This field corresponds to the database column t_house_follow.audit_cause
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private String auditCause;

    /**
     * 跟进类型 1：房源未审核通过
     * This field corresponds to the database column t_house_follow.follow_type
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private Integer followType;

    /**
     * 跟进状态 101：客服待跟进 102：客服跟进中，103：客服未联系上房东，201：专员跟进中，202：专员跟进结束，301：系统终结，302：超时结束
     * This field corresponds to the database column t_house_follow.follow_status
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private Integer followStatus;
    
    /**
     * 跟进结束原因 1：房源已上线，2：房东无意向，3：品质无法合格，4：待升级
     */
    private Integer followEndCause;

	/**
     * 创建人fid
     * This field corresponds to the database column t_house_follow.create_fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private String createFid;

    /**
     * 创建时间
     * This field corresponds to the database column t_house_follow.create_date
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private Date createDate;

    /**
     * 最后更新时间
     * This field corresponds to the database column t_house_follow.last_modify_date
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private Date lastModifyDate;

    /**
     * 是否删除 0：否，1：是
     * This field corresponds to the database column t_house_follow.is_del
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    private Integer isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.id
     *
     * @return the value of t_house_follow.id
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.id
     *
     * @param id the value for t_house_follow.id
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.fid
     *
     * @return the value of t_house_follow.fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public String getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.fid
     *
     * @param fid the value for t_house_follow.fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.house_base_fid
     *
     * @return the value of t_house_follow.house_base_fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public String getHouseBaseFid() {
        return houseBaseFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.house_base_fid
     *
     * @param houseBaseFid the value for t_house_follow.house_base_fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setHouseBaseFid(String houseBaseFid) {
        this.houseBaseFid = houseBaseFid == null ? null : houseBaseFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.room_fid
     *
     * @return the value of t_house_follow.room_fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public String getRoomFid() {
        return roomFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.room_fid
     *
     * @param roomFid the value for t_house_follow.room_fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setRoomFid(String roomFid) {
        this.roomFid = roomFid == null ? null : roomFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.rent_way
     *
     * @return the value of t_house_follow.rent_way
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public Integer getRentWay() {
        return rentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.rent_way
     *
     * @param rentWay the value for t_house_follow.rent_way
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setRentWay(Integer rentWay) {
        this.rentWay = rentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.audit_status_time
     *
     * @return the value of t_house_follow.audit_status_time
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public Date getAuditStatusTime() {
        return auditStatusTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.audit_status_time
     *
     * @param auditStatusTime the value for t_house_follow.audit_status_time
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setAuditStatusTime(Date auditStatusTime) {
        this.auditStatusTime = auditStatusTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.audit_cause
     *
     * @return the value of t_house_follow.audit_cause
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public String getAuditCause() {
        return auditCause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.audit_cause
     *
     * @param auditCause the value for t_house_follow.audit_cause
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setAuditCause(String auditCause) {
        this.auditCause = auditCause == null ? null : auditCause.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.follow_type
     *
     * @return the value of t_house_follow.follow_type
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public Integer getFollowType() {
        return followType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.follow_type
     *
     * @param followType the value for t_house_follow.follow_type
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setFollowType(Integer followType) {
        this.followType = followType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.follow_status
     *
     * @return the value of t_house_follow.follow_status
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public Integer getFollowStatus() {
        return followStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.follow_status
     *
     * @param followStatus the value for t_house_follow.follow_status
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setFollowStatus(Integer followStatus) {
        this.followStatus = followStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.create_fid
     *
     * @return the value of t_house_follow.create_fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public String getCreateFid() {
        return createFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.create_fid
     *
     * @param createFid the value for t_house_follow.create_fid
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setCreateFid(String createFid) {
        this.createFid = createFid == null ? null : createFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.create_date
     *
     * @return the value of t_house_follow.create_date
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.create_date
     *
     * @param createDate the value for t_house_follow.create_date
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.last_modify_date
     *
     * @return the value of t_house_follow.last_modify_date
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.last_modify_date
     *
     * @param lastModifyDate the value for t_house_follow.last_modify_date
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_follow.is_del
     *
     * @return the value of t_house_follow.is_del
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_follow.is_del
     *
     * @param isDel the value for t_house_follow.is_del
     *
     * @mbggenerated Wed Feb 22 14:14:08 CST 2017
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
    
    /**
	 * @return the followEndCause
	 */
	public Integer getFollowEndCause() {
		return followEndCause;
	}

	/**
	 * @param followEndCause the followEndCause to set
	 */
	public void setFollowEndCause(Integer followEndCause) {
		this.followEndCause = followEndCause;
	}
}