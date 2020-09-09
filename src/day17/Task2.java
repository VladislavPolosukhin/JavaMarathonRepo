package day17;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {

        String[][] chessPieces = new String[8][8];
        ChessPiece[][] chessPiecesReal = new ChessPiece[8][8];

        String s = "♜____♜♚_" +
                "_♖__♟♟_♟" +
                "♟_♞___♟_" +
                "♛__♗____" +
                "___♝♙___" +
                "____♗♙__" +
                "♙__♕_♙_♙" +
                "_____♖♔_";

        int count = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessPieces[i][j] = String.valueOf(chars[count]);
                count++;
            }

        }


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                switch (chessPieces[i][j]) {
                    case "♙":
                        chessPiecesReal[i][j] = ChessPiece.PAWN_WHITE;
                        break;

                    case "♟":
                        chessPiecesReal[i][j] = ChessPiece.PAWN_BLACK;
                        break;

                    case "♘":
                        chessPiecesReal[i][j] = ChessPiece.KNIGHT_WHITE;
                        break;

                    case "♞":
                        chessPiecesReal[i][j] = ChessPiece.KNIGHT_BLACK;
                        break;

                    case "♗":
                        chessPiecesReal[i][j] = ChessPiece.BISHOP_WHITE;
                        break;

                    case "♝":
                        chessPiecesReal[i][j] = ChessPiece.BISHOP_BLACK;
                        break;


                    case "♖":
                        chessPiecesReal[i][j] = ChessPiece.ROOK_WHITE;
                        break;

                    case "♜":
                        chessPiecesReal[i][j] = ChessPiece.ROOK_BLACK;
                        break;

                    case "♕":
                        chessPiecesReal[i][j] = ChessPiece.QUEEN_WHITE;
                        break;

                    case "♛":
                        chessPiecesReal[i][j] = ChessPiece.QUEEN_BLACK;
                        break;

                    case "♔":
                        chessPiecesReal[i][j] = ChessPiece.KING_WHITE;
                        break;

                    case "♚":
                        chessPiecesReal[i][j] = ChessPiece.KING_BLACK;
                        break;

                    case "_":
                        chessPiecesReal[i][j] = ChessPiece.EMPTY;
                        break;

                    default:
                        break;

                }
            }

        }

        ChessBoard chessBoard = new ChessBoard(chessPiecesReal);
        chessBoard.print();

    }
}
