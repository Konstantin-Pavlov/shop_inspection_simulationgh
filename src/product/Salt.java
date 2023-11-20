package product;

import java.time.LocalDate;

public class Salt extends Product {
    public Salt(String title, int productExpirationDate, LocalDate producedOn) {
        super(title, productExpirationDate, producedOn);
    }

    @Override
    public String getProductExpirationDate() {
        return "INF";
    }

    @Override
    public boolean isFresh() {
        return true;
    }
}
