package com.jxc;

import com.google.protobuf.Internal;
import com.jxc.pojo.Manager;
import com.jxc.service.ManagerService;
import com.jxc.service.ManagerServiceImpl;
import lombok.Setter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.*;

public class test {


    @Test
    public void test111() {
        Object o = new Object();

        System.out.println(o.getClass());
        System.out.println(o.getClass().arrayType());
        System.out.println(o.getClass().getClasses());
        System.out.println(o.getClass().getClasses().length);
        System.out.println(o.getClass().getClass());
        System.out.println(o.hashCode());
        System.out.println(o.toString());

        Class oo = null;
        Object o1 = null;
        String o2 = null;
//        AbstractStringBuilder
//        StringBuffer
//        StringBuilder
//
//        Boolean
//        Byte
//        Double
//        Float
//        Integer
//        Long
//        Short
//        Thread
//        ThreadLocal
//
//        Enum
//        Throwable
//        Error
//        Exception
//
//        Class
//        ClassLoader
//        Compiler
//        System
//        Package
//        Void


        String a = new String();
        Integer a1 = 0;
        Double a2 = 0d;
        List a3 = new ArrayList();


    }


    private ManagerService managerService = new ManagerServiceImpl();


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-dao.xml");
        System.out.println(ctx.getBean("adminMapper"));

    }

    @Test
    public void testInsert() {

        Manager manager = new Manager();
        manager.setMname("manaager");
        manager.setJob("job");
        manager.setMpassword("123");

        managerService.insertSelective(manager);

    }


    @Test
    public void test() {
        Object o = new Object();

//

    }


}
