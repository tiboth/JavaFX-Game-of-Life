package controller;

import entity.Table;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import modell.Modell;
import sample.Main;

/**
 * clasa contine toate functiile care se apeleaza cand utilizatorul apasa un buton
 */
public class Controller {
    private Modell modell = new Modell();
    private Timeline timeline;

    public Controller() {
        timeline = new Timeline(
                new KeyFrame(Duration.millis(500),
                        ae -> nextButton()));
        timeline.setCycleCount(Animation.INDEFINITE);
    }

    public void startButton(){

        timeline.play();
    }

    public void stopButton(){

        timeline.stop();
    }

    public void nextButton(){
        Main.table.parseArray();
        Main.table.update();
    }

    public void clearPanel() {
        Table t = Main.table;

        modell.clear(t);

        Main.table.update();
        Main.table.setTable(t.getTable());
    }

    public void autoLayout() {
        Table t = Main.table;
        modell.autoL(t);
        Main.table.update();
        Main.table.setTable(t.getTable());
    }

}
