import j..util.Comparator.-CC;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;

public final class fvtv implements fvtd {
    public int a;
    private final ArrayList b;
    private final ArrayList c;

    public fvtv() {
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override  // fvtd
    public final long a(long v, fvwz fvwz0) {
        return fvsz.a(this, v, fvwz0);
    }

    @Override  // fvtd
    public final gged_interceptors b(long v, fvwz fvwz0) {
        ggdy ggdy0 = new ggdy();
        Objects.requireNonNull(this);
        ArrayList arrayList0 = this.b;
        boolean z = arrayList0.isEmpty() && this.c.isEmpty();
        ArrayList arrayList1 = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList0.size() + arrayList1.size());
        for(Object object0: arrayList0) {
            arrayList2.add(new fvtu(true, ((fvvj)object0).m()));
        }
        for(Object object1: arrayList1) {
            arrayList2.add(new fvtu(false, ((fvtm)object1).f));
        }
        Collections.sort(arrayList2, Comparator.-CC.comparingLong(new fvtt()));
        int v1 = arrayList2.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            fvtu fvtu0 = (fvtu)arrayList2.get(v2);
            fvwz0.a(new fvwx(0x93, v, null, null, (fvtu0.a ? 10 : 11), ((int)(v - fvtu0.b)), -1));
        }
        int v3 = 0;
        int v4 = 0;
        while(true) {
            fvvj fvvj0 = null;
            if(z) {
                break;
            }
            fvvj fvvj1 = v3 >= arrayList0.size() ? null : ((fvvj)arrayList0.get(v3));
            fvtm fvtm0 = v4 >= arrayList1.size() ? fvtm.g() : ((fvtm)arrayList1.get(v4));
            long v5 = 0x7FFFFFFFFFFFFFFFL;
            long v6 = fvvj1 == null ? 0x7FFFFFFFFFFFFFFFL : fvvj1.m();
            if(v4 < arrayList1.size()) {
                v5 = fvtm0.f;
            }
            if(Math.abs(v6 - v5) < 20000L) {
                ++v3;
                ++v4;
                fvvj0 = fvvj1;
            }
            else if(v6 < v5) {
                ++v3;
                fvtm0 = fvtm.g();
                fvvj0 = fvvj1;
            }
            else {
                ++v4;
            }
            z = v4 == arrayList1.size() && v3 == arrayList0.size();
            fvwz0.a(new fvwx(0x93, v, null, null, 9, (fvtm0.i() ? ((int)(v - v5)) : -1), (fvvj0 == null ? -1 : ((int)(v - v6)))));
            ggdy0.i(new fvta(fvvj0, fvtm0));
        }
        gged_interceptors gged0 = ggdy0.h();
        int v7 = this.a;
        if(v7 != 0) {
            int v8 = ((ggna)gged0).c;
            if(v8 > v7) {
                int v10 = 0;
                for(int v9 = 0; v9 < v8; ++v9) {
                    fvta fvta0 = (fvta)gged0.get(v9);
                    if(fvta0.a() != null && fvta0.b.i()) {
                        ++v10;
                    }
                }
                if(v10 >= v7) {
                    fvwz0.a(new fvwx(0x93, fvwz0.f(), null, null, 13, v8, v10));
                    ggdy ggdy1 = new ggdy();
                    for(int v11 = 0; v11 < v8; ++v11) {
                        fvta fvta1 = (fvta)gged0.get(v11);
                        if(fvta1.a() != null && fvta1.b.i()) {
                            ggdy1.i(fvta1);
                        }
                    }
                    return ggdy1.h();
                }
            }
        }
        return gged0;
    }

    public final int c() {
        return this.c.size();
    }

    public final int d() {
        return this.b.size();
    }

    public final void e(fvtm fvtm0, fvvj[] arr_fvvj) {
        this.g(arr_fvvj);
        this.f(fvtm0);
    }

    public final void f(fvtm fvtm0) {
        if(fvtm0.i()) {
            ArrayList arrayList0 = this.c;
            int v = arrayList0.size();
            if(v == 0 || ((fvtm)arrayList0.get(v - 1)).f < fvtm0.f) {
                arrayList0.add(fvtm0);
            }
        }
    }

    public final void g(fvvj[] arr_fvvj) {
        if(arr_fvvj != null && arr_fvvj.length != 0) {
            ArrayList arrayList0 = this.b;
            int v = arrayList0.size();
            long v1 = v == 0 ? -1L : ((fvvj)arrayList0.get(v - 1)).m();
            for(int v2 = 0; v2 < arr_fvvj.length; ++v2) {
                fvvj fvvj0 = arr_fvvj[v2];
                if(fvvj0 != null && fvvj0.d() != 0) {
                    long v3 = fvvj0.m();
                    int v4 = Long.compare(v1, v3);
                    if(v4 < 0) {
                        arrayList0.add(fvvj0);
                        v1 = v3;
                    }
                    else if(v4 > 0) {
                        v1 = v3;
                    }
                }
            }
        }
    }
}

