package model.repository;

import model.entity.Laptop;

import java.util.ArrayList;
import java.util.List;

public class LaptopDAO implements InterfaceDAO {
    List<Laptop> laptopList = new ArrayList<>();

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
    public Laptop update(long id) {
        return findById(id);
    }

}
