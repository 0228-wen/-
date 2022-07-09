package com.zdw.Service;

import com.zdw.Bean.Book;
import com.zdw.Bean.PageBean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    //    查询所有
    List<Book> selectAll();

    //    插入新增书籍
    int addBook(Book book);

    //    批量删除书籍
    int deleteBook(int[] ids);

    /*
     * 分页查询
     * */
    PageBean<Book> selectByPage(int page, int pagesize);

    /*
     * 分页查询高级版
     * */
    PageBean<Book> selectByPageBy(int page, int pagesize, Book book);

    /*
     * 单个删除
     * */
    int onDelete(int id);
    /*
    * 修改书籍信息
    * */
    int onUpdate(Book book);
    /*
    * 回显数据根据id
    * */
    Book backById(int id);
}
