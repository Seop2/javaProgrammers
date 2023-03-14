package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력받는 데이터가 String 으로 고정
 * Scanner 보다 속도가 빠르다.
 */
public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {//입출력 예외처리
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();//String
        int i = Integer.parseInt(bf.readLine());//int
    }
}
