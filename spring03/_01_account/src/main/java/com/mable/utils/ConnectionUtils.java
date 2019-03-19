package com.mable.utils;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * 连接的工具类，它用于从数据源中获取一个连接，并且实现和线程的绑定
 */
public class ConnectionUtils {

    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
    //提供数据源
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取当前线程上的连接
     * @return
     */
    public Connection getThreadConnection(){
        Connection conn = tl.get();
        try {
            //1.先从ThreadLocal上获取
            //2.判断当前线程上是否有连接
        if(conn == null){
            //3.从数据源中获取一个连接，并且存入ThreadLocal中
            conn = dataSource.getConnection();
            tl.set(conn);
        }
        //4.返回当前线程上的连接
            return conn;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 将连接与线程解绑
     */
    public void removeConnection(){
        tl.remove();
    }
}
