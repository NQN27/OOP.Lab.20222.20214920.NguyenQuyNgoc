package hust.soict.dsai.aims.screen;

import javax.swing.JFrame;

import hust.soict.dsai.aims.cart.Cart;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Screen;


public class CartScreen extends JFrame {
	private Cart cart;
	public CartScreen(Cart cart) {
		super();
		this.cart=cart;
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		
		this.setTitle("Cart");
		this.setVisible(true);
		Platform.runlater(new Runnable()){
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/fxml/cart.fxml"));
					CartScreenController controller = new CartScreenController(cart);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScreen(new Screen(root));
				}
				catch (IOExpection e) {
					e.printStackTrace();
				}
			}
		}
	}
}
