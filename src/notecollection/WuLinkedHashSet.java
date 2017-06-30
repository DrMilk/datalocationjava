package notecollection;

import testres.Person;

import java.util.*;

/**
 * Created by Administrator on 2017/6/30.
 * LinkedHashSet 是 Hashset的子类
 * LinkedHashSet 集合根据元素的hashcode值来决定元素的储存位置，
 * 但它同时使用链表维护元素的次序，这使得元素看起来是以插入顺序保存的、
 * LinedHashSet 性能插入元素略低HashSet，但在迭代访问Set里的全部元素时有很好的性能
 * LinkHashSet 不允许集合元素重复
 */
public class WuLinkedHashSet {
    public void test(){
        Person p=new Person("wuzhenyu",120,176,true);
        Person p1=new Person("liyanna",90,167,true);
        Person p2=new Person("chenyumin",110,175,true);
        Person p3=new Person("wuzhenyu",120,176,true);
        System.out.println(p.equals(p3));
        System.out.println(p.equals(p));
        Set set=new LinkedHashSet();
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
