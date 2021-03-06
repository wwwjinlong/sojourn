package com.ziroom.minsu.services.order.dto;

/**
 * <p>
 * 结算的订单参数
 * </p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author afi
 * @since 1.0
 * @version 1.0
 */
public class CheckOutOrderRequest extends OrderOpBaseRequest {

	/** 序列化id */
	private static final long serialVersionUID = -2156456452562673L;

	/** 订单操作备注 */
	String remark;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
