
/*This is a sub class of ChessPiece. It contains Two constructors. Both of the
 * constructors are using the constructor from ChessPiece.*/




public class Castle extends ChessPiece {
    private static String tileName = "Castle";//sets the name of the piece


    //this is a constructor that accept a String and a Board type parameter.
    //It uses the constructor of the ChessPiece
    public Castle(String newColor, Board theBoard){
        super(Castle.tileName, newColor, theBoard);
    }


    //this is a constructor that accept 2 String and a Board type parameter.
    //It uses the constructor of the ChessPiece
    public Castle(String name, String newColor, Board theBoard){
        super(name, newColor, theBoard);
    }




    /*THis method verifies the move for this piece(Castle).In this method, it gives true if
    * the move is either horizontal or vertical Direction till as many tiles the user wants but
    * cannot jump over other pieces.*/
    public boolean isValidMove( int currentRow, int currentCol, int futureRow, int futureCol ){
        boolean isValid = false;


        ///////////////////////Black Pieces////////////////////////


        /*This checks if the selected piece is Black. If the color is black then it set the
         * valid futureRow and futureCol*/
        if(getColor().equals("BLACK")){
            // horizontal and vetical direction
            if((futureRow == currentRow || futureCol==currentCol)&&
                    getBoard().getPiece(futureRow,futureCol)==null) {
                isValid = true;
            }
            // horizontal and vertical direction with opposite pieces
            else if(((futureRow == currentRow || futureCol==currentCol )&& getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white))
            ){
                isValid = true;

            }
        }



        /////////////////////////White Pieces/////////////////////////

        /*This checks if the selected piece is White. If the color is White then it set the
         * valid futureRow and futureCol*/
        if (getColor().equals("WHITE")) {

            // horizontal and vertical direction
            if((futureRow == currentRow || futureCol==currentCol)&&
                    getBoard().getPiece(futureRow,futureCol)==null) {
                isValid = true;
            }

            // horizontal and vertical direction with opposite pieces
            else if(((futureRow == currentRow || futureCol==currentCol )&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black))
            ){
                isValid = true;

            }

        }

        return isValid;
    }
}
