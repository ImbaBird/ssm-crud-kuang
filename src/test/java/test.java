import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Books;
import service.BookService;

public class test {
    @Test
    public void test(){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for(Books books : bookServiceImpl.queryAllBook()){
            System.out.print(books);
        }

    }
}