package assignment;

//import java.util.Scanner;

public class SnakeLadder {
	
	public static void main(String[] args) {
		
		
		System.out.println("1 is No Play. In no play  score remains same");
		System.out.println("2 is snake .In Case of Snake the player moves behind by the no. of positions appeared on dice");
		System.out.println("3 is Ladder .In Case of Ladder the player moves ahead by the number of position received in the die");
	    System.out.println("   ");
	    int player  = 2;
	    
	    int p1_score = 0;
	    int p2_score = 0;
	    
	    int dice_rolled_player1 = 0;
	    int dice_rolled_player2 = 0;
	    
	   
	    
	    
	    	
	    while(p1_score!=100 && p2_score != 100) {
	    	for (int i = 1; i<=player;  i++ ) {
	    		
		    	
	    		switch(i) {
		    	
    				case 1:
    					double p = Math.random()*(3-1+1)+1; //generating three random numbers from 1 to 3 for no play,snake and ladder
    					int res = (int) p;
    					if (res==1) {
    						p1_score = p1_score + 0;
    					}
    					else if (res==2) {
    						double a = Math.random()*(6-1+1)+1; // numbers getting from rolling dice for snake
    						dice_rolled_player1 +=1;
    						int s = (int) a;
    						if ((p1_score-s)<0) {
    							p1_score = 0;
    						}else {
    							p1_score -= s;
    						}
    					
    					
    					}else {
    				
    						double b = Math.random()*(6-1+1)+1; // numbers getting from rolling dice to use ladder
    						dice_rolled_player1 +=1;
    						int s = (int) b;
    						 
    						if((p1_score + s) > 100) {
    							p1_score = p1_score + 0;
    						}else {
    							p1_score  += s;
    						}
    						
    						double n = Math.random()*(6-1+1)+1;
    						dice_rolled_player1 += 1;
    						
    						if((p1_score + n) > 100) {
    							p1_score = p1_score + 0;
    						}else {
    							p1_score  += n;
    						}
    					
    						    				}
    					//System.out.println("player 1 score   " + p1_score); //by uncommenting this you can check your score at each steps for player 1
    					break;
    		
    				case 2:
	    	
    					double p1 = Math.random()*(3-1+1)+1;  //generating three random numbers from 1 to 3 for no play,snake and ladder
    					int res1 = (int) p1;
    					if (res1==1) {
    						p2_score = p2_score + 0;
    					}
    					else if (res1==2) {
    						double a1 = Math.random()*(6-1+1)+1; // numbers getting from rolling dice for snake
    						dice_rolled_player2 +=1;
    						int s1 = (int) a1;
    						if ((p2_score-s1)<0) {
    							p2_score = 0;
    						}else {
    							p2_score -= s1;
    						}
    					
    					
    					
    					}else {
    				
    						double a2 = Math.random()*(6-1+1)+1;   // numbers getting from rolling dice to use ladder
    						dice_rolled_player2 += 1;
    						int s2 = (int) a2;
    						 
    						if((p2_score + s2) > 100) {
    							p2_score = p2_score + 0;
    						}else {
    							p2_score  += s2;
    						}
    						
    						double m = Math.random()*(6-1+1)+1;
    						dice_rolled_player2 +=1;
    						
    						if((p2_score + m) > 100) {
    							p2_score = p2_score + 0;
    						}else {
    							p2_score  += m;
    						}
    					
    					}
    					//System.out.println("player 2 score   " + p2_score); //by uncommenting this you can check your score at each steps for player 2
    					break;
    		
    	
                }	
	    		
	    		System.out.println("position of player 1 = " + p1_score);
	    		System.out.println("position of player 2 = " + p2_score);
	    		
	    
	   }
	    
	    	     
	}
	int dice_rolled  = dice_rolled_player1 + dice_rolled_player2;
	System.out.println("No. of times Dice Rolled is = " + dice_rolled); 
	if(p1_score==100) {
		System.out.println("congratulation player 1 won ");
		System.out.println("score of the player 1 = " + p1_score);
	}else if(p2_score==100 && (dice_rolled_player2< dice_rolled_player1)){
		System.out.println("congratulation player 2 won ");
		System.out.println("score of the player 1 = " + p2_score);	
	}else { 
		if ((p1_score==p2_score) && (dice_rolled_player1 < dice_rolled_player2)) {
	
		System.out.println("congratulation player 1 won ");
	}else {
		System.out.println("congratulation player2 won");
	}
	}
	
  }
}
