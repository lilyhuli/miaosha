package cn.lilyhuli;

import java.util.*;

public class TreeMapDemo {
    /**
     * Map是键值对的集合接口，它的实现类主要包括：HashMap,TreeMap,Hashtable以及LinkedHashMap等。
     * TreeMap
     * 基于红黑树（Red-Black tree）的 NavigableMap 实现，该映射根据其键的自然顺序进行排序，或者根据创建映射时提供的 Comparator 进行排序，具体取决于使用的构造方法。
     *
     * HashMap
     * HashMap的值是没有顺序的，它是按照key的HashCode来实现的，对于这个无序的HashMap我们要怎么来实现排序呢？参照TreeMap的value排序。
     *
     * Map.Entry返回Collections视图。
     * 按key排序
     *
     * TreeMap默认是升序的，如果我们需要改变排序方式，则需要使用比较器：Comparator。Comparator可以对集合对象或者数组进行排序的比较器接口，实现该接口的public compare(T o1,To2)方法即可实现排序。
     */


    public static void main(String[] args) {
        /*Map<String,Integer> map = new TreeMap<String, Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                *//**
                 * 如果指定的数与参数相等返回0。
                 *
                 * 如果指定的数小于参数返回 -1。
                 *
                 * 如果指定的数大于参数返回 1。
                 *//*
                return o2.compareTo(o1);
            }
        });*/


        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("acb1", 5);
        map.put("bac1", 3);
        map.put("bca1", 20);
        map.put("cab1", 80);
        map.put("cba1", 1);
        map.put("abc1", 10);
        map.put("abc2", 12);

        // 升序比较器
        /**
         * Map是java中的接口，Map.Entry是Map的一个内部接口。
         *
         * Map提供了一些常用方法，如keySet()、entrySet()等方法，keySet()方法返回值是Map中key值的集合；entrySet()的返回值也是返回一个Set集合，此集合的类型为Map.Entry。
         *
         * Map.Entry是Map声明的一个内部接口，此接口为泛型，定义为Entry<K,V>。它表示Map中的一个实体（一个key-value对）。接口中有getKey(),getValue方法。
         */
        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                // TODO Auto-generated method stub
                return o1.getValue()-o2.getValue();
            }
        };

        // map转换成list进行排序
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

        Collections.sort(list,valueComparator);


        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ":" +entry.getValue());

        }

    }

   


}
