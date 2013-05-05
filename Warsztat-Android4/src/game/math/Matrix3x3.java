/**
 * @since 2013.5.5
 * @author Leszek Uchacz
 * @version 0.1
 * 
 */
package game.math;

import game.math.Util;



public class Matrix3x3
{
	private float[] matrix = new float[9];
	private float[] matrixTmp = new float[9];
	//   0,1,2,
	//   3,4,5,
	//	 6,7,8
	
	public Matrix3x3()
	{
		
	}

	public Matrix3x3 mul (Matrix3x3 m) {
		
		
		return this;
	}
	public void set(){
		
	}
	
	public Matrix3x3 rotateDegrees (float degrees) {
		float angle =(float) Util.degreesToRadians * degrees;
		if (angle == 0) return this;
		else 
		
			
			
		return this;
		
	}


}
