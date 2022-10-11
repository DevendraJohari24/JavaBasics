/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandgenerics;

/**
 *
 * @author deven
 */
public class Laptop implements Comparable<Laptop>{
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" + "brand=" + brand + ", ram=" + ram + ", price=" + price + '}';
    }
   
    public int compareTo(Laptop lap2){
        // this > lap2 = +
        // this < lap2 = -
        // this == lap2 = 0
        
        if(this.getRam() > lap2.getRam()) return 1;
        else if (this.getRam() == lap2.getRam()) return 0;
        else return -1;
    }
}
