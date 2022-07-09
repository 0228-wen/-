package com.zdw.Mapper;

import com.zdw.Bean.Book;
import com.zdw.Bean.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
@Repository
public interface BookMapper {
    /*
    *查询所有
    */
    List<Book> selectAll();
/*
*
* 添加书籍*/
    void addBook(Book book);
//    批量删除书籍
    void deleteBook(@Param("ids") int[] ids);

/*
* 分页查询
* 页码
* 条数
*
* */
    int selectTotal();
    List<Book> selectBypage(@Param("begin") int begin,@Param("size") int size);


//    分页查询高级版！条件
    int selectTotalBy(Book book);
    List<Book> selectBypageBy(@Param("begin") int begin,@Param("size") int size,@Param("book") Book book);

    /*
    * 单个删除
    * */
    void onDelete(int id);

    /*
    * 修改书籍信息
    * */
    void onUpdate(Book book);

    /*
    * 回显数据根据id
    *
    * */
    Book backByID(int id);

}
