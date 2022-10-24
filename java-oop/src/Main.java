import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(25,5, TreeType.OAK);
//        System.out.println(myFavoriteOakTree.treetype);
        Tree myFavoriteMapleTree = new Tree(125,5,TreeType.MAPLE);
//        System.out.println(myFavoriteMapleTree.treetype);

        myFavoriteMapleTree.announceTallTree();
        myFavoriteOakTree.announceTallTree();

        //non-static member - part of the class that is accessible with an instance and belongs to that instance. height, trunkDm, treetype, grow, announcetreetype are non-static. youll habve to createba tree or instance in order to access these attributes. they vary depending on the instance
        //static - part of the class accessible through the class and belongs to that class
       //noytice below we use the classname instead of the instance to access static attributer trunk color
        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();
        Color myFavoriteColor = Color.PINK;
        System.out.println(myFavoriteColor);
        Color brighterColor = myFavoriteColor.brighter();
        System.out.println(brighterColor);

        Employee developer = new Employee("Ash Lynx", 25, 30000);
        developer.raiseSalary();
        System.out.println(Employee.location);




    }
}
