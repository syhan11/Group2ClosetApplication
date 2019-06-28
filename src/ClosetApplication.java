import java.util.ArrayList;
import java.util.Random;


public class ClosetApplication {

    public static ArrayList<Jacket> allJackets = new ArrayList<Jacket>();
    public static ArrayList<Shirt> allShirts = new ArrayList<Shirt>();
    public static ArrayList<Pants> allPants = new ArrayList<Pants>();
    public static ArrayList<Shoes> allShoes = new ArrayList<Shoes>();


    public static void main(String[] args) {

        // initialize jacket, shirts, pants, & shoes into ArrayList
        allJackets = new ArrayList<Jacket>();
        initalizeJackets();
        initalizeShirts();
        initalizePants();
        initalizeShoes();



        Closet ansuCloset = new Closet();
        Closet kellyCloset = new Closet();
        Closet sueCloset = new Closet();


        initalizeCloset(ansuCloset);
        initalizeCloset(kellyCloset);
        initalizeCloset(sueCloset);


        // get jacket information from the user
        // set variable for searching jacket, like color and/or material
/***
        Jacket jacket = ansuCloset.lookForJacket("blue");
        if (jacket == null) {
            jacket = kellyCloset.lookForJacket("blue");
            if (jacket == null) {
                jacket = sueCloset.lookForJacket("blue");
                if (jacket == null) {
                    System.out.println("blue jacket not available.");
                }
            }
        }

        if (jacket != null) {
            System.out.println("blue jacket found");
        }
 ****/
        // print out the content of each closet
        System.out.println("Ansu Closet has \n" + ansuCloset.showCloset());


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

//get all sizes in array list. return a random int-item in that list




    public static void initalizeCloset (Closet tempCloset){
        //   ArrayList <Jacket> all_of_jackets = new ArrayList <Jacket>();
        // currently returns one item. add more items later on
        Random rand = new Random();
        int id1 = rand.nextInt(allJackets.size());
        Jacket oneJacket = allJackets.get(id1);

        int id2 = rand.nextInt(allShirts.size());
        Shirt oneShirt = allShirts.get(id2);

        int id3 = rand.nextInt(allPants.size());
        Pants onePants = allPants.get(id3);

        int id4 = rand.nextInt(allShoes.size());
        Shoes oneShoe = allShoes.get(id4);
    }

}
