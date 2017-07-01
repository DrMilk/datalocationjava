package notecollection;

import testres.Person;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/30.
 */
public class WuLinkedHashMap {
    public void testLinkedHashMap(){
        Person p=new Person("wuzhenyu",120,176,true);
        Person p1=new Person("liyanna",90,167,true);
        Person p2=new Person("chenyumin",110,175,true);
        Person p3=new Person("wuzhenyu",120,176,true);
        Map map=new LinkedHashMap();
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
