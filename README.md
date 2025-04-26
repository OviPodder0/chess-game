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