package application;
	
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends HouseBuilder {
	boolean fire;
	CountdownClock clock = new CountdownClock(5000);
	Button simulateButton = new Button("Simulate break-in");
	Button resetButton = new Button("Reset");
	
	@Override
	public void start(Stage primaryStage)  {
		try {
			primaryStage.setTitle("House");
			simulateButton.setOnAction(e -> clock.start());
			resetButton.setOnAction(e -> {
		    	primaryStage.close();
				Platform.runLater(() -> new Main().start(new Stage()));
		    	});
			//Cellar level
			Button button1 = new Button("Go to Entrance level");
			button1.setOnAction(e -> primaryStage.setScene(scene2));
			MenuItem cellOption1 = new MenuItem("Open");
	        cellOption1.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	cellWindow1.openWindow();
	            	cellWindow2.openWindow();
	            	cellWindow3.openWindow();
	            }
	        });
	        MenuItem cellOption2 = new MenuItem("Close");
	        cellOption2.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	cellWindow1.closeWindow();
	            	cellWindow2.closeWindow();
	            	cellWindow3.closeWindow();
	            }
	        });
	        MenuItem cellOption3 = new MenuItem("Lock");
	        cellOption3.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	cellWindow1.lockWindow();
	            	cellWindow2.lockWindow();
	            	cellWindow3.lockWindow();
	            }
	        });
	        MenuItem cellOption4 = new MenuItem("Unlock");
	        cellOption4.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	cellWindow1.unlockWindow();
	            	cellWindow2.unlockWindow();
	            	cellWindow3.unlockWindow();
	            }
	        });

			MenuButton cellmenu = new MenuButton("Window Control",null,cellOption1,cellOption2,cellOption3,cellOption4);
			cellmenu.setLayoutX(20);
			cellmenu.setLayoutY(400);

			Image cellarImage = new Image("file:cellarlevel.png");
			ImageView cellarImageView = new ImageView(cellarImage);
			Label label1= new Label("Cellar level");
			label1.setFont(Font.font("Arial", FontWeight.BOLD, 20));
			HBox layout1 = new HBox(20);
			Group cellarRoot = new Group();
			cellarRoot.getChildren().addAll(cellarImageView, cellmenu);
			layout1.alignmentProperty().setValue(Pos.CENTER);
			layout1.getChildren().addAll(label1, button1);
			BorderPane cellarPane = new BorderPane();
			cellarPane.setMinSize(825, 800);
			cellarPane.setCenter(cellarRoot);
			cellarPane.setBottom(layout1);
			scene1 = new Scene(cellarPane);
			               
			//Entrance level
			Button button2 = new Button("Go to Cellar level");
			button2.setOnAction(e -> primaryStage.setScene(scene1));
			Button button3 = new Button("Go to Upper level");
			button3.setOnAction(e -> primaryStage.setScene(scene3));
			Button policeButton = new Button("Call police");
			policeButton.setOnAction(e -> HouseBuilder.callPolice());
			
	        MenuItem entWinOption1 = new MenuItem("Open");
	        entWinOption1.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	entrenceWindow.openWindow();
	            	kitchenWindow1.openWindow();
	            	kitchenWindow2.openWindow();
	            	diningWindow1.openWindow();
	            	diningWindow2.openWindow();
	            	diningWindow3.openWindow();
	            	diningWindow4.openWindow();
	            	livingWindow1.openWindow();
	            	livingWindow2.openWindow();
	            	livingWindow3.openWindow();
	            	famWindow1.openWindow();
	            	famWindow2.openWindow();
	            	bath1Window.openWindow();
	            	garageWindow.openWindow();

	            }
	        });
	        MenuItem entWinOption2 = new MenuItem("Close");
	        entWinOption2.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	entrenceWindow.closeWindow();
	            	kitchenWindow1.closeWindow();
	            	kitchenWindow2.closeWindow();
	            	diningWindow1.closeWindow();
	            	diningWindow2.closeWindow();
	            	diningWindow3.closeWindow();
	            	diningWindow4.closeWindow();
	            	livingWindow1.closeWindow();
	            	livingWindow2.closeWindow();
	            	livingWindow3.closeWindow();
	            	famWindow1.closeWindow();
	            	famWindow2.closeWindow();
	            	bath1Window.closeWindow();
	            	garageWindow.closeWindow();
	            }
	        });
	        MenuItem entWinOption3 = new MenuItem("Lock");
	        entWinOption3.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	entrenceWindow.lockWindow();
	            	kitchenWindow1.lockWindow();
	            	kitchenWindow2.lockWindow();
	            	diningWindow1.lockWindow();
	            	diningWindow2.lockWindow();
	            	diningWindow3.lockWindow();
	            	diningWindow4.lockWindow();
	            	livingWindow1.lockWindow();
	            	livingWindow2.lockWindow();
	            	livingWindow3.lockWindow();
	            	famWindow1.lockWindow();
	            	famWindow2.lockWindow();
	            	bath1Window.lockWindow();
	            	garageWindow.lockWindow();
	            }
	        });
	        MenuItem entWinOption4 = new MenuItem("Unlock");
	        entWinOption4.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	entrenceWindow.unlockWindow();
	            	kitchenWindow1.unlockWindow();
	            	kitchenWindow2.unlockWindow();
	            	diningWindow1.unlockWindow();
	            	diningWindow2.unlockWindow();
	            	diningWindow3.unlockWindow();
	            	diningWindow4.unlockWindow();
	            	livingWindow1.unlockWindow();
	            	livingWindow2.unlockWindow();
	            	livingWindow3.unlockWindow();
	            	famWindow1.unlockWindow();
	            	famWindow2.unlockWindow();
	            	bath1Window.unlockWindow();
	            	garageWindow.unlockWindow();
	            }
	        });
			
	        
			MenuButton entranceWindowMenu = new MenuButton("Window Control",null,entWinOption1,entWinOption2,entWinOption3,entWinOption4);
			entranceWindowMenu.setLayoutX(20);
			entranceWindowMenu.setLayoutY(400);
			
	        MenuItem entDorOption1 = new MenuItem("Open");
	        entDorOption1.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	entranceDoor.openDoor();
	            	kitchenDoor_Garden.openDoor();
	            	bath1door.openDoor();
	            	garageDoor1.openDoor();
	            	garageDoor2.openDoor();
	            	sideGarageDoor.openDoor();
	            	cellDoor.openDoor();
	            }
	        });
	        MenuItem entDorOption2 = new MenuItem("Close");
	        entDorOption2.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	entranceDoor.closeDoor();
	            	kitchenDoor_Garden.closeDoor();
	            	bath1door.closeDoor();
	            	garageDoor1.closeDoor();
	            	garageDoor2.closeDoor();
	            	sideGarageDoor.closeDoor();
	            	cellDoor.closeDoor();
	            }
	        });
	        MenuItem entDorOption3 = new MenuItem("Lock");
	        entDorOption3.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	entranceDoor.lockDoor();
	    	    	kitchenDoor_Garden.lockDoor();
	    	    	bath1door.lockDoor();
	    	    	garageDoor1.lockDoor();
	    	    	garageDoor2.lockDoor();
	    	    	sideGarageDoor.lockDoor();
	    	    	cellDoor.lockDoor();
	            }
	        });
	        MenuItem entDorOption4 = new MenuItem("Unlock");
	        entDorOption4.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	entranceDoor.unlockDoor();
	    	    	kitchenDoor_Garden.unlockDoor();
	    	    	bath1door.unlockDoor();
	    	    	garageDoor1.unlockDoor();
	    	    	garageDoor2.unlockDoor();
	    	    	sideGarageDoor.unlockDoor();
	    	    	cellDoor.unlockDoor();
	            }
	        });
			MenuButton entranceDoorMenu = new MenuButton("Door Control",null,entDorOption1,entDorOption2,entDorOption3,entDorOption4);
			entranceDoorMenu.setLayoutX(20);
			entranceDoorMenu.setLayoutY(430);
			
			Image entranceimg = new Image("file:entrancelevel.png");
			ImageView entranceImageView = new ImageView(entranceimg);
			Label label2= new Label("Entrance level");
			label2.setFont(Font.font("Arial", FontWeight.BOLD, 20));
			HBox layout2 = new HBox(20);
			layout2.getChildren().addAll(label2, simulateButton, button2, button3, policeButton, resetButton );
			Group entranceRoot = new Group();
			entranceRoot.getChildren().addAll(entranceImageView, entranceWindowMenu, entranceDoorMenu);
			layout2.alignmentProperty().setValue(Pos.CENTER);
			BorderPane entrancePane = new BorderPane();
			entrancePane.setMinSize(825, 800);
			entrancePane.setCenter(entranceRoot);
			entrancePane.setBottom(layout2);
			scene2 = new Scene(entrancePane);
			
			//Upper level
			Button button4 = new Button("Go to Entrance level");
			button4.setOnAction(e -> primaryStage.setScene(scene2));
			Button masterLock = new Button("Master Lock");
			masterLock.setOnAction(e -> lockAllDoors());
			masterLock.setLayoutX(600);
			masterLock.setLayoutY(430);
			
	        MenuItem upWinOption1 = new MenuItem("Open");
	        upWinOption1.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	masterWindow1.openWindow();
	            	masterWindow2.openWindow();
	            	masterWindow3.openWindow();
	            	masterWindow4.openWindow();
	            	bedWindow1_1.openWindow();
	            	bedWindow1_2.openWindow();
	            	bedWindow2_1.openWindow();
	            	bedWindow2_2.openWindow();
	            	bedWindow3_1.openWindow();
	            	bedWindow3_2.openWindow();
	            	bedWindow4_1.openWindow();
	            	bedWindow4_2.openWindow();
	            	toiletWindow.openWindow();
	            }
	        });
	        MenuItem upWinOption2 = new MenuItem("Close");
	        upWinOption2.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	masterWindow1.closeWindow();
	            	masterWindow2.closeWindow();
	            	masterWindow3.closeWindow();
	            	masterWindow4.closeWindow();
	            	bedWindow1_1.closeWindow();
	            	bedWindow1_2.closeWindow();
	            	bedWindow2_1.closeWindow();
	            	bedWindow2_2.closeWindow();
	            	bedWindow3_1.closeWindow();
	            	bedWindow3_2.closeWindow();
	            	bedWindow4_1.closeWindow();
	            	bedWindow4_2.closeWindow();
	            	toiletWindow.closeWindow();
	            }
	        });
	        MenuItem upWinOption3 = new MenuItem("Lock");
	        upWinOption3.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	masterWindow1.lockWindow();
	            	masterWindow2.lockWindow();
	            	masterWindow3.lockWindow();
	            	masterWindow4.lockWindow();
	            	bedWindow1_1.lockWindow();
	            	bedWindow1_2.lockWindow();
	            	bedWindow2_1.lockWindow();
	            	bedWindow2_2.lockWindow();
	            	bedWindow3_1.lockWindow();
	            	bedWindow3_2.lockWindow();
	            	bedWindow4_1.lockWindow();
	            	bedWindow4_2.lockWindow();
	            	toiletWindow.lockWindow();
	            }
	        });
	        MenuItem upWinOption4 = new MenuItem("Unlock");
	        upWinOption4.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	masterWindow1.unlockWindow();
	            	masterWindow2.unlockWindow();
	            	masterWindow3.unlockWindow();
	            	masterWindow4.unlockWindow();
	            	bedWindow1_1.unlockWindow();
	            	bedWindow1_2.unlockWindow();
	            	bedWindow2_1.unlockWindow();
	            	bedWindow2_2.unlockWindow();
	            	bedWindow3_1.unlockWindow();
	            	bedWindow3_2.unlockWindow();
	            	bedWindow4_1.unlockWindow();
	            	bedWindow4_2.unlockWindow();
	            	toiletWindow.unlockWindow();
	            }
	        });
			MenuButton upperWindowMenu = new MenuButton("Window Control",null,upWinOption1,upWinOption2,upWinOption3,upWinOption4);
			upperWindowMenu.setLayoutX(20);
			upperWindowMenu.setLayoutY(400);
			
	        MenuItem upDoorOption1 = new MenuItem("Open");
	        upDoorOption1.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	masterBedroomDoor.openDoor();
	            	bath2door.openDoor();
	            	bedDoor1.openDoor();
	            	bedDoor2.openDoor();
	            	bedDoor3.openDoor();
	            	bedDoor4.openDoor();
	            	toiletdoor.openDoor();
	            }
	        });
	        MenuItem upDoorOption2 = new MenuItem("Close");
	        upDoorOption2.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	masterBedroomDoor.closeDoor();
	            	bath2door.closeDoor();
	            	bedDoor1.closeDoor();
	            	bedDoor2.closeDoor();
	            	bedDoor3.closeDoor();
	            	bedDoor4.closeDoor();
	            	toiletdoor.closeDoor();
	            }
	        });
	        MenuItem upDoorOption3 = new MenuItem("Lock");
	        upDoorOption3.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	    	    	masterBedroomDoor.lockDoor();
	    	    	bath2door.lockDoor();
	    	    	bedDoor1.lockDoor();
	    	    	bedDoor2.lockDoor();
	    	    	bedDoor3.lockDoor();
	    	    	bedDoor4.lockDoor();
	    	    	toiletdoor.lockDoor();
	            }
	        });
	        MenuItem upDoorOption4 = new MenuItem("Unlock");
	        upDoorOption4.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	    	    	masterBedroomDoor.unlockDoor();
	    	    	bath2door.unlockDoor();
	    	    	bedDoor1.unlockDoor();
	    	    	bedDoor2.unlockDoor();
	    	    	bedDoor3.unlockDoor();
	    	    	bedDoor4.unlockDoor();
	    	    	toiletdoor.unlockDoor();
	            }
	        });
			MenuButton upperDoorMenu = new MenuButton("Door Control",null,upDoorOption1,upDoorOption2,upDoorOption3,upDoorOption4);
			upperDoorMenu.setLayoutX(20);
			upperDoorMenu.setLayoutY(430);
			
			Image upperImage = new Image("file:upperlevel.png");
			ImageView upperImageView = new ImageView(upperImage);
			Label label3 = new Label("Upper level");
			label3.setFont(Font.font("Arial", FontWeight.BOLD, 20));   
			HBox layout3 = new HBox(20);
			Group upperRoot = new Group();
			upperRoot.getChildren().addAll(upperImageView,upperWindowMenu,upperDoorMenu,masterLock);
			layout3.alignmentProperty().setValue(Pos.CENTER);
			layout3.getChildren().addAll(label3, button4);
			BorderPane upperPane = new BorderPane();
			upperPane.setMinSize(825, 800);
			upperPane.setCenter(upperRoot);
			upperPane.setBottom(layout3);
			scene3 = new Scene(upperPane);
			        
			        
			primaryStage.setScene(scene2);
			primaryStage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);

	}		
	
}
