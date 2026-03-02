import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class ehut {
    public static final ggeo a;
    public boolean b;
    public long c;
    public int d;
    final NavigableMap e;
    public final ehuw f;

    static {
        ehut.a = ggeo.q(Integer.valueOf(0), "IN_VEHICLE", Integer.valueOf(6), "EXITING_VEHICLE", Integer.valueOf(1), "ON_BICYCLE", Integer.valueOf(7), "WALKING", Integer.valueOf(8), "RUNNING", Integer.valueOf(2), "ON_FOOT");
    }

    public ehut(ehuw ehuw0) {
        this.b = false;
        this.d = 0;
        this.f = ehuw0;
        ConcurrentSkipListMap concurrentSkipListMap0 = ehuw0.m ? new ConcurrentSkipListMap() : new TreeMap();
        this.e = concurrentSkipListMap0;
    }
}

