import j..util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class iaxp extends iaou {
    public static final Logger a;
    public static final Set b;
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final iaxo f;
    public final Random g;
    public final AtomicReference h;
    public final String i;
    public final int j;
    public final long k;
    public final iaps l;
    public final iaot m;
    public final gfug n;
    protected boolean o;
    public boolean p;
    protected volatile int q;
    private static final String r;
    private static final String s;
    private static final String t;
    private static String u;
    private final String v;
    private final ibcd w;
    private boolean x;
    private Executor y;
    private iaoq z;

    static {
        iaxo iaxo1;
        Constructor constructor0;
        Class class0;
        Logger logger0 = Logger.getLogger(iaxp.class.getName());
        iaxp.a = logger0;
        iaxp.b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));
        String s = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        iaxp.r = s;
        String s1 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        iaxp.s = s1;
        String s2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        iaxp.t = s2;
        iaxp.c = Boolean.parseBoolean(s);
        iaxp.d = Boolean.parseBoolean(s1);
        iaxp.e = Boolean.parseBoolean(s2);
        iaxo iaxo0 = null;
        try {
            class0 = Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, iaxp.class.getClassLoader()).asSubclass(iaxo.class);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            iaxp.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", classNotFoundException0);
            goto label_35;
        }
        catch(ClassCastException classCastException0) {
            iaxp.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", classCastException0);
            goto label_35;
        }
        try {
            constructor0 = class0.getConstructor(null);
        }
        catch(Exception exception0) {
            iaxp.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can\'t find JndiResourceResolverFactory ctor, skipping.", exception0);
            goto label_35;
        }
        try {
            iaxo1 = (iaxo)constructor0.newInstance(null);
        }
        catch(Exception exception1) {
            iaxp.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can\'t construct JndiResourceResolverFactory, skipping.", exception1);
            goto label_35;
        }
        if(iaxo1.b() == null) {
            iaxo0 = iaxo1;
        }
        else {
            logger0.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", iaxo1.b());
        }
    label_35:
        iaxp.f = iaxo0;
    }

    protected iaxp(String s, iaon iaon0, ibfk ibfk0, gfug gfug0, boolean z) {
        this.g = new Random();
        boolean z1 = true;
        this.q = 1;
        this.h = new AtomicReference();
        gftb.z(iaon0, "args");
        gftb.z(s, "name");
        URI uRI0 = URI.create(("//" + s));
        if(uRI0.getHost() == null) {
            z1 = false;
        }
        gftb.f(z1, "Invalid DNS name: %s", s);
        String s1 = uRI0.getAuthority();
        gftb.B(s1, "nameUri (%s) doesn\'t have an authority", uRI0);
        this.v = s1;
        this.i = uRI0.getHost();
        this.j = uRI0.getPort() == -1 ? iaon0.a : uRI0.getPort();
        Executor executor0 = iaon0.f;
        this.w = executor0 == null ? new ibfm(ibfk0) : new iaxu(executor0);
        long v = 0L;
        if(!z) {
            String s2 = System.getProperty("networkaddress.cache.ttl");
            long v1 = 30L;
            if(s2 != null) {
                try {
                    v1 = Long.parseLong(s2);
                }
                catch(NumberFormatException unused_ex) {
                    iaxp.a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", s2, ((long)30L)});
                }
            }
            v = v1 <= 0L ? v1 : TimeUnit.SECONDS.toNanos(v1);
        }
        this.k = v;
        this.n = gfug0;
        this.l = iaon0.c;
        this.m = iaon0.d;
    }

    @Override  // iaou
    public final String a() {
        return this.v;
    }

    @Override  // iaou
    public final void b() {
        gftb.r(this.z != null, "not started");
        this.f();
    }

    @Override  // iaou
    public final void c() {
        if(!this.x) {
            this.x = true;
            Executor executor0 = this.y;
            if(executor0 != null) {
                this.w.b(executor0);
                this.y = null;
            }
        }
    }

    @Override  // iaou
    public final void d(iaoq iaoq0) {
        gftb.r(this.z == null, "already started");
        this.y = this.w.a();
        this.z = iaoq0;
        this.f();
    }

    public static String e() {
        if(iaxp.u == null) {
            try {
                iaxp.u = InetAddress.getLocalHost().getHostName();
                return iaxp.u;
            }
            catch(UnknownHostException unknownHostException0) {
                throw new RuntimeException(unknownHostException0);
            }
        }
        return iaxp.u;
    }

    private final void f() {
        if(!this.p && !this.x) {
            if(this.o) {
                int v = Long.compare(this.k, 0L);
                if(v == 0 || v > 0 && this.n.a(TimeUnit.NANOSECONDS) > this.k) {
                    this.p = true;
                    this.y.execute(new iaxm(this, this.z));
                }
            }
            else {
                this.p = true;
                this.y.execute(new iaxm(this, this.z));
            }
        }
    }
}

