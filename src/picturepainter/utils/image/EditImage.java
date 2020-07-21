package picturepainter.utils.image;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class EditImage {
	
	public static BufferedImage resize(BufferedImage image, int height, int width) {
        Image tmp = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resizedImage;
    }
}
