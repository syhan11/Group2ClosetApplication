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


    public String showPants() {
        String msg;

        if (this.isShortlength())
            msg = "short";
        else
            msg = "long";


        return this.getColor() + " " + msg +
                this.getMaterial() + " " + this.getType() + " pants";
    }
}
