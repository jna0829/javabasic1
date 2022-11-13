package org.example.encap;

import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;
import org.example.poly.PerformanceTeam;
import org.junit.jupiter.api.Test;

class DancerTest {

    @Test
    void danceTest(){
//        Dancer dancer = new Dancer("서울짱크루", Grade.HIGH, "춤신춤왕");
//        //스트레칭을 하고 춤을 추는 로직을 만들어야 돼서 캡슐화가 필요
//        //춤추는 기능 안에 스트레칭을 숨김
//        dancer.dance();
//        dancer.setHeight(178);
//        System.out.println("dancer = " + dancer);

    }

    @Test
    void idolTest(){
        IdolDancer jungguk
                = new IdolDancer("BTS",Grade.HIGH,"정국");
        jungguk.dance();

        StreetDancer park =
                new StreetDancer("을지로크루",Grade.MIDDLE,"박춤꾼");
        park.dance();

        System.out.println("jungguk : " + jungguk);

    }

    @Test //다형성
    void teamTest(){
        PerformanceTeam team = new PerformanceTeam();

        Dancer kim =
                new IdolDancer("동방신기",Grade.HIGH,"영웅재중");

        Dancer mokma =
                new StreetDancer("말발굽",Grade.HIGH,"김목마");

        team.addDancer(kim);
        team.addDancer(mokma);



    }
}