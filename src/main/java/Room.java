public class Room {
    private int number;
    private BedType bedType;
    public Room(int number, BedType bedType){
        this.number = number;
        this.bedType = bedType;
    }
    public String getInfo(){
        return String.format("Dodano nowy pokój - numer: %d (%s)",
                this.number,this.bedType.toString());
    }
}
