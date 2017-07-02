package noteio;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * Created by Administrator on 2017/7/1.
 * Java 的IO流主要包括输入、输出两种IO流，每种输入、输出流有可分为字节流和字符流两大类：
 *      - 字节流以字节为单位来处理输入、输出操作
 *      - 字符流以字符为单位来处理输入、输出操作
 *
 * 按流向分：
 *      - 输入流
 *      - 输出流
 * 按处理的单位：
 *      -字节流（8位的字节）
 *      -字符流（16位的字节）
 * 按流的角色：
 *      -节点流：可以从一个特定的IO设备读/写数据的流
 *      -处理流：对一个已存在的流进行连接和封装，通过封装后的流来实现数据读/写操作
 *
 * IO 流体系
 *  分类        字节输入流        字节输出流      字符输入流     字符输出流
 *  抽象基类     InputStream      OutputStream   Reader        Writer
 *  访问文件     FileInputStream  FileOutputStream FileReader  FileWriter
 *  访问数组     ByteArray...     ByteArray...    CharArray...  CharArray...
 *  访问管道     Piped...         ...              ...          ...
 *  访问字符串                                   StringReader   StringWriter
 *  缓冲流       Buffered...      ...            ...            ...
 *  转换流                                       InputStreamReader OutputStreamWriter
 *  对象流       ObjectInputStream ObjectOutputStream
 *  抽象基类      Filter...       ...             ...           ...
 *  打印流                        PrintStream                   PrintWriter
 */
public class Wuio {
    /**
     * InputStream 和 Reader是所有输入流的基类
     * InputStream （典型实现：FileInputStream）：
     *  - int read()
     *  - int read(byte[] b)
     *  - int read(byte[] b,int off,int len)
     *
     *  Reader(典型实现：FileReader)
     *  -int read()
     *  -int read(char[] c)
     *  -int read(charp[ c,int off,int len)
     *
     *  程序中打开的文件IO资源不属于内存里的资源，垃圾回收机制无法回收该资源，所以应该
     *  显示关闭文件IO资源。
     */
    public void testInputStream() throws IOException {
        //1，创建了一个字节输入流
        InputStream is=new FileInputStream("F:\\不测试\\teat.txt");
        //2，读取文件的内容
        //2.1 第一个 读取一个字节 效率很低 不建议
        int resutlt=is.read();
        while(resutlt != -1){
            System.out.print((char) resutlt);
            resutlt=is.read();
        }
        System.out.println(resutlt);
        //2.2 一次读取一组；一组字符。
        byte[] bytes=new byte[10];
        int len=0;
        while ((len=is.read(bytes))!=-1){
            for(byte b:bytes){
                System.out.println((char)b);
            }
        }
        //2.3 把内容读取到字节数组的部分连续的元素中。
        byte[] result=new byte[1024*10];
        is.read(result,10,is.available());
        //3. 关闭流资源
        is.close();
    }

    public void testReader() throws IOException {
        //利用字符输入流读取
        Reader reader=new FileReader("F:\\不测试\\teat.txt");
        char [] buffer=new char[10];
        int len=0;
        while ((len=reader.read(buffer))!=-1){
            for(int i=0;i<len;i++){
                System.out.print(buffer[i]);
            }
        }
        reader.close();
    }
    public void testOutputStream() throws IOException {
        File file=new File("F:\\不测试\\teat.txt");
        FileOutputStream ops=new FileOutputStream(file);
        String content="efwefwefwefwgwegweg";
//        ObjectOutputStream oos=new ObjectOutputStream(ops);
//        oos.writeObject(content);
//        oos.flush();
//        oos.close();
        ops.write(content.getBytes());
        ops.close();
    }
    public void testCopuFile() throws IOException{
        //1.创建定位到文件的输入流
        InputStream is=new FileInputStream("F:\\我的视频\\试做.mp4");
        //2.创建定位到文件的输出流
        OutputStream os=new FileOutputStream("F:\\我的视频\\试做3.mp4");
        //3.创建一个byte数组，用于读写文件
        byte [] buffer=new byte[1024*10];
        int len=0;
        //4.读写为我年间：
        while ((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        os.close();
        is.close();
        //5.关闭流资源

    }
}
