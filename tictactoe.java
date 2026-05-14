import java.util.*;
class tictactoe
{
    public static void main()
    {
        Scanner in =new Scanner ( System.in);
        String grid[][]=new String[11][11];
        System.out.println("ENTER THE NAME OF THE PLAYERS");
        String name1= in.nextLine();
        String name2=in.nextLine();
        System.out.println("ENTER THE COUNTER ACCEPT OF BOTH PLAYERS");
        String ch1= in.nextLine();
        String ch2= in.nextLine();
        // Grid formation
        for( int i=0;i<11;i++)
        {
            for( int j=0;j<11;j++)
            { 
               if(i==3||i==7)
               grid[i][j]="-";
               else if( j==3||j==7)
               grid[i][j]="|";
               else if( (i==3&&j==3)||(i==7&&j==7)||(i==3&&j==7)||(i==7&&j==3))
               grid[i][j]="-";
               else
               grid[i][j]=" ";
                
            }
        }
        // Printing the grid
        for( int i=0;i<11;i++)
        {
            for( int j=0;j<11;j++)
            { 
                System.out.print(grid[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        // to print the numbers in grid 
        grid[1][1]=Integer.toString(1);
        grid[1][5]=Integer.toString(2);
        grid[1][9]=Integer.toString(3);
        grid[5][1]=Integer.toString(4);
        grid[5][5]=Integer.toString(5);
        grid[5][9]=Integer.toString(6);
        grid[9][1]=Integer.toString(7);
        grid[9][5]=Integer.toString(8);
        grid[9][9]=Integer.toString(9);
        // grid pritning
        for( int i=0;i<11;i++)
        {
            for( int j=0;j<11;j++)
            { 
                System.out.print(grid[i][j]+ "\t");
            }
            System.out.println();
        }
        // the counter varaible decides whose turn it is to play their move
        int count =1;
        // tictactoe can be played only 9 times
        while( count<=9)
        {
             System.out.println("ENTER THE GRID BOX TO BE FILLED");
             int g= in.nextInt();
             // if counter variable is even ,player 1's turn
             if(count%2==0)
             {
               System.out.println("THE GRID BOX NUMBER FOR "+" "+ name1);  
               System.out.println(g);// box number whcihg shall be replaced by their desired character
               switch(g)
               {
                   case 1: grid[1][1]= ch1;
                   break;
                   case 2 : grid[1][5]= ch1;
                   break;
                   case 3: grid[1][9]= ch1;
                   break;
                   case 4 : grid[5][1]= ch1;
                   break;
                   case 5: grid[5][5]= ch1;
                   break;
                   case 6: grid[5][9]= ch1;
                   break;
                   case 7: grid[9][1]= ch1;
                   break;
                   case 8: grid [9][5]= ch1;
                   break;
                   case 9: grid[9][9]= ch1;
                   break;
                   default : System.out.println( "invalid");
               }
               // grid printing each time
               for( int i=0;i<11;i++)
           {
            for( int j=0;j<11;j++)
            { 
                System.out.print(grid[i][j]+ "\t");
            }
            System.out.println();
           }
           // player 1 wins if following conditions are satisfied
            for( int i=0;i<11;i++)
            {
                for( int j=0;j<11;j++)
                {
                    if( (grid[1][1]==grid[1][5]&& grid[1][1]==grid[1][9])||(grid[5][1]==grid[5][5]&& grid[5][1]==grid[5][9])||(grid[9][1]==grid[9][5]&&grid[9][1]==grid[9][9]))// for rows
                    {
                      System.out.println(name1+" "+"WINS!");
                      System.exit(0);
                    }
                    else if( (grid[1][1]==grid[5][1]&& grid[1][1]==grid[9][1])||(grid[1][5]==grid[5][5]&& grid[1][5]==grid[9][5])||(grid[1][9]==grid[5][9]&&grid[1][9]==grid[9][9]))// for columns
                    {
                        System.out.println(name1+" "+"WINS!");
                        System.exit(0);
                        
                    }
                    else if( (grid[1][1]==grid[5][5]&&grid[1][1]==grid[9][9])||(grid[1][9]==grid[5][5]&&grid[1][9]==grid[9][1]))//  for diagonals
                    {
                      System.out.println(name1+" "+"WINS!");
                      System.exit(0);
                    }
                    
                }
            }
             }
             //player 2's turn
             else
             {
                 System.out.println("THE GRID BOX NUMBER FOR"+" "+name2);
                 System.out.println(g);// box number which shall be replaced by their desired character
                 switch(g)
               {
                   case 1: grid[1][1]= ch2;
                   break;
                   case 2 : grid[1][5]= ch2;
                   break;
                   case 3: grid[1][9]= ch2;
                   break;
                   case 4 : grid[5][1]= ch2;
                   break;
                   case 5: grid[5][5]= ch2;
                   break;
                   case 6: grid[5][9]= ch2;
                   break;
                   case 7: grid[9][1]= ch2;
                   break;
                   case 8: grid [9][5]= ch2;
                   break;
                   case 9: grid[9][9]= ch2;
                   break;
                   default : System.out.println( "invalid");
               }
               // grid printing each time
               for( int i=0;i<11;i++)
           {
            for( int j=0;j<11;j++)
            { 
                System.out.print(grid[i][j]+ "\t");
            }
            System.out.println();
           }
           // player 2 wins if the following conditions are satisfied
             for( int i=0;i<11;i++)
            {
                for( int j=0;j<11;j++)
                {
                    if( (grid[1][1]==grid[1][5]&& grid[1][1]==grid[1][9])||(grid[5][1]==grid[5][5]&& grid[5][1]==grid[5][9])||(grid[9][1]==grid[9][5]&&grid[9][1]==grid[9][9]))// for rows
                    {
                      System.out.println(name2+" "+"WINS!");
                      System.exit(0);
                    }
                    else if( (grid[1][1]==grid[5][1]&& grid[1][1]==grid[9][1])||(grid[1][5]==grid[5][5]&& grid[1][5]==grid[9][5])||(grid[1][9]==grid[5][9]&&grid[1][9]==grid[9][9]))// for columns
                    {
                        System.out.println(name2+" "+"WINS!");
                        System.exit(0);
                        
                    }
                    else if( (grid[1][1]==grid[5][5]&&grid[1][1]==grid[9][9])||(grid[1][9]==grid[5][5]&&grid[1][9]==grid[9][1]))//for diagonals
                    {
                      System.out.println(name2+" "+"WINS!");
                      System.exit(0);
                    }
                    
                }
            }
             }
             count++;// incrementing
        }
        // condition = DRAW 
        for( int i=0;i<11;i++)
        {
            for( int j=0;j<11;j++)
            {
                if( ((grid[1][1]!=grid[1][5]&& grid[1][1]!=grid[1][9])||(grid[5][1]!=grid[5][5]&& grid[5][1]!=grid[5][9])||(grid[9][1]!=grid[9][5]&&grid[9][1]!=grid[9][9]))&&(grid[1][1]!=grid[5][1]&& grid[1][1]!=grid[9][1])||(grid[1][5]!=grid[5][5]&& grid[1][5]!=grid[9][5])||(grid[1][9]!=grid[5][9]&&grid[1][9]!=grid[9][9])
                    &&(grid[1][1]!=grid[5][5]&&grid[1][1]!=grid[9][9])||(grid[1][9]!=grid[5][5]&&grid[1][9]!=grid[9][1]))
                    {
                    System.out.println("DRAW");
                    System.exit(0);
                    }
                else
                {
                    System.exit(0);
                }
                
            }
        }
}
}
