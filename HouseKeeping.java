public class HouseKeeping implements HotelService {
    public void cleanRoom(int roomNumber) {
        System.out.println("HouseKeeping: Cleaning room " + roomNumber + ".");
    }

    @Override
    public void performService() {
        System.out.println("HouseKeeping: Providing room-cleaning service.");
    }
}
