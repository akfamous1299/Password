
public class Num {
	int length;
	String out;
	int count;
	
	public Num(){
		count = 0;
		out = generator(4);
	}
	
	public Num(int le){
		count = 0;
		out = generator(le);
	}
	
	
	public String generator(int l){
		String output = "";
		
		int temp;
		for(int i = 0; i < l; i++){
			temp = (int)(Math.random()*10);
			if(count%250 == 0){
				output +="\n";
			}
			output += temp;
			count++;
		}
		return output;
		
	}
	
	public String toString(){
		return out;
	}

}
