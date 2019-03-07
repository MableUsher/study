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
	* INSERT table_name [字段(colume),...] VALUES(val,...);
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
	* FOREIGN KEY
	* 父表和子表必须使用相同的存储引擎,而且禁止使用临时表。	
	* 数据表的存储引擎只能为InnoDB.[配置文件中]	
	* 外键列和参照列必须具有相似的数据类型。其中数字的长度或是否有符号位必须相同;而字符的长度则可以不同。	
	* 外键列和参照列必须创建索引。如果外键列不存在索引的话 MysQL将自动创建索引。
21. 表级约束与列级约束
	* 实际开发列级约束用的多，表级约束很少能用到
	* NOT NULL 、DEFAULT只在列级约束
	* 主键约束、唯一约束、外键约束可存在表级和列级约束
22. 添加单列
	* ALTER TABLE tbl_name ADD [COLUMN] col_name column_definition [FIRST | AFTER col_name]
	* FIRST在整个表的最前方，默认不写未整个表的最后方
23. 添加多列不能添加位置关系
24. 删除列
	* ALTER TABLE tbl_name DROP col_name
25. 进行添加删除多项操作用逗号分隔开	
26. 添加主键约束，添加唯一约束,添加删除默认约束
	* 主键约束：ALTER TABLE 表名 ADD PRIMARY KEY(列名）; 
	* 外键约束： alter table 表名ADD FOREIGN KEY(外键列） REFERENCES参照表 (参照列); 
	* 唯一约束：ALTER TABLE表名 ADD UNIQUE KEY（列名） ; 
	* 添加默认约束: ALTER TABLE 表名 SET|DROP DEFAULT 默认值; 
27. 查看外键约束 查看主键唯一约束
	* SHOW CREATE TABLE 表名
	* SHOW INDEXES FROM 表名
28. 修改列定义MODIFY修改列名称CHANGE修改表名RENAME
	* ALTER TABLE tbl_name MODIFY [COLUMN] col_name column_definition  [FRIST | AFTER col_name]
	* ALTER TABLE 表名 CHANGE oldname newname SMALLINT UNSIGNED NOT NULL;
	* ALTER TABLE 表名 RENAME users2;
	* CHANGE功能大于MODIFY
29. 三种插入方式INSERT SET SELECT
	* INSERT VALUES标准形式
	* INSERT SET可以使用子查询
	* INSERT SELECT可以将SELECT的查询结果插入表中
30. 更新记录UPDATE SET
	* UPDATA 表名 SET 字段名=值|表达式 WHERE 判断条件 (如省略where筛选,则更新所有记录)
31. 查询表达式查询顺序影响结果顺序，查询别名AS影响结果名称
32. WHERE 条件查询
	* 对记录进行过滤，如果没有指定WHERE子句，则显示所有记录。
    * 在WHERE表达式中，可以使用MySQL支持的函数或运算符。
33. SELECT FROM table_name GROUP BY HAVING 条件(必须存在于SELECT 中的字段或者是聚合函数);
34. ORDER BY对查询结果进行排序
35. LIMIT 限制从几位开始查询 查询多少个数据
36. 子查询(Subquery)是指出现在其他SQL语句内的SELECT语句
	* SELECT * FROM t1 WHERE col1 = ( SELECT col2 FROM t2);
37. INSERT VALUE 和 INSERT SELECT区别在于后者有子查询，而前者没有。
	* INSERT [INTO] tbL_name [(col_name,...) SELECT...
	* 如：INSERT tdb_name(cate_name) SELECT goods_cates FROM tdb_goods GROUP BY goods_cate（分类）;
38. EXISTS与IN的使用效率的问题
	* 通常情况下采用exists要比in效率高，因为IN不走索引，但要看实际情况具体使用：
	* IN适合于外表大而内表小的情况；EXISTS适合于外表小而内表大的情况。
	* 在插入记录前，需要检查这条记录是否已经存在，只有当记录不存在时才执行插入操作，可以通过使用 EXISTS 条件句防止插入重复记录。
39. 通过tdb_goods_cates数据表来更新tdb_goods表
	* UPDATE tdb_goods INNER JOIN tdb_goods_cates ON goods_cate = cate_name <br/>SET goods_cate = cate_id ;
40. 如果数据表中文字符很多，而且数据很多时那么查询运行的时间将会很多，所以有时必要将一些文字变为数字，方便查询。那么就需要建立外键，将文字转化成数字（如类型转化成品类1,2,3、、、）
41. 连接

	* MySQL在SELECT语句、多表跟新、多表删除语句中支持JOIN操作.
	* table_reference<br/>
	{[INNER | CROSS] JOIN | {LEFT | RIGHT} [OUTER] JOIN}<br/>
	table_reference
42. INNER JOIN,内连接
	* 在MySQL中，JOITERN,CROSS JOIN和INNER JOIN是等价的。
	* LEFT [OUTER] JOIN 左外连接
	* RIGHT [OUTER] JOIN 右外连接
	* 左外连接：显示左表的全部记录及右表符合连接条件的记录，如果左表的某个字段记录右表不满足，则那个数据为NULL
	* 右外连接：显示右表的全部记录及左表符合连接条件的记录，如果右表的某个字段记录左表不满足，则那个数据为NULL
	* 连接条件：使用ON关键字来设定连接条件，也可以使用WHERE来代替
43. 多表连接
	* 多表的连接跟两张表的连接一样<br/>表的连接实质就是外键的逆向约束。
	* 	
	SELECTgoods_id,goods_name,b.cate_name,c.brand_name,goods_priceFROM productsAS a <br/> INNER JOIN products_cate AS b ON a.goods_cate = b.cate_id<br/>
	INNER JOIN products_brand AS c ON a.brand_name = c.brand_id;
