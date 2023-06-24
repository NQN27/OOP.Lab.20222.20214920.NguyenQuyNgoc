package hust.soict.dsai.aims.screen;

import java.awt.*;

import javax.swing.*;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;


public class MediaStore extends JPanel {
	private Media media;
	Cart cart = new Cart();
	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(this.media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + this.media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton addbutton = new JButton("Add to Cart");
		addbutton.addActionListener(a -> {
			cart.addMedia(media);
		});
		container.add(addbutton);
		if (this.media instanceof Playable) {
			JButton playButton = new JButton("Play");
			container.add(playButton);
			playButton.addActionListener(e ->{
				((Playable)this.media).play();
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
