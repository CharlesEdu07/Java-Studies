package br.com.charlesedu.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import br.com.charlesedu.entities.Candidate;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Candidate, Integer> votes = new HashMap<>();

        String path = System.getProperty("user.dir") + "\\src\\br\\com\\charlesedu\\files\\votes.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                Candidate candidate = new Candidate(fields[0]);
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(candidate)) {
                    int currentVotes = votes.get(candidate);
                    votes.put(candidate, count + currentVotes);
                } else {
                    votes.put(candidate, count);
                }

                line = br.readLine();
            }

            for (Candidate key : votes.keySet()) {
                System.out.println(key.getName() + ": " + votes.get(key));
            }
        }
    }
}
