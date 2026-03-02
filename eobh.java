import com.google.android.gms.semanticlocationhistory.LocationHistorySegment;
import java.util.Comparator;

public final class eobh implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        long v = ((LocationHistorySegment)object0).a - ((LocationHistorySegment)object1).a;
        return v == 0L ? eobi.b(((LocationHistorySegment)object0)) - eobi.b(((LocationHistorySegment)object1)) : ((int)v);
    }
}

