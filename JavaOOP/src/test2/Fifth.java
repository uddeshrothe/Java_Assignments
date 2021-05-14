package test2;

abstract class Shape{

	abstract void draw();

}
class line extends Shape{

	@Override
	void draw() {
		System.out.println("Line printed!");
		
	}}

class rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Rectangle printed!");
		
	}}

class cube extends Shape{

	@Override
	void draw() {
		System.out.println("Cube printed!");
		
	}}

class Fifth{
	public static void main(String[] args) {
		line l = new line();
		l.draw();
		rectangle  r = new rectangle();
		r.draw();
		cube c = new cube();
		c.draw();
	}
}

