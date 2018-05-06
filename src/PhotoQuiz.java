/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class PhotoQuiz {

    public static void main(String[] args) throws Exception {
        JFrame quizWindow = new JFrame();
        quizWindow.setVisible(true);
        quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

        int score = 0;

        // 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)

        // 2. create a variable of type "Component" that will hold your image
        Component image;

        // 3. use the "createImage()" method below to initialize your Component
        image = createImage("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Half_Dome_from_Glacier_Point%2C_Yosemite_NP_-_Diliff.jpg/1920px-Half_Dome_from_Glacier_Point%2C_Yosemite_NP_-_Diliff.jpg");

        // 4. add the image to the quiz window
        quizWindow.add(image);

        // 5. call the pack() method on the quiz window
        quizWindow.pack();

        // 6. ask a question that relates to the image
        String answer = JOptionPane.showInputDialog("What is this an image of?");

        // 7. print "CORRECT" if the user gave the right answer
        if (answer.equals("half dome")) {
            JOptionPane.showMessageDialog(null, "CORRECT");
            score++;
        }

        // 8. print "INCORRECT" if the answer is wrong
        else {
            JOptionPane.showMessageDialog(null, "INCORRECT");
        }

        // 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(image);

        // 10. find another image and create it (might take more than one line of code)
        Component image2 = createImage("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Map_of_Yosemite_National_Park.svg/746px-Map_of_Yosemite_National_Park.svg.png");

        // 11. add the second image to the quiz window
        quizWindow.add(image2);

        // 12. pack the quiz window
        quizWindow.pack();

        // 13. ask another question
        String answer2 = JOptionPane.showInputDialog("What is this an image of?");

        // 14+ check answer, say if correct or incorrect, etc.
        if (answer2.equals("map")) {
            JOptionPane.showMessageDialog(null, "CORRECT");
            score++;
        } else {
            JOptionPane.showMessageDialog(null, "INCORRECT");
        }

        JOptionPane.showMessageDialog(null, "Your score is: " + score);
    }

    private static Component createImage(String imageUrl) throws MalformedURLException {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        return imageLabel;
    }

    /* OPTIONAL */
    // *14. add scoring to your quiz
    // *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}





