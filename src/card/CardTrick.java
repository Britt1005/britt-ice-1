/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package card;
import java.util.*;
/**
@author rathorbr
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card A = new Card();
           
          A.setValue((int)(Math.random() * 13 + 1));
           
          A.setSuit(Card.SUITS[(int)(Math.random() *3+0)]);
        
            magicHand[i]=A;
        }

        Scanner br=  new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 13");
        int entered_num = br.nextInt();
        while(entered_num <1 || entered_num>13){
                    System.out.println("Wrong Input, Please enter a number from 1 to 13");
                    entered_num = br.nextInt();
        }

        System.out.println("Please enter the suit from Clubs, Spades, Diamonds, Hearts");
        String str = br.next();
        
        while( str.equals("Hearts")==false && str.equals("Clubs")==false && str.equals("Spades")==false && str.equals("Diamonds")==false ){
            System.out.println("Wrong Input, Please enter a correct Suit");
                    str = br.next();
        }
        
       int ans = 0;

       System.out.println("The Values set by System are as follows : \n");
for(int i = 0;i<magicHand.length; i++){
    System.out.println("Value = "+magicHand[i].getValue()+"\tSuit = "+magicHand[i].getSuit() );
}
    
    System.out.println("\n\nYour Selections are Value: "+entered_num + "\tSuit = "+str+"\n");
     
        for(int i=0; i<magicHand.length;i++)
        {
            if((magicHand[i].getValue()==entered_num) && (magicHand[i].getSuit().equals(str))){
                ans = 1;
                break;
            }      
        }
        
       if(ans==1) System.out.println("Oh yeah, You Won\n ");
       else System.out.println("Oops No Match, Try again\n");
        br.close();
        
       Card A = new Card();
        A.setValue(7);
        A.setSuit("Hearts");
        int ans2=0;
          for(int i=0; i<magicHand.length;i++)
        {
            if((magicHand[i].getValue()==A.getValue()) && (magicHand[i].getSuit().equals(A.getSuit()))){
                ans2 = 1;
                break;
            }      
        }
        
        System.out.println("Lucky Card:\n\t Value = "+ A.getValue() + "\n\tSuit = "+ A.getSuit()+"\n");
        System.out.print("Did the Lucky Card Match : \t");
        if(ans2==1) System.out.println("Yes\n");
        else System.out.println("No\n");  
    }   
}
