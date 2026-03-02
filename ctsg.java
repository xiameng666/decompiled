import com.google.android.gms.common.Feature;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public final class ctsg implements ctpd {
    public final ibrt a;
    public final bboh b;
    public final icmn c;
    public icck d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final ctrs h;
    private final bhzg i;
    private final Set j;
    private final ctsf k;

    public ctsg(bhzg bhzg0, ctrs ctrs0, ibrt ibrt0) {
        ibuq.f(ctrs0, "rpcClientFactory");
        super();
        this.i = bhzg0;
        this.h = ctrs0;
        this.a = ibrt0;
        this.b = ctnb.a("DeviceLink", new ibuk(this.getClass()));
        this.c = icmu.e(0, 0, 0, 7);
        this.j = new LinkedHashSet();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.k = new ctsf(this);
    }

    @Override  // ctpd
    public final void a(String s) {
        synchronized(this) {
            this.j.remove(s);
            if(!this.j.isEmpty()) {
                return;
            }
            icck icck0 = this.d;
            if(icck0 != null) {
                iccl.i(icck0);
                this.d = null;
                azzc azzc0 = new azzc();
                azzc0.a = new biub();
                azzc0.c = new Feature[]{bhus.b};
                azzc0.d = 0x6E9C;
                azzd azzd0 = azzc0.a();
                evql evql0 = ((azts)this.i).jn(azzd0);
                evql0.b(new ctry(new ctrx(this)));
                evql0.A(new ctrz(this));
            }
        }
    }

    @Override  // ctpd
    public final icig b() {
        ctsa ctsa0 = new ctsa(this, null);
        return new icns(this.c, ctsa0);
    }

    @Override  // ctpd
    public final void c(String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Set set0 = this.j;
        if(!set0.contains(s)) {
            set0.add(s);
            if(this.d != null) {
                FIN.finallyExec$NT(v);
                return;
            }
            this.d = iccl.b(this.a);
            FIN.finallyCodeBegin$NT(v);
            bhze bhze0 = new bhze();
            bhze0.b();
            List list0 = ibpo.b(bhze0.a());
            ibuq.f(list0, "deviceFilters");
            ibuq.f(this.k, "listener");
            azzc azzc0 = new azzc();
            azzc0.a = new bity(list0, this.k);
            azzc0.c = new Feature[]{bhus.b};
            azzc0.d = 0x6E9B;
            azzd azzd0 = azzc0.a();
            evql evql0 = ((azts)this.i).jn(azzd0);
            evql0.b(new ctrv(new ctru(this)));
            evql0.A(new ctrw(this));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}

