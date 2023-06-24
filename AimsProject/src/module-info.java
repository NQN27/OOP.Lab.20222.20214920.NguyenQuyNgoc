/**
 * 
 */
/**
 * @author FPTSHOP
 *
 */
module AimsProject {
	requires java.desktop;
	requires javafx.swing;
	requires javafx.graphics;
	requires javafx.fxml;
	opens CartScreen to to javafx.graphics, javafx.fxml;
}