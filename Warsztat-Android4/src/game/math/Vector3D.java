/**
 * 
 * @author Leszek Uchacz
 * @version 0.1
 * @since 2013.5.5
 */
package game.math;


public class Vector3D
{
	private float x;
	private float y;
	private float z;
	
Vector3D(){ this(0,0,0); }
	
	Vector3D(float x , float y,float z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public float length()
	{
		return (float)Math.sqrt(x * x + y * y + z * z);
	}

	public void  add(Vector3D v)
	{
		this.x += v.x;
		this.y += v.y;
		this.z += v.z;
	}
	public void  add(float x,float y)
	{
		this.x += x;
		this.y += y;
		this.z += z;
	}
	
	
	public Vector3D normal()
	{
		float length = length();
		if (length != 0) 
		{
			this.x /= length;
			this.y /= length;
			this.z /= length;
		}
		return this;
	}
	
	public Vector3D set(float x,float y,float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		return this;
	}
		
	public Vector3D sub(Vector3D v)	
	{
		this.x -= v.x;
		this.y -= v.y;
		this.z -= v.z;
		return this;
	}
	public Vector3D mul(float f)
	{
		this.x *= f;
		this.y *= f;
		return this;
		
	}
	
	
	public Vector3D div(float f)
	{
		this.x /= f;
		this.y /= f;
		return this;
		
	}
	
	public boolean isEqual(Vector3D v)
	{
		if ((this.x == v.x ) && (this.y == v.y) && (this.z == v.z))
		{
			return true;
		}
		return false;
	
	}



}
