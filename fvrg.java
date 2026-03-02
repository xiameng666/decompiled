import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public final class fvrg {
    final fvsl a;
    final gged_interceptors b;
    public final int c;
    private final long d;

    public fvrg(fvsl fvsl0, gged_interceptors gged0, int v, Calendar calendar0, long v1) {
        long v12;
        this.a = fvsl0;
        this.d = v1;
        ArrayList arrayList0 = new ArrayList();
        if(gged0 != null) {
            int v2 = gged0.size();
            fvsl fvsl1 = null;
            for(int v3 = 0; v3 < v2; ++v3) {
                fvsl fvsl2 = (fvsl)gged0.get(v3);
                long v4 = Math.max(fvsl2.b, fvsl0.b);
                long v5 = Math.min(fvsl2.c, fvsl0.c);
                fvsl fvsl3 = v5 > v4 ? new fvsl(v4, v5) : null;
                if(fvsl3 != null && fvsl1 != null) {
                    long v6 = fvsl1.c;
                    if(fvsl3.b < v6) {
                        fvsl3 = v6 >= fvsl3.c ? null : new fvsl(v6, fvsl3.c);
                    }
                }
                if(fvsl3 != null) {
                    arrayList0.add(fvsl3);
                    fvsl1 = fvsl3;
                }
            }
        }
        if(arrayList0.isEmpty()) {
            arrayList0.add(fvsl0);
        }
        gged_interceptors gged1 = gged_interceptors.i(arrayList0);
        this.c = gged1.size() == 1 && ((fvsl)gged1.get(0)).equals(fvsl0) ? 1 : v;
        long v7 = 0L;
        for(Object object0: gged1) {
            v7 += ((fvsl)object0).a();
        }
        long v8 = 0x7FFFFFFFFFFFFFFFL;
        Calendar calendar1 = (Calendar)calendar0.clone();
        fvsl.f(calendar1, this.a.b);
        long v9 = calendar1.getTimeInMillis();
        double f = new Random(this.d ^ v9).nextDouble() * ((double)(v7 / 2L));
        long v10 = this.a.b;
        long v11 = (long)f;
        for(Object object1: gged1) {
            fvsl fvsl4 = (fvsl)object1;
            if(v10 <= fvsl4.b) {
                v12 = fvsl4.a();
            }
            else {
                v12 = v10 >= fvsl4.c ? 0L : fvsl4.c - v10;
            }
            if(v12 > v11) {
                v8 = Math.max(fvsl4.b, v10) + v11;
                break;
            }
            v11 -= v12;
        }
        ArrayList arrayList1 = new ArrayList(gged1.size());
        for(Object object2: gged1) {
            fvsl fvsl5 = (fvsl)object2;
            if(fvsl5.c <= v8) {
            }
            else if(fvsl5.h(v8)) {
                arrayList1.add(new fvsl(v8, fvsl5.c));
            }
            else {
                arrayList1.add(fvsl5);
            }
        }
        this.b = gged_interceptors.i(arrayList1);
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.a);
        String s1 = String.valueOf(this.b);
        return this.c == 1 ? a.ak("FULL", s1, new StringBuilder(), s, "SensorCollectionTimeSpan [targetTimeSpan=", ", subTimeSpans=", ", subTimeSpanType=", "]") : a.ak("REFINED_BY_IN_OUTDOOR", s1, new StringBuilder(), s, "SensorCollectionTimeSpan [targetTimeSpan=", ", subTimeSpans=", ", subTimeSpanType=", "]");
    }
}

