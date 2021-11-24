package lab7;

public class Parallelepiped implements GeometricBody
{
	private float a, b, c;
	
	public Parallelepiped(float a, float b, float c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public float getVolume()
	{
		return a * b * c;
	}
	
	public float getSurface()
	{
		return (2 * a * b) + (2 * b * c) + (2 * a * c);
	}
}