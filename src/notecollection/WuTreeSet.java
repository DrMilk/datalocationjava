package notecollection;

import testres.Person;
import testres.Person1;

import java.util.*;

/**
 * Created by Administrator on 2017/6/30.
 * TreeSet是SortedSet接口的实现类，TreeSet可以确保集合元素处于排序状态
 * TreeSet 支持两种排序方法：自然排序和定制排序。默认情况下，TreeSet采用自然排序
 * Comparator comparator()
 * Object first() last() lower(Object e) higher(Object e)
 * SortedSet subSet(fromElement,toElement)  headSet(toElement) tallSet(fromElement)
 */
public class WuTreeSet {
    /**
     * 默认情况下 TreeSet要求集合中的元素必须实现 Comparable 接口
     * Comparable 接口中只有一个方法
     * public int compareTo() ; 若返回0代表两个元素相等，若返回整数，代表当前元素大，
     * 若返回负数，代表当前元素小
     * TreeSet 会调用每个元素的compareTo() 方法去和集合中的每个已经有的元素去比较，进而
     * 决定当前元素在集合中的位置。
     */
    public void testWithComparable(){
        Person p=new Person("wuzhenyu",120,176,true);
        Person p1=new Person("liyanna",90,167,true);
        Person p2=new Person("chenyumin",110,175,true);
        Person p3=new Person("wuzhenyu",120,176,true);
        System.out.println(p.equals(p3));
        System.out.println(p.equals(p));
        TreeSet set=new TreeSet();
        set.add(p);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void testTreeSetWithComparator(){
        Comparator comparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person1 && o2 instanceof Person1){
                    Person1 p1= (Person1) o1;
                    Person1 p2=(Person1) o2;
                    return -(p1.getHeight()-p2.getHeight());
                }
                throw new ClassCastException("传入值不能转化为Person1");
            }
        };
        TreeSet set=new TreeSet(comparator);
        Person1 p=new Person1("wuzhenyu",120,176,true);
        Person1 p1=new Person1("liyanna",90,167,true);
        Person1 p2=new Person1("chenyumin",110,175,true);
        Person1 p3=new Person1("wuzhenyu",120,176,true);
        System.out.println(p.equals(p3));
        System.out.println(p.equals(p));
        set.add(p);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(set.comparator().equals(comparator));
        System.out.println(set.first().toString());
        System.out.println("-----");
        System.out.println(set.last().toString());
        System.out.println("-----");
        System.out.println(set.lower(p1).toString());
        System.out.println("-----");
        System.out.println(set.higher(p2).toString());
        System.out.println("-----");
    }
}
