package myjavaprojects;
import java .util.*;
public class Tic_Tac_toe
{
	public static void main(String[] args)
	{
	String user;
	char symbol=' ';
	char gameboard[][]= { {' ','|',' ','|',' '},
			              {'-','+','-','+','-'},
			              {' ','|',' ','|',' '},
			              {'-','+','-','+','-'},
			              {' ','|',' ','|',' '}};
	
	Scanner sc=new Scanner(System.in);
	
           while(true)
	       {
		
	System.out.println("Enter your choice player 1 from 1 to 9:");
	final int pos1=sc.nextInt();
	getchoice(gameboard,pos1,"player 1",symbol);
	print_gameboard(gameboard);
	System.out.println();
	Random rand=new Random();
	final int poscpu=rand.nextInt(9)+1;
	getchoice(gameboard,poscpu,"cpu",symbol);
	print_gameboard(gameboard);
	System.out.println();
	}
	
//	else 
//	{ 
//		 while(true)
//		 { 
//			 System.out.println("Enter your choice player 1 from 1 to 9:");
//				final int pos1=sc.nextInt();
//				getchoice(gameboard,pos1,"player 1",symbol);
//				print_gameboard(gameboard);
//				System.out.println();
//		System.out.println("Enter your choice player 2 from 1 to 9:");
//		final int pos2=sc.nextInt();
//		getchoice(gameboard,pos2,"player 2",symbol);
//		print_gameboard(gameboard);
//		System.out.println();
//		 }
//	}
//		
		
	}
	
	public static void print_gameboard(char gameboard[][])
	{
		for(char row[]:gameboard)
		{
			for(char c:row)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void getchoice(char gameboard[][],int pos,String user,char symbol) 
	{
		if(user.equals("player 1"))
			symbol='X';
		else if(user.equals("cpu")||user.equals("player 2"))
             symbol='O';		
		switch(pos)
		{
		case 1: gameboard[0][0]=symbol;
		         break;
		case 2: gameboard[0][2]=symbol;
        break;
        case 3: gameboard[0][4]=symbol;
        break;
        case 4: gameboard[2][0]=symbol;
        break;
        case 5: gameboard[2][2]=symbol;
        break;
        case 6: gameboard[2][4]=symbol;
        break;
        case 7: gameboard[4][0]=symbol;
        break;
        case 8: gameboard[4][2]=symbol;
        break;
        case 9: gameboard[4][4]=symbol;
        break;
        default:System.out.println( "Enter a correct position");
        break;
		}
		
		
	}
	
		
		 
		
}


