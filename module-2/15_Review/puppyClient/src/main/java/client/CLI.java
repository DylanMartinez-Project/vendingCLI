package client;

import org.springframework.web.client.RestTemplate;
import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RestTemplate restTemplate = new RestTemplate();

        boolean stay = true;

        while (stay == true) {
            System.out.println("1.View all puppies\n2.View a puppy\n3.Add a puppy\n4.Quit");
            String option = scanner.nextLine();

            break;

        }

    }
}
