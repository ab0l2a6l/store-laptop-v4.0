package model.repository;

import common.StaticScanner;
import model.entity.Laptop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaptopDAO implements InterfaceDAO {
    List<Laptop> laptopList = new ArrayList<>();
    Scanner input = StaticScanner.getData();
    @Override
    public void save(Laptop laptop) {
        laptopList.add(laptop);
    }

    @Override
    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    @Override
    public Laptop findById(long id) {
        for (Laptop eachLaptop : laptopList) {
            if (eachLaptop.getId() == id)
                return eachLaptop;
        }
        return null;
    }

    @Override
    public boolean deleteById(long id) {
        Laptop laptop = findById(id);
        if (laptop != null) {
            laptopList.remove(laptop);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(long id) {
        Laptop laptop =  findById(id);
        if (laptop != null)
        {
            System.out.print("insert new laptop name: ");
            laptop.setLaptopName(input.nextLine());

            System.out.print("insert new id: ");
            laptop.setId(input.nextLong());

            return true;
        }
        return false;
    }

}
