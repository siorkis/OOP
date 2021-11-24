package lab7;

public class Sphere implements GeometricBody
{
	private float r;
	
	public Sphere(float r)
	{
		this.r = r;
	}
	
	public float getSurface()
	{
		return 4 * (float)Math.PI * (r * r);
	}
	
	public float getVolume()
	{
		return (4/3) * (float)Math.PI * (r * r * r);
	}
}