import shop.Store;

public class App {
    public static void main(String[] args) {
        Store store = new Store();
        store.fillingTheStoreWithGoods();
        store.doInspection();
    }
}
