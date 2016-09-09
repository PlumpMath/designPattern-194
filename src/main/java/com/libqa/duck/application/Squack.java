package com.libqa.duck.application;

import com.libqa.duck.common.QuackBehavior;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description :
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑 삑~");
    }
}