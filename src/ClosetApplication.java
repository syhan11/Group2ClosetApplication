import java.util.ArrayList;

public class ClosetApplication {
    ArrayList<Jacket> allJackets = new ArrayList<Jacket>();
    ArrayList<Shirt> allShirts = new ArrayList<Shirt>();
    ArrayList<Pants> allPants = new ArrayList<Pants>();
    ArrayList<Shoes> allShoes = new ArrayList<Shoes>();





    public static void main(String[] args) {

        // initialize jacket, shirts, pants, & shoes into ArrayList
        initalizeJackets();
        initalizeShirts();
        initalizePants();
        initalizeShoes();

        Closet ansuCloset new Closet();
        Closet kellyCloset new Closet();
        Closet sueCloset new Closet();


        ansuCloset.initalizeCloset();
        kellyCloset.initalizeCloset();
        sueCloset.initalizeCloset();

        // get jacket information from the user
        // set variable for searching jacket, like color and/or material

        Jacket jacket = ansuCloset.lookForItem("blue");
        if (jacket == null) {
            jacket = kellyCloset.lookForItem("blue");
            if (jacket == null) {
                jacket = sueCloset.lookForItem("blue");
                if (jacket == null) {
                    System.out.println("blue jacket not available.");
                }
            }
        }

        if (jacket != null) {
            System.out.println("blue jacket found");
        }


    }
}
