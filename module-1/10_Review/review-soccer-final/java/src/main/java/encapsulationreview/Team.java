package encapsulationreview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {

    public static void main(String[] args) {

//        SoccerPlayer player1 = new SoccerPlayer("Messi", "FWD", 11 );
//        System.out.println(player1.getPosition());
//
//        player1.setPosition("MID");
//
//        System.out.println(player1.getPosition());
//
//        player1.setAverageHearRate(160);
//        System.out.println(player1.checkStressLevel());
//
//        player1.testThis("POTATO");

        boolean programLoop = true;
        Scanner scanner = new Scanner(System.in);
        List<SoccerPlayer> roster = new ArrayList<SoccerPlayer>();

        do {

            System.out.println("Enter the name:");
            String name = scanner.nextLine();

            System.out.println("Enter the position:");
            String position = scanner.nextLine();

            System.out.println("Enter the number:");
            String numberString = scanner.nextLine();
            int numberInt = Integer.parseInt(numberString);

            SoccerPlayer player = new SoccerPlayer(name, position, numberInt);
            roster.add(player);
            System.out.println("Entered " + player.getName());

            System.out.println("Press Q to quit, press any key to continue");
            String continueLoop = scanner.nextLine();

            if (continueLoop.equals("Q")) {
                programLoop = false;
            }

        } while(programLoop);

        for(SoccerPlayer player : roster) {
//            System.out.println(player.getName() + " " + player.getPosition() + " " + player.getJerseyNumber());
            System.out.println(player);
        }

    }
}
