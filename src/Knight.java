
/*This is a sub class of ChessPiece. It contains Two constructors. Both of the
 * constructors are using the constructor from ChessPiece.*/





public class Knight extends ChessPiece {
    private static String tileName = "Knight";//sets the name of the piece


    //this is a constructor that accept a String and a Board type parameter.
    //It uses the constructor of the ChessPiece
    public Knight(String newColor, Board theBoard){
        super(Knight.tileName, newColor, theBoard);
    }

    //this is a constructor that accept 2 String and a Board type parameter.
    //It uses the constructor of the ChessPiece
    public Knight(String name, String newColor, Board theBoard){
        super(name, newColor, theBoard);
    }


    /*THis method verifies the move for this piece(Knight).In this method, it gives true if
     * the move is horizontal 2 spaces and vertical 1 space or horizontal 1 space and
     * vertical 2 spaces and it can jump over other pieces*/
    public boolean isValidMove( int currentRow, int currentCol, int futureRow, int futureCol ){
        boolean isValid = false;


        /////////////////////////black Pieces ////////////////

        /*This checks if the selected piece is Black. If the color is black then it set the
         * valid futureRow and futureCol*/
        if(getColor().equals("BLACK")){

            //Empty future tiles
            //for vertical 2 space and horizontal 1 space
            if(futureRow == currentRow +2 && futureCol==currentCol+1&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow+2 && futureCol==currentCol-1 &&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow-2&&futureCol==currentCol-1&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow-2&&futureCol==currentCol+1&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }

            //Empty future tiles
            //for vertical 1 space and horizontal 2 space
            else if(futureRow == currentRow +1&&futureCol==currentCol+2&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow +1&&futureCol==currentCol-2&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow -1&&futureCol==currentCol-2&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow -1&&futureCol==currentCol+2&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }

/////////////////// Future tile with opposite color ////////////////////////////////////
            else if(futureRow == currentRow +2 && futureCol==currentCol+1&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white)){
                isValid = true;
            }
            else if(futureRow == currentRow+2&&futureCol==currentCol-1&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white)){
                isValid = true;
            }
            else if(futureRow == currentRow-2&&futureCol==currentCol-1&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white)){
                isValid = true;
            }
            else if(futureRow == currentRow-2&&futureCol==currentCol+1&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white)){
                isValid = true;
            }

            //future tiles with opposite color
            //for vertical 1 space and horizontal 2 space
            else if(futureRow == currentRow +1&&futureCol==currentCol+2&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white)){
                isValid = true;
            }
            else if(futureRow == currentRow +1&&futureCol==currentCol-2&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white)){
                isValid = true;
            }
            else if(futureRow == currentRow -1&&futureCol==currentCol-2&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white)){
                isValid = true;
            }
            else if(futureRow == currentRow -1&&futureCol==currentCol+2&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.white)){
                isValid = true;
            }

        }





        ////////////////////////White Pieces/////////////////////////

        /*This checks if the selected piece is White. If the color is White then it set the
         * valid futureRow and futureCol*/
        if(getColor().equals("WHITE")){

            //Empty future tiles
            //for vertical 2 space and horizontal 1 space
            if(futureRow == currentRow +2 && futureCol==currentCol+1&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow+2&&futureCol==currentCol-1&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow-2&&futureCol==currentCol-1&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow-2&&futureCol==currentCol+1&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }

            //Empty future tiles
            //for vertical 1 space and horizontal 2 space
            else if(futureRow == currentRow +1&&futureCol==currentCol+2&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow +1&&futureCol==currentCol-2&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow -1&&futureCol==currentCol-2&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }
            else if(futureRow == currentRow -1&&futureCol==currentCol+2&&
                    getBoard().getPiece(futureRow,futureCol)==null){
                isValid = true;
            }

            // Future tile with opposite color
            //for vertical 2 space and horizontal 1 space
            else if(futureRow == currentRow +2 && futureCol==currentCol+1&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black)){
                isValid = true;
            }
            else if(futureRow == currentRow+2&&futureCol==currentCol-1&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black)){
                isValid = true;
            }
            else if(futureRow == currentRow-2&&futureCol==currentCol-1&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black)){
                isValid = true;
            }
            else if(futureRow == currentRow-2&&futureCol==currentCol+1&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black)){
                isValid = true;
            }

            //future tiles with opposite color
            //for vertical 1 space and horizontal 2 space
            else if(futureRow == currentRow +1&&futureCol==currentCol+2&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black)){
                isValid = true;
            }
            else if(futureRow == currentRow +1&&futureCol==currentCol-2&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black)){
                isValid = true;
            }
            else if(futureRow == currentRow -1&&futureCol==currentCol-2&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black)){
                isValid = true;
            }
            else if(futureRow == currentRow -1&&futureCol==currentCol+2&&
                    getBoard().getPiece(futureRow,futureCol).getColor().equals(Board.black)){
                isValid = true;
            }
        }

        return isValid;
    }
}
