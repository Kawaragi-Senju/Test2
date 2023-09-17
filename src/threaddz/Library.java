package threaddz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Library {
    static List<String> books = new ArrayList<>();
    public Library getBook(List<Library> book){
        Random random = new Random();
        return book.get(random.nextInt(5));
    }

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