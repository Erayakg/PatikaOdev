import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {
    private List<String> teams;
    private List<String> fixtures;
    
    public FixtureGenerator(List<String> teams) {
        this.teams = teams;
        this.fixtures = new ArrayList<>();
    }
    
    public List<String> generateFixtures() {
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }
        
        int numWeeks = teams.size() - 1;
        int halfSize = teams.size() / 2;
        
        List<String> teamList = new ArrayList<>(teams);
        teamList.remove(0);
        
        for (int week = 0; week < numWeeks; week++) {
            Collections.shuffle(teamList);
            
            List<String> weekFixtures = new ArrayList<>();
            
            int teamIdx = week % halfSize;
            String homeTeam = teams.get(teamIdx);
            
            for (int idx = 0; idx < halfSize; idx++) {
                String awayTeam = teamList.get(idx);
                
                if (!awayTeam.equals("Bay")) {
                    String fixture = homeTeam + " vs " + awayTeam;
                    weekFixtures.add(fixture);
                }
            }
            
            fixtures.addAll(weekFixtures);
            Collections.reverse(teamList);
        }
        
        return fixtures;
    }
}
