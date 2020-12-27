package Section10.GenericChallenge;


public class Main {
    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> a = new Team<>("a");
        Team<FootballPlayer> b = new Team<>("b");

        BaseballPlayer pat = new BaseballPlayer("Pat");

        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(pat); //unchecked warning,Team type undefine

        footballLeague.add(rawTeam);//unchecked warning,Team type undefine

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(a); //no warning
        rawLeague.add(b);//no warning
        rawLeague.add(rawTeam);//no warning, but different team mixed up

        League reallyRaw = new League("Really Raw");
        reallyRaw.add(a);//unchecked warning,league type undefine
        reallyRaw.add(b);//unchecked warning,league type undefine
        reallyRaw.add(rawTeam);//unchecked warning,league type undefine
    }
}


