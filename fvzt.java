import android.location.Location;
import android.os.SystemClock;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public final class fvzt {
    public final gful_cronetEngineProvider a;
    public final Deque b;

    public fvzt() {
        this.a = gfus.a(((gful_cronetEngineProvider)new fvzq()));
        this.b = new LinkedBlockingDeque();
    }

    final fvzs_BatchInfo a(List list0) {
        int v12;
        long v9;
        long v8;
        Deque deque0 = this.b;
        fvzr fvzr0 = fvzs_BatchInfo.a();
        long v = 0x7FFFFFFFFFFFFFFFL;
        long v1 = 0L;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        for(Object object0: deque0) {
            gwxy gwxy0 = (gwxy)object0;
            int v5 = gwxy0.c;
            int v6 = gwxx.a(v5);
            if(v6 == 0) {
                throw null;
            }
            switch(v6 - 1) {
                case 0: {
                    if(gwyi.a((v5 == 2 ? ((gwyk)gwxy0.d) : gwyk.a).b) == 1) {
                        ++v4;
                    }
                    break;
                }
                case 1: {
                    ++v2;
                    v1 = gwxy0.e;
                    break;
                }
                case 2: {
                    if(list0 == null) {
                        ++v2;
                        v1 = gwxy0.e;
                    }
                    break;
                }
                case 3: {
                    ++v3;
                }
            }
            v = gwxy0.e;
            continue;
        }
        if(list0 != null) {
            v2 += list0.size();
            long v7 = 0L;
            for(Object object1: list0) {
                Location location0 = (Location)object1;
                if(location0.getTime() > v7) {
                    v7 = location0.getTime();
                }
            }
            v1 = Math.max(v1, v7 * 1000000L);
            v = Math.max(v, v7 * 1000000L);
        }
        if(deque0.isEmpty()) {
            v8 = v1;
            v9 = 0L;
        }
        else {
            v8 = v1;
            v9 = ((gwxy)deque0.getLast()).e - ((gwxy)deque0.getFirst()).e;
        }
        boolean z = v9 >= huni.a.u().d() && ((long)v2) >= huni.c() && ((long)v3) >= huni.a.u().f() && ((long)v4) >= huni.a.u().c() && (huni.c() == 0L || v - v8 < huni.a.u().b());
        long v10 = SystemClock.elapsedRealtime() - v / 1000000L;
        long v11 = SystemClock.elapsedRealtime() - v8 / 1000000L;
        fvzr0.b(v10);
        fvzr0.c(v11);
        if(z) {
            v12 = 3;
        }
        else {
            v12 = v2 <= 0 ? 1 : 2;
        }
        fvzr0.a_batchCondition = v12;
        return fvzr0.a();
    }

    final Iterator b() {
        return this.b.iterator();
    }

    final void c() {
        this.b.clear();
    }

    final boolean d() {
        return this.b.isEmpty();
    }
}

