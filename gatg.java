import java.util.Iterator;
import java.util.List;

public abstract class gatg {
    public final gast a;
    bzt b;
    private final hfta c;

    public gatg(gast gast0, hfta hfta0) {
        this.a = gast0;
        this.c = hfta0;
    }

    protected abstract int a(MessageLite arg1);

    public final int b() {
        return this.c.a();
    }

    static void c(bzt bzt0, List list0) {
        hftu hftu0;
        hfta hfta0;
        gatg gatg0;
        int v = bzt0.c();
        Iterator iterator0 = list0.iterator();
    label_2:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            hcsi hcsi0 = (hcsi)object0;
            int v1 = 0;
            while(true) {
                if(v1 >= v) {
                    continue label_2;
                }
                gatg0 = (gatg)bzt0.e(v1);
                hfta0 = gatg0.c;
                hcsi0.f(hfta0);
                hftu0 = hfta0.d;
                if(hcsi0.s.m(hftu0)) {
                    break;
                }
                ++v1;
            }
            if(gatg0.b == null) {
                gatg0.b = new bzt();
            }
            bzt bzt1 = gatg0.b;
            hcsi0.f(hfta0);
            Object object1 = hcsi0.s.k(hftu0);
            bzt1.h(gatg0.a(((MessageLite)(object1 == null ? hfta0.b : hfta0.d(object1)))), hcsi0);
        }
    }

    static void d(bzt bzt0) {
        int v = bzt0.c();
        for(int v1 = 0; v1 < v; ++v1) {
            bzt bzt1 = ((gatg)bzt0.e(v1)).b;
            if(bzt1 != null) {
                bzt1.g();
            }
        }
    }

    public final void e(int v) {
        if(this.f(v)) {
            hcsi hcsi0 = (hcsi)bzu.a(this.b, v);
            gftb.check(hcsi0);
            this.a.d.b(hcsi0);
        }
    }

    public final boolean f(int v) {
        return this.b != null && this.b.i(v);
    }
}

