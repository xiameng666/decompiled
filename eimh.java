import com.google.android.gms.phenotype.Flag;
import java.util.Comparator;

public final class eimh implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((Flag)object0).i;
        int v1 = ((Flag)object1).i;
        if(v == v1 && ((Flag)object0).j == ((Flag)object1).j) {
            return ((Flag)object0).b.compareTo(((Flag)object1).b);
        }
        return v == v1 ? ((Flag)object0).j - ((Flag)object1).j : v - v1;
    }
}

