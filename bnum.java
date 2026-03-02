import com.google.android.gms.auth.folsom.SharedKey;
import java.util.Comparator;

public final class bnum implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Integer.compare(((SharedKey)object0).a, ((SharedKey)object1).a);
    }
}

