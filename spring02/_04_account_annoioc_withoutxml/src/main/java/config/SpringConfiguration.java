package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 配置类，和bean.xml功能一样
 * @Configuration
 * 指定当前类是一个配置类
 * @ComponentScan
 * 用于通过注解指定spring在创建容器时要扫描的包
 * 属性：value 和basePackages，用于指定要扫描的包
 * @Bean
 * 用于把当前方法的返回值作为bean对象存入springioc的容器中
 * 属性：name：用于指定bean的id 默认值为当前方法的名称
 */
@Configuration
@ComponentScan(basePackages = {"com.mable"})
@Import(JdbcConfig.class)
public class SpringConfiguration {

}
