public class Shoes {
    private String material;
    private String color;
    private String type;       // heel, sneakers, sandles, dress, casual (default)

    public Shoes() {

        material = "";
        color = "";
        type = "casual";
    }

    public Shoes(String material, String color, String type) {
        this.material = material;
        this.color = color;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
