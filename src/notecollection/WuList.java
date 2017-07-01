package notecollection;

import testres.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 * List代表一个元素有序、且可重复的集合，集合中的每个元素都有其对应的顺序索引
 * List允许使用重复元素，可以通过索引来访问指定位置的集合元素
 * List默认按元素的添加顺序设置元素的索引
 * List集合里添加了一些根据索引来操作集合元素的方法
 *
 * ArrayList和Vector是List接口的两个典型实现
 * 区别：Vector是一个古老的集合，通常建议使用ArrayList
 *       ArrayList是线程不安全的，而Vector是线程安全的。
 *       即使为保证List集合线程安全，也不推荐使用Vector
 * Array.asList(...)方法返回的List集合不是ArrayList实例也不是Vector实例。Arrays.asLIst()
 * 返回值是一个固定长度的List集合
 */
public class WuList {
    public void testList(){
        List list=new ArrayList();
        Person p1=new Person("liyanna",90,167,true);
        Person p=new Person("wuzhenyu",120,176,true);
        Person p2=new Person("chenyumin",110,175,true);
        Person p3=new Person("wuzhenyu",120,176,true);
        list.add(p2);
        list.add(p3);
        list.add(p1);
        list.add(p2);
        list.add(p);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        int index=list.indexOf(p2);
        int index2=list.lastIndexOf(p2);
        int index1=list.indexOf(new Person("wuzhenyu",120,176,true));
        System.out.println(index+" "+index1+" "+index2);
    }
    /**
     * 1.Arrays.asList(Object ... args) 方法返回的是一个List对象。但不是ArrayList
     * 也不是Vector 是Arrays里的内部类ArrayList
     *
     * 2.Arrays.asList(Object ... args) 方法返回的List是一个只读的
     */

    public void testArraysAsList(){
        test("aa","bb","cc");
        List list=Arrays.asList("aaa","bbb","ccc");
        System.out.println(list);
        System.out.println(list.getClass());
    }
    public void test(String ... arg){
        System.out.println(arg.length);
        for(int i=0;i<arg.length;i++){
            System.out.println(arg[i]);
        }
    }
}
