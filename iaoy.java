import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class iaoy {
    private static final Logger a;
    private static iaoy b;
    private String c;
    private final LinkedHashSet d;
    private ggeo e;

    static {
        iaoy.a = Logger.getLogger(iaoy.class.getName());
    }

    public iaoy() {
        new iaow(this);
        this.c = "unknown";
        this.d = new LinkedHashSet();
        this.e = ggnf.a;
    }

    public final iaov a(String s) {
        return s == null ? null : ((iaov)this.d().get(s.toLowerCase(Locale.US)));
    }

    public static iaoy b() {
        synchronized(iaoy.class) {
            if(iaoy.b == null) {
                ArrayList arrayList0 = new ArrayList();
                try {
                    arrayList0.add(iaxq.class);
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    iaoy.a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", classNotFoundException0);
                }
                try {
                    arrayList0.add(iasd.class);
                }
                catch(ClassNotFoundException classNotFoundException1) {
                    iaoy.a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", classNotFoundException1);
                }
                List list0 = DesugarCollections.unmodifiableList(arrayList0);
                iaox iaox0 = new iaox();
                List list1 = iapg.a(iaov.class, list0, iaov.class.getClassLoader(), iaox0);
                if(list1.isEmpty()) {
                    iaoy.a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                iaoy.b = new iaoy();
                for(Object object0: list1) {
                    iaoy.a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found " + ((iaov)object0));
                    iaoy.b.f(((iaov)object0));
                }
                iaoy.b.g();
            }
        }
        return iaoy.b;
    }

    public final String c() {
        synchronized(this) {
        }
        return this.c;
    }

    final Map d() {
        synchronized(this) {
        }
        return this.e;
    }

    public final void e(iaov iaov0) {
        synchronized(this) {
            this.f(iaov0);
            this.g();
        }
    }

    private final void f(iaov iaov0) {
        synchronized(this) {
            iaov0.e();
            this.d.add(iaov0);
        }
    }

    private final void g() {
        synchronized(this) {
            HashMap hashMap0 = new HashMap();
            String s = "unknown";
            int v1 = 0x80000000;
            for(Object object0: this.d) {
                iaov iaov0 = (iaov)object0;
                String s1 = iaov0.b();
                iaov iaov1 = (iaov)hashMap0.get(s1);
                if(iaov1 == null) {
                    hashMap0.put(s1, iaov0);
                }
                else {
                    int v2 = iaov0.c();
                    if(iaov1.c() < v2) {
                        hashMap0.put(s1, iaov0);
                    }
                }
                if(v1 < iaov0.c()) {
                    v1 = iaov0.c();
                    s = iaov0.b();
                }
            }
            this.e = ggeo.k(hashMap0);
            this.c = s;
        }
    }
}

