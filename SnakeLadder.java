package assignment;

//import java.util.Scanner;

public class SnakeLadder {
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println(" ");
		System.out.println("1 is No Play. In no play  score remains same");
		System.out.println("2 is snake .In Case of Snake the player moves behind by the no. of positions appeared on dice");
		System.out.println("3 is Ladder .In Case of Ladder the player moves ahead by the number of position received in the die");
	    System.out.println("   ");
	    int player  = 4;
	    
	    int p1_score = 0;
	    int p2_score = 0;
	    int p3_score = 0;
	    int p4_score = 0;
	    
	    
	    	
	    while(p1_score < 100 && p2_score < 100 && p3_score < 100 && p4_score < 100) {
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
    						int s = (int) a;
    						if ((p1_score-s)<0) {
    							p1_score = 0;
    						}else {
    							p1_score -= s;
    						}
    					
    					
    					}else {
    				
    						double b = Math.random()*(6-1+1)+1; // numbers getting from rolling dice to use ladder
    						int s = (int) b;
    						p1_score  += s;
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
    						int s1 = (int) a1;
    						if ((p2_score-s1)<0) {
    							p2_score = 0;
    						}else {
    							p2_score -= s1;
    						}
    					
    					
    					
    					}else {
    				
    						double a2 = Math.random()*(6-1+1)+1;   // numbers getting from rolling dice to use ladder
    						int s2 = (int) a2;
    						p2_score  += s2;
    					
    					}
    					//System.out.println("player 2 score   " + p2_score); //by uncommenting this you can check your score at each steps for player 2
    					break;
    		
    		
    		
    				case 3:
	    	
    					double p2 = Math.random()*(3-1+1)+1;   //generating three random numbers from 1 to 3 for no play,snake and ladder
    					int res2 = (int) p2;
    					if (res2==1) {
    						p3_score = p3_score + 0;
    					}
    					else if (res2==2) {
    						double a4 = Math.random()*(6-1+1)+1;  // numbers getting from rolling dice for snake
    						int s4 = (int) a4;
    						if ((p3_score-s4)<0) {
    							p3_score = 0;
    						}else {
    							p3_score -= s4;
    						}
    					
    					
    					
    					}else {
    				
    						double a5 = Math.random()*(6-1+1)+1;   // numbers getting from rolling dice to use ladder
    						int s5 = (int) a5;
    						p3_score  += s5;
    					
    					}
    					//System.out.println("player 3 score   " + p3_score); //by uncommenting this you can check your score at each steps for player 3
    					break;
    	
    		
    				case 4:
	    	
    					double p3 = Math.random()*(3-1+1)+1;  //generating three random numbers from 1 to 3 for no play,snake and ladder
    					int res3 = (int) p3;
    					if (res3==1) {
    						p4_score = p4_score + 0;
    					}
    					else if (res3==2) {
    						double r = Math.random()*(6-1+1)+1;  // numbers getting from rolling dice for snake
    						int n = (int) r;
    						if ((p4_score-n)<0) {
    							p4_score = 0;
    						}else {
    							p4_score -= n;
    						}
    					
    					
    					
    					}else {
    				
    						double r1 = Math.random()*(6-1+1)+1;    // numbers getting from rolling dice to use ladder
    						int m = (int) r1;
    						p4_score  += m;
    						
    					}
    					//System.out.println("player 4 score   " + p4_score); //by uncommenting this you can check your score at each steps for player 4
    					break;
    	
    	
    	
                }	
	    
	    }
	    
	    	    
	if (p1_score>=100 &&(p1_score>p2_score && p1_score > p3_score && p1_score > p4_score)) {
    	System.out.println("player 1 won and score is " + p1_score);	
    }else if (p2_score>=100 &&(p2_score>p1_score && p2_score > p3_score && p2_score > p4_score)) {
    	System.out.println("player 2 won and score is " + p2_score);
    	
    }else if (p3_score>=100 &&(p3_score>p1_score && p3_score > p2_score && p3_score > p4_score)) {
    	System.out.println("player 3 won and score is " + p3_score);
    }else if (p4_score>=100 &&(p4_score>p1_score && p4_score > p2_score && p4_score > p3_score)) {
    	System.out.println("player 4 won and score is " + p4_score);
    	
    	
        }
   
	    
	}

  }
}
