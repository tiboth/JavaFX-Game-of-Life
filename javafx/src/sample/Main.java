package sample;

import entity.Cell;
import entity.Table;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * clasa Main porneste jocul si initializeaza tabla
 */
public class Main extends Application{

    private Stage primaryStage;
    public static Table table;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Game of Life");

        table = initLayout();
    }

    /**
     * funtia initializeaza array-ul si apeleaza scena folosind un fisier fxml
     * @return returneaza arrayul initializat
     * @throws IOException
     */
    private Table initLayout() throws IOException{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ui.fxml"));
            AnchorPane rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            primaryStage.show();

            Table table = new Table();
            GridPane grid = (GridPane) scene.lookup("#grid");
            for (int row = 0; row < 20; row++) {
                for (int col = 0; col < 20; col++) {
                    Rectangle rec = new Rectangle();
                    rec.setWidth(23);
                    rec.setHeight(23);
                    rec.setFill(Color.GREEN);

                    Cell c = new Cell(row,col, false, rec);
                    table.getTable()[row][col] = c;

                    rec.setOnMouseClicked(e -> {
                        c.changeState();
                        c.updateState();
                        rec.setFill(c.isAlive() ? Color.GREY : Color.GREEN);
                    });
                    grid.add(rec, col, row);
                }
            }
            return table;

    }



    public static void main(String[] args) {
        launch(args);
    }
}
