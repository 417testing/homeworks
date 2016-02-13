
public class Problem1 {
	
	public Problem1(){
		
	}

//	public static void main(String[] args) {
//		int[] x = {0,1,2,3};
////		System.out.println(findLast(x,0));
//	}
	
	public static int findLast(int[] x, int y) throws NullPointerException{
		for(int i = x.length -1; i >= 0; i--){
			if(x[i] == y){
				return i;
			}
		}
		
		return -1;
	}
}
