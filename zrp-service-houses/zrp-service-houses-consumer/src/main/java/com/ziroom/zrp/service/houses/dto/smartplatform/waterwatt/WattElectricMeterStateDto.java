package com.ziroom.zrp.service.houses.dto.smartplatform.waterwatt;

import com.ziroom.zrp.service.houses.valenum.SmartPlatformWaterWattDeivceTypeEnum;
import com.ziroom.zrp.service.houses.valenum.SmartPlatformWaterWattOperationMarkedEnum;
import lombok.Data;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * <p>B端获取电表详情接口</p>
 * wiki-http://wiki.ziroom.com/pages/viewpage.action?pageId=341835936
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author zhangyl2
 * @Date Created in 2018年01月15日
 * @version 1.0
 * @since 1.0
 */

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class WattElectricMeterStateDto extends WaterWattCommonDto {

    /**
     * B端获取电表详情接口
     */
    public WattElectricMeterStateDto(){
        this.setDeviceType(SmartPlatformWaterWattDeivceTypeEnum.WATT_METER.getCode());
        this.setOperationMarked(SmartPlatformWaterWattOperationMarkedEnum.ELECTRICMETERSTATE.getCode());
    }

}
