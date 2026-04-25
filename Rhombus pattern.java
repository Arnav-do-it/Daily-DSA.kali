public class Main{
	static  void main() {
		int n = 5;
		//int v=6;
		for(int i=1;i<=n;i++){
		    for(int s=1;s<=n-i;s++){
		        System.out.print(" ");
		    }
		    for(int c=1;c<=n;c++){
		        System.out.print("*");
		}System.out.println();
	}
}
}
