
/*This is a sub class of ChessPiece. It contains Two constructors. Both of the
 * constructors are using the constructor from ChessPiece.*/



public class Queen extends ChessPiece {
    private static String tileName = "Queen";//sets the name of the piece


    //this is a constructor that accept a String and a Board type parameter.
    //It uses the constructor of the ChessPiece
    public Queen(String newColor, Board theBoard){
        super(Queen.tileName, newColor, theBoard);
    }


    //this is a constructor that accept 2 String and a Board type parameter.
    //It uses the constructor of the ChessPiece
    public Queen(String name, String newColor, Board theBoard){
        super(name, newColor, theBoard);
    }



    /*THis method verifies the move for this piece(Queen).In this method, it gives true if
     * the move is either horizontal or vertical Direction or any diagonal direction
     * till as many tiles the user wants but cannot jump over other pieces.*/
    public boolean isValidMove( int currentRow, int currentCol, int futureRow, int futureCol ) {
        boolean isValid = false;

        ///////////////////////////black Pieces//////////////////////

        /*This checks if the selected piece is Black. If the color is black then it set the
         * valid futureRow and futureCol*/
        if (getColor().equals("BLACK")) {
            for (int i = 0; i < Board.BOARD_SIZE; i++) {

                //for empty tiles
                if ((futureRow == currentRow + i && futureCol == currentCol + i) &&
                        getBoard().getPiece(futureRow, futureCol) == null) {
                    isValid = true;
                } else if ((futureRow == currentRow + i && futureCol == currentCol - i) &&
                        getBoard().getPiece(futureRow, futureCol) == null) {
                    isValid = true;

                } else if ((futureRow == currentRow - i && futureCol == currentCol + i) &&
                        getBoard().getPiece(futureRow, futureCol) == null) {
                    isValid = true;

                } else if ((futureRow == currentRow - i && futureCol == currentCol - i) &&
                        getBoard().getPiece(futureRow, futureCol) == null) {
                    isValid = true;

                }
                else if((futureRow == currentRow || futureCol==currentCol)&&
                        getBoard().getPiece(futureRow,futureCol)==null) {
                    isValid = true;

                }

                //for tiles with opposite color
                else if ((futureRow == currentRow + i && futureCol == currentCol + i) &&
                        getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white)) {
                    isValid = true;
                } else if ((futureRow == currentRow + i && futureCol == currentCol - i) &&
                        getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white)) {
                    isValid = true;

                } else if ((futureRow == currentRow - i && futureCol == currentCol + i) &&
                        getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white)) {
                    isValid = true;

                } else if ((futureRow == currentRow - i && futureCol == currentCol - i) &&
                        getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.white)) {
                    isValid = true;

                } else if(((futureRow == currentRow || futureCol==currentCol )&&
                        getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white))){
                    isValid = true;

                }

            }

        }


        ///////////////////////White Pieces///////////////////////

        /*This checks if the selected piece is Black. If the color is black then it set the
         * valid futureRow and futureCol*/
        if (getColor().equals("WHITE")) {

            for (int i = 0; i < Board.BOARD_SIZE; i++) {

                //for empty tiles
                if ((futureRow == currentRow + i && futureCol == currentCol + i) &&
                        getBoard().getPiece(futureRow, futureCol) == null) {
                    isValid = true;
                } else if ((futureRow == currentRow + i && futureCol == currentCol - i) &&
                        getBoard().getPiece(futureRow, futureCol) == null) {
                    isValid = true;

                } else if ((futureRow == currentRow - i && futureCol == currentCol + i) &&
                        getBoard().getPiece(futureRow, futureCol) == null) {
                    isValid = true;

                } else if ((futureRow == currentRow - i && futureCol == currentCol - i) &&
                        getBoard().getPiece(futureRow, futureCol) == null) {
                    isValid = true;

                }else if((futureRow == currentRow || futureCol==currentCol)&&
                        getBoard().getPiece(futureRow,futureCol)==null) {
                    isValid = true;
                }

                // for tiles with opposite color
                else if ((futureRow == currentRow + i && futureCol == currentCol + i) &&
                        getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black)) {
                    isValid = true;
                } else if ((futureRow == currentRow + i && futureCol == currentCol - i) &&
                        getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black)) {
                    isValid = true;

                } else if ((futureRow == currentRow - i && futureCol == currentCol + i) &&
                        getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black)) {
                    isValid = true;

                } else if ((futureRow == currentRow - i && futureCol == currentCol - i) &&
                        getBoard().getPiece(futureRow, futureCol).getColor().equals(Board.black)) {
                    isValid = true;

                } else if(((futureRow == currentRow || futureCol==currentCol )&&
                        getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black))){
                    isValid = true;

                }
            }
        }
        return isValid;

    }
}
