package com.zdw.Controller;

import com.zdw.Bean.Book;
import com.zdw.Bean.PageBean;
import com.zdw.Mapper.BookMapper;
import com.zdw.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    //    查询所有
    @GetMapping("/all")
    public List<Book> selectAll() {
        return bookService.selectAll();
    }
//    新增书籍

    @PostMapping("/add")
    public int addBook(@RequestBody Book book) {
        int i = bookService.addBook(book);
        //判断条件
        return i;
    }

    //    批量删除
    @PostMapping("/delete")
    public int deleteBook(@RequestBody int[] ids) {
        int i = bookService.deleteBook(ids);
        return i;
    }

    /*
     * 单个删除
     * */
    @GetMapping("/onDelete")
    public int onDelete(int id) {
        int i=bookService.onDelete(id);
        return i;
    }

    //    分页设置
    @GetMapping("/limit")
    public PageBean<Book> limitBook(int page, int pagesize) {
        PageBean<Book> pageBean = bookService.selectByPage(page, pagesize);
        return pageBean;
    }

    //    分页设置高级版
    @PostMapping("/limitBy")
    public PageBean<Book> limitBookBy(int page, int pagesize, @RequestBody Book book) {
        Book book1 = new Book();
        /*
         * 关键细节，模糊查询必备
         * */
        book1.setBookname("%" + book.getBookname() + "%");
        book1.setAuthor("%" + book.getAuthor() + "%");
        PageBean<Book> pageBean = bookService.selectByPageBy(page, pagesize, book1);
        return pageBean;
    }
    /*
     * 修改书籍信息
     * */
    @PostMapping("/update")
    public int onUpdate(@RequestBody Book book)
    {
        int i=bookService.onUpdate(book);
        return i;
    }
    /*
    * 回显书籍数据
    * */
    @GetMapping("backById")
    public Book backById(int id)
    {
        Book book = bookService.backById(id);
        return book;
    }
}
