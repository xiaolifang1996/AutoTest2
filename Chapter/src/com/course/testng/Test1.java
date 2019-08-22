package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Test1 {
    @Test
    public void testCase1() {
        System.out.println("这是测试用例1");
    }

    @BeforeMethod
    public void testCase2() {
        System.out.println("在测试用例1执行前执行的方法");
    }
    @AfterMethod
    public  void testCase3(){
        System.out.println("在测试用例1执行后执行的方法");
    }
    @Test
    public void testCase4(){
        System.out.println("这是测试用例2");
    }
}
