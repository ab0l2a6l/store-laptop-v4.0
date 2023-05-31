package view;

import common.StaticScanner;
import controler.LaptopControler;
import model.entity.Laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = StaticScanner.getData();
        LaptopControler laptopControler = new LaptopControler();

        for (; ; ) {
            showMainMenu();
            int requestForMenu = input.nextInt();
            input.nextLine();

            switch (requestForMenu) {
                case 1 -> {
                    Laptop laptop = new Laptop();
                    System.out.print("insert laptop name: ");
                    laptop.setLaptopName(input.nextLine());
                    System.out.print("insert id: ");
                    laptop.setId(input.nextLong());

                    laptopControler.sendDataToServiceForSave(laptop);

                }

                case 2 -> {
                    System.out.print("insert id for search: ");
                    if (laptopControler.sendIdToServiceForSearch(input.nextLong()) != null)
                        System.out.println("found");
                    else
                        System.out.println("not found");
                }

                case 3 -> {
                    System.out.print("insert id for delete: ");
                    if (laptopControler.sendIdToServiceForDelete(input.nextLong()))
                        System.out.println("deleted");
                    else
                        System.out.println("not found");
                }

                case 4 -> {
                    System.out.print("insert id for update: ");
                    boolean laptopUpdate = laptopControler.sendDataToServiceForUpdate(input.nextLong());
                    if (laptopUpdate) {
                        System.out.println("updated");
                    } else System.out.println("wrong id");
                }

                case 5 -> {
                    return;
                }
            }
        }
    }

    private static void menuForUpdate() {
        System.out.println("select an item for update");
        System.out.println("1.laptop name");
        System.out.println("2.id");
    }

    private static void showMainMenu() {
        System.out.println("1.insert");
        System.out.println("2.search");
        System.out.println("3.delete");
        System.out.println("4.update");
        System.out.println("5.exit");
    }
}
