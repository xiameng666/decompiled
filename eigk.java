import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class eigk implements eift {
    private static eigk a;
    private final eicb b;
    private final Map c;

    public eigk(eicb eicb0) {
        this.c = new HashMap();
        this.b = eicb0;
    }

    @Override  // eift
    public final void a(gwgu gwgu0) {
        if(gwgu0 == gwgu.b && (!this.h(eigj.a) || !this.h(eigj.b))) {
            this.b.q(27);
            ((ggtj)eicd.a.j()).x("Missing essential listeners for auto scan onBleScanStopped");
        }
        if(!this.i()) {
            this.b.q(21);
            return;
        }
        for(Object object0: this.e()) {
            ((eift)object0).a(gwgu0);
        }
    }

    @Override  // eift
    public final void b(gwgx gwgx0, gwgx gwgx1, eigg eigg0) {
        if(!this.i()) {
            this.b.q(20);
            return;
        }
        for(Object object0: this.e()) {
            ((eift)object0).b(gwgx0, gwgx1, eigg0);
        }
    }

    public static eigk c() {
        synchronized(eigk.class) {
            if(eigk.a == null) {
                eigk.a = new eigk(eicb.a(AppContextProvider.a()));
            }
        }
        return eigk.a;
    }

    @Override  // eift
    public final void d(int v) {
        if(!this.i()) {
            return;
        }
        if(hxjf.a.c().k()) {
            for(Object object0: new HashMap(this.c).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                eift eift0 = (eift)map$Entry0.getValue();
                if(eift0 == null) {
                    ((ggtj)eicd.a.j()).B("Listener %s is null for onAutoScanModeChanged", ((eigj)map$Entry0.getKey()).name());
                }
                else {
                    eift0.d(v);
                }
            }
            return;
        }
        for(Object object1: this.e()) {
            ((eift)object1).d(v);
        }
    }

    public final List e() {
        return new ArrayList(this.c.values());
    }

    public final void f(eift eift0, eigj eigj0) {
        this.c.put(eigj0, eift0);
    }

    public final void g(eigj eigj0) {
        this.c.remove(eigj0);
    }

    public final boolean h(eigj eigj0) {
        return this.c.containsKey(eigj0);
    }

    public final boolean i() {
        return !this.c.isEmpty();
    }
}

