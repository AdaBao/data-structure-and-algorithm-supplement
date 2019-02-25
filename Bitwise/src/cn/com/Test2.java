package cn.com;

//求二进制中1的个数
//首先,判断这个数的最后一位是否为1,如果为1,则计数器加1,然后,通过右移丢弃掉最后一位.循环执行
//该操作直到这个数等于0为止.在判断二进制表示的最后一位是否为1时,可以采用与运算来达到这个目的
public class Test2 {
    public static int countOne(int n){
        int count=0;
        while(n>0){
            if((n&1)==1)
                count++;
            n>>=1;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countOne(7));
        System.out.println(countOne(8));
    }
}
