import java.util.ArrayList;

public final class cymk implements kar {
    public final cyna a;

    public cymk(cyna cyna0) {
        this.a = cyna0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ArrayList arrayList0;
        long v4;
        long v2;
        cyna cyna0 = this.a;
        ((cync)object0).i = cyna0.c.a().b.k();
        synchronized(cyna0.c) {
            arrayList0 = new ArrayList(cyna0.c.a);
        }
        int v1 = arrayList0.size();
        while(true) {
            --v1;
            v2 = ((cync)object0).a;
            if(v1 < 0) {
                goto label_20;
            }
            cymy cymy0 = (cymy)arrayList0.get(v1);
            long v3 = cymy0.d;
            if(v3 < v2) {
                v4 = v3;
                break;
            }
            if(cymy0.c < v2) {
                goto label_20;
            }
        }
        goto label_22;
    label_20:
        v4 = v2;
    label_22:
        ((cync)object0).j = Math.max(v2 - v4, 0L);
        if(hvpp.bf() && cyna0.i) {
            cype cype0 = cyna0.g();
            long v5 = ((cync)object0).a();
            String s = cyna.i(cyna0.b.c(), "cc8888", true, true);
            long v6 = ((cync)object0).a();
            String s1 = cyna.h("Latest switch:");
            cype0.h(cyna0.b, v5 + "ms", s + cyna.i((v6 + "ms"), "99cc99", true, true) + s1 + cyna.i(((cync)object0).toString(), "9999cc", true, false));
        }
    }
}

