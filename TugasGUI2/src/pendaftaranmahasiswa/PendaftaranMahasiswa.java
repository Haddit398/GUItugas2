package pendaftaranmahasiswa;

 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class PendaftaranMahasiswa extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pendaftaran Mahasiswa");
        primaryStage.getIcons().add(new Image("https://www.pngfind.com/pngs/m/470-4703547_icon-user-icon-hd-png-download.png"));
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(pane, 300, 275);

        Text sceneTitle = new Text("Pendaftaran Mahasiswa");
        sceneTitle.setFont(Font.font("Arial", FontWeight.NORMAL,20));
        pane.add(sceneTitle, 0, 0, 2, 1);
        Label nama = new Label("Nama:");
        pane.add(nama, 0, 1);
        final TextField nama1 = new TextField();
        pane.add(nama1, 1, 1);
        
        Label tlp = new Label("Telepon:");
        pane.add(tlp,0,2);
        final TextField telepon = new TextField();
        pane.add(telepon, 1, 2); 
        
        Label alamat = new Label("Alamat:");
        pane.add(alamat,0,3);
        final TextArea almt = new TextArea();
        pane.add(almt, 1, 3); 

        Button proses = new Button("Proses");      
        Button hapus = new Button("Hapus");      
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(hapus);
        hbox.getChildren().add(proses);
        pane.add(hbox, 1, 4);

        final Text alert = new Text();
        pane.add(alert, 1, 6);

        proses.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                alert.setText("Berhasil Input Data");
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}