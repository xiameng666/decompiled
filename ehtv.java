import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public final class ehtv {
    public static String a(UsageStatsManager usageStatsManager0, long v, long v1, boolean z) {
        Map map0 = usageStatsManager0.queryAndAggregateUsageStats(v, v1);
        HashMap hashMap0 = ggkm.k(map0.size());
        Iterator iterator0 = map0.keySet().iterator();
    label_3:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            long v2 = ((UsageStats)map0.get(s)).getLastTimeVisible();
            if(v2 >= v && v2 <= v1) {
                for(Object object1: hrto.a.o().B().b) {
                    if(s.startsWith(((String)object1))) {
                        continue label_3;
                    }
                }
                hashMap0.put(s, Long.valueOf(v2));
            }
        }
        long v3 = z ? 0x7FFFFFFFFFFFFFFFL : 0x8000000000000000L;
        String s1 = "";
        for(Object object2: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object2;
            long v4 = (long)(((Long)map$Entry0.getValue()));
            if(!z) {
                if(v4 > v3) {
                    goto label_26;
                }
                continue;
            }
            else if(v4 >= v3) {
                continue;
            }
        label_26:
            s1 = (String)map$Entry0.getKey();
            v3 = v4;
        }
        return s1;
    }
}

