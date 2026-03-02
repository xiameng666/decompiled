import com.google.android.gms.location.DetectedActivity;
import java.util.Comparator;

final class fuss implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Integer.valueOf(((DetectedActivity)object1).e).compareTo(Integer.valueOf(((DetectedActivity)object0).e));
        return v == 0 ? Integer.valueOf(((DetectedActivity)object0).a()).compareTo(Integer.valueOf(((DetectedActivity)object1).a())) : v;
    }
}

