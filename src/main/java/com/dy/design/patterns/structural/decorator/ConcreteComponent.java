package com.dy.design.patterns.structural.decorator;

/**
 * @description ConcreteComponent是定义一个具体的对象，也可以给这个对象添加一些职责
 * @author dxy
 * @date 20200309
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }

}
