package br.com.charlesedu.app;

import java.text.SimpleDateFormat;
import java.util.Locale;

import br.com.charlesedu.entities.Comment;
import br.com.charlesedu.entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
                "I'm going to visit this wonderful country!", 12);

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        
        p1.addComment(c1);
        p1.addComment(c2);

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1.getTitle());
        System.out.println(p1.getLikes() + " likes - " + sdf.format(p1.getMoment()));
        System.out.println(p1.getContent());
        System.out.println("Comments:");
        
        for (int i = 0; i < p1.getComments().size(); i++) {
            System.out.println(p1.getComments().get(i).getText());
        }

        System.out.println();

        System.out.println(p2.getTitle());
        System.out.println(p2.getLikes() + " likes - " + sdf.format(p2.getMoment()));
        System.out.println(p2.getContent());
        System.out.println("Comments:");

        for (int i = 0; i < p2.getComments().size(); i++) {
            System.out.println(p2.getComments().get(i).getText());
        }
    }
}
