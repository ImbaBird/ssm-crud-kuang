package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Books;
import service.BookService;

import java.util.List;

@Controller
@RequestMapping("/book" )
public class BookController {
//    controller 调 service 层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
//查询所有书籍 并返回一个页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

}
