import java.util.ArrayList;
import java.util.List;

public class entrygate extends gate{
    public boolean isslotavailable(vehicleType vehicleType){
        return true;
    }
    public slot getAvailableSlot(vehicleType vehicleType){
        return new slot();
    }

    public List<slot> displayallslots(){
        List<slot> slots= new ArrayList<>();
        return slots ;

    }
}
