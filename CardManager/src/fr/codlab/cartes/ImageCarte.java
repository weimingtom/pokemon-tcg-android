package fr.codlab.cartes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Classe permettant l'affichage d'une image
 * @author kevin
 *
 */
public class ImageCarte extends ImageView {
	public ImageCarte(Context context) {
		super(context);
	}
	public ImageCarte(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	public ImageCarte(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	public boolean setSize(int x, int y, int w, int h ){
		return this.setFrame(0, 0, w, h);
	}


}
