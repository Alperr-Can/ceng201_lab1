import game.inventory.Item;
import game.inventory.Inventory;

public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        Item item1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item item3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);

        shop.displayAll();
        System.out.println();

        //------------------------- Bazı kopyalar satılacak ve satılmaya çalışılacak
        item1.sell(4);
        item2.sell(6);

        System.out.println();

        //------------------------- Güncellenmiş stok gösterilecek
        shop.displayAll();
        System.out.println();

        //------------------------- İtemlerin serial code'larının gösterimi
        shop.auditSerialCodes();


        // System.out.println(item1.getSerialCode()); 

        // Bu neden çalışmaz, çünkü getSerialCode() metodu package-private.
        //Bu yüzden sadece aynı package içindeki sınıflardan erişilebilir.
        // GameShop.java ise ana yerde olduğu için  sınıfının package-private metodunu göremez ve compile error verir.
    }
}