import java.util.ArrayList;

public class Closet {
    private Jacket jacketItem;
    private Shirt shirtItem;
    private Pants pantsItem;
    private Shoes shoesItem;

    public Closet() {
        this.jacketItem = null;
        this.shirtItem = null;
        this.pantsItem = null;
        this.shoesItem = null;
    }

    public Closet(Jacket jacketItem, Shirt shirtItem, Pants pantsItem, Shoes shoesItem) {
        this.jacketItem = jacketItem;
        this.shirtItem = shirtItem;
        this.pantsItem = pantsItem;
        this.shoesItem = shoesItem;
    }

    public Jacket getJacketItem() {
        return jacketItem;
    }

    public void setJacketItem(Jacket jacketItem) {
        this.jacketItem = jacketItem;
    }

    public Shirt getShirtItem() {
        return shirtItem;
    }

    public void setShirtItem(Shirt shirtItem) {
        this.shirtItem = shirtItem;
    }

    public Pants getPantsItem() {
        return pantsItem;
    }

    public void setPantsItem(Pants pantsItem) {
        this.pantsItem = pantsItem;
    }

    public Shoes getShoesItem() {
        return shoesItem;
    }

    public void setShoesItem(Shoes shoesItem) {
        this.shoesItem = shoesItem;
    }

    public Jacket lookForItem(String color){
        String str = this.jacketItem.getColor();

        if (color.equalsIgnoreCase(str))
            return  this.jacketItem;
        else
            return null;


    }

    public void initalizeCloset() {

    }
}
