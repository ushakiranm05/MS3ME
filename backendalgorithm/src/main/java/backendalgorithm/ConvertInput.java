package backendalgorithm;

public class ConvertInput {
	public String convertInput(int lower,int higher){
		String finalString="";
		for (int i = lower; i <= higher; i++) {
			if(i%7==0 && i%3==0){
				finalString= finalString+"MS3 and ME";				
			}else if(i%7==0){
				finalString= finalString+"MS3";
			}else if(i%3==0){
				finalString= finalString+"ME";
			}else{
				finalString= finalString+i;
			}
			if(!(i==higher)){
				finalString= finalString+",";
			}
		}
		return finalString;
	}

}
