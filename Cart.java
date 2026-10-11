public class Cart implements HotelService {
    public void requestCart(int numberOfCarts) {
        if (numberOfCarts <= 0) {
            System.out.println("Cart: Please request at least one luggage cart.");
            return;
        }

        System.out.println("Cart: " + numberOfCarts
                + " luggage cart(s) requested.");
    }

    @Override
    public void performService() {
        System.out.println("Cart: Providing luggage-cart service.");
    }
}
