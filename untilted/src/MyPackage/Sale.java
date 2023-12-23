package MyPackage;

public final class Sale {

    private Sale() {
    }

    public static int sale() {
        int totalSale = 0;
        Order order = new Order();
        for (Dishes dish : order.orders) {
            if (dish == Dishes.PASTA) {
                for (Dishes dishes : order.orders) {
                    if (dishes == Dishes.WINE) {
                        totalSale += 30;
                    }
                }
            }
            if (dish == Dishes.SALAD) {
                totalSale += 10;
            }
            if (dish == Dishes.DESSERT) {
                totalSale += 15;
            }
            if (dish == Dishes.PIZZA) {
                for (Dishes dishes : order.orders) {
                    if (dishes == Dishes.SPRITE) {
                        totalSale += 33;
                    }
                }
            }
        }
        System.out.println("Sale: " + totalSale);
        return totalSale;
    }
}
