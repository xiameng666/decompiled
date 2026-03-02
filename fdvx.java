import j..util.Objects;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public class fdvx implements ffmj {
    private static final Long[] a;
    private final Map b;

    static {
        fdvx.a = new Long[]{((long)60000L), ((long)600000L), ((long)3600000L), ((long)86400000L), ((long)0L)};
    }

    public fdvx() {
        this.b = new TreeMap();
    }

    public void a(fdvw fdvw0, String s, int v) {
        String s1 = fdvw0.toString();
        if(v < 0) {
            return;
        }
        synchronized(this.b) {
            long v2 = System.currentTimeMillis();
            this.b(v2, "Total", s, v);
            this.b(v2, s1, s, v);
        }
    }

    private final void b(long v, String s, String s1, int v1) {
        Map map0 = this.b;
        fetc fetc0 = (fetc)map0.get(s);
        if(fetc0 == null) {
            fetc0 = new fetc(fdvx.a);
            map0.put(s, fetc0);
        }
        TreeMap treeMap0 = fetc0.b;
        fetb fetb0 = (fetb)treeMap0.get(s1);
        if(fetb0 == null) {
            fetb fetb1 = new fetb(fetc0.a);
            treeMap0.put(s1, fetb1);
            fetb0 = fetb1;
        }
        for(int v2 = 0; v2 < 5; ++v2) {
            fetb0.a[v2].b(v, ((long)v1));
        }
    }

    private static final void c(bbpd bbpd0, long v, String s, fetc fetc0) {
        bbpd0.println(s);
        bbpd0.b();
        for(Object object0: fetc0.b.entrySet()) {
            String s1 = (String)((Map.Entry)object0).getKey();
            feta[] arr_feta = ((fetb)((Map.Entry)object0).getValue()).a;
            bbpd0.printf("%-15s %12d %12d %12d %12d %12d\n", new Object[]{s1, arr_feta[0].a(v), arr_feta[1].a(v), arr_feta[2].a(v), arr_feta[3].a(v), arr_feta[4].a(v)});
        }
        bbpd0.a();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Data Usage Stats");
        bbpd0.b();
        bbpd0.b();
        bbpd0.printf("%-15s %12s %12s %12s %12s %12s\n", new Object[]{"", "Minute", "10 Minutes", "Hour", "Day", "Total"});
        bbpd0.a();
        Map map0 = this.b;
        synchronized(map0) {
            long v1 = System.currentTimeMillis();
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(!Objects.equals(map$Entry0.getKey(), "Total")) {
                    fdvx.c(bbpd0, v1, ((String)map$Entry0.getKey()), ((fetc)map$Entry0.getValue()));
                }
            }
            fetc fetc0 = (fetc)map0.get("Total");
            if(fetc0 != null) {
                fdvx.c(bbpd0, v1, "Total", fetc0);
            }
        }
        bbpd0.a();
    }
}

