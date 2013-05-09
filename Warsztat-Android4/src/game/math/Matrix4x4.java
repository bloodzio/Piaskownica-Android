package game.math;

/**
 * Macierz kwadratowa 4x4 dla obiektów 3D
 * 
 * @author Leszek Uchacz
 * @version beta
 * 
 */
public class Matrix4x4
{
	/** Tablica 4x4 */
	private float[] m = new float[16];
	
	/**Konstruktor domyślny Matrix4x4 (macierz jednostkowa)*/
	public Matrix4x4()
	{
		init();
	}
	/** Macierz jednostkowa */
	public Matrix4x4 init()
	{
		
		 m[0]=1;  
		 m[4]=1; 
		 m[8]=1; 
		 m[15]=1;
		return this;
	}

	/** Mnożenie macierzy 
	 * 
	 * wiersz x kolumna
	 * dla m[1]  	0 1 2
	 * 				  4
	 * 				  7	
	 * */
	public Matrix4x4 mul (Matrix4x4 v) {
	
		return this;
	}  
	/** Macierz Rotacji  */ 
	public Matrix4x4 rotate (float degrees) {
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
	public Matrix4x4 translation (float x, float y) {
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
	public Matrix4x4 setToTranslation (Vector2D v) {
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

	public Matrix4x4 set(Matrix4x4 v)
	{
		for (int i=0;i<=8;i++)
		{
			m[i]=v.m[i];
		}	
		return this;
	}
	
	
	public Matrix4x4 scale(float scaleX, float scaleY)
	{
		
		return this;
	}
	
	
	public Matrix4x4 invert(Matrix4x4 v)
	{
		
		return this;
	}
	


}
