package game.math;



import game.math.Util;

/**
 * Macierz kwadratowa 3x3 dla obiektów 2D
 * 
 * @author Leszek Uchacz
 * @version beta
 * 
 */
public class Matrix3x3
{
	/** Tablica 3x3 */
	private float[] m = new float[9];
	/** Tablica pomocnica 3x3 */
	//private float[] mTmp = new float[9];
	//   0,1,2,
	//   3,4,5,
	//	 6,7,8
	
	/**Konstruktor domyślny Matrix3x3 (macierz jednostkowa)*/
	public Matrix3x3()
	{
		init();
	}
	/** Macierz Jednostkowa
	 * 	
	 *  1 0 0
	 *  0 1 0
	 *  0 0 1  
	 */
	public Matrix3x3 init()
	{
		
		m[0]=1; m[1]=0; m[2]=0; 
		m[3]=0; m[4]=1; m[5]=0; 
		m[6]=0; m[7]=0; m[8]=1; 
		
		return this;
	}
	
	/** Mnożenie macierzy 
	 * 
	 * wiersz x kolumna
	 * dla m[1]  	0 1 2
	 * 				  4
	 * 				  7	
	 * */
	public Matrix3x3 mul (Matrix3x3 v) {
		m[0] = m[0] * v.m[0] + m[3] * v.m[1] + m[6] * v.m[2];
		m[1] = m[1] * v.m[0] + m[4] * v.m[1] + m[7] * v.m[2];
		m[2] = m[2] * v.m[0] + m[5] * v.m[1] + m[8] * v.m[2];
		m[3] = m[0] * v.m[3] + m[3] * v.m[4] + m[6] * v.m[5];
		m[4] = m[1] * v.m[3] + m[4] * v.m[4] + m[7] * v.m[5];
		m[5] = m[2] * v.m[3] + m[5] * v.m[4] + m[8] * v.m[5];
		m[6] = m[0] * v.m[6] + m[3] * v.m[7] + m[6] * v.m[8];
		m[7] = m[1] * v.m[6] + m[4] * v.m[7] + m[7] * v.m[8];
		m[8] = m[2] * v.m[6] + m[5] * v.m[7] + m[8] * v.m[8];
		return this;
	}  
	/** Macierz Rotacji  */ 
	public Matrix3x3 rotate (float degrees) {
		float angle = Util.degreesToRadians * degrees;
		float cos = (float)Math.cos(angle);
		float sin = (float)Math.sin(angle);

		m[0] = cos;
		m[1] = sin;
		m[2] = 0;
		m[3] = -sin;
		m[4] = cos;
		m[5] = 0;
		m[6] = 0;
		m[7] = 0;
		m[8] = 1;

		return this;
	}
	/** Macierz translacji*/
	public Matrix3x3 translation (float x, float y) {
		m[0] = 1;
		m[1] = 0;
		m[2] = 0;
		m[3] = 0;
		m[4] = 1;
		m[5] = 0;
		m[6] = x;
		m[7] = y;
		m[8] = 1;

		return this;
	}
	/** Macierz translacji*/
	public Matrix3x3 setToTranslation (Vector2D v) {
		m[0] = 1;
		m[1] = 0;
		m[2] = 0;
		m[3] = 0;
		m[4] = 1;
		m[5] = 0;
		m[6] = v.x;
		m[7] = v.y;
		m[8] = 1;

		return this;
	}

	public Matrix3x3 set(Matrix3x3 v)
	{
		for (int i=0;i<=8;i++)
		{
			m[i]=v.m[i];
		}	
		return this;
	}
	
	
	public Matrix3x3 scale(float scaleX, float scaleY)
	{
		
		return this;
	}
	
	
	public Matrix3x3 invert(Matrix3x3 v)
	{
		
		return this;
	}
	

}
