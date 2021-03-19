package ssong;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*
        // 배열을 값 목록으로 생성
        String[][] books = {
            {"책번호", "책제목", "저자", "출판사", "가격", "선호도"},
            {"책번호", "책제목", "저자", "출판사", "가격", "선호도"},
            {"책번호", "책제목", "저자", "출판사", "가격", "선호도"},
            {"책번호", "책제목", "저자", "출판사", "가격", "선호도"}
        };

        String[] bookInfo = {"책번호", "책제목", "저자", "출판사", "가격", "선호도"};

        책번호 : A000-소설, B100-인문, C200-과학, D300-컴퓨터
        */

        Scanner sc = new Scanner(System.in);

        // 배열을 값 목록으로 생성
        String[][] books = {
                {"A000", "꼭두각시 살인사건", "다니엘 콜", "북플라자", "14000"},
                {"B100", "질서 너머", "조던 피터슨", "웅진지식하우스", "16000"},
                {"C200", "코스모스", "칼 세이건", "사이언스북스", "17000"},
                {"D300", "정보처리기사 실기", "정보처리기술사 연구회", "건기원", "30000"}
        };

        /*
        System.out.println("등록된 책 수: " + books.length);
        System.out.println("책번호: " + books[0][0]); // 원하는 책의 책번호: books[찾을 책이 있는 인덱스번호][0]
        */

        while (true) {
            // 찾을 책번호 입력받기
            System.out.println("찾으려는 책의 책번호를 입력하세요.");
            System.out.print("> ");
            String bookName = sc.next();

            while (true) {
                // books 배열안에서 책번호가 있는 배열 찾기
                for (int idx = 0; idx < books.length; idx++) {
                    String temp2;
                    temp2 = books[idx][0];

                    // 입력한 책번호가 배열안에 있는 책번호와 같으면 해당 배열 출력
                    if (temp2.equals(bookName)) {
                        System.out.println(Arrays.toString(books[idx]));
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("해당 책을 찾을 수 없습니다.");
                break;
            }

        }


    }
}


