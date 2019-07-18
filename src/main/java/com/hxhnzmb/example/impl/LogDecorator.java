package com.hxhnzmb.example.impl;

import com.hxhnzmb.example.AbstractDecorator;
import com.hxhnzmb.example.AbstractGatewayComponent;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/18 15:11
 */
public class LogDecorator extends AbstractDecorator {

    public LogDecorator(AbstractGatewayComponent abstractGatewayComponent) {
        super(abstractGatewayComponent);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("第二步>>>>日志的采集.....");
    }

}
