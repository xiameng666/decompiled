import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public final class fvdf {
    private final ibnf a;
    private final long b;
    private long c;
    private int[] d;

    public fvdf() {
        throw null;
    }

    public fvdf(ibnf ibnf0, long v) {
        this.c = -1L;
        this.d = new int[0];
        this.a = ibnf0;
        this.b = v;
    }

    public final int[] a(ggym ggym0) {
        boolean z;
        double[] arr_f2;
        long v = SystemClock.elapsedRealtime();
        if(this.c < 0L || v - this.c > this.b) {
            int v1;
            for(v1 = 14; v1 > 0 && (fvdf.b(v1) < 200.0); --v1) {
            }
            double f = fvdf.b(v1) * 1000.0 / Math.sqrt(2.0);
            double[] arr_f = new double[2];
            fhts.p(ggym0.c, arr_f);
            HashSet hashSet0 = new HashSet();
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            Long long0 = fhts.m(ggym0.c, v1);
            hashSet0.add(long0);
            arrayList0.add(long0);
            double[] arr_f1 = new double[2];
            while(!arrayList0.isEmpty()) {
                long v2 = (long)(((Long)arrayList0.get(arrayList0.size() - 1)));
                arrayList0.remove(arrayList0.size() - 1);
                fhts.p(v2, arr_f1);
                if(GeoMath.a(arr_f[0], arr_f[1], arr_f1[0], arr_f1[1]) <= 200000.0 + f) {
                    arrayList1.add(new ggym(v2));
                    int v3 = fhts.b(v2);
                    int v4 = fhts.e(v3);
                    int v5 = fhts.a(v2);
                    long v6 = fhts.n(v2);
                    int v7 = fhts.c(v6);
                    int v8 = fhts.d(v6);
                    int v9 = v8 - v4;
                    if(v9 >= 0) {
                        arr_f2 = arr_f1;
                        z = true;
                    }
                    else {
                        arr_f2 = arr_f1;
                        z = false;
                    }
                    int v10 = v7 + v4;
                    int v11 = v8 + v4;
                    int v12 = v7 - v4;
                    long[] arr_v = {fhts.m(fhts.g(v5, v7, v9, z), v3), fhts.m(fhts.g(v5, v10, v8, v10 < 0x40000000), v3), fhts.m(fhts.g(v5, v7, v11, v11 < 0x40000000), v3), fhts.m(fhts.g(v5, v12, v8, v12 >= 0), v3)};
                    Arrays.fill(arr_v, 4, 4, 0L);
                    for(int v13 = 0; v13 < 4; ++v13) {
                        Long long1 = (long)arr_v[v13];
                        if(!hashSet0.contains(long1)) {
                            arrayList0.add(long1);
                            hashSet0.add(long1);
                        }
                    }
                    arr_f1 = arr_f2;
                    f = f;
                }
            }
            ggyq ggyq0 = new ggyq();
            ggyq0.k(arrayList1);
            ggyq0.n();
            Collection collection0 = (Collection)this.a.get();
            ArrayList arrayList2 = new ArrayList(collection0.size());
            for(Object object0: collection0) {
                ggym ggym1 = (ggym)object0;
                if(ggym1.j() <= 14 && ggyq0.i(ggym1)) {
                    arrayList2.add(Integer.valueOf(fvdg.a(ggym1)));
                }
            }
            Collections.sort(arrayList2);
            this.d = glwy.n(arrayList2);
            this.c = v;
        }
        return this.d;
    }

    private static double b(int v) {
        return Math.pow(2.0, 14 - v) * 0.5628;
    }
}

