// public class L{  
    // public static void main(String args[]){  
        // int i=0;  
        // for(i=1;i<=20;i++)  
            // System.out.println(f(i));  
    // }  
    // public static int f(int x)  
    // {  
        // if(x==1 || x==2)  
            // return 1;  
        // else  
            // return f(x-1)+f(x-2);  
    // }  
// } 
//    
// public class L{  
    // public static void main(String args[]){  
        // int i=0;  
        // math mymath = new math();  
        // for(i=1;i<=20;i++)  
            // System.out.println(mymath.f(i));  
    // }  
  
// }  
// class math  
// {  
    // public int f(int x)  
    // {  
        // if(x==1 || x==2)  
            // return 1;  
        // else  
            // return f(x-1)+f(x-2);  
    // }  
// } 
//自己写的方法，是递归调用
public class L{  
    public static void main(String[] args){  
        for(int i = 1;i<=20;i++){
			int d = fn(i);
			System.out.println(d);
		}
    }  
	public static int fn(int x){
		int f=0;
		if(x == 1 || x == 2){
			f = 1;
		}else {
			f = fn(x-1) + fn(x-2);
		}
		return f;
	}
}