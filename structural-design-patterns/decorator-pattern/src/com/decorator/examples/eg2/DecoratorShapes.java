package com.decorator.examples.eg2;

public class DecoratorShapes {

	interface Shape {
		public void draw();
	}

	static class Circle implements Shape {
		@Override
		public void draw() {
			System.out.println("Shape: Circle");
		}
	}

	static class Rectangle implements Shape {
		@Override
		public void draw() {
			System.out.println("Shape: Rectangle");
		}
	}

	static class ShapeDecorator implements Shape {

		protected Shape decoratedShape;

		public ShapeDecorator(Shape decoratedShape) {
			this.decoratedShape = decoratedShape;
		}

		@Override
		public void draw() {
			decoratedShape.draw();
		}
	}

	static class RedShapeDecorator extends ShapeDecorator {

		public RedShapeDecorator(Shape decoratedShape) {
			super(decoratedShape);
		}

		@Override
		public void draw() {
			decoratedShape.draw();
			setRedBorder(decoratedShape);
		}

		private void setRedBorder(Shape decoratedShape) {
			System.out.println("Border Color: Red");
		}
	}

	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}

}