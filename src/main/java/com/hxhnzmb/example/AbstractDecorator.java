package com.hxhnzmb.example;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/18 15:09
 */
public abstract class AbstractDecorator extends AbstractGatewayComponent{

    private AbstractGatewayComponent abstractGatewayComponent;

    public AbstractDecorator(AbstractGatewayComponent abstractGatewayComponent){
        this.abstractGatewayComponent = abstractGatewayComponent;
    }

    @Override
    public void service() {
        if (abstractGatewayComponent != null){
            abstractGatewayComponent.service();
        }
    }
}
