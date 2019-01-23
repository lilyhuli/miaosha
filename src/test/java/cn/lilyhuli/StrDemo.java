package cn.lilyhuli;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class StrDemo {

    public static void main(String[] args) {
        String s = "aabbbbccc";

        TreeMap<Integer,Character> map = new TreeMap<Integer, Character>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        StringBuilder sb = new StringBuilder(s);

        while(sb.length() != 0){
            char c = sb.charAt(0);
            int count = 0;
            //indexOf(int ch) 在给定字符串中查找字符(ASCII),找到返回字符数组所对应的下标找不到返回-1
            while (sb.indexOf(c+"") != -1){
                //deleteCharAt（int  a）只有一个参数，使用时删除索引为a的字符；
                sb.deleteCharAt(sb.indexOf(c+""));
                count++;
            }
            map.put(count,c);
        }

        for (Integer count : map.keySet()) {
            System.out.println(map.get(count)+":"+count);
        }

    }
}
