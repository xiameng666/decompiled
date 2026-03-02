import j..util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class iayh {
    public static final iaoa a;
    public static final iaoa b;
    public static final iaoa c;
    public static final iaoa d;
    public static final iaoa e;
    static final iaoa f;
    public static final iaoa g;
    public static final iaoa h;
    public static final iaoa i;
    public static final long j;
    public static final iapc k;
    public static final iakp l;
    public static final ibfk m;
    public static final ibfk n;
    public static final gful_cronetEngineProvider o;
    private static final Logger p;
    private static final Set q;
    private static final ialc r;

    static {
        iayh.p = Logger.getLogger(iayh.class.getName());
        iayh.q = DesugarCollections.unmodifiableSet(EnumSet.of(iaph.a, new iaph[]{iaph.d, iaph.f, iaph.g, iaph.j, iaph.k, iaph.l, iaph.p}));
        Charset.forName("US-ASCII");
        iayh.a = new iant("grpc-timeout", new iayg());
        iayh.b = new iant("grpc-encoding", iaof_metadata.c);
        iayh.c = iamo.a("grpc-accept-encoding", new iaye());
        iayh.d = new iant("content-encoding", iaof_metadata.c);
        iayh.e = iamo.a("accept-encoding", new iaye());
        iayh.f = new iant("content-length", iaof_metadata.c);
        iayh.g = new iant("content-type", iaof_metadata.c);
        iayh.h = new iant("te", iaof_metadata.c);
        iayh.i = new iant("user-agent", iaof_metadata.c);
        gfud.e(',').i();
        iayh.j = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        iayh.k = new ibdb();
        iayh.l = new iakp("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        iayh.r = new ialc();
        iayh.m = new iayb();
        iayh.n = new iayc();
        iayh.o = new iayd();
    }

    public static iapk a(int v) {
        if(v >= 100 && v < 200) {
            return iaph.n.a().f("HTTP status code " + v);
        }
        switch(v) {
            case 401: {
                return iaph.q.a().f("HTTP status code " + 401);
            }
            case 403: {
                return iaph.h.a().f("HTTP status code " + 403);
            }
            case 404: {
                return iaph.m.a().f("HTTP status code " + 404);
            }
            case 429: {
                return iaph.o.a().f("HTTP status code " + 429);
            }
            case 400: 
            case 0x1AF: {
                return iaph.n.a().f("HTTP status code " + v);
            }
            default: {
                return v == 502 || v == 503 || v == 504 ? iaph.o.a().f("HTTP status code " + v) : iaph.c.a().f("HTTP status code " + v);
            }
        }
    }

    public static iapk b(iapk iapk0) {
        gftb.checkTrue(iapk0 != null);
        return iayh.q.contains(iapk0.t) ? iapk.p.f("Inappropriate status code from control plane: " + iapk0.t.toString() + " " + iapk0.u).e(iapk0.v) : iapk0;
    }

    static iavb c(iamz iamz0, boolean z) {
        iavb iavb0;
        ianc ianc0 = iamz0.b;
        if(ianc0 == null) {
            iavb0 = null;
        }
        else {
            gftb.r(((iatx)ianc0).g, "Subchannel is not started");
            iavb0 = ((iatx)ianc0).f.a();
        }
        if(iavb0 == null) {
            iapk iapk0 = iamz0.c;
            if(!iapk0.h()) {
                if(iamz0.d) {
                    return new iaxt(iayh.b(iapk0), iauz.c);
                }
                if(!z) {
                    return new iaxt(iayh.b(iapk0), iauz.a);
                }
            }
            return null;
        }
        return iavb0;
    }

    public static String d(String s, int v) {
        try {
            return new URI(null, null, s, v, null, null, null).getAuthority();
        }
        catch(URISyntaxException uRISyntaxException0) {
            throw new IllegalArgumentException(a.p(v, s, "Invalid host or port: ", " "), uRISyntaxException0);
        }
    }

    public static String e(String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(s1 != null) {
            stringBuilder0.append(s1);
            stringBuilder0.append(' ');
        }
        stringBuilder0.append("grpc-java-");
        stringBuilder0.append(s);
        stringBuilder0.append("/1.76.0-SNAPSHOT");
        return stringBuilder0.toString();
    }

    public static URI f(String s) {
        gftb.z(s, "authority");
        try {
            return new URI(null, s, null, null, null);
        }
        catch(URISyntaxException uRISyntaxException0) {
            throw new IllegalArgumentException("Invalid authority: " + s, uRISyntaxException0);
        }
    }

    static void g(ibfp ibfp0) {
        InputStream inputStream0;
        while((inputStream0 = ibfp0.f()) != null) {
            iayh.h(inputStream0);
        }
    }

    public static void h(Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(IOException iOException0) {
            iayh.p.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", iOException0);
        }
    }

    public static boolean i(String s, boolean z) {
        String s1 = System.getenv(s);
        if(s1 == null) {
            s1 = System.getProperty(s);
        }
        if(s1 != null) {
            s1 = s1.trim();
        }
        return z ? gfta.c(s1) || Boolean.parseBoolean(s1) : !gfta.c(s1) && Boolean.parseBoolean(s1);
    }

    public static boolean j(iakq iakq0) {
        return !Boolean.TRUE.equals(iakq0.j(iayh.l));
    }

    public static ThreadFactory k(String s) {
        gmcw gmcw0 = new gmcw();
        gmcw0.b(true);
        gmcw0.a = s;
        return gmcw.a(gmcw0);
    }

    public static ialc[] l(iakq iakq0, int v, boolean z) {
        List list0 = iakq0.g;
        int v1 = list0.size();
        ialc[] arr_ialc = new ialc[v1 + 1];
        gftb.z(iakq0, "callOptions cannot be null");
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            arr_ialc[v2] = ((ialb)list0.get(v2)).a();
        }
        arr_ialc[v1] = iayh.r;
        return arr_ialc;
    }
}

