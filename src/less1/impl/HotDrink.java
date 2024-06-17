package less1.impl;

import less1.Product;

public class HotDrink extends Product{

    protected float volume;

    protected int temperature;

    protected String pack;



    public HotDrink(String productName, float volume, int temperature) {
        super(productName);
        this.volume = volume;
        this.temperature = temperature;
        this.pack = Package.PAPER.getMaterial();;
    }

    public float getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getPack() {
        return pack;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "volume=" + volume +
                ", temperature=" + temperature +
                ", pack='" + pack + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}