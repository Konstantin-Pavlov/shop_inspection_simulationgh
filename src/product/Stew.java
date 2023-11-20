package product;

import java.time.LocalDate;

public class Stew extends Product {

    public Stew(String title, int productExpirationDate, LocalDate producedOn) {
        super(title, productExpirationDate, producedOn);
    }

    @Override
    public boolean isFresh() {
        // Get date of production
        LocalDate productionDate = getProducedOn();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the expiration date
        LocalDate expirationDate = productionDate.plusDays(Long.parseLong(getProductExpirationDate()));

        return currentDate.isBefore(expirationDate);
    }
}
