import android.location.Location;
import java.util.Comparator;

public final class emcr implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((Location)object0).getTime(), ((Location)object1).getTime());
    }
}

