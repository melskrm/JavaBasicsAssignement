package java1103;

public class islem1103 { 
	
	public static void main(String []args) {
		
		int number1,number2,sonuc;
		char islem;
		
		
		if (islem=='+') {
			sonuc= number1+number2;
			System.out.println("sonuc");
		}
		else if(islem=='-') {
			sonuc=number1-number2;
			System.out.println("sonuc");
			
		}
		else if(islem=='*') {
			sonuc=number1*number2;
			System.out.println("sonuc");
			
		}else if(islem=='/') {
			if (number2!==0) 
			{
				sonuc=number1/number2;
				System.out.println("sonuc");
				}
			else 
				System.out.println("hatali giris");
		}
		
		
			
		
		
	}
	
}
