package Inheritance;

class MountainBike extends Bicycle {
    int seatHeight;
    public MountainBike(int gear, int speed, int seatHeight){
        super(gear,speed);
        this.seatHeight=seatHeight;
    }
    @Override
    public String toString(){
        return(super.toString() + "\nseat height is "
                + seatHeight);
    }
}
