package com.ziroom.minsu.entity.cms;

import java.util.Date;

import com.asura.framework.base.entity.BaseEntity;

/**
 * 
 * <p>城市专栏实体类</p>
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
public class ColumnCityEntity extends BaseEntity{
    /**
	 * 序列化id
	 */
	private static final long serialVersionUID = -7436575434320620988L;

	/**
     * 自增id
     * This field corresponds to the database column t_column_city.id
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private Integer id;

    /**
     * 逻辑fid
     * This field corresponds to the database column t_column_city.fid
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private String fid;

    /**
     * 专栏模板fid
     * This field corresponds to the database column t_column_city.temp_fid
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private String tempFid;

    /**
     * 对应城市code
     * This field corresponds to the database column t_column_city.city_code
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private String cityCode;

    /**
     * 专栏标题
     * This field corresponds to the database column t_column_city.col_title
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private String colTitle;

    /**
     * 专栏副标题
     * This field corresponds to the database column t_column_city.col_deputy_title
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private String colDeputyTitle;

    /**
     * 专栏分享标题
     * This field corresponds to the database column t_column_city.col_share_title
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private String colShareTitle;

    /**
     * 专栏背景颜色
     * This field corresponds to the database column t_column_city.col_back_color
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private String colBackColor;

    /**
     * 专栏状态 0:新建，1：上线，2：下线
     * This field corresponds to the database column t_column_city.col_status
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private Integer colStatus;

    /**
     * 创建人fid
     * This field corresponds to the database column t_column_city.create_fid
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private String createFid;

    /**
     * 创建时间
     * This field corresponds to the database column t_column_city.create_date
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private Date createDate;

    /**
     * 最后更新时间
     * This field corresponds to the database column t_column_city.last_modify_date
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private Date lastModifyDate;

    /**
     * 是否删除状态 0：否，1：是
     * This field corresponds to the database column t_column_city.is_del
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    private Integer isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.id
     *
     * @return the value of t_column_city.id
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.id
     *
     * @param id the value for t_column_city.id
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.fid
     *
     * @return the value of t_column_city.fid
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public String getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.fid
     *
     * @param fid the value for t_column_city.fid
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.temp_fid
     *
     * @return the value of t_column_city.temp_fid
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public String getTempFid() {
        return tempFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.temp_fid
     *
     * @param tempFid the value for t_column_city.temp_fid
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setTempFid(String tempFid) {
        this.tempFid = tempFid == null ? null : tempFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.city_code
     *
     * @return the value of t_column_city.city_code
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.city_code
     *
     * @param cityCode the value for t_column_city.city_code
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.col_title
     *
     * @return the value of t_column_city.col_title
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public String getColTitle() {
        return colTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.col_title
     *
     * @param colTitle the value for t_column_city.col_title
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setColTitle(String colTitle) {
        this.colTitle = colTitle == null ? null : colTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.col_deputy_title
     *
     * @return the value of t_column_city.col_deputy_title
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public String getColDeputyTitle() {
        return colDeputyTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.col_deputy_title
     *
     * @param colDeputyTitle the value for t_column_city.col_deputy_title
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setColDeputyTitle(String colDeputyTitle) {
        this.colDeputyTitle = colDeputyTitle == null ? null : colDeputyTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.col_share_title
     *
     * @return the value of t_column_city.col_share_title
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public String getColShareTitle() {
        return colShareTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.col_share_title
     *
     * @param colShareTitle the value for t_column_city.col_share_title
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setColShareTitle(String colShareTitle) {
        this.colShareTitle = colShareTitle == null ? null : colShareTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.col_back_color
     *
     * @return the value of t_column_city.col_back_color
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public String getColBackColor() {
        return colBackColor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.col_back_color
     *
     * @param colBackColor the value for t_column_city.col_back_color
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setColBackColor(String colBackColor) {
        this.colBackColor = colBackColor == null ? null : colBackColor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.col_status
     *
     * @return the value of t_column_city.col_status
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public Integer getColStatus() {
        return colStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.col_status
     *
     * @param colStatus the value for t_column_city.col_status
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setColStatus(Integer colStatus) {
        this.colStatus = colStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.create_fid
     *
     * @return the value of t_column_city.create_fid
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public String getCreateFid() {
        return createFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.create_fid
     *
     * @param createFid the value for t_column_city.create_fid
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setCreateFid(String createFid) {
        this.createFid = createFid == null ? null : createFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.create_date
     *
     * @return the value of t_column_city.create_date
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.create_date
     *
     * @param createDate the value for t_column_city.create_date
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.last_modify_date
     *
     * @return the value of t_column_city.last_modify_date
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.last_modify_date
     *
     * @param lastModifyDate the value for t_column_city.last_modify_date
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_city.is_del
     *
     * @return the value of t_column_city.is_del
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_city.is_del
     *
     * @param isDel the value for t_column_city.is_del
     *
     * @mbggenerated Wed Nov 09 11:12:52 CST 2016
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}