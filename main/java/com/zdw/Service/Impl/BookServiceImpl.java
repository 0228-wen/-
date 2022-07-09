package com.zdw.Service.Impl;

import com.zdw.Bean.Book;
import com.zdw.Bean.PageBean;
import com.zdw.Mapper.BookMapper;
import com.zdw.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
//    查询所有
    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }
//新增书籍
    @Override
    public int addBook(Book book) {
        bookMapper.addBook(book);
        return 1;
    }
//批量删除书籍
    @Override
    public int deleteBook(int[] ids) {
    bookMapper.deleteBook(ids);
    return 1;
    }

    @Override
    public PageBean<Book> selectByPage(int page, int pagesize) {
//        计算分页索引
        int begin=(page-1)*pagesize;
        int size=pagesize;
        List<Book> rows = bookMapper.selectBypage(begin, size);
        int total=bookMapper.selectTotal();
        PageBean<Book> pageBean=new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(total);
        return pageBean;
    }
/*
* 下面的为上面代码升级版，上面可以弃用
*
*
* */
    @Override
    public PageBean<Book> selectByPageBy(int page, int pagesize, Book book) {
        int begin=(page-1)*pagesize;
        int size=pagesize;
        List<Book> rows = bookMapper.selectBypageBy(begin,size,book);
        int total=bookMapper.selectTotalBy(book);
        PageBean<Book> pageBean=new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(total);
        return pageBean;
    }
//单个删除
    @Override
    public int onDelete(int id) {
        bookMapper.onDelete(id);
        return 1;
    }
    /*
     * 修改书籍信息
     * */
    @Override
    public int onUpdate(Book book) {
        bookMapper.onUpdate(book);
        return 1;
    }
/*
* 回显数据根据id
* */
    @Override
    public Book backById(int id) {
        Book book = bookMapper.backByID(id);
        return book;
    }
}
