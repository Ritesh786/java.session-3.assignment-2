
public class Math {
	int i, a;
	Math (int b){
		System.out.println("Ho ja print");
		a=b;
		for(i=2;i<a;i++){
			if(a%i==0){
				break;
				
			}
			
		}
		if(i==a){
			System.out.println(+a);
		}
		else{
			System.out.println("Given no. is not prime");
		}
	}
	
	
	
	}

	
	


