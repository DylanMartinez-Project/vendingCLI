package encapsulationreview;

public class SoccerPlayer {

    private String name;
    private String position;
    private int goalsScored;
    private int assists;
    private int jerseyNumber;
    private int averageHearRate;

    public void testThis(String position) {

        // the local variable:
        System.out.println(position);

        // the instance variable:
        System.out.println(this.position);

    }



    public void setAverageHearRate(int averageHearRate) {
        this.averageHearRate = averageHearRate;
    }

    // if the heart rate is greater than 150, return the string "Stressed"
    // otherwise return the string "Normal"

    public String checkStressLevel() {

        if (this.averageHearRate > 150) {
            return "Stressed";
        } else {
            return "Normal";
        }
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }

    public SoccerPlayer(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

}
