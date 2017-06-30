package notecollection;

import testres.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/30.
 *  Hashset 是set的最典型实现
 *  Hashset 里不能有重复的元素 判定标准是 equals() 方法返回 true
 *  Hashset 通过 Hashcode() 值存放元素  所以不能保证元素的位置
 *  HashSet 是线程不安全的
 *  HashSet 由HashMap来定义的；
 *  1).在HashSet中维护了一个HashMap属性，
 *  2).在调用HashSet的方法是，实际操作的是HashMap的对应的方法。
 *  3).add(Object obj)实际上是把obj放入了map中；
 */
public class WuHashSet {
    public void go(){
        Person p=new Person("wuzhenyu",120,176,true);
        Person p1=new Person("liyanna",90,167,true);
        Person p2=new Person("chenyumin",110,175,true);
        Person p3=new Person("wuzhenyu",120,176,true);
        System.out.println(p.equals(p3));
        System.out.println(p.equals(p));
        Set set=new HashSet();
        set.add(p);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
