import java.awt.*;

public class Tree {
    //class = blueprijnt. represents the attributes and behaviors of a tree. we haven't created a tree yet
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treetype;
    protected static Color TRUNK_COLOR = new Color(102,51,0);

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treetype = treeType;
    }

    public void grow(){
        this.heightFt=this.heightFt+10;
        this.trunkDiameterInches=trunkDiameterInches+1;
        System.out.println(this.heightFt);
    }

    public void announceTallTree(){
        if(this.heightFt>100){
            System.out.println("That's a tall " + this.treetype+ " tree!");
        }
    }

    public static void announceTree(){
        //notice this does not rely on instance attributes/methods
        System.out.println("Look out for that " + TRUNK_COLOR + " tree");
    }

    public double getHeightFt() {
        return heightFt;
    }

    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreetype() {
        return treetype;
    }

}
