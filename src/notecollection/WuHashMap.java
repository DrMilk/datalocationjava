package notecollection;

import testres.Person;

import java.util.*;

/**
 * Created by Administrator on 2017/6/30.
 * HashMap和Hashtable 是Map接口的两个典型实现类
 * 区别：-Hashtable 是一个古老的Map实现类，不建议使用
 *      -Hashtable 是一个线程安全的Map实现，但HashMap是线程不完全的。
 *      -Hashtable 不允许使用null作为key和value，而HashMap可以
 * 与HashSet集合不能保证元素的顺序的顺序一样
 * Hashtable、HashMap也不能保证其中key-value对的顺序
 * Hashtable、HashMap判断两个Key相等的标准是：两个Key通过equals方法返回true，hashCode值也相等
 * Hashtable、HashMap判断两个Value相等的标准是：两个Value通过equals方法返回true
 */
public class WuHashMap {
    public void testHashMap(){
        Person p=new Person("wuzhenyu",120,176,true);
        Person p1=new Person("liyanna",90,167,true);
        Person p2=new Person("chenyumin",110,175,true);
        Person p3=new Person("wuzhenyu",120,176,true);
        Map map=new HashMap();
        map.put(1,p);
        map.put(2,p1);
        map.put(3,p2);
        map.put(4,p3);
        Set keyset=map.keySet();
        Iterator it= keyset.iterator();
        while(it.hasNext()){
            System.out.println(map.get(it.next()));
        }
    }
}
