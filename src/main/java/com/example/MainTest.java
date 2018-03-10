package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTest {

    /**
     * 进行rebase测试
     * @param args
     */
    public static void main(String args[]) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring/spring-mvc.xml");
        TestInterface test1 = (TestInterface)ctx.getBean("proxyFactory");
        test1.getReflectField();

    }
}
