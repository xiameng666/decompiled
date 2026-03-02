import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.Comparator;

final class bxgc implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Long.compare(((UsageInfo)object0).b, ((UsageInfo)object1).b);
        if(v > 0) {
            return -1;
        }
        return v < 0 ? 1 : 0;
    }
}

