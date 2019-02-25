package cn.com;

//把一个数向左移动n位相当于把该数乘以2的n次方
public class Muti {
    //计算m*2^n
    public static int powerN(int m,int n){
        for(int i=0; i<n; i++){
            m=m<<1;
        }
        return m;
    }
    public static void main(String[] args){
        System.out.println("2*4="+powerN(2,2));
        System.out.println("3*8="+powerN(3,3));
    }
}
