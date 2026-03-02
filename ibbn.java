import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

final class ibbn extends iaxy {
    public static final Logger b;
    private static final ReferenceQueue c;
    private static final ConcurrentMap d;
    private final ibbm e;

    static {
        ibbn.c = new ReferenceQueue();
        ibbn.d = new ConcurrentHashMap();
        ibbn.b = Logger.getLogger(ibbn.class.getName());
    }

    public ibbn(ianj_grpcChannel ianj0) {
        super(ianj0);
        this.e = new ibbm(this, ianj0, ibbn.c, ibbn.d);
    }

    @Override  // iaxy
    public final ianj_grpcChannel d() {
        this.e.a();
        ((ibbd)this.a).v();
        return this.a;
    }

    @Override  // iaxy
    public final ianj_grpcChannel e() {
        this.e.a();
        ((ibbd)this.a).w();
        return this.a;
    }
}

