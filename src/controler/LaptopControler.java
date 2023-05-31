package controler;

import model.entity.Laptop;
import model.server.InterfaceService;
import model.server.LaptopService;

public class LaptopControler {
    InterfaceService interfaceServer = new LaptopService();

    public void sendDataToServiceForSave(Laptop laptop) {
        interfaceServer.sendDataToDAOForSave(laptop);
    }

    public Laptop sendIdToServiceForSearch(long id) {
        return interfaceServer.sendIdToDAOForSearch(id);
    }

    public boolean sendIdToServiceForDelete(long id) {
        return interfaceServer.sendIdToDAOForDelete(id);
    }

    public boolean sendDataToServiceForUpdate(long id) {
        return interfaceServer.sendDataToDAOForUpdate(id);
    }
}
