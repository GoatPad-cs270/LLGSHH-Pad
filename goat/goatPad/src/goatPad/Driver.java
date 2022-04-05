package goatPad;

import java.awt.Color;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		DisplayPanel display = new DisplayPanel(800, 800, Color.white);
		JFrame frame = new JFrame("GoatPad JPanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(display);
		frame.pack();
		frame.setVisible(true);

		String englishVerb = "fruit punch";
		String goatVerb = "AW brrybyaawb";
		toolbar toolbar = new toolbar();

		System.out.println(toolbar.translateToGoat(englishVerb));

		englishVerb = "Fruit Punch";
		System.out.println(toolbar.translateToGoat(englishVerb));

		englishVerb = "The quick brown fox jumps over the lazy dog";
		System.out.println(toolbar.translateToGoat(englishVerb));

		String goatEnglish = "BAAAA";
		String englishEnglish = toolbar.translateToEnglish(goatEnglish);
		System.out.println(englishEnglish);

		goatEnglish = "RBrwarbr";
		englishEnglish = toolbar.translateToEnglish(goatEnglish);
		System.out.println(englishEnglish);

		englishEnglish = toolbar.translateToEnglish(goatEnglish);
		System.out.println(englishEnglish);

		goatEnglish = "AW/wwawybyb/brrybyaawb/bayrbarryyarbyba";
		englishEnglish = toolbar.translateToEnglish(goatEnglish);
		System.out.println(englishEnglish);

		String englishText = "This will revolutionize the LLGHS community!";
		String goatText = "RWwbawrb/wwawybyb/rrbayrarybryrwawarbyawywba/rwwbba/YBYBWAWBRB/aaarayayrybyawrwyy";
		System.out.println(toolbar.translateToEnglish(goatText));
		System.out.println(toolbar.translateToGoat(englishText));
	}

}