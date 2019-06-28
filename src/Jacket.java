public class Jacket extends Clothes {

    private String type;    // 2 buttons, 3 buttons, hood, no butons, zipper(default)

    public Jacket() {
        super();
        super.setShortlength(false);
        type = "zipper";
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
