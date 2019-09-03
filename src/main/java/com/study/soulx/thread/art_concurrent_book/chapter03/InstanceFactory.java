package com.study.soulx.thread.art_concurrent_book.chapter03;

public class InstanceFactory {
    private static class InstanceHolder {
        public static Instance instance = new Instance();
    }

    public static Instance getInstance() {
        return InstanceHolder.instance; //���ｫ����InstanceHolder�౻��ʼ��
    }

    static class Instance {
    }
}
