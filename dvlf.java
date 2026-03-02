import java.util.Comparator;
import java.util.Map.Entry;

public final class dvlf implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Integer.compare(((dvli)((Map.Entry)object0).getValue()).a(), ((dvli)((Map.Entry)object1).getValue()).a());
        return v == 0 ? ((Integer)((Map.Entry)object0).getKey()).compareTo(((Integer)((Map.Entry)object1).getKey())) : v;
    }
}

