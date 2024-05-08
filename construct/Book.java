package construct;

public class Book {
/*
    BookMain.java 코드를 보고 해당 코드가 실행할 수 있도록 Book.java를 완성하시오.
    특히 Book 클래스의 생성자 코드에 중복이 없도록 주의하시오.

    멤버변수
            title
    author
            page

    출력형태
    제목: , 저자: , 페이지: 0
    제목: Hello Java, 저자: Seo, 페이지: 0
    제목: JPA 프로그래밍, 저자: kim, 페이지: 700
*/

    String title;
    String author;
    int page;

    Book(){
        this("","",0);
    }

    Book(String title, String author){
        this(title, author, 0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: "+ title + " 저자: " + author + " 페이지: " + page);
    }
}

