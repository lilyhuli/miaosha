package cn.lilyhuli;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        String s = "aabbbbccc";

        StringBuilder buf = new StringBuilder(s);

        TreeMap<Integer, Character> map = new TreeMap<Integer, Character>();
        while (buf.length() != 0) {
            int  count = 0;
            char c     = buf.charAt(0);
            while (buf.indexOf(c + "") != -1) {
                buf.deleteCharAt(buf.indexOf(c + ""));
                count++;
            }
            map.put(count,c);
        }
        for (Integer count : map.keySet()) {
            System.out.println(map.get(count)+":"+count);

        }
    }
}
