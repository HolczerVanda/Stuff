package coloring;

import java.awt.Color;

public interface Colorable {

	Color defaultColor=Color.red;
	
	
	public Color getColor();
	
	public void setColor(Color givenColor);
}
