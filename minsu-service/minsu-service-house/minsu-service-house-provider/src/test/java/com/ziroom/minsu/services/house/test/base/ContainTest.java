package com.ziroom.minsu.services.house.test.base;/*
 * <P></P>
 * <P>
 * <PRE>
 * <BR> 修改记录
 * <BR>------------------------------------------
 * <BR> 修改日期       修改人        修改内容
 * </PRE>
 * 
 * @Author lusp
 * @Date Create in 2017年07月 19日 14:51
 * @Version 1.0
 * @Since 1.0
 */

import com.alibaba.dubbo.container.spring.SpringContainer;
import org.junit.Test;

public class ContainTest extends SpringContainer {


    @Test
    public void dubboStart(){
        start();

        synchronized (ContainTest.class) {
            while (true) {
                try {
                    ContainTest.class.wait();
                } catch (Throwable e) {

                }
            }

        }
    }
}
