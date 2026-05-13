import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Abstract class for creating and displaying JavaFX windows.
 */
public abstract class JavaFXWindow extends Application {

    private Object controller = null;

    /**
     * Retrieves the controller instance.
     *
     * @return the controller instance
     */
    public Object getController() {
        return controller;
    }

    /**
     * Abstract method to set the window title.
     *
     * @return the title of the window
     */
    protected abstract String getStageTitle();

    private Parent loadFXML() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
            JavaFXWindow.class.getResource(
                this.getClass().getSimpleName() + ".fxml"
            )
        );
        Parent p = fxmlLoader.load();
        controller = fxmlLoader.getController();
        return p;
    }

    /**
     * Opens a window at a specified screen position.
     *
     * @param screenX x coordinate on the screen
     * @param screenY y coordinate on the screen
     * @throws IOException when the window cannot be loaded
     */
    public void openNewWindow(double screenX, double screenY) throws IOException {
        Stage s = new Stage();
        s.setX(screenX);
        s.setY(screenY);
        start(s);
    }

    /**
     * Launches the window as the starting window of the application.
     */
    public void runAsStartUpWindow() {
        launch(this.getClass());
    }

    @Override
    public void start(Stage stage) throws IOException {
        startWindow(stage, getStageTitle());
    }

    private void startWindow(Stage stage, String title) throws IOException {
        Scene scene = new Scene(loadFXML());
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
}
