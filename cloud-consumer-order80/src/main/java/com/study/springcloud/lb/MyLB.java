package com.study.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author TODO
 * @date 2021/8/20 15:38
 **/
@Component
public class MyLB implements LoadBalancer{
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    public final int getAndIncrement(){
        int current,next;
        do{
            current = atomicInteger.get();
            next = current>=2147483647?0:current+1;
        }while(!this.atomicInteger.compareAndSet(current,next));
        System.out.println("********第几次访问next次数:"+next);
        return next;
    }
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
