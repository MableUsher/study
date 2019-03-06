1. 修改MySQL提示符
2. MySQL语句的规范
	* 关键字和函数名称全部大写
	* 数据库名称、表名称、字段名称小写
	* SQL语句必须以分号结尾
3. 创建数据库
	* CREATE DATABASE ;
4. 创建某一类型的数据库
    * CREATE {DATABASE | SCHEMA} [IF NOT EXISTS] db_name [DEFAULT] CHARACTER SET [=] charset_name;
5. 修改数据库
	* ALTER {DATABASE | SCHEMA} [db_name] [DEFAULT] CHARACTER SET [=] charset_name;
6. 删除数据库
	* DROP {DATABASE | SCHEMA} [IF EXISTS] db_name;
7. 判断是否不存在，如果不存在则执行命令
	* IF NOT EXISTS;
8. 显示警告信息
	* SHOW WARNINGS;
9.  显示数据库创建时使用的指令
	* SHOW CREATE DATABASE +DBNAME;
10. 进入数据库
	* USE db_name; 
11. 创建数据表
 	* CREATE TABLE [IF NOT EXISTS] table_name(
12. 查看数据列表
	* SHOW TABLES [FROM db_name] [LIKE 'pattern' | WHERE expr]；
13. 查看数据表结构
	* SHOW CLOUMNS FROM table_name；
14. 插入表数据
	* INSERT tbl_name [字段(colume),...] VALUES(val,...);
15. 查看表数据
	* SELECT * FROM table_name;
16. 自动编号
	* AUTO_INCREMENT （必须与主键组合使用）
17. 主键约束
	* PRIMARY KEY
	* 只能存在一个主键
	* 主键自动为NOT NULL
18. 唯一约束
	* UNIQUE KEY
	* 保证记录的唯一性
19. 默认约束
	* default
	* 当插入记录时，如果没有明确为字段赋值，则自动赋予默认值
20. 外键约束的要求
	* FOREING KEY
	* 父表和子表必须使用相同的存储引擎,而且禁止使用临时表。	
	* 数据表的存储引擎只能为InnoDB.[配置文件中]	
	* 外键列和参照列必须具有相似的数据类型。其中数字的长度或是否有符号位必须相同;而字符的长度则可以不同。	
	* 外键列和参照列必须创建索引。如果外键列不存在索引的话 MysQL将自动创建索引。
21. 
22.  