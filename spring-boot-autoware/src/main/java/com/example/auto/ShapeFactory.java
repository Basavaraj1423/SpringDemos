package com.example.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	/*
	 * Autowiring by type
	 * 
	 * @Autowired
	 * 
	 * @Qualifier("rectangle") //shape = new Rectangle(); private IShape shape;
	 * 
	 * /* public IShape getShape() { return shape; }
	 * 
	 * public void setShape(IShape shape) { this.shape = shape; }
	 */

	/*
	 * // Autowiring by name
	 * 
	 * @Autowired IShape triangle;
	 * 
	 * void printArea(int x, int y) { System.out.println("Area is");
	 * triangle.area(x, y); }
	 */
	@Autowired
	@Qualifier("rectangle")
	private IShape shape;
	// Autowiring by name
	private IShape shaper;
	@Autowired
	IShape triangle;

	public ShapeFactory(IShape shaper) {
		super();
		this.shaper = shaper;
	}

	public void printArea(String choice, int x, int y) {
		if (choice.equals("s")) {
			shaper.area(x, y);
		} else if (choice.equals("r")) {
			shape.area(x, y);
		} else if (choice.equals("t")) {
			triangle.area(x, y);

		}

	}
}
