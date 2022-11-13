package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

public class IdolDancer extends Dancer {

    public IdolDancer(String crewName, Grade grade, String myName) {
        super(crewName, grade, myName);
        //super은 상위 클래스의 생성자를 호출 뜻함
        //빈칸은 기본생성자 호출
        //기본생성자가 없을때 Dancer의 초기화생성자 호출 해야함
        //super호출은 생성자 호출에 꼭 첫번째 줄에!!!!!
    }

    @Override //오버라이딩(재정의) 부모와 똑같이 입력하고 기능추가
    public void dance(){
//        super.dance();
        System.out.println("윙크");
    }



}
