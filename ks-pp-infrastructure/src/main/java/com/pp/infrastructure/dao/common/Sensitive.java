package com.pp.infrastructure.dao.common;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author gupp
 * @date 2022/3/13 6:41 下午
 */
public class Sensitive {

    private final Map<Integer, Boolean> sensitiveMap = new ConcurrentHashMap<>();

    private final Function<Integer, String> function;

    public Sensitive(Function<Integer, String> function) {
        this.function = function;
    }

    public Sensitive() {
        this.function = k -> "";
    }

    private boolean isSensitive(int index) {
        return sensitiveMap.computeIfAbsent(index, k -> isSensitive(function.apply(k)));
    }

    private boolean isSensitive(String paramName) {
        return Stream.of("phone", "email")
                .anyMatch(e -> paramName.toLowerCase().contains(e));
    }

    public <T> T checkEncrypt(String paramName, T value) {
        if (value instanceof String && isSensitive(paramName)) {
            return (T) encrypt((String) value);
        }
        return value;
    }

    public <T> T checkEncrypt(int index, T value) {
        if (value instanceof String && isSensitive(index)) {
            return (T) encrypt((String) value);
        }
        return value;
    }

    public <T> T checkDecrypt(String paramName, T value) {
        if (value instanceof String && isSensitive(paramName)) {
            return (T) decrypt((String) value);
        }
        return value;
    }

    public <T> T checkDecrypt(int index, T value) {
        if (value instanceof String && isSensitive(index)) {
            return (T) decrypt((String) value);
        }
        return value;
    }

    private String encrypt(String data) {
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        return new String(Base64.getEncoder().encode(bytes));
    }

    private String decrypt(String data) {
        try {
            byte[] bytes = Base64.getDecoder().decode(data);
            return new String(bytes);
        } catch (Exception e) {
            return data;
        }
    }
}
