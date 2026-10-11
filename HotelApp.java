public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.arrangeVehiclePickup("ABC-123");
        frontDesk.arrangeRoomCleaning(305);
        frontDesk.arrangeCart(2);
    }
}
