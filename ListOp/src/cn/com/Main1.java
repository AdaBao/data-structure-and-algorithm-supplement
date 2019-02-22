package cn.com;

//从尾到头输出单链表
public class Main1 {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        for(int i=0; i<10; i++){
            Node node=new Node(new Integer(i));
            list.addNode(node);
        }
        list.printListReversely(list.getHead().next);
    }
}
