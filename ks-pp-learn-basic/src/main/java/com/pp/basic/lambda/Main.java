package com.pp.basic.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author gupp
 * @date 2022/3/19 4:27 下午
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        System.out.println(list.stream().filter(num -> num < 5).collect(Collectors.toList()));
    }
}
