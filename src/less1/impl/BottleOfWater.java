package less1.impl;

import less1.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {

    protected float volume;

    protected String pack;

    protected boolean sparkling;

    public BottleOfWater(String name, double price, LocalDate releaseDate) {

        super(releaseDate, price, name);
        this.sparkling = false;
        this.volume = 1;
        this.pack = Package.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean sparkling,String pack, float volume) {
        super(releaseDate, price, name);
        this.sparkling = sparkling;
        this.volume = volume;
        this.pack = pack;


    }


    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isCarbonated() {
        return sparkling;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", carbonated=" + sparkling +
                '}';
    }
}