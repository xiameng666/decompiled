import android.content.ComponentName;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import jeb.synthetic.FIN;

public final class cttb implements ykm {
    public final bhzg a;
    public final bboh b;
    public icck c;
    public final Map d;
    public final Map e;
    public final ykc f;
    private final Context g;
    private final ibrt h;
    private final Map i;

    public cttb(Context context0, bhzg bhzg0, ykd ykd0, ibrt ibrt0) {
        this.g = context0;
        this.a = bhzg0;
        this.h = ibrt0;
        this.b = ctnb.a("DeviceLink", new ibuk(this.getClass()));
        this.i = new LinkedHashMap();
        this.f = ykd0.a(this);
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }

    @Override  // ykm
    public final ykl a(String s) {
        ykl ykl0;
        ibuq.f(s, "serviceName");
        synchronized(this) {
            ykl0 = (ykl)this.i.get(s);
        }
        return ykl0;
    }

    @Override  // ykm
    public final Object b(ykl ykl0, ibrl ibrl0) {
        ykl0.b();
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Map map0 = this.i;
        if(!map0.containsKey(ykl0.b())) {
            map0.put(ykl0.b(), ykl0);
            FIN.finallyCodeBegin$NT(v);
            if(this.c == null) {
                this.c = iccl.b(this.h);
                ComponentName componentName0 = new ComponentName(this.g, "com.google.android.gms.multidevice.sync.devicelink.dtdi.DtdiIncomingConnectionService");
                evql evql0 = this.a.f(componentName0);
                evql0.b(new ctsq(new ctsp()));
                evql0.A(new ctsr(this));
                Object object0 = ictn.b(evql0, ibrl0);
                if(object0 == ibrx.a) {
                    return object0;
                }
            }
            return ibom.a;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override  // ykm
    public final void c(ykl ykl0) {
        ibuq.f(ykl0, "service");
        ykl0.b();
        synchronized(this) {
            Map map0 = this.i;
            if(!map0.containsKey(ykl0.b())) {
                ykl0.b();
                return;
            }
            map0.remove(ykl0.b());
            String s = ykl0.b();
            this.f.a(s);
            if(map0.isEmpty()) {
                evql evql0 = this.a.f(null);
                evql0.b(new ctsk(new ctsh()));
                evql0.A(new ctsl(this));
                this.d.clear();
                this.e.clear();
                icck icck0 = this.c;
                if(icck0 != null) {
                    iccl.i(icck0);
                }
                this.c = null;
            }
        }
    }
}

