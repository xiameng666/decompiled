import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class iayn {
    public final long a;
    public final gfug b;
    public Map c;
    public boolean d;
    public iapk e;
    private static final Logger f;

    static {
        iayn.f = Logger.getLogger(iayn.class.getName());
    }

    public iayn(long v, gfug gfug0) {
        this.c = new LinkedHashMap();
        this.a = v;
        this.b = gfug0;
    }

    public static void a(Executor executor0, Runnable runnable0) {
        try {
            executor0.execute(runnable0);
        }
        catch(Throwable throwable0) {
            iayn.f.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", throwable0);
        }
    }

    public static void b(iazp iazp0, Executor executor0) {
        iayn.a(executor0, new iaym(iazp0));
    }
}

