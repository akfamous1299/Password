public class RandomAlphaNum{
	public String result;
	
	public RandomAlphaNum(){
		 result = makePassword(13);
	}
	
	public RandomAlphaNum(int length){
	 result = makePassword(length);
	}

	public static String makePassword(int length){
		String password = "";
		int count = 0;
		for(int i = 0; i < length; i++){
			if(count%250 == 0){
				password += "\n";
			}
			password = password + randomChar("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*?-=+_<>\\/()[]{}|");
			count++;
		}
		return password;
		
	}
	
	public static String randomChar(String charector){
		int n = charector.length();
		int r = (int) (n * Math.random());
		return charector.substring(r, r + 1);
		
	} 
	
	public String toString(){
		 
		return result;
	}
	
	
	
	
	
	
	
}