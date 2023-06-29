package hust.soict.dsai.aims.screen;

import java.awt.*;

import javax.swing.*;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.LimitException;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;


public class MediaStore extends JPanel {
	protected Media media;
	protected static Cart cart;
	public MediaStore(Media media,Cart cart) {
		this.media = media;
		MediaStore.cart = cart;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(this.media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + this.media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton addButton = new JButton("Add to Cart");
		addButton.addActionListener(e ->{
			try {
			MediaStore.cart.addMedia(media);}
			catch (LimitException ex) {
				JOptionPane.showMessageDialog(null, "Cart is Full", "Full", JOptionPane.WARNING_MESSAGE);
				}
			});
		container.add(addButton);
		if (this.media instanceof Playable) {
			JButton playButton = new JButton("Play");
			container.add(playButton);
			playButton.addActionListener(e ->{
				try {
					((Playable)this.media).play();
				} catch (PlayerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, this.media.getTitle() + " is playing", "Playing", JOptionPane.INFORMATION_MESSAGE);
			});
		}
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
}
}
