import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class JavaFXMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){

        Group root = new Group();
        Scene scene = new Scene(root, 500,550); // Creating scene and appending root into Scene
        primaryStage.setScene(scene); // Setting Scene into Stage

        Rectangle r1 = new Rectangle();
        scene.setFill(Color.BLACK);
        r1.setX(10);
        r1.setY(10);
        r1.setHeight(100);
        r1.setWidth(100);
        r1.setFill(Color.CYAN);
        root.getChildren().add(r1);




        final long startNanoTime = System.nanoTime();

        new AnimationTimer(){
            double speedX = 4;
            double speedY =4;
            @Override
            public void handle(long now) {
                double timer = ( now - startNanoTime)/10000000000.0;
            if (r1.getX()>scene.getWidth()-r1.getWidth()||r1.getX()<0) {
                speedX *= -1;
            }

            if (r1.getY()>scene.getHeight()-r1.getHeight()||r1.getY()<0) {
                    speedY *= -1;
                }

                r1.setX(r1.getX()+speedX);
                r1.setY(r1.getY()+speedY);


            }
        }.start();

        primaryStage.show();

    }
}