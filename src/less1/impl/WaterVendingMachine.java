package less1.impl;

import less1.Product;
import less1.VendingMachine;

import java.util.List;

public class WaterVendingMachine extends VendingMachine {

    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products){
        super(products);
    }
}