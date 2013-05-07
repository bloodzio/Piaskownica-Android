package game.math;

//import android.R.bool;
/**
 *Wektor - Uporządkowana para liczb u =[x,y]  gdzie x i y są jego wpółrzędnymi w protokątnym układzie współrzednych.<br>
 *<img alt=”description” height=”50″ width=”50″ src=wektor2d.png><br>
 *Wektory generalnie mogą być reprezentowane na 2 różne sposoby.<br>
 *1: przez długość i jakiś kąt(trygonometria).<br>
 *2: przez początkowy i końcowy punkt(macierze).<br>
 * @author Leszek Uchacz
 * @version beta
 * 
 */
public class Vector2D
{
	/**Współrzędna x wektora  **/
	public float x;
	/**Współrzędna y wektora **/
	public float y;
	
	/**Konstruktor domyślny  Vector2D(0,0) **/
	public Vector2D(){ this(0,0); }
	/**Konstruktor parametryczny wektora 
	 * @param x wektora
	 * @param y wektora*/ 
	public Vector2D(float x , float y)
	{
		this.x=x;
		this.y=y;
	}
	
	/**Zwraca dlugosc wectora z T.Pitagorasa a^2 * b^2 = c^2 <br>
	 * Dlugość od współrzednychdanego wektora  do wektora zerowgo (0,0)
	 * @return sqrt(x * x + y * y) **/
	public float length()
	{
		return  (float)Math.sqrt(x * x + y * y);
	}
	/** Dodajemy  Vector2D do wektora
	 * @parm Vector2D który chcemy dodać
	 * @return  Nowy Vector2D [x1+x2,y1+y2]**/
	public Vector2D  add(Vector2D v)
	{
		this.x += v.x;
		this.y += v.y;
		return this;
		
	}
	/** Przesunięcie ( translacja ) Vectora2D o wartosc[x,y] 
	 * @parm x który chcemy dodać
	 * @parm y który chcemy dodać
	 * @return  Nowy Vector2D w=[x1+x2,y1+y2]**/
	public Vector2D  add(float x,float y)
	{
		this.x += x;
		this.y += y;
		return this;
	}
	/** Odejmujemy Vector2D od wektora  
	 * @parm Vector2D który chcemy odjąć
	 * @return Nowy Vector2D [x1-x2,y1-y2]**/
	public Vector2D sub(Vector2D v)	
	{
		this.x -= v.x;
		this.y -= v.y;
		return this;
	}
	/** Przesunięcie wektora o wartosc[x,y]  
	 * @parm x który chcemy odjąć
	 * @parm y który chcemy odjąć
	 * @return  Nowy Vector2D [x1-x2,y1-y2]**/
	public Vector2D sub(float x,float y)	
	{
		this.x -= x;
		this.y -= y;
		return this;
	}
	/**
	 *  W wyniku normalizacji otrzymujemy wektor zawarty w przedziale <0,1>
	 * @return |x| i |y| w przedziale <0,1> */
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
	/** Mnożenie (skalowanie względem początku układu współ(0,0)) wektora o Vectora2D 
	 * @return  Nowy Vector2D [x1*x2,y1*y2]**/
	public Vector2D mul(Vector2D v)
	{
		this.x *= v.x;
		this.y *= v.y;
		return this;
	}
	
	/**  Mnożenie (skalowanie względem początku układu współ(0,0)) wektora o wartosci x i y. 
	 * @return  Nowy Vector2D [x1*x2,y1*y2]**/
	public Vector2D mul(float x,float y)
	{
		this.x *= x;
		this.y *= y;
		return this;
	}
	
	/** Dzielenie wektora o Vectora2D 
	 * @return  Nowy Vector2D [x1/x2,y1/y2]**/
	public Vector2D div(Vector2D v)
	{
		this.x /= v.x;
		this.y /= v.x;
		return this;	
	}
	/** Porównanie dwóch wektorów 2D
	 * @return true = Jeśli takie same **/
	public boolean isEqual(Vector2D v)
	{
		if ((this.x == v.x ) && (this.y == v.y))
		{
			return true;
		}
		return false;
	
	}
	/** Zmiana wartości pól x i y wektora */
	public void set(float x,float y)
	{
		this.x = x;
		this.y = y;
	}
	
/**  TODO : Transformacja -  Obrót o kąt */
}


