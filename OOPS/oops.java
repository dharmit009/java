import java.util.Random;

class dice{
	// CONSTRUCTOR ...
	dice(){
		int side=1;
	} 
	
	//Properties: 
	Random myrandomObj = new Random();
	
	// BEHAVIOUR: roll -> Returns one random integer in range of (1, 6);
	void roll(){
		int myrandomNumber = myrandomObj.nextInt(1,7); 
		System.out.println("Value: "+myrandomNumber); 
	}

}

public class oops{
	public static void main(String args[]){
		dice mydice1 = new dice(); 
		mydice1.roll();
	}
}
