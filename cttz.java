import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import com.google.android.gms.nearby.presence.DiscoveryRequest;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public final class cttz implements ctpd {
    public final ibrt a;
    public final bboh b;
    public icck c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final icmn g;
    public final cttn h;
    public static final int i;
    private static final List j;
    private static final List k;
    private static final PresenceIdentity l;
    private static final DiscoveryFilter m;
    private final dasx n;
    private final Set o;
    private final cttx p;

    static {
        cttz.j = ibpo.b(Integer.valueOf(4));
        List list0 = ibpo.b(new PresenceAction(20));
        cttz.k = list0;
        PresenceIdentity presenceIdentity0 = new PresenceIdentity(0, "");
        cttz.l = presenceIdentity0;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        dasl.c(ibps.a, arrayList1);
        dasl.a(list0, arrayList0);
        dasl.b(ibpo.b(presenceIdentity0), arrayList2);
        cttz.m = new DiscoveryFilter(arrayList0, arrayList1, arrayList2, 2);
    }

    public cttz(dasx dasx0, cttn cttn0, ibrt ibrt0) {
        ibuq.f(cttn0, "rpcClientFactory");
        super();
        this.n = dasx0;
        this.h = cttn0;
        this.a = ibrt0;
        this.b = ctnb.a("DeviceLink", new ibuk(this.getClass()));
        this.o = new LinkedHashSet();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = icmu.e(0, 0, 0, 7);
        this.p = new cttx(this);
    }

    @Override  // ctpd
    public final void a(String s) {
        synchronized(this) {
            this.o.remove(s);
            if(!this.o.isEmpty()) {
                return;
            }
            icck icck0 = this.c;
            if(icck0 != null) {
                iccl.i(icck0);
                this.c = null;
                Map map0 = this.d;
                for(Object object0: map0.values()) {
                    ((ctoq)object0).d();
                }
                map0.clear();
                this.e.clear();
                this.n.e(this.p).b(new ctts(new cttr(this)));
            }
        }
    }

    @Override  // ctpd
    public final icig b() {
        ctty ctty0 = new ctty(this, null);
        return new icns(this.g, ctty0);
    }

    @Override  // ctpd
    public final void c(String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Set set0 = this.o;
        if(!set0.contains(s)) {
            set0.add(s);
            if(this.c != null) {
                FIN.finallyExec$NT(v);
                return;
            }
            this.c = iccl.b(this.a);
            FIN.finallyCodeBegin$NT(v);
            int[] arr_v = ibpo.aF(cttz.j);
            DiscoveryRequest discoveryRequest0 = dasp.a(false, 100L, false, Arrays.copyOf(arr_v, arr_v.length), cttz.m, null);
            batl.s(this.p);
            azyf azyf0 = ((dbci)this.n).i(this.p);
            dbbl dbbl0 = new dbbl(azyf0, discoveryRequest0);
            dbbo dbbo0 = new dbbo(azyf0);
            evql evql0 = ((dbci)this.n).j(azyf0, 0x555, dbbl0, dbbo0, new Feature[]{cumh.u});
            evql0.b(new cttp(new ctto(this)));
            evql0.A(new cttq(this));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}

