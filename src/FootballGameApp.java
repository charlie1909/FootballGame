public class FootballGameApp {

    public static void main (String [] args){
        Game game = new Game("Juniors", 5, "Minis", 4);
        game.calculateWinningTeam(game);

        Game game2 = new Game();
        game2.setTeam1Name();
        game2.setTeam1Goals();
        game2.setTeam2Name();
        game2.setTeam2goals();


        game2.calculateWinningTeam(game2);
    }
}
