import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public final class ibbl extends ianl {
    static final long a;
    static final long b;
    static final Pattern c;
    ibcd d;
    public final ibcd e;
    iaoy f;
    final List g;
    final String h;
    IdentityHashMap i;
    String j;
    ialv k;
    final iali l;
    long m;
    final iamg n;
    public final ibbe o;
    private static final Logger p;
    private static final ibcd q;
    private static final ialv r;
    private static final iali s;
    private static final Method t;
    private final List u;
    private final ibbf v;

    static {
        ibbl.p = Logger.getLogger(ibbl.class.getName());
        ibbl.a = TimeUnit.MINUTES.toMillis(30L);
        ibbl.b = TimeUnit.SECONDS.toMillis(1L);
        ibbl.q = new ibfm(iayh.m);
        ibbl.r = ialv.b;
        ibbl.s = iali.a;
        ibbl.c = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        Method method0 = null;
        try {
            method0 = iasz.class.getDeclaredMethod("getClientInterceptor", Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            ibbl.p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", classNotFoundException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            ibbl.p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", noSuchMethodException0);
        }
        ibbl.t = method0;
    }

    public ibbl(String s, ibbf ibbf0, ibbe ibbe0) {
        this.d = ibbl.q;
        this.e = ibbl.q;
        this.u = new ArrayList();
        this.f = iaoy.b();
        this.g = new ArrayList();
        this.k = ibbl.r;
        this.l = ibbl.s;
        this.m = ibbl.a;
        this.n = iamg.b;
        new ArrayList();
        gftb.z(s, "target");
        this.h = s;
        this.v = ibbf0;
        this.o = ibbe0;
        iamj.a();
    }

    public ibbl(SocketAddress socketAddress0, String s, ibbf ibbf0) {
        this.d = ibbl.q;
        this.e = ibbl.q;
        this.u = new ArrayList();
        this.f = iaoy.b();
        this.g = new ArrayList();
        this.k = ibbl.r;
        this.l = ibbl.s;
        this.m = ibbl.a;
        this.n = iamg.b;
        new ArrayList();
        this.h = ibbl.j(socketAddress0);
        this.v = ibbf0;
        iaoy iaoy0 = new iaoy();
        iaoy0.e(new ibbh(socketAddress0, s));
        this.f = iaoy0;
        this.o = new ibbj();
        iamj.a();
    }

    @Override  // ianl
    public final ianj_grpcChannel a() {
        iakw iakw2;
        iakw iakw0;
        iavd iavd0 = this.v.a();
        iaoy iaoy0 = this.f;
        Collection collection0 = iavd0.b();
        ibbk ibbk0 = ibbl.b(this.h, iaoy0, collection0);
        URI uRI0 = ibbk0.a;
        iaov iaov0 = ibbk0.b;
        ibfm ibfm0 = new ibfm(iayh.m);
        gful_cronetEngineProvider gful0 = iayh.o;
        ArrayList arrayList0 = new ArrayList(this.u.size());
        Iterator iterator0 = this.u.iterator();
        while(true) {
            iakw0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            iakw iakw1 = (iakw)object0;
            if(!(iakw1 instanceof ibbi)) {
                arrayList0.add(iakw1);
                continue;
            }
            ibbi ibbi0 = (ibbi)iakw1;
            throw null;
        }
        ialk.a();
        Method method0 = ibbl.t;
        if(method0 == null) {
            iakw2 = null;
        }
        else {
            try {
                Boolean boolean0 = Boolean.valueOf(true);
                iakw2 = (iakw)method0.invoke(null, boolean0, boolean0, Boolean.valueOf(false), boolean0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                ibbl.p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", illegalAccessException0);
                iakw2 = null;
            }
            catch(InvocationTargetException invocationTargetException0) {
                ibbl.p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", invocationTargetException0);
                iakw2 = null;
            }
        }
        if(iakw2 != null) {
            arrayList0.add(0, iakw2);
        }
        try {
            iakw0 = (iakw)iata.class.getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            ibbl.p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", classNotFoundException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            ibbl.p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", noSuchMethodException0);
        }
        catch(IllegalAccessException illegalAccessException1) {
            ibbl.p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", illegalAccessException1);
        }
        catch(InvocationTargetException invocationTargetException1) {
            ibbl.p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", invocationTargetException1);
        }
        if(iakw0 != null) {
            arrayList0.add(0, iakw0);
        }
        return new ibbn(((ianj_grpcChannel)new ibbd(this, iavd0, uRI0, iaov0, ibfm0, gful0, arrayList0, ibfr.a)));
    }

    static ibbk b(String s, iaoy iaoy0, Collection collection0) {
        URI uRI0;
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            uRI0 = new URI(s);
        }
        catch(URISyntaxException uRISyntaxException0) {
            stringBuilder0.append(uRISyntaxException0.getMessage());
            uRI0 = null;
        }
        iaov iaov0 = uRI0 == null ? null : iaoy0.a(uRI0.getScheme());
        String s1 = "";
        if(iaov0 == null && !ibbl.c.matcher(s).matches()) {
            try {
                uRI0 = new URI(iaoy0.c(), "", "/" + s, null);
            }
            catch(URISyntaxException uRISyntaxException1) {
                throw new IllegalArgumentException(uRISyntaxException1);
            }
            iaov0 = iaoy0.a(uRI0.getScheme());
        }
        if(iaov0 == null) {
            if(stringBuilder0.length() > 0) {
                s1 = a.b(stringBuilder0, " (", ")");
            }
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", s, s1));
        }
        if(collection0 != null && !collection0.containsAll(iaov0.d())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver \'%s\' for \'%s\' not supported by transport", uRI0.getScheme(), s));
        }
        return new ibbk(uRI0, iaov0);
    }

    @Override  // ianl
    public final void c() {
        this.k(gmap.a);
    }

    @Override  // ianl
    public final void d(iaom iaom0, Object object0) {
        if(this.i == null) {
            this.i = new IdentityHashMap();
        }
        IdentityHashMap identityHashMap0 = this.i;
        gftb.z(object0, "value");
        identityHashMap0.put(iaom0, object0);
    }

    @Override  // ianl
    public final void e(ialv ialv0) {
        if(ialv0 != null) {
            this.k = ialv0;
            return;
        }
        this.k = ibbl.r;
    }

    @Override  // ianl
    public final void f(Executor executor0) {
        this.k(executor0);
    }

    @Override  // ianl
    public final void g(iakw[] arr_iakw) {
        List list0 = Arrays.asList(arr_iakw);
        this.u.addAll(list0);
    }

    @Override  // ianl
    public final void h(String s) {
        this.j = s;
    }

    @Override  // ianl
    public final void i(long v, TimeUnit timeUnit0) {
        gftb.e(v > 0L, "idle timeout is %s, but must be positive", v);
        if(timeUnit0.toDays(v) >= 30L) {
            this.m = -1L;
            return;
        }
        this.m = Math.max(timeUnit0.toMillis(v), ibbl.b);
    }

    static String j(SocketAddress socketAddress0) {
        try {
            return new URI("directaddress", "", "/" + socketAddress0, null).toString();
        }
        catch(URISyntaxException uRISyntaxException0) {
            throw new RuntimeException(uRISyntaxException0);
        }
    }

    public final void k(Executor executor0) {
        if(executor0 != null) {
            this.d = new iaxu(executor0);
            return;
        }
        this.d = ibbl.q;
    }
}

