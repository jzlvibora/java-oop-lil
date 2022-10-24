import java.util.ArrayList;
import java.util.Collection;

public class OddArrayList extends ArrayList<Integer> {
    @Override
    public void add(int index, Integer element){
        if(isOdd(element)){
            super.add(index, element);
        }
    }

    @Override
    public boolean add(Integer element){
        if(isOdd(element)){
            return super.add(element);
        }
        else{
            return false;
        }
    }

    public static boolean isOdd(Integer element){
        return Math.abs(element) %2 ==1;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return super.addAll(index, c);
    }
}
