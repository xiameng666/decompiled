import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final class aidw implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((Scope)object0).b.compareTo(((Scope)object1).b);
    }
}

