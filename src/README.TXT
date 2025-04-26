------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------



Outstanding Issues: The Bishop, Queen and the Castle jump over the pieces in front of them.
	I tried several ways to fix the bugs but those methods did not work


PURPOSE OF PROJECT: I will be upgrading the previous assignment(Checkers) into a Chess game. I will be working with Multi Dimensional
	arrays  and StdDraw(Graphics). I was provided with a GameController.java which handles the game logic and input, a 
	Board.java which holds the pieces and also a TestClass.java to help me test as I moved along.

 
VERSION or DATE: 15 Nov 2020


HOW TO START THIS PROJECT: To start the project, the Bishop.java,Board.java,Castle.java,ChessPiece.java,GameController.java,
	King.java,Knight.java,Pawn.java,Queen.java,StdDraw.java , TestClass.java,StandardBoard.txt and the Piecesfolder must be in the same folder.
	Then right click on StandardBoard.txt and go to Properties. In Properties, in General tab, copy the Loaction. Then
	open the GameController.java. There in Line 21, BoardLoader.loadBoardState(board, ""), paste the location in the quotation
	and in the end of the location type "\\StandardBoard.txt".
	For Example: BoardLoader.loadBoardState(board, "E:\\Materials\\UTP 2\\COM 1020\\Java\\A3\\Assignment 3\\src\\StandardBoard.txt");
	Then Run the GameController.java file



AUTHORS: OVI PODDER


# Chess Game

A Java-based chess game implementation with a graphical user interface.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Windows, macOS, or Linux operating system

## Project Structure

```
chess-game/
├── src/
│   ├── Pieces/           # Chess piece implementations
│   ├── GameController.java
│   ├── Board.java
│   ├── BoardLoader.java
│   ├── StdDraw.java
│   ├── StandardBoard.txt
│   ├── EmptyBoard.txt
│   └── Various chess piece classes (.java files)
```

## How to Run the Game

1. Open a terminal/command prompt
2. Navigate to the project root directory:
   ```
   cd path/to/chess-game
   ```
3. Compile the Java files (if not already compiled):
   ```
   javac src/*.java
   ```
4. Run the game using:
   ```
   java -cp src GameController
   ```

## Game Controls

- Click on a piece to select it
- Click on a valid destination square to move the selected piece
- The game follows standard chess rules
- White pieces start at the bottom
- Black pieces start at the top

## Piece Notation

- P: Pawn
- C: Castle/Rook
- N: Knight
- B: Bishop
- Q: Queen
- K: King

Prefixes:
- W: White pieces
- B: Black pieces

## Troubleshooting

If you encounter any issues:

1. Make sure Java is properly installed:
   ```
   java --version
   ```
2. Verify you're in the correct directory
3. Ensure all source files are present in the src directory
4. Check that StandardBoard.txt exists in the src directory

## Additional Files

- `StandardBoard.txt`: Contains the initial board setup
- `EmptyBoard.txt`: Contains an empty board template
- `README.TXT`: Contains additional project information 
