package picturepainter.conversion;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;

import org.bukkit.Material;

public class Convert {
	
	public static Material convert(Color color) {
		int r = color.getRed();
		int g = color.getGreen();
		int b = color.getBlue();
		
		Integer[] diffs = new Integer[Wools.values().length];
		int c = 0;
		
		for(Wools wool : Wools.values()) {
			diffs[c] += Math.abs(wool.color.getRed() - r);
			diffs[c] += Math.abs(wool.color.getGreen() - g);
			diffs[c] += Math.abs(wool.color.getBlue() - b);
			++c;
		}
		return Wools.values()[Arrays.asList(diffs).indexOf(Collections.min(Arrays.asList(diffs)))].block;
	}
}
