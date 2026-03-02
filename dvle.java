import java.util.Comparator;
import java.util.Map.Entry;

public final class dvle implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((Integer)((Map.Entry)object0).getValue()).compareTo(((Integer)((Map.Entry)object1).getValue()));
        return v == 0 ? ((Integer)((Map.Entry)object0).getKey()).compareTo(((Integer)((Map.Entry)object1).getKey())) : v;
    }
}

