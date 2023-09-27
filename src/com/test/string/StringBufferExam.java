//09-21

package com.test.string;

public class StringBufferExam {
    public static void main(String[] args) {
    // StringBuffer는 대용량 데이터 처리와 멀티 쓰레드 환경에서 우수한 성능을 발휘한다.
    // StringBuilder는 StringBuffer 보다는 멀티쓰레드 환경에서 안정성은 다소 낮지만 
    // StringBuffer 보다 성능이 우수하다
    
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("Hello");
    stringBuffer.append(" ");
    stringBuffer.append("My World");
    String result1 = stringBuffer.toString();
    System.out.println(result1);

    stringBuffer.insert(0,"Everyone, ");
    String result2 = stringBuffer.toString();
    System.out.println(result2);

    // 문자열 0부터 시작해서 8번재 자리까지의 "문자열을 리턴"
    String result3 = stringBuffer.substring(0, 8);
    System.out.println(result3);
    }
}
