import j..time.Instant;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;

public final class ehsc {
    static final boolean a(NavigableMap navigableMap0, long v, long v1, List list0, long v2) {
        for(Object object0: navigableMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            for(Object object1: ((List)map$Entry0.getValue())) {
                ehuh ehuh0 = (ehuh)object1;
                long v3 = (long)(((Long)map$Entry0.getKey()));
                Instant.ofEpochMilli(v3);
                if(Instant.ofEpochMilli(v3).isAfter(Instant.ofEpochMilli(v)) && Instant.ofEpochMilli(v3).isBefore(Instant.ofEpochMilli(v1)) && (ehuh0.b >= ((float)v2)) && list0.contains(Integer.valueOf(ehuh0.a))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean b(NavigableMap navigableMap0, long v, ehsd ehsd0) {
        return ehsc.a(navigableMap0, v, v + ehsd0.a, ehsd0.h, ehsd0.i);
    }
}

