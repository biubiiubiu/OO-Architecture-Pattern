package HW3AdapterCustomerInfocheck;


/*---------------------------------------------------------*/
/* This adapter class extends InfoValidation and           */
/* implements CusInfoValidator, and so the first           */
/* 4 functionalities listed in class CusInfoValidator      */
/* are automatically inherited from class InfoValidation,  */
/* and in this addapter class, isValidSSNNum(String SSNNum)*/
/* is emplemented.                                         */
/*---------------------------------------------------------*/


class InformationAdapter extends InfoValidation implements CusInfoValidator{

    /*------------------------------------------*/
	/* The Social Security number is a 9-digit  */
	/* number in the format "AAA-GG-SSSS".      */
	/*------------------------------------------*/
	public boolean isValidSSNNum(String SSNNum){
	   boolean isValid=true;
	   if(SSNNum.length() == 0){
		      isValid = false;
		      System.out.println("Empty string ***");
	   }
	   else{
			   String ns = SSNNum.trim();
			   String nStr = ns.replaceAll("\\s{1,}", "");
			   int len = nStr.length();

			   if ( (len==11) && (nStr.charAt(3) == '-') && (nStr.charAt(6) == '-')  ) {
				  for(int m=0; m<len; m++){
					    if(  (m != 3) && (m !=6) && ( Character.isDigit(nStr.charAt(m))==false) ){
					    	isValid=false;
					    }
				  }
			   }
			   else{
				  isValid=false;
			   }
	   }
	   return  isValid;
    }
	/*---------------------------------------------------------------------------*/
	/* The email address should be formed by English characters from the         */
	/* 26 English alphabets mixed with digits from 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, */
	/* exactly one¡°@¡±, and at least one period mark ¡°.¡±                          */
	/*---------------------------------------------------------------------------*/
	public boolean isValidEmail(String Email) {
		boolean isValid=true;
		   if(Email.length() <= 5){
			     isValid = false;
			     System.out.println("Emailadress too short");
		   }
		   else{
			   if(Email.charAt(0)>='a' && Email.charAt(0)<='z' || Email.charAt(0)>='A' && Email.charAt(0) <= 'Z') {
				   if(Email.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")){
					isValid = true;
				   }
			   }
			   else
				   isValid = false;
		   }
		   return  isValid;
	}
}


