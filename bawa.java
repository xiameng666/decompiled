import com.google.android.gms.common.Feature;
import java.util.Comparator;

public final class bawa implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        String s = ((Feature)object0).a;
        String s1 = ((Feature)object1).a;
        return s.equals(s1) ? Long.compare(((Feature)object0).a(), ((Feature)object1).a()) : s.compareTo(s1);
    }
}

