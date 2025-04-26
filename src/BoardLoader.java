


/*This class loads the file that is representing the Board and turn into actual board*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;



public class BoardLoader {

    //this method load the get the filename to load from and initializes the file using
    // the methods below
    public static void loadBoardState(Board theBoard, String fileName) throws FileNotFoundException {

        loadPiecesFromString(theBoard,parseFile(fileName));

    }

    /*this method load the given file and returns the contents as a 2D array
    * where each row represents one line in the file and each column contains one
    * single token.It reads the file and then splits the provided character. Then
    * it enters each characters to the 2D array*/
    private static String[][] parseFile(String fileName) throws FileNotFoundException {

        String[][] boardData = new String[Board.BOARD_SIZE][Board.BOARD_SIZE];
        File Object = new File(fileName);

        Scanner myFile = new Scanner(Object);//Scanner used to read the file
        String  data = myFile.nextLine();


        int count  ;
        int length ;
        String gettoken;
        System.out.println(fileName.length());



        for (int row = boardData.length -1; row >-1; row--){

            count = 0 ;
            data = myFile.nextLine();
            length = data.length();

                for (int col = 0; col < boardData.length; col++) {
                    System.out.println(data);

                    while ((count < length) && (Character.isWhitespace(data.charAt(count)))) {
                        count++;
                    }

                    gettoken = "";
                    while ((count < length) && (!Character.isWhitespace(data.charAt(count)))) {
                        gettoken += data.charAt(count);
                        count++;
                    }

                    if (!((count >= length) && (gettoken.equals("")))) {
                        boardData[row][col] = gettoken;
                        System.out.println(row + " " + col + " " + boardData[row][col]);

                    }
                }
        }

            return boardData;
    }



    // this method takes the board codes from the 2D array and loads all the pieces in the board
    private static void loadPiecesFromString(Board targetBoard, String[][] boardCodes){
        for (int row = 0; row < boardCodes.length; row++){
            for (int col = 0; col < boardCodes.length; col++) {
                targetBoard.setPiece(row,col,loadChessPiece(targetBoard,boardCodes[row][col]));
            }
        }
    }



    //this method load the pieces according to the given board code
    private static ChessPiece loadChessPiece(Board targetBoard, String code){
        ChessPiece loadPiece = null;
        //black pieces
        if(code.equals("BC")){
            loadPiece = new Castle(Board.black, targetBoard);
        }
        else if (code.equals("BN")){
            loadPiece = new Knight(Board.black, targetBoard);
        }
        else if (code.equals("BB")){
            loadPiece = new Bishop(Board.black, targetBoard);
        }
        else if (code.equals("BK")){
            loadPiece = new King(Board.black, targetBoard);
        }
        else if (code.equals("BQ")){
            loadPiece =new Queen(Board.black, targetBoard);
        }
        else if (code.equals("BP")){
            loadPiece =new Pawn(Board.black, targetBoard);
        }

        //empty pieces
//        else if (code.equals("E")){
//            loadPiece =null;
//        }

        //White pieces
        else if (code.equals("WP")){
            loadPiece =new Pawn(Board.white, targetBoard);
        }
        else if (code.equals("WC")){
            loadPiece =new Castle(Board.white, targetBoard);
        }
        else if (code.equals("WN")){
            loadPiece =new Knight(Board.white, targetBoard);
        }
        else if (code.equals("WB")){
            loadPiece =new Bishop(Board.white, targetBoard);
        }
        else if (code.equals("WQ")){
            loadPiece =new Queen(Board.white, targetBoard);
        }
        else if (code.equals("WK")){
            loadPiece =new King(Board.white, targetBoard);
        }
       return loadPiece;
    }



}


