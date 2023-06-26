package hust.soict.dsai.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import hust.soict.dsai.aims.cart.Cart;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import hust.soict.dsai.aims.store.Store;

public class CartScreen extends JFrame {
	private Cart cart;
	private Store store;
	public CartScreen(Cart cart,Store store) {
		super();
		this.cart=cart;
		this.store = store;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
	    Runnable windowCloser = () -> SwingUtilities.invokeLater(
	            () -> this.setVisible(false)
	        );
		this.setTitle("Cart");
		this.setSize(1024, 864);
		this.setVisible(true);
		Platform.runLater(new Runnable(){
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("cart.fxml"));
					CartScreenController controller = new CartScreenController(cart,store);
					controller.setWindowCloser(windowCloser);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
