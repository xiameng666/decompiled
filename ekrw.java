import java.util.Comparator;
import java.util.Map;

public final class ekrw implements Comparator {
    public final Map a;

    public ekrw(Map map0) {
        this.a = map0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return ((int)(((Integer)this.a.get(((btac)object1))))) - ((int)(((Integer)this.a.get(((btac)object0)))));
    }
}

