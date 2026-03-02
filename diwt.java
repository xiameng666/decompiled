import com.google.android.gms.nearby.sharing.RangingData;
import java.util.Comparator;

public final class diwt implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        long v = ((diwu)object0).a.a;
        long v1 = ((diwu)object1).a.a;
        RangingData rangingData0 = ((diwu)object0).c;
        RangingData rangingData1 = ((diwu)object1).c;
        if(rangingData0 != null && rangingData1 != null) {
            return Long.compare(v, v1);
        }
        if(rangingData0 == null && rangingData1 == null) {
            return Long.compare(v, v1);
        }
        return rangingData0 == null ? 1 : -1;
    }
}

