import java.util.ArrayList;

/*This is a sub class of ChessPiece. It contains Two constructors. Both of the
* constructors are using the constructor from ChessPiece.*/


public class Pawn extends ChessPiece {

    
    private static String tileName = "Pawn";//sets the name of the piece

    //this is a constructor that accept a String and a Board type parameter.
    //It uses the constructor of the ChessPiece
    public Pawn(String newColor, Board theBoard){
        super(Pawn.tileName, newColor, theBoard);
    }
    //this is a constructor that accept 2 String and a Board type parameter
    //It uses the constructor of the ChessPiece
    public Pawn(String name, String newColor, Board theBoard){
        super(name, newColor, theBoard);
    }



    /*This method verify the move of this Piece(Pawn).In this method, it gives true if it moves
    * one tile forward toward the opponent and one tile diagonally forward toward the opponent
    * if there is a piece of he opposite color and captures the piece.*/
    public boolean isValidMove( int currentRow, int currentCol, int futureRow, int futureCol ){
        boolean isValid = false;


        //////////////////Black Pieces///////////////////////////

        /*This checks if the selected piece is Black. If the color is black then it set the
        * valid futureRow and futureCol*/
        if(getColor().equals("BLACK")){
            //one tile forward
            if(futureRow == currentRow - 1 && futureCol==currentCol &&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }

            // diagonal move to right
            else if (futureRow == currentRow-1 && futureCol == currentCol + 1
                    && getBoard().getPieceColor(futureRow,futureCol).equals(Board.white)){
                isValid = true;
            }
            // diagonal move to left
            else if (futureRow == currentRow-1 && futureCol == currentCol -1
                    && getBoard().getPieceColor(futureRow,futureCol).equals(Board.white)){
                isValid = true;
            }

        }
        ////////////////////White Pieces/////////////////////////////

        /*This checks if the selected piece is White. If the color is White then it set the
         * valid futureRow and futureCol*/
        if(getColor().equals("WHITE")) {

            //one tile forward
            if (futureRow == currentRow + 1 && futureCol == currentCol &&
                    getBoard().getPiece(futureRow, futureCol) == null) {
                isValid = true;
            }
            // diagonal move to right
            else if (futureRow == currentRow+1 && futureCol == currentCol + 1
                    && getBoard().getPieceColor(futureRow,futureCol).equals(Board.black)){
                isValid = true;
            }
            // diagonal move to left
            else if (futureRow == currentRow+1 && futureCol == currentCol -1
                    && getBoard().getPieceColor(futureRow,futureCol).equals(Board.black)){
                isValid = true;
            }
        }

        return isValid;
    }

}
