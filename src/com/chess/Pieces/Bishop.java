package com.chess.Pieces;

import com.chess.Game.Board;
import com.chess.Game.Spot;

import java.util.ArrayList;

public class Bishop extends Piece {

    ArrayList<Spot> moves = new ArrayList<>();

    public Bishop(int color) {
        super(color);
        super.BlackPath ="src/com/chess/Pieces/png/bishop.png";
        super.WhitePath ="src/com/chess/Pieces/png/bishopw.png";
        super.PieceName = "Bishop";
    }

    //ID = xLoc , yLoc
    public Bishop(int x, int y, int color) {
        super(x, y, color);
        super.BlackPath ="src/com/chess/Pieces/png/bishop.png";
        super.WhitePath ="src/com/chess/Pieces/png/bishopw.png";
        super.PieceName = "Bishop";
    }
    /* bishop moving diagonal fa el X wel Y byzedu we y2lu be nfs el 3dd
            ex:
            (0,0),(1,1),....,(7,7)
            (0,1)....(2,3),(3,4),(4,5),(5,6),(6,7)
            (newX,newy)....,(newX+2,newY+2),... we hazka
             */
    @Override
    public ArrayList<Spot> possibleMoves(Board board) {
        moves.clear();

        int[] X = {1, 2, 3, 4, 5, 6, 7,8};
        //up-Right
        for(int i = 0 ; i < 8 ; i++)
        {
            int newX = getX()+X[i];
            int newY = getY()+X[i];
            if(board.isValidPosition(newX, newY)){
                Spot spot = board.getSpot(newX, newY);

                if(spot.getPiece()!= null){
                    if(spot.getPiece().getColor()!= this.getColor()){
                        moves.add(board.getSpot(newX, newY));
                        break;
                    }
                    if(spot.getPiece().getColor()== this.getColor()){
                        break;
                    }
                }
                // check if spot is valid and empty OR contains a piece of the opposite color
                if(board.isValidPosition(newX, newY) && spot.getPiece()== null )
                {
                    moves.add(board.getSpot(newX, newY));
                }
            }
        }

        //down_Left
        for(int i = 0 ; i < 8 ; i++)
        {
            int newX = getX()-X[i];
            int newY = getY()-X[i];

            if(board.isValidPosition(newX, newY)){
                Spot spot = board.getSpot(newX, newY);

                if(spot.getPiece()!= null){
                    if(spot.getPiece().getColor()!= this.getColor()){
                        moves.add(board.getSpot(newX, newY));
                        break;
                    }
                    if(spot.getPiece().getColor()== this.getColor()){
                        break;
                    }
                }

                if(board.isValidPosition(newX, newY) && spot.getPiece()== null )
                {
                    moves.add(board.getSpot(newX, newY));
                }
            }}
        //up_Left
        for(int i = 0 ; i < 8 ; i++)
        {
            int newX = getX()-X[i];
            int newY = getY()+X[i];
            if(board.isValidPosition(newX, newY)){
                Spot spot = board.getSpot(newX, newY);

                if(spot.getPiece()!= null){
                    if(spot.getPiece().getColor()!= this.getColor()){
                        moves.add(board.getSpot(newX, newY));
                        break;
                    }
                    if(spot.getPiece().getColor()== this.getColor()){
                        break;
                    }
                }

                if(board.isValidPosition(newX, newY) && spot.getPiece()== null )
                {
                    moves.add(board.getSpot(newX, newY));
                }
            }}

        //down_right
        for(int i = 0 ; i < 8 ; i++)
        {
            int newX = getX()+X[i];
            int newY = getY()-X[i];
            if(board.isValidPosition(newX, newY)){
                Spot spot = board.getSpot(newX, newY);

                if(spot.getPiece()!= null){
                    if(spot.getPiece().getColor()!= this.getColor()){
                        moves.add(board.getSpot(newX, newY));
                        break;
                    }
                    if(spot.getPiece().getColor()== this.getColor()){
                        break;
                    }
                }

                if(board.isValidPosition(newX, newY) && spot.getPiece()== null )
                {
                    moves.add(board.getSpot(newX, newY));
                }
            }}
        return moves;
    }


}