import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class hbqs implements Runnable {
    public final hbqy a;
    public final hbko b;
    public final hbqw c;

    public hbqs(hbqy hbqy0, hbko hbko0, hbqw hbqw0) {
        this.a = hbqy0;
        this.b = hbko0;
        this.c = hbqw0;
    }

    @Override
    public final void run() {
        hbqy hbqy0 = this.a;
        Map map0 = hbqy0.i;
        hbko hbko0 = this.b;
        gghp gghp0 = (gghp)map0.get(hbko0);
        if(gghp0 != null) {
            for(Object object0: gghp0.z()) {
                ArrayList arrayList0 = new ArrayList(gghp0.g(object0));
                Collections.sort(arrayList0);
                hbjo hbjo0 = new hbjo();
                long v = 0L;
                for(Object object1: arrayList0) {
                    v += (long)(((Long)object1));
                }
                long v1 = v / ((long)arrayList0.size());
                Long.valueOf(v1).getClass();
                hbjo0.c = (long)(v1 & 0x7FFFFFFFFFFFFFFFL);
                long v2 = hbqy.a(arrayList0, 100.0);
                Long.valueOf(v2).getClass();
                hbjo0.a = (long)(v2 & 0x7FFFFFFFFFFFFFFFL);
                long v3 = hbqy.a(arrayList0, 75.0);
                Long.valueOf(v3).getClass();
                hbjo0.f = (long)(v3 & 0x7FFFFFFFFFFFFFFFL);
                long v4 = hbqy.a(arrayList0, 50.0);
                Long.valueOf(v4).getClass();
                hbjo0.e = (long)(v4 & 0x7FFFFFFFFFFFFFFFL);
                long v5 = hbqy.a(arrayList0, 25.0);
                Long.valueOf(v5).getClass();
                hbjo0.d = (long)(v5 & 0x7FFFFFFFFFFFFFFFL);
                long v6 = hbqy.a(arrayList0, 0.0);
                Long.valueOf(v6).getClass();
                hbjo0.b = (long)(v6 & 0x7FFFFFFFFFFFFFFFL);
                hbjp hbjp0 = new hbjp(hbjo0);
                hbqy0.e(this.c.a(object0, arrayList0.size(), hbjp0), hbko0);
            }
            map0.remove(hbko0);
        }
    }
}

