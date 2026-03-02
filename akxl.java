import com.google.android.gms.auth.proximity.NearbyConnectionsIntentOperation;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.util.HashMap;
import java.util.Map;

public final class akxl extends cuvg {
    public static final baun a;
    public final gmcg b;
    private final Map c;

    static {
        akxl.a = new baun("ProximityAuth", new String[]{"NearbyConnectionLifecycleCallback"});
    }

    public akxl() {
        this.c = new HashMap();
        this.b = new bblp(1, 10);
    }

    public final Map a() {
        return hpzm.U() ? NearbyConnectionsIntentOperation.a : this.c;
    }

    @Override  // cuvg
    public final void b(String s, cuvf cuvf0) {
        akxl.a.d("onConnectionInitiated with endpoint " + s, new Object[0]);
        if(hpzm.T()) {
            akxf akxf0 = new akxf(s, cuvf0);
            this.b.execute(akxf0);
        }
        else {
            akyk akyk0 = new akyk(s);
            this.a().put(s, akyk0);
        }
        akxm.a().c(s, new akxk(this));
    }

    @Override  // cuvg
    public final void c(String s, cuvl cuvl0) {
        if(cuvl0.a.i != 0) {
            akxl.a.h("Connection to %s was unsuccessful", new Object[]{s});
            if(hpzm.T()) {
                akxg akxg0 = new akxg(s);
                this.b.execute(akxg0);
                return;
            }
            this.a().remove(s);
            return;
        }
        if(hpzm.T()) {
            akxh akxh0 = new akxh(s);
            this.b.execute(akxh0);
            return;
        }
        akzp akzp0 = new akzp(AppContextProvider.a(), akzn.c().e());
        akyk akyk0 = (akyk)this.a().get(s);
        if(akyk0 == null) {
            akxl.a.m("Could not retrieve secure channel for endpoint " + s, new Object[0]);
            return;
        }
        akyk0.f(1);
        akyk0.d(akvs.a());
        akyk0.e(akzp0);
    }

    @Override  // cuvg
    public final void d(String s) {
        baun baun0 = akxl.a;
        baun0.h("Nearby connections disconnected from %s.", new Object[]{s});
        if(hpzm.T()) {
            akxe akxe0 = new akxe(s);
            this.b.execute(akxe0);
            return;
        }
        akyk akyk0 = (akyk)this.a().get(s);
        if(akyk0 == null) {
            baun0.m("Could not retrieve secure channel for endpoint " + s, new Object[0]);
            return;
        }
        akyk0.f(0);
        this.a().remove(s);
    }
}

