package notecollection;

import testres.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 * Collections是一个操作Set、List和Map等集合的工具类
 * Collections中提供了大量方法对集合元素进行排序、查询和修改等操作，还提供了对集合对象设置
 *             不可变、对集合对象实现同步控制等方法。
 * 排序操作：
 *        -reverse(List):反转List中元素的顺序
 *        -shuffle(List):对List集合元素进行随机排序
 *        -sort(List):根据元素的自然顺序对指定List集合元素按升序排序
 *        -sort(List,Comparator):根据指定的Comparator产生的顺序对List集合元素进行牌血
 *        -swap(List，int，int):将指定List集合中的i处元素与j处元素进行交换
 */
public class WuCollections {
    //1.获取线程安全的集合对象
    /**
     * ArrayList、HashSet、HashMap...都不是线程安全的。
     * 如何得到对一个的线程安全的集合对象呢 调用Collections的synchronizedXXX()方法获取线程安全集合对象
     *
     *
     *
     */
    public void testCollections(){
        ArrayList list=new ArrayList();
        List list_syn= Collections.synchronizedList(list);
        Person p=new Person("wuzhenyu",120,176,true);
        Person p1=new Person("liyanna",90,167,true);
        Person p2=new Person("chenyumin",110,175,true);
        Person p3=new Person("wuzhenyu",120,176,true);
        list.add(p);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for(Object obj: list){
            System.out.println(obj);
        }
        System.out.println("----");
        Collections.sort(list);
        for(Object obj:list){
            System.out.println(obj);
        }
        System.out.println("----");
        Object obj=Collections.max(list);
        System.out.println(obj);
    }
}
