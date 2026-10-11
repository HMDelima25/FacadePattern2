public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void arrangeVehiclePickup(String plateNumber) {
        System.out.println("FrontDesk: Arranging vehicle pickup.");
        valet.pickUpVehicle(plateNumber);
    }

    public void arrangeRoomCleaning(int roomNumber) {
        System.out.println("FrontDesk: Arranging room cleaning.");
        houseKeeping.cleanRoom(roomNumber);
    }

    public void arrangeCart(int numberOfCarts) {
        System.out.println("FrontDesk: Arranging luggage carts.");
        cart.requestCart(numberOfCarts);
    }
}
