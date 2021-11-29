package cn.feiyun.springbootTest.Controller;

import java.util.HashMap;

public class test {
    static final int MAXIMUM_CAPACITY = 1 << 30;



    public static void main(String[] args) {
        HashMap hashMap =new HashMap<String,String>(20,Integer.MAX_VALUE);
        hashMap.put("1","1");
        System.out.println(1 << 30);
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
