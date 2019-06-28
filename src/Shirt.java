public class Shirt extends Clothes {
    private String type;  // vTshrit (default), uTshirt, collarshirt, buttons


    public Shirt() {
        super();
        this.type="vTshirt";

    }

    public Shirt(String material, String color, boolean casual, boolean shortlength, String type) {
        super(material, color, casual, shortlength);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
