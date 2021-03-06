/**
 * @FileName: HouseStatusEnum.java
 * @Package com.ziroom.minsu.valenum.house
 * 
 * @author bushujie
 * @created 2016年4月2日 下午8:56:30
 * 
 * Copyright 2011-2015 asura
 */
package com.ziroom.minsu.valenum.house;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * <p>跟进类型</p>
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
public enum FollowTypeEnum {
	FYWSHTG(1,"房源未审核通过");

	/** code */
	private int code;
	
	/** 名称 */
	private String name;

	

	private static final Map<Integer,String> enumMap = new LinkedHashMap<Integer,String>();
	
	static {
		for (FollowTypeEnum houseStatusEnum : FollowTypeEnum.values()) {  
			enumMap.put(houseStatusEnum.getCode(), houseStatusEnum.getName());  
        }  
	}
	
	FollowTypeEnum(int code,String name){
		 this.code = code;
	     this.name = name;
	}

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    
	public static Map<Integer,String> getEnumMap() {
    	return enumMap;
    }
}
