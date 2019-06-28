public class Shirt extends Clothes {
    private String type;  // vTshrit (default), uTshirt, collarshirt, buttons

    public Shirt() {
        this.type = "vTshirt";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
