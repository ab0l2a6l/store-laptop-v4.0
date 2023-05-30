package model.repository;

import model.entity.Laptop;

import java.util.List;

public interface InterfaceDAO {
    void save(Laptop laptop);
    List<Laptop> getLaptopList();
    Laptop findById(long id);
    boolean deleteById(long id);
    Laptop update(long id);

}
