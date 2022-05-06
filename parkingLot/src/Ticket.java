import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ticket {
    slot slot;
    String vehicleNumber;
    LocalDateTime entrytime;
    Float paidamount;
    boolean paymentstatus;
    public Ticket(slot slot){
        this.slot=slot;
        this.entrytime= LocalDateTime.now();
        //LocalDateTime mydateobj = LocalDateTime.now();
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
        //this.entrytime= mydateobj.format(dateTimeFormatter);
    }

    public float calculateDueAmount(LocalDateTime exittime){
        float pendingamount;
        if(exittime ==null){
            exittime=LocalDateTime.now();
        }
        long totaltime= exittime.getMinute()-entrytime.getMinute();
        pendingamount =totaltime*1;
        return pendingamount-paidamount;
    }

    public boolean pay(float amount){
        this.paymentstatus=true;
        return true;

    }

    public Invoice getinvoice(){
        if (paymentstatus){
            return new Invoice(this);
        }

        throw  new RuntimeException("please pay the amount first");
    }





}
