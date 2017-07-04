package noteexception;

import testres.Person;

/**
 * Created by Administrator on 2017/7/3.
 * 任何一种程序设计语言设计的程序在运行时都有可能出现错误，例如除数为0，数组下标越界，要读写的文件不存在等等。
 * 捕获错误最理想的是在编译期间，但有的错误只有在运行时才会发生。
 * 对于这些错误，一般有两种解决方法：
 * 遇到错误就终止程序的运行。
 * 由程序员在编写程序时，就考虑到错误的检测、错误消息的提示，以及错误的处理。
 *
 * 异常：在Java语言中，将程序执行中发生的不正常情况称为“异常”。
 * Java中的异常用于处理非预期的情况，如文件没找到，网络错误，非法的参数
 * Java程序运行过程中所发生的异常事件可分为两类：
 * Error:  JVM系统内部错误、资源耗尽等严重情况
 * Exception: 其它因编程错误或偶然的外在因素导致的一般性问题，例如：
 *      -空指针访问
 *      -试图读取不存在的文件
 *      -网络连接中断
 */
public class WuException {
    /**
     * Java异常处理：Java采用异常处理机制，将异常处理的程序代码集中在一起，
     * 与正常的程序代码分开，使得程序简洁，并易于维护。
     *
     * Java提供的是异常处理的抓抛模型。
     * Java程序的执行过程中如出现异常，会自动生成一个异常类对象，该异常对象将被提交给Java运行时系统，这个过程称为抛出(throw)异常。
     * 如果一个方法内抛出异常，该异常会被抛到调用方法中。如果异常没有在调用方法中处理，它继续被抛给这个调用方法的调用者。这个过程将一直继续下去，直到异常被处理。这一过程称为捕获(catch)异常。
     * 如果一个异常回到main()方法，并且main()也不处理，则程序运行终止。
     * 程序员通常只能处理Exception，而对Error无能为力。
     */
    public void testException(){
        // 1.数组下标越界
        //java.lang.ArrayIndexOutOfBoundsException
        int [] scores=new int[10];
        try{
            scores[10]=10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("1  "+e.toString()+"  "+e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("1"+e.toString());
        }finally {
            // finally 一定会执行
            System.out.println();
        }

        // 2.空指针异常
        // java.lang.NullPointerException
        Person person = null;
        person.getName();

        // 3.数学异常
        // java.lang.ArithmeticEx
        int i=10/0;

        // 4.类型转换异常
        // java.lang.ClassCastException
        Object obj=new ClassCastException();
        Person p2=(Person)obj;


    }

    /**
     * 在方法参数列表的后面使用 throws 关键字声明抛出异常；
     * 异常在当前方法内部不处理，而抛给调用当前方法的方法
     * 可以声明抛出多个异常,多个一场使用，分割，多个异常没有顺序
     * 可以声明抛出出现的异常类的父类
     * 重写方法不能抛出比被重写方法范围更大的异常类型
     * @throws ClassNotFoundException
     */
    public void testthrowsExecption() throws ClassNotFoundException ,RuntimeException{
       Class.forName("www");
    }
}
