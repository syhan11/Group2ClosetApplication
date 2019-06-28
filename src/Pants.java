public class Pants extends Clothes {

    private String type;   // jean (default) , sweat, dress, casual

    public Pants() {
        this.type = "jean";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
