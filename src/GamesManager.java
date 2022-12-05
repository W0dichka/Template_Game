public class GamesManager {

    public static void main (String [] args){
        final GameCode gameCode = GameCode.CHESS;

        Game game;

        switch (gameCode){
            case CHESS :
                game = new Chess();
                break;
            case MONOPOLY :
                game = new Monopoly();
                break;
            case TIC_TAC_TOE:
                game = new Tic_Tac_Toe();
                break;
            default :
                throw new IllegalStateException();
        }

        game.playOneGame(2);
    }

}
