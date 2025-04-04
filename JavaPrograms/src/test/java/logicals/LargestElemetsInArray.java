package logicals;

public class LargestElemetsInArray {

	public static void main(String[] args) {
    
		// creating an integer array
		int []ar= {5,15,20,50,80,30,60,90};
		
		
		//intially we store 0
		 int lar=0;
		 
		//we need to access integer array
		for(int i=0;i<ar.length;i++) {       // 7
			
			//System.out.println(ar[i]);
			
			//5>0=t, 15>5=t, 20>15=t, 50>20=t, 80>50= t, 30>80=f, 60>80=f, 90>80=t
			
			if(ar[i]>lar) {
				
				
				lar=ar[i];   
			}
			
			}
		
		
		System.out.println(lar);

	}
}