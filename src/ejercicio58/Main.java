package ejercicio58;

public class Main
{

	public static void main(String[] args)
	{
		Rectangulo rectangulo1 = new Rectangulo(2.17f, 4.87f, 5.47f, 7.28f);
		System.out.println("Rectangulo 1");
		System.out.print("Base: ");
		System.out.println(rectangulo1.getBase());
		System.out.print("Altura: ");
		System.out.println(rectangulo1.getAltura());
		System.out.print("X: ");
		System.out.println(rectangulo1.getX());
		System.out.print("Y: ");
		System.out.println(rectangulo1.getY());
		System.out.print("Area: ");
		System.out.println(rectangulo1.getArea());
		System.out.print("Perimetro: ");
		System.out.println(rectangulo1.getPerimetro());
		System.out.println("Rectangulo 1 modificado");
		rectangulo1.setBase(3.2f);
		System.out.print("Base: ");
		System.out.println(rectangulo1.getBase());
		rectangulo1.setAltura(1.35f);
		System.out.print("Altura: ");
		System.out.println(rectangulo1.getAltura());
		rectangulo1.setX(3.82f);
		System.out.print("X: ");
		System.out.println(rectangulo1.getX());
		rectangulo1.setY(5.47f);
		System.out.print("Y: ");
		System.out.println(rectangulo1.getY());
		System.out.println("Rectangulo agrandado +3 base y +4 altura:");
		rectangulo1.agranda(3, 4);
		System.out.print("Base: ");
		System.out.println(rectangulo1.getBase());
		System.out.print("Altura: ");
		System.out.println(rectangulo1.getAltura());
		System.out.print("X: ");
		System.out.println(rectangulo1.getX());
		System.out.print("Y: ");
		System.out.println(rectangulo1.getY());
		System.out.println("Rectangulo agrandado +3 base y altura:");
		rectangulo1.agranda(3);
		System.out.print("Base: ");
		System.out.println(rectangulo1.getBase());
		System.out.print("Altura: ");
		System.out.println(rectangulo1.getAltura());
		System.out.print("X: ");
		System.out.println(rectangulo1.getX());
		System.out.print("Y: ");
		System.out.println(rectangulo1.getY());
		System.out.println("Rectangulo agrandado en una unidad base y altura:");
		rectangulo1.agranda();
		System.out.print("Base: ");
		System.out.println(rectangulo1.getBase());
		System.out.print("Altura: ");
		System.out.println(rectangulo1.getAltura());
		System.out.print("X: ");
		System.out.println(rectangulo1.getX());
		System.out.print("Y: ");
		System.out.println(rectangulo1.getY());
		Rectangulo rectangulo2 = new Rectangulo(5.15f, 7.63f);
		System.out.println("Rectangulo de base = 5.15, altura = 7.63, x = default e y = default:");
		System.out.print("Base: ");
		System.out.println(rectangulo2.getBase());
		System.out.print("Altura: ");
		System.out.println(rectangulo2.getAltura());
		System.out.print("X: ");
		System.out.println(rectangulo2.getX());
		System.out.print("Y: ");
		System.out.println(rectangulo2.getY());
		Rectangulo rectangulo3 = new Rectangulo(10.63f);
		System.out.println("Rectangulo de base = 10.63, altura = default, x = default e y = default:");
		System.out.print("Base: ");
		System.out.println(rectangulo3.getBase());
		System.out.print("Altura: ");
		System.out.println(rectangulo3.getAltura());
		System.out.print("X: ");
		System.out.println(rectangulo3.getX());
		System.out.print("Y: ");
		System.out.println(rectangulo3.getY());
		Rectangulo rectangulo4 = new Rectangulo();
		System.out.println("Rectangulo de base = default, altura = default, x = default e y = default:");
		System.out.print("Base: ");
		System.out.println(rectangulo4.getBase());
		System.out.print("Altura: ");
		System.out.println(rectangulo4.getAltura());
		System.out.print("X: ");
		System.out.println(rectangulo4.getX());
		System.out.print("Y: ");
		System.out.println(rectangulo4.getY());
	}

}
