package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
         * Map 인터페이스의 특징
         * Collection 인터페이스와 다른 저장장식을 가진다.
         * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
         * */

        /*
         * 키(key)란?
         * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
         * 1. 요소의 저장순서를 유지하지 않는다.
         * 2. 키는 중복 허용하지 않지만 키가 다르면 중복되는 값을 저장 가능하다.
         * */

        /*
         * HashMap 검색 속도가 매우 빠르다.
         * */
        HashMap hMap = new HashMap();
        hMap.put("one", new Date());
        hMap.put(12, "red apple");
        hMap.put(33, 123);
        System.out.println("hMap = " + hMap);
        
        hMap.put(12, "banana");
        System.out.println("hMap = " + hMap);
        
        hMap.put(11, "banana");
        hMap.put(9, "banana");
        System.out.println("hMap = " + hMap);
        System.out.println("hMap.get(9) = " + hMap.get(9));

        hMap.remove(9);
        System.out.println("hMap = " + hMap);
        System.out.println("hMap.size() = " + hMap.size());

        HashMap<String, String> hMap2 = new HashMap<>();
        hMap2.put("one", "java");
        hMap2.put("two", "oracle");
        hMap2.put("three", "jdbc");
        hMap2.put("four", "html");
        hMap2.put("five", "css");

        Iterator<String> keyIter = hMap2.keySet().iterator();
        while(keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hMap2.get(key);
            System.out.println(key + " = " + value);
        }

        Collection<String> values = hMap2.values();
        Iterator<String> value = values.iterator();
        while (value.hasNext()) {
            System.out.println("value.next() = " + value.next());
        }

        Object[] valueArr = values.toArray();
        for(int i = 0; i < valueArr.length; i++) {
            System.out.println("valueArr[" + i + "] = " + valueArr[i]);
        }

        Set<Map.Entry<String, String>> set = hMap2.entrySet();
        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while(entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
