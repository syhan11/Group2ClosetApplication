public class Shirt extends Clothes {
    private String type;  // v neck (default), u neck, collars, buttons

    public Shirt() {
        this.type = "v neck";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String showShirt() {
        String msg;

        if (this.isShortlength())
            msg = "short";
        else
            msg = "long";


        return this.getColor() + " " + msg +
                this.getMaterial() + " " + this.getType() + " shirt";
    }
}
