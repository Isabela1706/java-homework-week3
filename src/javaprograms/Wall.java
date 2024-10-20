package javaprograms;

/**
 * Wall
 */

public class Wall {
    // Instance variables (fields)
    private double width;
    private double height;

    // No-arg constructor
    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    // Constructor with parameters
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the value of width
    public double getWidth() {
        return width;
    }

    // Method to set the value of width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Method to get the value of height
    public double getHeight() {
        return height;
    }
    // Method to set the value of height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to calculate the area of the wall
    public double getArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        // TEST CODE
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea()); // Should print 20.0

        wall.setHeight(-1.5); // Invalid height, should set to 0
        System.out.println("width= " + wall.getWidth());  // Should print 5.0
        System.out.println("height= " + wall.getHeight()); // Should print 0.0
        System.out.println("area= " + wall.getArea());  // Should print
}

    }
