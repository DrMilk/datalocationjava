package notecollection;

import testres.Person;
import testres.Person1;

import java.util.*;

/**
 * Created by Administrator on 2017/6/30.
 */
public class WuTreeMap {
    public void testTreeMap(){
        Person p=new Person("wuzhenyu",120,176,true);
        Person p1=new Person("liyanna",90,167,true);
        Person p2=new Person("chenyumin",110,175,true);
        Person p3=new Person("wuzhenyu",120,176,true);
        Comparator comparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person1&& o2 instanceof Person1){
                    return ((Person1) o1).getWeight()-((Person1) o2).getWeight();
                }
                throw new ClassCastException("Object转换不成 Person1");
            }
        };
        Map map=new TreeMap();
        map.put(4,p);
        map.put(2,p1);
        map.put(1,p2);
        map.put(3,p3);
        Map map1=new TreeMap(comparator);
        Person1 pp=new Person1("wuzhenyu",120,176,true);
        Person1 pp1=new Person1("liyanna",90,167,true);
        Person1 pp2=new Person1("chenyumin",110,175,true);
        Person1 pp3=new Person1("wuzhenyu",120,176,true);
        map1.put(pp,pp);
        map1.put(pp1,pp1);
        map1.put(pp2,pp2);
        map1.put(pp3,pp3);
        Set keyset=map.keySet();
        Iterator it= keyset.iterator();
        while(it.hasNext()){
            System.out.println(map.get(it.next()));
        }
        System.out.println("--------");
        Iterator it1=map1.keySet().iterator();
        while (it1.hasNext()){
            System.out.println(map1.get(it1.next()));
        }
    }
}
