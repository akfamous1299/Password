
public class PrintAllNum {
	int[] var;
	
	public PrintAllNum(){
		generator();
		
		System.out.println("done");
	}
	
	public void generator(){
		 var = new int[10000];
		int current = 0;
		for(int i = 0; i <= var.length-1; i++){
			var[i] = current;
			current++;
		}
		
	}
	public void print(){
		
		for(int x=0; x <= var.length-1; x++){
			if(var[x] <= 9){
				
				System.out.println("000" + var[x]);
				
				//System.out.println(var[x]);
			}
			else if(var[x] <= 99){
				System.out.println("00" + var[x]);
			}
			else if(var[x] <= 999){
				System.out.println("0" + var[x]);
			}
			else{
				System.out.println( var[x]);
			}
		}
		
	}
public String toString(){
		String out = "Start \t";
		for(int x=0; x <= var.length-1; x++){
			if(var[x] <= 9){
			//	out += "";
				 out += ("000");
				 out += Integer.toString(var[x]) + " ";
				
				//System.out.println(var[x]);
			}
			else if(var[x] <= 99){
				out += ("00");
				out += Integer.toString(var[x]) + " ";
			}
			else if(var[x] <= 999){
				out += ("0");
				out += Integer.toString(var[x]) + " ";
			}
			else{
				out += Integer.toString(var[x]) + " ";
			}
			if(var[x]%60 == 0){
				out +="\n";
			}
		}
		return out;
		
	}
	
	
	

	
	

}
