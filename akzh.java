import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class akzh {
    public static final baun a;
    public static WeakReference b;
    public final gmcg c;
    public final List d;
    public final Object e;
    public final Map f;
    public boolean g;
    public boolean h;

    static {
        akzh.a = new baun("ProximityAuth", new String[]{"RemoteBeaconSeedFetcher"});
    }

    public akzh() {
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        super();
        this.g = false;
        this.h = true;
        this.c = gmcn.a(bblp0);
        this.d = new ArrayList();
        this.e = new Object();
        this.f = new bxd();
    }

    public final void a(Map map0) {
        synchronized(this.e) {
            if(map0 == null) {
                akzh.a.m("Could not fetch remote seeds. Notifying callbacks of failure.", new Object[0]);
                for(Object object2: this.d) {
                    ((akzg)object2).c(null);
                }
            }
            else {
                bxd bxd0 = new bxd(((bzs)map0).d_num);
                bxd0.putAll(map0);
                akzh.a.d("Successfully fetched remote seeds. Notifying callbacks.", new Object[0]);
                for(Object object1: this.d) {
                    ((akzg)object1).c(bxd0);
                }
            }
            this.d.clear();
            this.g = false;
        }
    }
}

