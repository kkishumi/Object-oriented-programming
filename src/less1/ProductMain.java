package less1;

import less1.impl.*;

import less1.impl.Package;

import java.util.List;

import java.time.LocalDate;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Шишкин Лес", 43, LocalDate.of(2024, 4, 7));
        Product bottle2 = new BottleOfWater("Ессентуки Газированная", 55, LocalDate.of(2024, 5, 2),
                true, Package.GLASS.getMaterial(),0.5F);

        VendingMachine vm = new WaterVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle2,bottle1, bottle2,bottle1, bottle2,bottle1, bottle2));

        System.out.println(vm.getProducts());
        vm.getProduct("Ессентуки Газированная");

        System.out.println(vm.getProducts());


        Product tea = new HotDrink("Green tea",750,58);

        Product coffee = new HotDrink("Natty",750,58);

        VendingMachine hvm = new HotDrinkVendingMachine();

        System.out.println(hvm.getProducts());

        hvm.addProducts(List.of(tea, coffee, tea, coffee, tea, coffee,tea, coffee,tea, coffee,tea, coffee));
        System.out.println(hvm.getProducts());

        hvm.getProduct("Natty");

        System.out.println(hvm.getProducts());


    }
}