import java.util.ArrayList;


public class ClosetApplication {

    public static ArrayList<Jacket> allJackets = new ArrayList<Jacket>();
    public static ArrayList<Shirt> allShirts = new ArrayList<Shirt>();
    public static ArrayList<Pants> allPants = new ArrayList<Pants>();
    public static ArrayList<Shoes> allShoes = new ArrayList<Shoes>();




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


    public static void initalizeJackets() {

        Jacket item = new Jacket("cotton", "blue", true,
                false, "2 buttons");
        allJackets.add(item);

        item = new Jacket("linen", "brown", true,
                false, "3 buttons");
        allJackets.add(item);

        item = new Jacket("polyester", "grey", true,
                false, "hood");
        allJackets.add(item);

        item = new Jacket("linen", "yellow", true,
                false, "no butons");
        allJackets.add(item);

        item = new Jacket("polyester", "white", true,
                false, "zipper");
        allJackets.add(item);




    }

    public static void initalizeShirts() {

    }

    public static void initalizePants() {

    }

    public static void initalizeShoes() {

    }


}
