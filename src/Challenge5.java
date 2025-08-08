/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class Challenge5 {
    public static void main(String[] args) {
        area(new Triangle(4.0, 3.0));
        area(new Square(4.0));
        area(new Rectangle(3.0, 2.5));
    }

    public interface Polygon{
        double calculateArea();
        void printArea();
    }

    public static void area(Polygon p) {
        p.printArea();
    }


    public static class Triangle implements Polygon{
        private final double width;
        private final double height;
        public Triangle(double width, double height){
            this.width = width;
            this.height = height;
        }
        @Override
        public double calculateArea(){
            return width * height / 2;
        }
        @Override
        public void printArea(){
            System.out.println("El área del triángulo es: " + calculateArea());
        }
    }

    public static class Square implements Polygon{
        private final double width;
        public Square(double width){
            this.width = width;
        }

        @Override
        public double calculateArea(){
            return width * width;
        }
        @Override
        public void printArea(){
            System.out.println("El área del cuadrado es: " + calculateArea());
        }
    }

    public static class Rectangle implements Polygon{
        private final double width;
        private final double height;
        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea(){
            return width * height;
        }
        @Override
        public void printArea(){
            System.out.println("El área del rectángulo es: " + calculateArea());
        }
    }
}
