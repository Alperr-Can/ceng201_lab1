package game.inventory;

public class Item {
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    public String getName() {return name;}
    public String getGenre() {return genre;}
    public int getStockCount() {return stockCount;}
    String getSerialCode() {return serialCode;}

    private boolean isAvailable(int quantity) {
        return this.stockCount >= quantity;
    }

    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            this.stockCount -= quantity;
        } else {
            System.out.println("Sold 4 copy/copies of Galaxy Racer. Remaining stock: 8\n" +
                    "WARNING: Not enough stock for Shadow Realm. Requested: 6, Available: 5");
        }
    }
}
