package notecollection;

import testres.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/6/29.
 */
public class WuCollection {
    public void go(){
        Collection collection=new ArrayList();
        System.out.println("哈哈");
        collection.add("abc");
        Person p=new Person("wuzhenyu",120,180,true);
        collection.add(p);
        collection.add(new Person("liyanan",100,160,false));
        collection.add(new Person("chenyumin",120,180,true));
        for(Object obj:collection){
            System.out.println(obj);
        }

        Iterator it=collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
      //  collection.remove(p);
        collection.remove(new Person("chenyumin",120,180,true));
        Collection collection1=new ArrayList();
        collection1.add(new Person("chenyumin",120,180,true));
        collection1.add("abc");
        collection1.add(p);
        System.out.println(collection.contains(p));
        System.out.println(collection.isEmpty());
        Object[] obg=collection.toArray();
        System.out.println(obg[0]);
        collection.removeAll(collection1);
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());
    }
        public static void main(String[] args){
            WuCollection wu=new WuCollection();
            wu.go();
        }
}
