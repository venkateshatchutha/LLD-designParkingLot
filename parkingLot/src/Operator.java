import java.util.List;

public class Operator {
    parkingLot parkingLot;

    public List<slot> displayAvailableSlots(){
        return parkingLot.getAvailableSlots();
    }
    public Ticket issueslot(vehicleType vehicleType, String vehicleNumber){
        slot slot = parkingLot.getSlot(vehicleType);
        Ticket ticket =new Ticket(slot);
        ticket.vehicleNumber=vehicleNumber;
        return ticket;
    }

}
