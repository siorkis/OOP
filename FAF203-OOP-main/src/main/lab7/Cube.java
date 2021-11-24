package lab7;

public class Cube implements GeometricBody
{
	private float length;
	
	public Cube(float l)
	{
		length = l;
	}
	
	public float getSurface()
	{
		return 6 * (length * length);
	}
	
	public float getVolume()
	{
		return length * length * length;
	}
}