package game.math;
/**
 * Wektor - Uporządkowana para liczb u =[x,y]  gdzie x i y są jego wpółrzędnymi w protokątnym układzie współrzednych.<br>
 * @author Leszek Uchacz
 * @version beta
 * 
 */


public class Vector3D
{
	/**Skrót dla Vector3D(1, 0, 0)**/
	public final static Vector3D right = new Vector3D(1, 0, 0);
	/**Skrót dla Vector3D(0, 1, 0)**/
	public final static Vector3D up = new Vector3D(0, 1, 0);
	/**Skrót dla Vector3D(0, 0, 1)**/
	public final static Vector3D forward = new Vector3D(0, 0, 1);
	/**Skrót dla Vector3D(0, 0, 0)**/
	public final static Vector3D zero = new Vector3D(0, 0, 0);
	/**Skrót dla Vector3D(1, 1, 1)**/
	public final static Vector3D one = new Vector3D(1, 1, 1);
	
	
	/**Współrzędna x wektora  **/
	public float x;
	/**Współrzędna y wektora  **/
	public float y;
	/**Współrzędna z wektora  **/
	public float z;
	
	/**Konstruktor domyślny  Vector3D(0,0,0) **/
	public Vector3D(){ this(0,0,0); }
	/**Konstruktor parametryczny wektora 
	 * @param x wektora
	 * @param y wektora
	 * @param z wektora*/ 
	public Vector3D(float x , float y,float z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	/**Zwraca dlugosc wectora z T.Pitagorasa a^2 * b^2 = c^2 <br>
	 * Dlugość od współrzednych danego wektora  do wektora zerowgo (0,0,0)
	 * @return sqrt(x*x + y*y+ z*z) **/
	public float length()
	{
		return (float)Math.sqrt(x * x + y * y + z * z);
	}
	/** Przesunięcie ( translacja ) Vectora3D o wartosc[x,y,z] 
	 * @parm Vector3D który chcemy dodać
	 * @return  Nowy Vector3D w=[x1+x2,y1+y2,z1+z2]**/
	public Vector3D  add(Vector3D v)
	{
		this.x += v.x;
		this.y += v.y;
		this.z += v.z;
		return this;
	}
	/** Dodajemy Vectora3D do wektora
	 * @parm x który chcemy dodać
	 * @parm y który chcemy dodać
	 * @parm z który chcemy dodać
	 * @return  Nowy Vector3D w=[x1+x2,y1+y2,z1+z2]**/
	public Vector3D  add(float x,float y,float z)
	{
		this.x += x;
		this.y += y;
		this.z += z;
		return this;
	}
	/** Odejmujemy Vector3D od wektora  
	 * @parm Vector3D który chcemy odjąć
	 * @return Nowy Vector3D w=[x1-x2,y1-y2,z1-z2]**/
	public Vector3D sub(Vector3D v)	
	{
		this.x -= v.x;
		this.y -= v.y;
		this.z -= v.z;
		return this;
	}
	/** Przesunięcie wektora o wartosc[x,y,z]  
	 * @parm x który chcemy odjąć
	 * @parm y który chcemy odjąć
	 * @parm z który chcemy odjąć
	 * @return  Nowy Vector3D [x1-x2,y1-y2,z1-z2]**/
	public Vector3D sub(float x,float y,float z)	
	{
		this.x -= x;
		this.y -= y;
		this.z -= z;
		return this;
	}
	/**
	 *  W wyniku normalizacji otrzymujemy wektor zawarty w przedziale <0,1>
	 * @return |x| , |y| i |z|  w przedziale <0,1> */
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
	
	public Vector3D mul(float f)
	{
		this.x *= f;
		this.y *= f;
		this.z *= f;
		return this;
		
	}
	public Vector3D mul(Vector3D v)
	{
		this.x *= v.x;
		this.y *= v.y;
		this.z *= v.z;
		return this;
		
	}
	public Vector3D mul(float x,float y , float z)
	{
		this.x *= x;
		this.y *= y;
		this.z *= z;
		return this;
		
	}
	
	public Vector3D div(float f)
	{
		this.x *= f;
		this.y *= f;
		this.z *= f;
		return this;
		
	}
	public Vector3D div(Vector3D v)
	{
		this.x *= v.x;
		this.y *= v.y;
		this.z *= v.z;
		return this;
		
	}
	public Vector3D div(float x,float y , float z)
	{
		this.x *= x;
		this.y *= y;
		this.z *= z;
		return this;
		
	}

	/** Porównanie dwóch wektorów 3D
	 * @return true = Jeśli takie same **/
	public boolean isEqual(Vector3D v)
	{
		if ((this.x == v.x ) && (this.y == v.y) && (this.z == v.z))
		{
			return true;
		}
		return false;
	
	}
	/** Zmiana wartości pól x , y i z wektora */
	public Vector3D set(float x,float y,float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		return this;
	}


}
