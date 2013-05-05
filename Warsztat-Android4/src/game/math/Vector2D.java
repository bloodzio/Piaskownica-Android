/**
 * 
 * @author Leszek Uchacz
 * @version 0.1
 * @since 2013.5.5
 */
package game.math;

import android.R.bool;

public class Vector2D
{
	private float x;
	private float y;
	
	Vector2D(){ this(0,0); }
	
	Vector2D(float x , float y)
	{
		this.x=x;
		this.y=y;
	}
	
	public float length()
	{
		return  (float)Math.sqrt(x * x + y * y);
	}

	public void  add(Vector2D v)
	{
		this.x += v.x;
		this.y += v.y;
	}
	public void  add(float x,float y)
	{
		this.x += x;
		this.y += y;
	}
	
	
	public Vector2D normal()
	{
		float length = length();
		if (length != 0) 
		{
			this.x /= length;
			this.y /= length;
		}
		return this;
	}
	
	public Vector2D set(float x,float y)
	{
		this.x = x;
		this.y = y;
		return this;
	}
		
	public Vector2D sub(Vector2D v)	
	{
		this.x -= v.x;
		this.y -= v.y;
		return this;
	}
	public Vector2D mul(float f)
	{
		this.x *= f;
		this.y *= f;
		return this;
		
	}
	
	
	public Vector2D div(float f)
	{
		this.x /= f;
		this.y /= f;
		return this;
		
	}
	
	public boolean isEqual(Vector2D v)
	{
		if ((this.x == v.x ) && (this.y == v.y))
		{
			return true;
		}
		return false;
	
	}
}


