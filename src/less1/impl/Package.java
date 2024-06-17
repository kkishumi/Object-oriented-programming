package less1.impl;

public enum Package {
    PLASTIC("пластик"), GLASS("стекло"),PAPER("бумага");

    private final String material;

    Package(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
