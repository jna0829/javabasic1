package org.example.encap;

// import 단축키 : 알트+엔터

//인터페이스 Dance를 import함
import org.example.inter.Danceable;

public abstract class Dancer implements Danceable { //extends Object 생략

    String crewName; //팀의 이름
    Grade grade; //실력
    String myName; //내 이름

    private double height; //키

    //기본 생성자 생성 (단축키 : 알트 + 인서트)
//    public Dancer() {}

    //초기화 -> 알트+인서트 -> 모두선택(컨트롤 + A)
    public Dancer(String crewName, Grade grade, String myName) {
        this.crewName = crewName;
        this.grade = grade;
        this.myName = myName;
    }

    //스트레칭 (댄서의 기능)
    private void stretch(){
        System.out.println(myName + "이 몸을 풉니다.");
    }

    //유연성 연습
    private void moreFlexible(){
        System.out.println(myName + "이 다리를 찢습니다.");
    }

    // 춤추기
//    public abstract void dance(); //추상화
//    {
//        stretch();
//        moreFlexible();
//        System.out.println(myName + "이 춤을 춥니다.");
//    }

    public void setHeight(double height) {
        if(height <= 130 || height >= 250){
            this.height = 160;
            return;
        }
        this.height = height;
    }

    //재정의 : 댄스의 해시값은 필요없고 기능을 보고 싶기 때문에 toString을 재정의 한다.
    @Override
    public String toString() {
        return "Dancer{" +
                "crewName='" + crewName + '\'' +
                ", grade=" + grade +
                ", myName='" + myName + '\'' +
                ", height=" + height +
                '}';
    }


}
