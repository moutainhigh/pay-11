package com.fushun.pay.infrastructure.pay.tunnel.database;

import com.alibaba.cola.tunnel.DataTunnelI;
import com.fushun.framework.jpa.CustomerRepository;
import com.fushun.pay.infrastructure.pay.tunnel.database.dataobject.RecordPayDO;
import com.fushun.pay.infrastructure.pay.tunnel.database.dataobject.RecordPayId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author wangfushun
 * @version 1.0
 * @description
 * @creation 2019年01月19日23时24分
 */
@Repository
public interface PayDBTunnel extends DataTunnelI, CustomerRepository<RecordPayDO, RecordPayId> {

    /**
     * @param outTradeNo 支付单号
     * @return 支付信息
     * @description 获取支付信息
     * @date 2019年02月05日01时14分
     * @author wangfushun
     * @version 1.0
     */
    @Query("select s from RecordPayDO s where s.outTradeNo=:outTradeNo")
    RecordPayDO findByOutTradeNO(@Param("outTradeNo") String outTradeNo);
}
