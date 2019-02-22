package cn.com;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
* 实现链表重复数据的删除,有两种方法可以删除链表
* */
public class Main {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        for(int i=0; i<10; i++){
            Node node=new Node(new Integer(i));
            list.addNode(node);
        }

        for(int i=0; i<5; i++){
            Node node=new Node(new Integer(i));
            list.addNode(node);
        }
        list.print();

        //第一种链表删除重复数据的方法
        //遍历链表,把遍历到的值存储到一个Set中,在遍历过程中,若当前
        //访问的值在Set中已存在,则说明这个数据是重复的,可以删除
        /*Set<Object> set=new HashSet<>();
        Node preNode=list.getHead();
        while(preNode.next!=null){
            Object e=preNode.next.e;
            if(set.contains(e))
            {
                list.deleteNode(preNode);
            }else{
                set.add(e);
                preNode=preNode.next;
            }
        }
        list.print();*/

        //第二种方法是对链表进行双重循环遍历,外循环正常遍历链表,假设外循环当前
        //遍历的节点为cur,内循环从cur开始遍历,若碰到与cur所指向结点值相同,则删除这个重复的结点
        Node preNode1=list.getHead();
        while(preNode1.next!=null){
            Node preNode2=preNode1.next;
            if(preNode2!=null)
            while(preNode2.next!=null){
                if(preNode2.next.e.equals(preNode1.next.e)){
                    list.deleteNode(preNode2);
                }else{
                    preNode2=preNode2.next;
                }
            }
            preNode1=preNode1.next;
        }
        list.print();
    }
}
