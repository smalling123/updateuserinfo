package com.example.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/12/25
 * @Time:15:15
 */

public class MyTest {

    public static void main(String[] args) {

        List<String> listStr = new ArrayList<>();

        listStr.add(0,"aaa");
        listStr.add(1,"bbb");
        listStr.add(2,"ccc");
        listStr.add(3,"ddd");
        listStr.set(3,"mmm");
        System.out.println(listStr.get(1));

        for (String s : listStr) {
            System.out.println("s = " + s);
        }

    }}
