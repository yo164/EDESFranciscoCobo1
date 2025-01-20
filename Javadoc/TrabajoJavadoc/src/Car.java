/**
 * la clase Car tiene los atributos para crear objetos de su clase (coches) los cuales tienen Marca
 * Modelo, Año de Fabricación y precio con el que fueron puestos a la venta en Catálogo, permite 
 * añadir y modificar la información de los objetos de esta clase 
 * @author Francisco Cobo Sánchez
 * 
 * 
 */
public class Car {
    // atributos de clase
    private String make;
    private String model;
    private int year;
    private double price;

    // CONSTRUCTOR
    /**
     *  CONSTRUCTOR
     * 
     * @param make Marca del coche
     * 
     * @param model Modelo del coche
     * 
     * @param year Año de fabricación del coche
     * 
     * @param price Precio de Catálogo del coche
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // GETTERS Y SETTERS
    /**
     * Nos devuelve el valor de la marca
     * 
     * @return String Nos devuelve el valor de la marca
     */
    public String getMake() {
        return make;
    }

    /**
     * Establece la marca del coche
     * 
     * @param make Establece la marca del coche
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * String Nos devuelve  el modelo
     * 
     * @return String Nos devuelve  el modelo
     */
    public String getModel() {
        return model;
    }


    /**
     * Establece el modelo del coche 
     * 
     * @param model Establece el modelo del coche
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Devuelve el año de fabricación del coche
     * 
     * @return int Devuelve el año de fabricación del coche
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece el año de fabricación del coche
     * 
     * @param year Establece el año de fabricación del coche
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Nos devuelve el precio de Catálogo del coche
     * 
     * @return double Nos devuelve el precio de Catálogo del coche
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio de Catálogo del coche
     * 
     * @param price Establece el precio de Catálogo del coche
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *Nos devuelve una descripción del coche concatenando sus atributos
     * 
     * @return String  Nos devuelve una descripción del coche concatenando sus atributos
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /**
     * nos devuelve lo mismo que el metodo anterior pero metido en una función
     * 
     * @return String nos devuelve lo mismo que el metodo anterior pero metido en una función
     */
    @Override
    public String toString() {
        return carDescription();
    }

    // Método principal que ejecuta el programa
    /**
     * Método principal que ejecuta el programa
     * 
     * @param args creamos un nuevo objeto de la clase Car a cuyos atributos asignamos valores y seguidamente
     * imprimos por pantalla los datos almacenados dentro del objeto
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}