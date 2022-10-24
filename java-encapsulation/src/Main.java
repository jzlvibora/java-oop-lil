public class Main {
    public static void main(String[] args) {
//
//        how to achieve encapsulation
//                1.restrict each attribute with private access modifier
//                2.write getters and setters

        Tree myFavoriteOakTree = new Tree(100, 25, TreeType.OAK);
        // since we added private access modifier to instance attributes, we can no longer access them outside the tree class
        myFavoriteOakTree.announceTallTree();
        System.out.println(Tree.TRUNK_COLOR);

        System.out.println("SPECIES: " + myFavoriteOakTree.getTreetype() + "\nHEIGHT: " + myFavoriteOakTree.getHeightFt());
        myFavoriteOakTree.setHeightFt(200);
        myFavoriteOakTree.grow();
        System.out.println( myFavoriteOakTree.getTreetype());



    }
}
