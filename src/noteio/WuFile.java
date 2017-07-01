package noteio;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/1.
 * File 类代表与平台无关的文件和目录
 * File 能新建、删除、重命名文件和目录，但File不能访问文件内容本身。如果需要访问文件内容本身，
 *      则需要使用输入/输出流
 */
public class WuFile {
    public void testFile() throws IOException {
        //创建file对象
        File file=new File("F:\\测试");
        //访问文件名系列方法
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.renameTo(new File("F:\\不测试")));

        //文件检测：
        file=new File("F:\\不测试");
        System.out.println();
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        // 获取常规文件信息
        System.out.println();
        System.out.println(file.lastModified());
        System.out.println(file.length());

        // 文件操作相关
        System.out.println();
        File filetest=new File("F:\\不测试\\test.txt");
        File filenew=new File("F:\\不测试\\teat.txt");
        System.out.println(filenew.createNewFile());
        System.out.println(filetest.delete());

        // 目录操作相关
        System.out.println();
        File filedir=new File("F:\\不测试\\haha");
        System.out.println(filedir.mkdir());
        for(Object obj:file.list()){
            System.out.println(obj);
        }
        System.out.println(file.listFiles());
    }
}
