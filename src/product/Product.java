package product;

import java.time.LocalDate;
import java.util.Random;

import shop.StoragePlace;

public abstract class Product {
    private String title;
    private int productExpirationDate;
    private final LocalDate producedOn;

    private StoragePlace place;

    public Product(String title, int productExpirationDate, LocalDate producedOn) {
        this.title = title;
        this.productExpirationDate = productExpirationDate;
        this.producedOn = producedOn;
    }

    public abstract boolean isFresh();

    public void placeProductTo() {
        Random random = new Random();
        if (random.nextBoolean()) {
            setPlace(StoragePlace.ICEBOX);
        } else {
            setPlace(StoragePlace.SHOWCASE);
        }
    }

    public String getProductExpirationDate() {
        return String.valueOf(productExpirationDate);
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place.getPlace();
    }

    private void setPlace(StoragePlace place) {
        this.place = place;
    }
}
