package UTIL;

import java.util.LinkedList;
import java.util.Random;

import org.eclipse.swt.graphics.Color;

public final class ColorScheme {
	private  final static Color DEFAULT_COLOR_MIX = new Color(null,150,150,150);
	private final static double GLODEN_RATIO = 0.618033988749895;
	
	public  static Integer RANDOM_SEED = 4513;
	public  static Random random = new Random(RANDOM_SEED);
	private static int count = 1;
	public static LinkedList<Color> colors = new LinkedList<Color>();
	
	public final static void initColors() {					
		random.setSeed(RANDOM_SEED);
	}
	public final static  Color generateRandomColor() {
		Color one = generateRandomColor(null, count);
		Color two = generateRandomColor(null, count);		
		Color three = generateRandomColor(null, count);
		count++;
		return (RandomMix(one,two,three, (float) 1));
	}
	
	public final static  Color generateRandomColor(Color mix, int i) {				
		colors = GenerateColors_Harmony(60,(float)120,(float)240,(float)30,(float)30,(float)30,(float)0.5,(float)0.8);		
		return colors.pollFirst();
	}
	
	public static LinkedList<Color> GenerateColors_Harmony(
			   int colorCount,
			   float offsetAngle1,
			   float offsetAngle2,
			   float rangeAngle0,
			   float rangeAngle1, 
			   float rangeAngle2,
			   float saturation, float luminance)
			{
			   LinkedList<Color> colors = new LinkedList<Color>();

			   float referenceAngle = random.nextFloat() * 360;

			   for (int i = 0; i < colorCount; i++)
			   {
			      float randomAngle = 
			         random.nextFloat() * (rangeAngle0 + rangeAngle1 + rangeAngle2);

			      if (randomAngle > rangeAngle0)
			      {
			         if (randomAngle < rangeAngle0 + rangeAngle1)
			         {
			            randomAngle += offsetAngle1;
			         }
			         else
			         {
			            randomAngle += offsetAngle2;
			         }
			      }

			      java.awt.Color hslColor =  java.awt.Color.getHSBColor(
			         ((referenceAngle + randomAngle) / 360.0f) % 1.0f,
			         saturation, 
			         luminance);

			      colors.add(new Color(null,hslColor.getRed(),hslColor.getGreen(),hslColor.getBlue()));
			   }

			   return colors;
			}
	
	private static Color RandomMix(Color color1, Color color2, Color color3, float greyControl) {
		   int randomIndex = random.nextInt() % 3;

		   float mixRatio1 =
		      (randomIndex == 0) ? random.nextFloat() * greyControl : random.nextFloat();

		   float mixRatio2 = 
		      (randomIndex == 1) ? random.nextFloat() * greyControl : random.nextFloat();

		   float mixRatio3 = 
		      (randomIndex == 2) ? random.nextFloat() * greyControl : random.nextFloat();

		   float sum = mixRatio1 + mixRatio2 + mixRatio3;

		   mixRatio1 /= sum;
		   mixRatio2 /= sum;
		   mixRatio3 /= sum;	   
		   return new Color(null,
				      (int)(mixRatio1 * color1.getRed() + mixRatio2 * color2.getRed() + mixRatio3 * color3.getRed()),
				      (int)(mixRatio1 * color1.getGreen() + mixRatio2 * color2.getGreen() + mixRatio3 * color3.getGreen()),
				      (int)(mixRatio1 * color1.getBlue() + mixRatio2 * color2.getBlue() + mixRatio3 * color3.getBlue()));
		}
}
