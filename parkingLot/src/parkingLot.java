import java.util.List;

public class parkingLot {
    private List<slot> slots;
    private displayboard displayboard;

    public List<slot> getAvailableSlots(){
        return displayboard.displayavailableSlots();
    }

    public boolean isSlotAvailable(vehicleType vehicleType){
        return true;
    }
    public slot getSlot(vehicleType vehicleType){
        return displayboard.getslot(vehicleType);
    }


}
