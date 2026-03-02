import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class iani {
    private static final Logger a;
    private static iani b;
    private static final Iterable c;
    private final LinkedHashSet d;
    private final LinkedHashMap e;

    static {
        iani.a = Logger.getLogger(iani.class.getName());
        ArrayList arrayList0 = new ArrayList();
        try {
            arrayList0.add(ibcy.class);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            iani.a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", classNotFoundException0);
        }
        try {
            arrayList0.add(ibkn.class);
        }
        catch(ClassNotFoundException classNotFoundException1) {
            iani.a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", classNotFoundException1);
        }
        iani.c = DesugarCollections.unmodifiableList(arrayList0);
    }

    public iani() {
        this.d = new LinkedHashSet();
        this.e = new LinkedHashMap();
    }

    public final iang a(String s) {
        iang iang0;
        synchronized(this) {
            iang0 = (iang)this.e.get(s);
        }
        return iang0;
    }

    public static iani b() {
        synchronized(iani.class) {
            if(iani.b == null) {
                ianh ianh0 = new ianh();
                iani.b = new iani();
                for(Object object0: iapg.a(iang.class, iani.c, iang.class.getClassLoader(), ianh0)) {
                    iani.a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found " + ((iang)object0));
                    iani.b.c(((iang)object0));
                }
                iani.b.d();
            }
        }
        return iani.b;
    }

    private final void c(iang iang0) {
        synchronized(this) {
            iang0.d();
            this.d.add(iang0);
        }
    }

    private final void d() {
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = this.e;
            linkedHashMap0.clear();
            for(Object object0: this.d) {
                iang iang0 = (iang)object0;
                String s = iang0.c();
                if(((iang)linkedHashMap0.get(s)) == null) {
                    linkedHashMap0.put(s, iang0);
                }
                else {
                    iang0.e();
                }
            }
        }
    }
}

