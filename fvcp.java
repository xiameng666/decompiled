import java.util.ArrayList;

public final class fvcp {
    private final ArrayList a;

    public fvcp() {
        this.a = new ArrayList();
    }

    public final int a() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            fvcr fvcr0 = (fvcr)arrayList0.get(v1);
            v2 += (fvcr0 == null ? 0 : fvcr0.b.size());
        }
        return v2;
    }

    public final Iterable b() {
        fvcn fvcn0 = new fvcn();
        return ggch.e(gggq.j(gggq.d(this.a, fvcn0), new fvco()));
    }

    public final Object c(int v) {
        ArrayList arrayList0 = this.a;
        if(arrayList0.size() > v / 0x40 && arrayList0.get(v / 0x40) != null) {
            fvcr fvcr0 = (fvcr)arrayList0.get(v / 0x40);
            gftb.checkTrue(v % 0x40 >= 0 && v % 0x40 < 0x40);
            return fvcr.c(fvcr0.a, v % 0x40) ? fvcr0.b.get(Long.bitCount(fvcr.b(fvcr0.a, v % 0x40))) : null;
        }
        return null;
    }

    public final void d(int v, Object object0) {
        boolean z = true;
        ArrayList arrayList0 = this.a;
        if(arrayList0.size() <= v / 0x40) {
            arrayList0.ensureCapacity(v / 0x40 + 1);
            while(arrayList0.size() <= v / 0x40) {
                arrayList0.add(null);
            }
        }
        if(arrayList0.get(v / 0x40) == null) {
            arrayList0.set(v / 0x40, new fvcr());
        }
        fvcr fvcr0 = (fvcr)arrayList0.get(v / 0x40);
        if(v % 0x40 < 0 || v % 0x40 >= 0x40) {
            z = false;
        }
        gftb.checkTrue(z);
        long v1 = fvcr0.a;
        if(!fvcr.c(v1, v % 0x40)) {
            ArrayList arrayList1 = fvcr0.b;
            arrayList1.add(fvcr.a(v1, v % 0x40), object0);
            fvcr0.a |= 1L << v % 0x40;
            if(arrayList1.size() == 0x40) {
                arrayList1.trimToSize();
            }
            return;
        }
        fvcr0.b.set(fvcr.a(v1, v % 0x40), object0);
    }

    private static int e(int v) {
        return v / 0x40;
    }

    private static int f(int v) {
        return v % 0x40;
    }
}

