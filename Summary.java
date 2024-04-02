import java.io.Serializable;

public class Summary implements Serializable{
    private int id, room_id, pay_room_cost, pay_water_cost, pay_elec_cost, pay_total_cost;
    private boolean pay_status;
    
    public Summary(){
        this.id = 0;
        this.room_id = 0;
        this.pay_room_cost = 0;
        this.pay_water_cost = 0;
        this.pay_elec_cost = 0;
        this.pay_total_cost = 0;
        this.pay_status = true;
    }
    public Summary(int id, int room_id, int pay_room_cost, int pay_water_cost, int pay_elec_cost, int pay_total_cost, boolean pay_status){
        this.id = id;
        this.room_id = room_id;
        this.pay_room_cost = pay_room_cost;
        this.pay_water_cost = pay_water_cost;
        this.pay_elec_cost = pay_elec_cost;
        this.pay_total_cost = pay_total_cost;
        this.pay_status = pay_status;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setRoom_id(int room_id){
        this.room_id = room_id;
    }
    public void setPay_room_cost(int pay_room_cost){
        this.pay_room_cost = pay_room_cost;
    }
    public void setPay_water_cost(int pay_water_cost){
        this.pay_water_cost = pay_water_cost;
    }
    public void setPay_elec_cost(int pay_elec_cost){
        this.pay_elec_cost = pay_elec_cost;
    }
    public void setPay_total_cost(int pay_total_cost){
        this.pay_total_cost = pay_total_cost;
    }
    public void setPay_status(boolean pay_status){
        this.pay_status = pay_status;
    }
    public int getID(){
        return id;
    }
    public int getRoom_id(){
        return room_id;
    }
    public int getPay_room_cost(){
        return pay_room_cost;
    }
    public int getPay_water_cost(){
        return pay_water_cost;
    }
    public int getPay_elec_cost(){
        return pay_elec_cost;
    }
    public int getPay_total_cost(){
        return pay_total_cost;
    }
    public boolean getPay_status(){
        return pay_status;
    }
    
}
