package com.hxhnzmb.example.impl;

import com.hxhnzmb.example.AbstractGatewayComponent;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/18 15:01
 */
public class BasicComponentGateway extends AbstractGatewayComponent {

    @Override
    public void service() {
        System.out.println("第一步>>>>网关开始获取基本参数信息....");
    }
}
