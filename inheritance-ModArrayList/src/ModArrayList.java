import java.util.ArrayList;

public class ModArrayList extends ArrayList<String>{
    public String getUsingMod(int index){
        if(index>=0 && index <= size()-1){
            return  get(index);
        }
        return "Invalid index";
    }


}
