**available方法**
	int read(byte[] a):一次读取一个字节数组
	write(byte[] a):一次写出一个字节数组
	available()获取读的文件所有的字节个数
	弊端：可能会造成字节溢出
	 FileInputStream fis = new FileInputStream（xxx.mp3）; 
	 FlieOutputStream fos = new FlieOutputStream（copy.mp3）;
	byte[] arr = new byte[fis.available];  //根据文件大小生成一个字节数组
	fis.read(arr);  //将文件上的所有字节读取到数组中
	fos.write(arr);  //将字节数组中的所有字节数据一次性写到文件上
	fis.close;
	fos.close;
 **定义小数组的标准格式**：
	 byte[] arr = new byte[1024*8];
	 int len;
	 while( (len = fis.read(arr)) != -1){
	          fos.write(arr,0,len);           //写入从0到len个字节数
	 }
 **缓冲**
 A：缓冲思想
	字节流一次读取一个数组的速度明显比一次读写一个字节的速度快得多，
	是因为加入了数组这样的缓冲区效果，java在本身设计的时候；
	也考虑到了这样的设计思想，所以提供了字节缓冲区流
B：BufferedInputStream
	其中内置了一个缓冲区（数组）
	从BufferedInputStream中读取一个字节时，会一次性从文件中读8192个，存在缓冲区中，返回给程序一个
	程序再次读取时，就不用找文件了，直接从缓冲区中获取
	直到缓冲区中所有的都被使用过，才重新从文件中读取8192个
C：BufferedOutputStream
	也内置了一个缓冲区（数组）
	程序向流中写出字节时，不会直接写到文件，先写到缓冲区中
	直到缓冲区写满，才会把缓冲区中的数据一次性写到文件里
**flush和close**
	flush刷新后不会关闭流
**图片加密**
	bos.write(b ^ 123);
	将写出的字节异或上一个数导致不能正常写入即加密
	解密时将copy文件再次读取写入，即异或两次
	123即相当于密匙

**## 字符流 ##**
**FileReader**
	用法与FileInputStream一样
	read返回值为int类型，要输出需要向下强转为char
**FileWriter**
	能直接写字符串 单个字符

**拷贝**
	Writer类中有一个2k的小缓冲区，如果不关流，就会将内容写到缓冲区里，关流会将缓冲区内容写出刷新再关闭。
**字符流的使用**
	由于读取时会将字节转为字符写出时再转为字节，在拷贝时不使用
	在只读或只写时使用可避免读取乱码，写出不用转为字符数组，直接写出字符串
	只能拷贝纯文本，因为在读取过程中可能找不到对应的字符就用？代替，写出时会直接写出导致文件扰乱无法查看
**readline**
	整行读取与输出，输出时要用newline进行换行
	LineNumberReader
	它的getLineNumber方法可以获取行号
	setLineNumber可以设置初始行号
	底层相当于一个private LIneNumber变量
**用指定编码表读写**
	在创建流时，在文件名后加码表名称即可
**序列流整合多个**
	创建vector集合对象，将流对象存储起来
	创建Enumeration枚举，关联集合元素
	将枚举中的输入流通过SequenceInputStream整合成一个