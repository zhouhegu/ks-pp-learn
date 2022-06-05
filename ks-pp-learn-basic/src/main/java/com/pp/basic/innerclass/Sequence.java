package com.pp.basic.innerclass;

/**
 * @author gupp
 * @date 2022/6/4 12:42
 */
public class Sequence {

    private Object[] items;

    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    /**
     * 内部类
     */
    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    /**
     * 静态内部类
     */
    private static class StaticSequenceSelector implements Selector {
        @Override
        public boolean end() {
            return false;
        }

        @Override
        public Object current() {
            return null;
        }

        @Override
        public void next() {

        }
    }

    /**
     * 获取一个内部类的对象实例
     */
    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        // 不能通过Sequence.SequenceSelector sequenceSelector = new SequenceSelector();
        Sequence.SequenceSelector sequenceSelector = sequence.new SequenceSelector();
        Sequence.StaticSequenceSelector staticSequenceSelector = new StaticSequenceSelector();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
