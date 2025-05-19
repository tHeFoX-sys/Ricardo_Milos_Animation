import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Pakistanoi extends JFrame {

    private static final int WIDTH = 1200;
    private static final int HEIGHT = 650;
    public JLabel background;
    public ImageIcon myIcon = new ImageIcon("Background\\Ricardo.GIF");


    Pakistanoi(){

        background = new JLabel(myIcon);
        background.setSize(new Dimension(WIDTH,HEIGHT));


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("PAKISTANOI");
        this.setSize(new Dimension(WIDTH,HEIGHT));
        this.add(background);
        this.setVisible(true);

    }


    private void loadAudio(String filePath) {
        try {
            File audioFile = new File("Sound\\Dota_Song.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

}
