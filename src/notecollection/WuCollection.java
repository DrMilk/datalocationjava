package notecollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Administrator on 2017/6/29.
 */
public class WuCollection {
    public static void main(String[] args){
        Collection collection=new ArrayList();
        System.out.println("哈哈");
        collection.add("abc");
        collection.add(new Person("wuzhenyu",120,180,true));
        collection.add(new Person("liyanan",100,160,false));
        collection.add(new Person("chenyumin",120,180,true));
        for(Object obj:collection){
            System.out.println(obj);
        }
    }
}
