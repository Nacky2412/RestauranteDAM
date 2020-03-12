import java.awt.Image;
import javax.swing.ImageIcon;

public class ImagenManager {
	/**
	 * Esta funcion sirve para remendizionar la imagen
	 * @param imagen Imagen que hay poner para remendizionar
	 * @param xscale Escala X
	 * @param yscale Escala Y
	 * @return Devuelve la imagen remendionada
	 */
	public static ImageIcon remidenzionarImagen(ImageIcon imagen, int xscale, int yscale) {
		ImageIcon imageIcon = imagen;
		Image img = imageIcon.getImage();
		Image newimg = img.getScaledInstance(xscale, yscale, java.awt.Image.SCALE_AREA_AVERAGING); //Escala la imagen a la dimension introducida
		imageIcon = new ImageIcon(newimg);
		return imageIcon;
	}
}
