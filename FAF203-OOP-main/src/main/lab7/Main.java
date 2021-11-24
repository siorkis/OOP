package lab7;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		GeometricBody cube = new Cube(3);
		GeometricBody sphere = new Sphere(3);
		GeometricBody parallelepiped = new Parallelepiped(1, 2, 3);
		
		ArrayList<GeometricBody> bodies = new ArrayList<GeometricBody>();
		
		bodies.add(cube);
		bodies.add(sphere);
		bodies.add(parallelepiped);
		
		System.out.println(GeometricBodyController.getBiggestSurfaceBody(bodies).getSurface());
		System.out.println(GeometricBodyController.getBiggestVolumeBody(bodies).getVolume());
		
	}
}