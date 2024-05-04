package java_basic.construct;

public class Member {
    String name;
    int age;

    // this는 인스턴스를 가리킨다. 즉 자기 자신을 참조하는 값이다.
    void initMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 파라미터 명과 멤버변수의 이름이 다르다면 this를 생략할 수 있다.
    // 변수를 찾을때 가장 가까운 지역변수를 찾기 때문에 가장 가까운 멤버변수를 찾는다.
    void initMemberDiffName(String nameParam, int ageParam) {
        // 아래는 this 생략
        name = nameParam;
        age = ageParam;
    }
}
