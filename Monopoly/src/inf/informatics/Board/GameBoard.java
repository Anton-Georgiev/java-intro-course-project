package inf.informatics.Board;
 import java.util.Random;
 import inf.informatics.Players.*;

    public class GameBoard {
        BoardField[] board = new BoardField[20];
        Player[] players;


        public GameBoard(){
            //Generate board
            fieldGenerator();

            //Create two players
            players = new Player[2];
            players[0] = new RealPlayer();
            players[1] = new Bot();
        }

        String fieldTypeNumberToString(int typeNumber){
            switch(typeNumber){
                case 0: return "T";
                case 1: return "I";
                case 2: return "P";
                case 3: return "C";
                case 4: return "ST";
            }
            return "S";
        }

        void fieldGenerator(){
            int[] fieldTypes = new int[5];
            fieldTypes[0] = 7;  //Trap
            fieldTypes[1] = 3;  //Invest
            fieldTypes[2] = 3;  //Party Hard
            fieldTypes[3] = 3;  //Chance
            fieldTypes[4] = 3;  //Steal
            Random rand = new Random();
            for (int i = 1; i < board.length; i++){
                int type;
                do{
                    type = rand.nextInt(5);

                }while (fieldTypes[type] <= 0);

                board[i] = new BoardField(fieldTypeNumberToString(type));
                fieldTypes[type]--;
            }
        }

        int rollDice(int sides){
            Random rand = new Random();
            return rand.nextInt(sides) + 1;
        }

        public void printBoard(){
            //print the upper part
            for (int i = 10; i <= 17; i++){
                System.out.print(String.format("|%s|", board[i].getType()));
            }
            System.out.println();

            //Print second layer
            System.out.print(String.format("|%s|", board[9].getType()));
            for(int i = 0; i < 18; i++){
                System.out.print(" ");
            }

            System.out.println(String.format("|%s|", board[18].getType()));

            //Print second layer
            System.out.print(String.format("|%s|", board[8].getType()));
            for(int i = 0; i < 18; i++){
                System.out.print(" ");
            }

            System.out.println(String.format("|%s|", board[19].getType()));

            //Print fourth layer
            for (int i = 7; i > 0; i--){
                System.out.print(String.format("|%s|", board[i].getType()));
            }
            System.out.println("STR");
        }
    }
}
