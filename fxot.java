import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class fxot implements fxpt {
    public final bbng a;
    public final fxor b;
    public final List c;
    public int d;
    public int e;

    public fxot(bbng bbng0, List list0, long[] arr_v, fxor fxor0) {
        this.a = bbng0;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(new fxos(((fxoo)object0)));
        }
        Collections.sort(arrayList0, new fxom());
        if(arr_v != null) {
            Arrays.sort(arr_v);
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((fxos)arrayList0.get(v2)).a(arr_v[v]);
                }
            }
        }
        this.c = arrayList0;
        this.b = fxor0;
    }

    public final fxon a() {
        long v = System.currentTimeMillis() / 1000L;
        long v1 = 0L;
        long v2 = 0L;
        for(Object object0: this.c) {
            long v3 = v - ((fxos)object0).b[((fxos)object0).c];
            long v4 = ((fxos)object0).a.a;
            long v5 = v3 < v4 ? v4 - v3 : 0L;
            if(v5 > v1) {
                v1 = v5;
                v2 = v4;
            }
        }
        return new fxon(v1, v2);
    }

    @Override  // fxpt
    public final boolean b(Runnable runnable0) {
        throw null;
    }
}

