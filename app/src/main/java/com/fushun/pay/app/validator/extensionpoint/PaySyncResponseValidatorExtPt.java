package com.fushun.pay.app.validator.extensionpoint;

import com.alibaba.cola.extension.ExtensionPointI;
import com.fushun.pay.app.dto.PaySyncResponseCmd;

/**
 * @author wangfushun
 * @version 1.0
 * @description
 * @creation 2019年01月29日23时47分
 */
public interface PaySyncResponseValidatorExtPt<T extends PaySyncResponseCmd> extends ExtensionPointI {

    public void validate(T candidate);
}
