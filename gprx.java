import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.ArrayMap;
import j..util.DesugarCollections;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class gprx {
    public final ArrayMap a;
    public final ArrayMap b;
    public final Handler c;
    public final gptb d;
    public long e;

    public gprx(Looper looper0) {
        gptb gptb0 = new gptb();
        super();
        this.a = new ArrayMap();
        this.b = new ArrayMap();
        this.e = 0x7FFFFFFFFFFFFFFFL;
        this.c = new Handler(looper0);
        this.d = gptb0;
    }

    public final long a(long v) {
        gpqo.a(this.c);
        ArrayMap arrayMap0 = this.a;
        if(!arrayMap0.isEmpty()) {
            long v2 = 0x7FFFFFFFFFFFFFFFL;
            for(int v1 = 0; v1 < arrayMap0.size(); ++v1) {
                List list0 = (List)arrayMap0.valueAt(v1);
                int v3 = gppz.a(list0, new gprr());
                if(v3 != -1) {
                    v2 = Math.min(v2, ((gprw)list0.get(v3)).a.a(v));
                }
            }
            return v2 == 0x7FFFFFFFFFFFFFFFL ? 0x7FFFFFFFFFFFFFFFL : v + v2;
        }
        return 0x7FFFFFFFFFFFFFFFL;
    }

    public static gprn b(List list0, String s) {
        for(Object object0: list0) {
            gprn gprn0 = (gprn)object0;
            if(gpqj.c(s, gprn0.d())) {
                return gprn0;
            }
        }
        return null;
    }

    public final gprn c(String s, gprv gprv0) {
        gprw gprw0;
        gpqo.a(this.c);
        ArrayMap arrayMap0 = this.a;
        List list0 = (List)arrayMap0.get(gprv0);
        if(list0 != null) {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                gprw0 = (gprw)object0;
                if(!gpqj.c(s, gprw0.a.d())) {
                    continue;
                }
                iterator0.remove();
                goto label_12;
            }
            gprw0 = null;
        label_12:
            if(list0.isEmpty()) {
                arrayMap0.remove(gprv0);
            }
            this.e = this.a(SystemClock.elapsedRealtime());
            return gprw0 == null ? null : gprw0.a;
        }
        return null;
    }

    public final List d(gprv gprv0, boolean z) {
        gpqo.a(this.c);
        this.i(gprv0, SystemClock.elapsedRealtime());
        ArrayMap arrayMap0 = this.a;
        if(arrayMap0.containsKey(gprv0)) {
            List list0 = (List)arrayMap0.get(gprv0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                arrayList0.add(((gprw)object0).a);
            }
            return DesugarCollections.unmodifiableList(arrayList0);
        }
        return Collections.EMPTY_LIST;
    }

    public final void e(gprv gprv0, gprn gprn0) {
        gpqo.a(this.c);
        gprs gprs0 = new gprs();
        List list0 = (List)Map.-EL.computeIfAbsent(this.a, gprv0, gprs0);
        list0.remove(gprx.h(list0, gprn0.d()));
        gprw gprw0 = new gprw(gprn0);
        long v = SystemClock.elapsedRealtime();
        int v1 = Collections.binarySearch(list0, gprw0, new gpru(v));
        if(v1 < 0) {
            v1 = -v1 - 1;
        }
        list0.add(v1, gprw0);
        this.e = this.a(v);
    }

    public final void f(gprv gprv0, long v) {
        Handler handler0 = this.c;
        gpqo.a(handler0);
        ArrayMap arrayMap0 = this.a;
        List list0 = (List)arrayMap0.get(gprv0);
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList();
            boolean z = false;
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                gprn gprn0 = ((gprw)object0).a;
                if(!gprn0.q() || gprn0.a(v) > 0L) {
                    break;
                }
                iterator0.remove();
                arrayList0.add(((gprw)object0));
                z = true;
            }
            if(z) {
                this.e = this.a(v);
            }
            if(!arrayList0.isEmpty()) {
                for(Object object1: arrayList0) {
                    gprn gprn1 = ((gprw)object1).a;
                    gpsc gpsc0 = (gpsc)this.b.get(gprv0);
                    if(gpsc0 != null) {
                        handler0.post(new gprt(gpsc0, gprn1));
                    }
                }
                if(list0.isEmpty()) {
                    arrayMap0.remove(gprv0);
                }
            }
        }
    }

    public final gprn g(String s, gprv gprv0) {
        gpqo.a(this.c);
        this.i(gprv0, SystemClock.elapsedRealtime());
        List list0 = (List)this.a.get(gprv0);
        if(list0 != null) {
            gprw gprw0 = gprx.h(list0, s);
            return gprw0 == null ? null : new gprn(gprw0.a);
        }
        return null;
    }

    private static gprw h(List list0, String s) {
        for(Object object0: list0) {
            gprw gprw0 = (gprw)object0;
            if(gpqj.c(s, gprw0.a.d())) {
                return gprw0;
            }
        }
        return null;
    }

    private final void i(gprv gprv0, long v) {
        gpqo.a(this.c);
        if(v < this.e) {
            return;
        }
        this.f(gprv0, v);
    }
}

