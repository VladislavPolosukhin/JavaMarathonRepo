package day17;

public class ChessBoard {
    ChessPiece [] [] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }
    
    public void print(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <8 ; j++) {
                System.out.print(chessPieces[i][j]);
            }
            System.out.println();
        }
    }
}
