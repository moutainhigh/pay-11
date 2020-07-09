package com.fushun.pay.client.dto.cmd.createdpay;

import com.fushun.pay.client.dto.CreatePayCmd;
import com.fushun.pay.dto.clientobject.PayDTO;
import com.fushun.pay.dto.clientobject.createpay.CreatePayWeiXinAppDTO;
import lombok.Data;

/**
 * @author wangfushun
 * @version 1.0
 * @creation 2019年01月18日23时31分
 */
@Data
public class CreatePayWeixinAppCmd extends CreatePayCmd {

    private CreatePayWeiXinAppDTO createPayWeiXinAppDTO;

    @Override
    public PayDTO getPayDTO() {
        return this.createPayWeiXinAppDTO;
    }
}