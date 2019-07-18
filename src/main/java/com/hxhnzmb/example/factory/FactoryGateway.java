package com.hxhnzmb.example.factory;

import com.hxhnzmb.example.AbstractGatewayComponent;
import com.hxhnzmb.example.impl.BasicComponentGateway;
import com.hxhnzmb.example.impl.LimitDecorator;
import com.hxhnzmb.example.impl.LogDecorator;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/18 15:25
 */
public class FactoryGateway {

    private static AbstractGatewayComponent getFactoryGateway(){
        return new LimitDecorator(new LogDecorator(new BasicComponentGateway()));
    }

    public static void main(String[] args) {
        AbstractGatewayComponent factoryGateway = FactoryGateway.getFactoryGateway();
        factoryGateway.service();
    }
}
