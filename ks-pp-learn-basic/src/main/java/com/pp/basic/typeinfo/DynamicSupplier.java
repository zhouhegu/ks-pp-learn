package com.pp.basic.typeinfo;

import java.lang.reflect.Field;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author gupp
 * @date 2022/7/30 17:33
 */
class CountedInteger {

    private static long counter;

    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class DynamicSupplier<T> implements Supplier<T> {

    private final Class<T> type;

    public DynamicSupplier(Class<T> type) {
        this.type = type;
    }

    @Override
    public T get() {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // Stream.generate(Supplier<? extends T> s)可生成无限的顺序无序流，每个元素都由Supplier生产
        Stream.generate(
                new DynamicSupplier<>(CountedInteger.class))
                .skip(10)
                .limit(5)
                .forEach(System.out::println);

    }
}
