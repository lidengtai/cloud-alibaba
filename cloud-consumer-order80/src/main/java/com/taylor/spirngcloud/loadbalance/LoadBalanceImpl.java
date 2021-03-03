package com.taylor.spirngcloud.loadbalance;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author taylor
 * @Description: 自定义轮询负载均衡
 * @date 2021/3/3 23:27
 */
@Component
public class LoadBalanceImpl implements MyLoadBalanced {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getIncrement(){

        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        //自旋锁
        }while (!atomicInteger.compareAndSet(current,next));
        System.out.println("**********第几次访问********** ："+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
