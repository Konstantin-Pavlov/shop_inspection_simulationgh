package shop;

public enum StoragePlace {
    ICEBOX("Icebox"), SHOWCASE("Showcase");
    private final String place;

    StoragePlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}
