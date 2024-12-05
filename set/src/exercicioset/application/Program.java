package exercicioset.application;

import exercicioset.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file pull path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] split = line.split(" ");
                String username = split[0];
                String rawMoment = split[1];
                String formattedMoment = rawMoment.substring(0, 10) + "T" + rawMoment.substring(11, 13) + ":" + rawMoment.substring(13, 15) + ":" + rawMoment.substring(15);
                Date moment = Date.from(Instant.parse(formattedMoment));

                set.add(new LogEntry(username, moment));
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        }
        catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        sc.close();
    }
}
