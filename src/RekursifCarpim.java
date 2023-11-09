
// 2 parametre alıp bunları rekürsif olarak çarpan metod 

public class RekursifCarpim {
	 public static  int carpma (int x , int y  )  {
		  
		  if ( x==0||y==0) {
			  
			  return  0 ;
		  }
		  
		return x + carpma(x,y-1);
		
		  }
	  
		  
		
	  
	        
	  
		
		
		public static void main(String[] args) {
		
			
			
			System.out.println("Recursive Çarpma işlemi : " + carpma(3,6));
			


	}}

