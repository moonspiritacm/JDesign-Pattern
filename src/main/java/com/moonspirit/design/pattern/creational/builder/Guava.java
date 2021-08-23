package com.moonspirit.design.pattern.creational.builder;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Guava {
    public static void main(String[] args) {
        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();
        System.out.println(set);
    }
}
