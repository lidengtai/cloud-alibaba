package com.taylor.springcloudalibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.taylor.springcloud.entities.ResponseCommon;

/**
 *
 */
public class CustomerBlockHandler {

    public static ResponseCommon handlerException(BlockException exception) {
        return new ResponseCommon(444, "客户自定义，global handlerException---1");
    }

    public static ResponseCommon handlerException2(BlockException exception) {
        return new ResponseCommon(444, "客户自定义，global handlerException---2");
    }
}
