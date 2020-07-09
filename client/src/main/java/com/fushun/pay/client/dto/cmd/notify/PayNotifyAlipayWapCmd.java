package com.fushun.pay.client.dto.cmd.notify;

import com.fushun.pay.client.dto.PayNotifyCmd;
import com.fushun.pay.dto.clientobject.PayNotifyDTO;
import com.fushun.pay.dto.clientobject.notify.PayNotifyAlipayWapDTO;
import lombok.Data;

/**
 * @author wangfushun
 * @version 1.0
 * @description
 * @creation 2019年01月22日00时17分
 */
@Data
public class PayNotifyAlipayWapCmd extends PayNotifyCmd {

    private PayNotifyAlipayWapDTO payNotifyAlipayWapCO;

    @Override
    public PayNotifyDTO getPayNotifyDTO() {
        return payNotifyAlipayWapCO;
    }
}