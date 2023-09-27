package com.test.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberInfoView {
   public static void main(String[] args) {

    // Member member = new Member("김철수", "남성", 23);

    List<Member> list = new ArrayList<>(); // 동적 배열을 지원하는 Collector Framework 
    list.add(new Member("김철수", "남성", 23));
    list.add(new Member("김민수", "남성", 35));
    list.add(new Member("김희주", "여성", 32));
    list.add(new Member("박은진", "여성", 28));
    list.add(new Member("최현아", "여성", 43));

    for(Member member : list) {
            System.out.println(member.getname() + "\t" + member.getgender() + "\t" + member.getage() );
    }
    
    for(int i =0; i<list.size(); i++) {
        System.out.println(list.get(i).getname() + "\t" + list.get(i).getgender() + "\t" + list.get(i).getage());
    
    }

    // Map<String, Integer> map = new HashMap<>();
    List<Map<Integer, Integer>> listFruits = new ArrayList<>();

    int aa = 0;
    for(int i =0; i<3; i++) {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(i, aa*10);
        aa++;
        listFruits.add(map);
        System.out.println(listFruits.get(i).toString());
    }

    System.out.println(listFruits.get(2).toString());
    
    // map.put("사과", 10 );
    // listFruits.add(map);

    // map.put("배", 20);
    // listFruits.add(map);

    // map.put("수박", 30);
    // listFruits.add(map);

    // System.out.println(listFruits.get(0));

    // for (int i=0; i<listFruits.size(); i++) {
    //     System.out.println(listFruits.get(i).get(i));
    // } 
    
   }
}
