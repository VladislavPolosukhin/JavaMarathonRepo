package day17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chessPiece = new ChessPiece[8];

        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                chessPiece[i] = ChessPiece.PAWN_WHITE;
            } else chessPiece[i] = ChessPiece.ROOK_BLACK;
        }
        for (ChessPiece ch : chessPiece){
            System.out.print(ch);
        }

    }
}
