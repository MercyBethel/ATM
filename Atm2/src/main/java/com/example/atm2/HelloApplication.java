package com.example.atm2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        ConnectionDB o = new ConnectionDB();
      //  o.conMethod();

        Pane p = new Pane();

        Text t1 = new Text("WELCOME");

        t1.setFont(Font.font("times new roman", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,50));
        Text t2 = new Text("log in to account.");
        t2.setFont(Font.font("times new roman", FontWeight.BLACK, FontPosture.REGULAR,20));
        Button b= new Button("log in");
        b.setStyle("-fx-background-color:SEASHELL;-fx-border-color:BLACK");
        b.setPrefSize(80,30);

        GridPane v = new GridPane();
        v.add(t1,5,0);
        v.add(t2,5,6);
        v.add(b,15,15);
        v.setAlignment(Pos.CENTER);


        v.setStyle("-fx-background-color:THISTLE;" );

        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                PasswordField tf1 = new PasswordField();
                tf1.relocate(100,80);

                Label l = new Label("Enter Your PIN " );
                l.relocate(100,50);

                Button b7 = new Button("1");
                b7.relocate(100,140);
                b7.setPrefSize(80,30);

                b7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b7.getText());
                    }
                });

                Button b8 = new Button("2");
                b8.relocate(190,140);
                b8.setPrefSize(80,30);
                b8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b8.getText());
                    }
                });


                Button b9 = new Button("3");
                b9.relocate(280,140);
                b9.setPrefSize(80,30);
                b9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b9.getText());
                    }
                });

                Button clr = new Button("clear");
                clr.relocate(370,140);
                clr.setPrefSize(80,30);
                clr.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText("");
                    }
                });

                Button b10 = new Button("4");
                b10.relocate(100,180);
                b10.setPrefSize(80,30);

                b10.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b10.getText());
                    }
                });

                Button b11 = new Button("5");
                b11.relocate(190,180);
                b11.setPrefSize(80,30);
                b11.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b11.getText());
                    }
                });

                Button b12 = new Button("6");
                b12.relocate(280,180);
                b12.setPrefSize(80,30);
                b12.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b12.getText());
                    }
                });



                Button b13 = new Button("7");
                b13.relocate(100,220);
                b13.setPrefSize(80,30);
                b13.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b13.getText());
                    }
                });

                Button b14 = new Button("8");
                b14.relocate(190,220);
                b14.setPrefSize(80,30);

                b14.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b14.getText());
                    }
                });

                Button b15 = new Button("9");
                b15.relocate(280,220);
                b15.setPrefSize(80,30);
                b15.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b15.getText());
                    }
                });

                Button b16 = new Button("0");
                b16.relocate(190,260);
                b16.setPrefSize(80,30);
                b16.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf1.setText(tf1.getText()+b16.getText());
                    }
                });

                Button entr = new Button("Enter");
                entr.relocate(370,180);
                entr.setPrefSize(80,30);

                String s=tf1.getText();


                    entr.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent actionEvent) {

                            Pane pane = new Pane();
                            Button b1 = new Button();
                            b1.setPrefSize(40, 20);
                            b1.relocate(20, 50);

                            b1.setOnAction((EventHandler<ActionEvent>) new HelloController(tf1));

                            Label l1 = new Label("Balance");
                            l1.relocate(70, 50);

                            Button b2 = new Button();
                            b2.setPrefSize(40, 20);
                            b2.relocate(20, 80);

                            b2.setOnAction((EventHandler<ActionEvent>) new Deposit(tf1));


                            Label l2 = new Label("Deposite");
                            l2.relocate(70, 80);



                            Button b4 = new Button();
                            b4.setPrefSize(40, 20);
                            b4.relocate(440, 50);


                            Label l4 = new Label("Withdraw");
                            l4.relocate(380, 50);



                            Button b5 = new Button();
                            b5.setPrefSize(40, 20);
                            b5.relocate(440, 80);

                            Label l5 = new Label("Transfer");
                            l5.relocate(380, 80);



                             b4.setOnAction(new EventHandler<ActionEvent>() {
                                 @Override
                                 public void handle(ActionEvent actionEvent) {
                                     Pane pane11= new Pane();

                                     TextField tx = new TextField();
                                     tx.relocate(100,100);
                                     Label lb = new Label("Enter Amount:");
                                     lb.relocate(10,100);
                                     Button be= new Button("Confirm");
                                     be.relocate(100,200);

                                    pane11.setStyle("-fx-background-color:THISTLE;");

                                     be.setOnAction((EventHandler<ActionEvent>)new WithDraw(tf1,tx));
                                     pane11.getChildren().addAll(tx,lb,be);

                                     Stage stage11=new Stage();
                                     Scene scene11=new Scene(pane11,500,500);
                                     stage11.setX(stage.getX()+0);
                                     stage11.setY(stage.getY()+0);
                                     stage11.setScene(scene11);
                                     stage11.show();


                                 }
                             });


                            b5.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent actionEvent) {
                                    TextField textField1= new TextField();
                                    Label lt1 = new Label("Account:", textField1);

                                    TextField textField2 =new TextField();
                                    Label lt2 = new Label("Amount", textField2);

                                    lt1.setContentDisplay(ContentDisplay.RIGHT);
                                    lt2.setContentDisplay(ContentDisplay.RIGHT);

                                    Button button = new Button("submit");


                                    button.setOnAction(new EventHandler<ActionEvent>() {
                                        @Override
                                        public void handle(ActionEvent actionEvent) {


                                                Alert alt = new Alert(Alert.AlertType.CONFIRMATION);
                                                alt.setContentText("sucessfully Transfer");
                                                alt.showAndWait();
                                            }


                                    });

                                    VBox vBox = new VBox();
                                    vBox.getChildren().addAll(lt1, lt2, button);
                                    vBox.setAlignment(Pos.CENTER);
                                    vBox.setSpacing(10);
                                    vBox.setStyle("-fx-background-color:THISTLE;");


                                    Stage stage3 = new Stage();
                                    Scene scene3 = new Scene(vBox, 500, 500);
                                    stage3.setX(stage.getX() + 0);
                                    stage3.setY(stage.getY() + 0);
                                    stage3.setScene(scene3);
                                    stage3.show();
                                }
                            });

                            pane.getChildren().addAll(b1, b2, b4, b5, l1, l2, l4, l5);
                            pane.setStyle("-fx-background-color:THISTLE;");

                            Stage sg1 = new Stage();
                            sg1.setX(stage.getX() + 0);
                            sg1.setY(stage.getY() + 0);
                            Scene scene1 = new Scene(pane, 500, 500);
                            sg1.setScene(scene1);
                            sg1.show();

                        }

                    });

                p.getChildren().addAll(b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,clr,entr,l,tf1);
                p.setStyle("-fx-background-color:THISTLE;" );

                Stage sg = new Stage();
                Scene sn1 = new Scene(p,500,500);
                sg.setScene(sn1);
                sg.setX(stage.getX()+0);
                sg.setY(stage.getY()+0);
                stage.close();
                sg.show();

            }
        });




        Scene scene = new Scene(v, 500, 500);

        stage.setTitle("ATM MACHINE ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}