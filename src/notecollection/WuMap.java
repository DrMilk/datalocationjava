package notecollection;

import testres.Person;

import java.util.*;

/**
 * Created by Administrator on 2017/6/30.
 * Map用于保存具有映射关系的数据，因此Map集合里保存着两组值，一组值用于保存Map里的Key，
 * 另外一组用于保存Map里的Value
 *
 * Map中的key和value都可以是任何引用类型的数据
 * Map中的key不允许重复，即同一个Map对象的任何两个key用过equals方法比较中返回false
 * key和value之间存在单向一对一关系，即通过指定的key总能找到唯一的，确定的value。
 */
public class WuMap {
    public void testMap(){
        Map map=new HashMap();
        Person p=new Person("wuzhenyu",120,176,true);
        Person p1=new Person("liyanna",90,167,true);
        Person p2=new Person("chenyumin",110,175,true);
        Person p3=new Person("wuzhenyu",120,176,true);
        map.put("p",p);
        map.put("p1",p1);
        map.put("p2",p2);
        map.put("p3",p3);
        System.out.println(map.size());
        Collection values=map.values();
        System.out.println(values);
        Set set=map.keySet();
        System.out.println(set);
        Iterator it=set.iterator();
        System.out.println("------------");
        while (it.hasNext()){
            System.out.println(it.next()+"--"+map.get(it.next()));
        }
    }
}
