package com.mable.proxy;

import org.ietf.jgss.Oid;

/**
 * 对生产厂要求的接口
 */
public interface IProducer {
    public void saleProduct(float money);
    public void afterService(float money);
}
