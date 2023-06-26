package hust.soict.dsai.aims.screen;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
public class CartScreenController {
    private Runnable windowCloser ;

    public void setWindowCloser(Runnable windowCloser) {
        this.windowCloser = windowCloser;
    }


	private Cart cart;
	private Store store;
    @FXML
    private AnchorPane All;
	@FXML
	private TableView<Media> tblMedia;
	
	@FXML
	private TableColumn<Media, String> colMediaTitle;
	
	@FXML
	private TableColumn<Media, String> colMediaCategory;
	
	@FXML
	private TableColumn<Media, Float> colMediaCost;
	
    @FXML
    private Button btnPlay;

    @FXML
    private Label costCalculate;
    
    @FXML
    private Button btnRemove;
	public CartScreenController(Cart cart,Store store) {
		super();
		this.cart = cart;
		this.store = store;
	}
	@FXML
	void btnRemovePressed(ActionEvent evt1) {
		Media md1 = tblMedia.getSelectionModel().getSelectedItem();
		cart.removeMedia(md1);
		costCalculate.setText(Float.toString(cart.totalCost()));
	}
    @FXML
    private Button CloseButton;
    @FXML
    void btnMenuBar(MouseEvent event) throws IOException {
    	windowCloser.run();
    	new StoreScreen(cart,store);
    	
    }
    @FXML
    void btnPlayMedia(ActionEvent event) {
    	Media md1 = tblMedia.getSelectionModel().getSelectedItem();
    	if (md1 instanceof Book) {
    		Alert alert = new Alert(AlertType.CONFIRMATION);
    		alert.setTitle("Play Media");
    		alert.setHeaderText("Play unsuccessfully");
    		alert.setContentText("Can't play this Type of Media");
    		alert.showAndWait();
    	}
    	else if (md1 instanceof DigitalVideoDisc || md1 instanceof CompactDisc) {
    		String Type ="";
    		if (md1 instanceof DigitalVideoDisc) {
    			Type = "DigitalVideoDisc";
    		}
    		else {
    			Type = "CompactDisc";
    		}
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("Play successfully");
    		alert.setTitle("Play Media");
    		try {
				alert.setContentText("You are playing "+Type+" Length is"+Integer.toString(((Playable) md1).play()));
			} catch (PlayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		alert.showAndWait();
    	}
    }
	@FXML
	void btnPlaceOrder(MouseEvent evt1) {
		Alert alert = new Alert(AlertType.INFORMATION);
		if (this.cart.getSize()>0) {
			
			alert.setHeaderText("You order successfully your total cost is " +Float.toString(cart.totalCost()));
			alert.setTitle("Order");
			//JOptionPane.showMessageDialog(null,Float.toString(cart.totalCost()), "Total Cost", JOptionPane.WARNING_MESSAGE);
			costCalculate.setText(Float.toString(this.cart.totalCost()));
			alert.showAndWait();
			cart = new Cart();
			initialize();
		}
		else {
			alert.setHeaderText("You order unsuccessfully");
			alert.setTitle("Order");
			alert.setContentText("Nothing in your cart");
			alert.showAndWait();
		}
		
	}
	
	@FXML
	private void initialize() {
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
		tblMedia.setItems(this.cart.getItemsOrdered());
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		costCalculate.setText(Float.toString(cart.totalCost()));
		tblMedia.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<Media>() {
				@Override
				public void changed(ObservableValue<? extends Media> observable, Media oldValue,Media newValue) {
					if (newValue != null) {
						updateButtonBar(newValue);
					}
				}
				
				});
		
	}
	void updateButtonBar(Media md1) {
		btnRemove.setVisible(true);
		if (md1 instanceof Playable) {
			btnPlay.setVisible(true);
		}
		else btnPlay.setVisible(false);
	}
}


