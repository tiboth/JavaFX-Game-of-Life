package entity;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * clasa Cell pentru patratelele din panelul de 20x20
 */
public class Cell extends Pane{
    private int xindex;
    private int yindex;
    private boolean state;
    private boolean newState;
    private Rectangle rec;

    public Cell(int xindex, int yindex, boolean state, Rectangle rec) {
        this.xindex = xindex;
        this.yindex = yindex;
        this.state = state;
        this.rec = rec;
    }


    boolean getState() {
        return state;
    }

    public void setNewState(boolean state) {
        newState = state;
    }

    public void updateState() {
        state = newState;
        rec.setFill(this.isAlive() ? Color.GREY : Color.GREEN);
    }

    /**
     * schimba starea Cell-ului
     */
    public void changeState() {
        if (state)
            setNewState(false);
        else
            setNewState(true);
    }

    public boolean isAlive() {
        return (getState());
    }
}
