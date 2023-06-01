package model.server;

import model.entity.Laptop;
import model.repository.InterfaceDAO;
import model.repository.LaptopDAO;

public class LaptopService implements InterfaceService {
    InterfaceDAO interfaceDAO = new LaptopDAO();

    @Override
    public void sendDataToDAOForSave(Laptop laptop) {
        interfaceDAO.save(laptop);
    }

    @Override
    public Laptop sendIdToDAOForSearch(long id) {
        return interfaceDAO.findById(id);
    }

    @Override
    public boolean sendIdToDAOForDelete(long id) {
        return interfaceDAO.deleteById(id);
    }

    @Override
    public void sendDataToDAOForUpdate(Laptop laptop) {
        interfaceDAO.update(laptop);
    }
}
