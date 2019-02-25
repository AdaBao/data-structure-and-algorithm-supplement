package cn.com;

//如何判断一个数是否是2的n次方
//2的n次方可以表示为: 2^0,2^1,2^2,2^3,2^4......,用1做移位操作,然后判断移位后的值是否与给定的数相等
public class Test1 {
    public static boolean isPower(int n){
        if(n<1)
            return false;
        int i=1;
        while(i<=n){
            if(i==n)
                return true;
            i<<=1;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(isPower(8));
        System.out.println(isPower(7));
    }
}
