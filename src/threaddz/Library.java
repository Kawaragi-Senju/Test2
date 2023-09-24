package threaddz;

import java.util.HashMap;
import java.util.Map;


public class Library {
    final static Map<String, Book> BOOK_MAP = new HashMap<>();
    public static final String[] NAMES = {"LOTR1", "LOTR2", "LOTR3", "LOTR4", "LOTR5"};

    private final Map<String, Book> REMOVED_BOOKS = new HashMap<>();
    public Book getBook(String name){
        synchronized (BOOK_MAP){
            Book book = BOOK_MAP.remove(name);
            REMOVED_BOOKS.put(name, book);
            return book;
        }
    }

    public void putBookBack(Book name){
        synchronized (BOOK_MAP) {
            if(REMOVED_BOOKS.containsKey(name.getName())){
                Book book = REMOVED_BOOKS.remove(name.getName());
                BOOK_MAP.put(name.toString(), book);
            }
        }
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