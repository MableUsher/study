package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * 和spring连接数据库相关的配置类
 */
public class JdbcConfig {
    /**
     * 用于创建一个QueryRunner对象
     * @param dataSource
     * @return QueryRunner
     */
    @Bean("runner")
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    /**
     * 创建数据源对象
     * @return
     */
    @Bean("datasource")
    @Scope("prototype")
    public DataSource createDataSource(){
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/spring01");
            ds.setUser("root");
            ds.setPassword("511320");
            return ds;
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
