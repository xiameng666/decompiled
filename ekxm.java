import java.util.Comparator;
import java.util.Map.Entry;

public final class ekxm implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((int)(((Integer)((Map.Entry)object0).getKey()))) - ((int)(((Integer)((Map.Entry)object1).getKey())));
    }
}

