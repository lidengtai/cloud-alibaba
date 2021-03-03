package com.taylor.spirngcloud.loadbalance;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/4 0:20
 */
public interface MyLoadBalanced {


    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
