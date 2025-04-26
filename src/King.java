

/*This is a sub class of ChessPiece. It contains Two constructors. Both of the
 * constructors are using the constructor from ChessPiece.*/



public class King extends ChessPiece {
    private static String tileName = "King";//sets the name of the piece


    //this is a constructor that accept a String and a Board type parameter.
    //It uses the constructor of the ChessPiece
    public King(String newColor, Board theBoard) {
        super(King.tileName, newColor, theBoard);
    }


    //this is a constructor that accept 2 String and a Board type parameter.
    //It uses the constructor of the ChessPiece
    public King(String name, String newColor, Board theBoard) {
        super(name, newColor, theBoard);
    }

    /*THis method verifies the move for this piece(Knight).In this method, it gives true if
     * the move is 1 tile to any direction*/
    public boolean isValidMove(int currentRow, int currentCol, int futureRow, int futureCol) {
        boolean isValid = false;


        ///////////////////////black Pieces///////////////////
        if (getColor().equals("BLACK")) {

            //for empty tiles in all direction
            if ((futureRow == currentRow - 1 && futureCol == currentCol && getBoard().getPiece(futureRow, futureCol) == null)
            || (futureRow == currentRow - 1 && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol) == null)
            || (futureRow == currentRow - 1 && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol) == null)
            || (futureRow == currentRow     && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol) == null)
            || (futureRow == currentRow     && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol) == null)
            || (futureRow == currentRow + 1 && futureCol == currentCol     && getBoard().getPiece(futureRow, futureCol) == null)
            || (futureRow == currentRow + 1 && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol) == null)
            || (futureRow == currentRow + 1 && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol) == null)

            ) {
                isValid = true;
            }
            //for tiles with opposite color pieces
            else if ((futureRow == currentRow - 1 && futureCol == currentCol && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white))
                    || (futureRow == currentRow - 1 && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white))
                    || (futureRow == currentRow - 1 && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white))
                    || (futureRow == currentRow     && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white))
                    || (futureRow == currentRow     && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white))
                    || (futureRow == currentRow + 1 && futureCol == currentCol     && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white))
                    || (futureRow == currentRow + 1 && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white))
                    || (futureRow == currentRow + 1 && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white))) {
                isValid = true;

            }
        }

        ////////////////////////White Pieces/////////////////////
        if (getColor().equals("WHITE")) {

            // for empty  tiles
            if ((futureRow == currentRow - 1 && futureCol == currentCol && getBoard().getPiece(futureRow, futureCol) == null)
                    || (futureRow == currentRow - 1 && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol) == null)
                    || (futureRow == currentRow - 1 && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol) == null)
                    || (futureRow == currentRow     && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol) == null)
                    || (futureRow == currentRow     && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol) == null)
                    || (futureRow == currentRow + 1 && futureCol == currentCol     && getBoard().getPiece(futureRow, futureCol) == null)
                    || (futureRow == currentRow + 1 && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol) == null)
                    || (futureRow == currentRow + 1 && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol) == null)) {
                isValid = true;
            }

            //for tiles with opposite color pieces
            else if ((futureRow == currentRow - 1 && futureCol == currentCol && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black))
                    || (futureRow == currentRow - 1 && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black))
                    || (futureRow == currentRow - 1 && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black))
                    || (futureRow == currentRow     && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black))
                    || (futureRow == currentRow     && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black))
                    || (futureRow == currentRow + 1 && futureCol == currentCol     && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black))
                    || (futureRow == currentRow + 1 && futureCol == currentCol - 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black))
                    || (futureRow == currentRow + 1 && futureCol == currentCol + 1 && getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black))) {
                isValid = true;

            }
        }

        return isValid;
    }

}


