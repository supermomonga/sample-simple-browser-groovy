
package simplebrowser

import static groovyx.javafx.GroovyFX.start
import javafx.application.Application

public class Main extends Application {
  public void start(Stage stage) {
    stage(title: "hi", visible: true) {
      scene(width: 300, height: 300) {
        fxml this.class.getResource '/app.fxml'
      }
    }
    stage.show()
  }
  public static void main(String[] args){
    println "hi"
      start
  }
}

// start {
// }
