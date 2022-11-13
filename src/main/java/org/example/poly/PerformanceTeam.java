package org.example.poly;

import org.example.encap.Dancer;

import java.util.*;

//공연팀
public class PerformanceTeam {

    private List<Dancer> Dancers = new ArrayList<>();

    //팀원 추가하기
    public void addDancer(Dancer dancer) {
        Dancers.add(dancer);
        System.out.println(dancer + "가 추가됨!");
    }

}
