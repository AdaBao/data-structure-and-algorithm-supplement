package cn.com;

//单链表,每个单链表有一个头结点和一个尾结点
public class LinkedList {
    private Node head;
    private Node lastNode;
    public LinkedList(){
        this.head=new Node(null);
        this.head.next=null;
        lastNode=this.head;
    }

    //删除结点,必须知道待删除结点的前一个结点
    public void deleteNode(Node preNode){
        if(preNode.next==lastNode)
            lastNode=preNode;
        preNode.next=preNode.next.next;
    }

    //增加结点,尾结点的左右在这里体现出来
    public void addNode(Node node){
        lastNode.next=node;
        lastNode=lastNode.next;
    }

    public void print(){
        Node preNode=this.head;
        while(preNode.next!=null){
            if(preNode.next.e instanceof Integer)
            System.out.print((Integer)preNode.next.e+" ");
            preNode=preNode.next;
        }
        System.out.println();
    }

    //从尾到头输出单链表,使用递归的方法实现
    public void printListReversely(Node node){
        if(node!=null){
            printListReversely(node.next);
            System.out.print(node.e+" ");
        }
    }

    public Node getHead(){
        return this.head;
    }
    public Node getLastNode(){
        return  this.lastNode;
    }


}
