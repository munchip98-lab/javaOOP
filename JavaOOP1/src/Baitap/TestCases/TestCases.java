package Baitap.TestCases;

import Baitap.Common.BaseTest;

public class TestCases extends BaseTest {
    public void login(){
        createDriver("Chrome");
        System.out.println("bước 1");
        System.out.println("bước 2");
        System.out.println("bước 3");
        closedDriver( " Chrome");
    }


    public void addCategory(){
        createDriver("Edge");
        System.out.println("bước 1");
        System.out.println("bước 2");
        System.out.println("bước 3");
        System.out.println("bước 4");
        System.out.println("bước 5");
        closedDriver( " Edge");


    }

    public static void main(String[] args) {
        TestCases testcase = new TestCases();
        testcase.login();
        System.out.println("================");
        testcase.addCategory();

    }

}
