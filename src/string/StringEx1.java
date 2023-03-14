package string;

import java.util.Scanner;

/**
 * 문자 찾기
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는 지 알아내는 프로그램 작성
 * 대소문자를 구분하지 않습니다.
 * 문자열의 길이는 100을 넘지 않습니다.
 * 첫줄에 문자열 , 두 번째 줄에 문자
 * 첫줄에 해당 문자의 개수를 출력
 */
public class StringEx1 {
    public static int sol(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//        System.out.println(str+" " + t);
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)==t)
//                answer++;
//        }
        for (char c : str.toCharArray()) {//foreach는 배열을 반복하는 것이기때문에 형변환해야함
            if (c==t) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(StringEx1.sol(str, c));
    }
}
