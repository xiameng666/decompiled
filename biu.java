import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;

public final class biu {
    public final Executor a;
    public bjb b;
    public bld c;
    public final bit d;
    public volatile List e;
    public final AtomicBoolean f;
    public final CopyOnWriteArrayList g;
    public final CopyOnWriteArrayList h;
    public aox i;
    public bjk j;
    private final Object k;
    private final Map l;

    public biu(Executor executor0) {
        this.a = executor0;
        this.k = new Object();
        this.d = new bit(this);
        this.e = ibps.a;
        this.f = new AtomicBoolean(false);
        this.g = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.l = new LinkedHashMap();
    }

    public final void a(bks bks0) {
        ibuq.f(bks0, "listener");
        this.g.add(bks0);
    }

    public final void b(String s) {
        bjb bjb0 = this.b;
        if(bjb0 != null) {
            try {
                bik bik0 = bjb0.b(s).e();
                ibuq.e(bik0, "getCameraInfoInternal(...)");
                String s1 = bik0.j();
                if(this.f.get()) {
                    Object object0 = this.k;
                    synchronized(object0) {
                        Map map0 = this.l;
                        if(map0.containsKey(s1)) {
                            return;
                        }
                        biq biq0 = new biq(this, s1);
                        bow.a().execute(new bir(bik0, biq0));
                        map0.put(s1, biq0);
                        bcs.h("CameraPresencePrvdr");
                    }
                    return;
                }
                return;
            }
            catch(IllegalArgumentException unused_ex) {
                goto label_22;
            }
        }
        return;
    label_22:
        bcs.d("CameraPresencePrvdr", a.a(s, "CameraInternal not found for ", ". Cannot setup state observer."));
    }

    public final void c(String s) {
        synchronized(this.k) {
            lqj lqj0 = (lqj)this.l.remove(s);
            bjb bjb0 = this.b;
            if(lqj0 != null && bjb0 != null) {
                try {
                    bin bin0 = bjb0.b(s);
                    bow.a().execute(new bip(bin0, lqj0));
                    bcs.h("CameraPresencePrvdr");
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
        }
    }

    public final void d() {
        bhg bhg0;
        if(!this.f.getAndSet(false)) {
            bcs.h("CameraPresencePrvdr");
            return;
        }
        bcs.c("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        bld bld0 = this.c;
        if(bld0 != null) {
            bit bit0 = this.d;
            kay.i(bit0);
            List list0 = ((bhh)bld0).e;
            for(Object object0: list0) {
                bhg0 = (bhg)object0;
                if(!bhg0.b.equals(bit0)) {
                    continue;
                }
                goto label_16;
            }
            bhg0 = null;
        label_16:
            if(bhg0 != null) {
                list0.remove(bhg0);
            }
            Object object1 = ((bhh)bld0).d;
            __monitor_enter(object1);
            try {
                if(((bhh)bld0).h && list0.isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    ((bhh)bld0).h = false;
                    ((bhh)bld0).c();
                }
            }
            finally {
                __monitor_exit(object1);
            }
        }
        Object object2 = this.k;
        __monitor_enter(object2);
        int v1 = FIN.finallyOpen$NT();
        Map map0 = this.l;
        if(map0.isEmpty()) {
            FIN.finallyExec$NT(v1);
        }
        else {
            Map map1 = ibpz.q(map0);
            map0.clear();
            FIN.finallyCodeBegin$NT(v1);
            bjb bjb0 = this.b;
            if(bjb0 != null) {
                LinkedHashSet linkedHashSet0 = bjb0.c();
                ArrayList arrayList0 = new ArrayList();
                for(Object object3: linkedHashSet0) {
                    bin bin0 = (bin)object3;
                    bik bik0 = bin0 == null ? null : bin0.e();
                    if(bik0 == null) {
                        continue;
                    }
                    arrayList0.add(bik0);
                }
                bcs.h("CameraPresencePrvdr");
                for(Object object4: map1.entrySet()) {
                    String s = (String)((Map.Entry)object4).getKey();
                    lqj lqj0 = (lqj)((Map.Entry)object4).getValue();
                    bow.a().execute(new bio(arrayList0, lqj0, s));
                }
            }
        }
        this.j = null;
        this.g.clear();
        this.h.clear();
        this.e = ibps.a;
        this.i = null;
        this.b = null;
    }
}

