package cn.clover;
import cn.clover.bean.Person;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *@author:clover
 * @Date: 2019/12/31 22:03
 * @Description:删除list集合中的name为空值
 */
public class RemoveTeset {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("clover1", 10));
        list.add(new Person("", 0));
        list.add(new Person("clover2", 12));
        list.add(new Person("", 0));
        list.add(new Person("clover3", 13));
        list.add(new Person("", 0));
        list.add(new Person("", 0));
        list.add(new Person("", 0));
        System.out.println("删除前list=" + list.toString());
        //方法一
        for (int i = 0; i < list.size(); i++) {
           /* if ("".equals(list.get(i).getName())){
                list.remove(i);
            }*/
            if ("".equals(list.get(i).getName())) {
                list.remove(i);
                i--;//在元素被移除掉后，进行索引后移
            }
        }
        System.out.println("删除后list=" + list.toString());

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("clover111", 10));
        list2.add(new Person("", 0));
        list2.add(new Person("clover2", 12));
        list2.add(new Person("", 0));
        list2.add(new Person("clover3", 13));
        list2.add(new Person("", 0));
        list2.add(new Person("", 0));
        list2.add(new Person("", 0));
        System.out.println("删除前list2=" + list2.toString());
        //方法二 使用迭代器的方法
        Iterator<Person> itr=list2.iterator();
        while (itr.hasNext()) {
            if ("".equals(itr.next().getName()))
                itr.remove();
        }
        System.out.println("删除后list2=" + list2.toString());
    }
}