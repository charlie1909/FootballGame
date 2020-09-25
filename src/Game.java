import java.util.Scanner;

public class Game {

    private String team1Name;
    private int team1Goals;
    private String team2Name;
    private int team2Goals;
    private Scanner scanner = new Scanner(System.in);

    public Game(String team1Name, int team1Goals, String team2Name, int team2Goals){
        this.team1Name = team1Name;
        this.team1Goals = team1Goals;
        this.team2Name = team2Name;
        this.team2Goals = team2Goals;
    }

    public Game(){

    }

    public String getTeam1Name() {
        return team1Name;
    }

    public int getTeam1Goals() {
        return team1Goals;
    }

    public int getTeam2Goals() {
        return team2Goals;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam1Name(){
        System.out.println("Please enter team 1 Name");
        team1Name = scanner.next();
    }

    public void setTeam1Goals() {
        System.out.println("Please enter team 1 goals");
        team1Goals = scanner.nextInt();
    }

    public void setTeam2Name(){
        System.out.println("Please enter team 2 Name");
        team2Name = scanner.next();
    }

    public void setTeam2goals() {
        System.out.println("Please enter team 2 goals");
        team2Goals = scanner.nextInt();
    }

    public void calculateWinningTeam(Game game){
        String winner;
        if(game.getTeam1Goals()> game.getTeam2Goals()){
            winner = game.getTeam1Name();
        }else if (game.getTeam1Goals()< game.getTeam2Goals()){
            winner = game.getTeam2Name();
        }else{
            winner = "Both Teams! Its a draw!";
        }
        System.out.println("The winning team is "+ winner);

    }
}
