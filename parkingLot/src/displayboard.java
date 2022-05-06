import java.util.List;
public class displayboard {
    List<slot> slots;
    public List<slot> displayavailableSlots(){
        return slots;
    }

    public slot getslot(vehicleType vehicleType){
        return new slot();
    }
}
