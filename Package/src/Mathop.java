//Use of Static import.

import java.lang.Math;
public class Mathop 
{
	public void Circle(float r)
	{
		float a,pi= 3.14f;
		a= pi*r*r;
		System.out.println("Area of circle is : "+a);
	}
	public static void main(String args[])
	{
		Mathop ma = new Mathop();
		ma.Circle(7.1f);
	}
}
