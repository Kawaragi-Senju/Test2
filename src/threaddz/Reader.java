package threaddz;

import java.util.Random;

public class Reader extends Thread{
Book name;
    private final Library library;

    public String bookNames(){
        Random random = new Random();
        int  z = random.nextInt(4);
        return Library.NAMES[z];
    }

    public Reader(Library library){
        this.library = library;
    }
    @Override
    public void run(){
        Book name = null;
        String str = bookNames();
        name = library.getBook(str);
        while (name == null){
            try {
                System.out.println("Book are not taken " + Thread.currentThread().getName() + " " + str);
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            name = library.getBook(str);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Reader");
        }
        library.putBookBack(name);
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