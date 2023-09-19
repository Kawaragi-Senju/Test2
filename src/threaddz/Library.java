package threaddz;

import java.util.ArrayList;
import java.util.List;

public class Library {
    final static List<String> books = new ArrayList<>();
    static final String[] bookNames = {"LOTR1", "LOTR2", "LOTR3", "LOTR4", "LOTR5"};
//    public Library getBook(List<String> book){
//        synchronized (books){
//            //return book.get();
//        }
//    }

    public void putBoolBack(List<Library> book){
        book.remove(book);
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