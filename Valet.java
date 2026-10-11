public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Vehicle with plate " + plateNumber
                + " is ready for pickup.");
    }

    @Override
    public void performService() {
        System.out.println("Valet: Providing vehicle valet service.");
    }
}
