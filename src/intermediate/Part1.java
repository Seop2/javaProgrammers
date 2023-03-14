package intermediate;

import java.util.Objects;

/**
 * Object 클래스는 모든 클래스의 최상위 클래스
 * ----@Override-----
 * equals() : 객체가 가진 값을 비교할 때 사용
 * toString() : 객체가 가진 값을 문자열로 반환
 * hashCode() : 객체의 해시코드 반환 - 자료구조에서 사용
 */
public class Part1 {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "김민수";
        st1.number = "1234";
        st1.birthYear = 1996;
        Student st2 = new Student();
        st2.name = "박민수";
        st2.number = "5678";
        st2.birthYear = 1997;

        if(st1.equals(st2))
            System.out.println("st1 == st2");
        else
            System.out.println("st1 != st2");

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());

        System.out.println("st1 = " + st1);
        System.out.println("st2 = " + st2);
    }
}
class Student {
    String name;
    String number;
    int birthYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return birthYear == student.birthYear && Objects.equals(name, student.name) && Objects.equals(number, student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, birthYear);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}