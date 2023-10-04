package threaddz;

import java.util.concurrent.locks.Lock;

public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        String book1 = "LOTR1";
        String book2 = "LOTR2";
        String book3 = "LOTR3";
        String book4 = "LOTR4";
        String book5 = "LOTR5";
        Thread reader = new Reader(l);
        Thread reader1 = new Reader(l);
        Thread reader2 = new Reader(l);
        Thread reader3 = new Reader(l);
        Thread reader4 = new Reader(l);
        reader4.start();
        reader3.start();
        reader2.start();
        reader1.start();
        reader.start();
    }
}
//    Создать класс Библиотека, хранящий  список книг (книга – это строка с названием).
//    Создать класс Читатель, получающий в конструкторе экземпляр библиотеки.
//    Определить в классе библиотека методы, позволяющие взять и вернуть книгу (при наличии таковой).
//    Читатели, используя многопоточность, берут книги и «читают» их (можно имитировать  чтение, усыпляя поток на
//    несколько секунд).
//    После, читатели возвращают их. Если желаемой книги нет, читатель не должен ее получить.
//    Все события (взята книга читателем N, возвращена книга читателем N,  читатель N  не смог получить книгу M)
//    должные выводиться в консоль.