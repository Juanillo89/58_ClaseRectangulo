package ejercicio58;

/**
 * @author Xuan
 */
public class Rectangulo
{
	private float base;
	private float altura;
	private float x;
	private float y;

	/**
	 * Construye un Rectangulo especificando base, altura y coordenadas x e y.
	 * @param base Especifica la base del rectangulo en centimetros.
	 * @param altura Especifica la altura del rectangulo en centimetros.
	 * @param x Especifica la coodenada x del rectangulo en centimetros.
	 * @param y Especifica la coodenada y del rectangulo en centimetros.
	 */
	public Rectangulo(float base, float altura, float x, float y)
	{
		this.base = base;
		this.altura = altura;
		this.x = x;
		this.y = y;
	}

	/**
	 * Construye un Rectangulo especificando base y altura pero sin especificar su posicion,
	 * que por defecto es x = 0, y = 0.
	 * @param base Especifica la base del rectangulo en centimetros.
	 * @param altura Especifica la altura del rectangulo en centimetros.
	 */
	public Rectangulo(float base, float altura)
	{
		this.base = base;
		this.altura = altura;
		x = 0;
		y = 0;
	}

	/**
	 * Construye un Rectangulo especificando la base. La altura sera de 1 cm
	 * y su posicion por defecto es x = 0, y = 0.
	 * @param base Especifica la base del rectangulo en centimetros.
	 */
	public Rectangulo(float base)
	{
		this.base = base;
		altura = 1;
		x = 0;
		y = 0;
	}

	/**
	 * Construye un Rectangulo de base y altura 1 centimetro y posicion
	 * x = 0, y = 0.
	 */
	public Rectangulo()
	{
		base = 1;
		altura = 1;
		x = 0;
		y = 0;
	}

	/**
	 * Devuelve la base del Rectangulo.
	 * @return La base en centimetros.
	 */
	public float getBase()
	{
		return base;
	}

	/**
	 * Define la base del Rectangulo.
	 * @param base La base en centimetros.
	 */
	public void setBase(float base)
	{
		this.base = base;
	}

	/**
	 * Devuelve la altura del Rectangulo.
	 * @return La altura en centimetros.
	 */
	public float getAltura()
	{
		return altura;
	}

	/**
	 * Define la altura del Rectangulo.
	 * @param altura La altura en centimetros.
	 */
	public void setAltura(float altura)
	{
		this.altura = altura;
	}

	/**
	 * Devuelve la coordenada x del Rectangulo.
	 * @return La coordenada x en centimetros.
	 */
	public float getX()
	{
		return x;
	}

	/**
	 * Define la coordenada x del Rectangulo.
	 * @param x La coordenada x en centimetros.
	 */
	public void setX(float x)
	{
		this.x = x;
	}

	/**
	 * Devuelve la coordenada y del Rectangulo.
	 * @return La coordenada y en centimetros.
	 */
	public float getY()
	{
		return y;
	}

	/**
	 * Define la coordenada y del Rectangulo.
	 * @param y La coordenada y en centimetros.
	 */
	public void setY(float y)
	{
		this.y = y;
	}

	/**
	 * Devuelve el area del Rectangulo.
	 * @return El area en centimetros cuadrados.
	 */
	public float getArea()
	{
		float area = base * altura;
		return area;
	}

	/**
	 * Devuelve el perimetro del Rectangulo.
	 * @return El perimetro en centimetros.
	 */
	public float getPerimetro()
	{
		float perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}

	/**
	 * Agranda la base y altura del rectangulo.
	 * @param aumentaBase El aumento de la base en centimetros.
	 * @param aumentaAltura El aumento de la altura en centimetros.
	 */
	public void agranda(float aumentaBase, float aumentaAltura)
	{
		base += aumentaBase;
		altura += aumentaAltura;
	}

	/**
	 * Agranda la base y altura del rectangulo.
	 * @param valor El aumento de base y altura en centimetros.
	 */
	public void agranda(float valor)
	{
		base += valor;
		altura += valor;
	}

	/**
	 * Agranda la base y altura del rectangulo en 1 centimetro.
	 */
	public void agranda()
	{
		base += 1;
		altura += 1;
	}
}
