import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

final class ibbm extends WeakReference {
    public static final int a;
    private static final boolean b;
    private static final RuntimeException c;
    private final ReferenceQueue d;
    private final ConcurrentMap e;
    private final String f;
    private final Reference g;
    private final AtomicBoolean h;

    static {
        ibbm.b = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
        RuntimeException runtimeException0 = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException0.setStackTrace(new StackTraceElement[0]);
        ibbm.c = runtimeException0;
    }

    public ibbm(ibbn ibbn0, ianj_grpcChannel ianj0, ReferenceQueue referenceQueue0, ConcurrentMap concurrentMap0) {
        super(ibbn0, referenceQueue0);
        this.h = new AtomicBoolean();
        this.g = new SoftReference((ibbm.b ? new RuntimeException("ManagedChannel allocation site") : ibbm.c));
        this.f = ianj0.toString();
        this.d = referenceQueue0;
        this.e = concurrentMap0;
        concurrentMap0.put(this, this);
        ibbm.b(referenceQueue0);
    }

    public final void a() {
        if(!this.h.getAndSet(true)) {
            this.clear();
        }
    }

    static void b(ReferenceQueue referenceQueue0) {
        ibbm ibbm0;
        while((ibbm0 = (ibbm)referenceQueue0.poll()) != null) {
            RuntimeException runtimeException0 = (RuntimeException)ibbm0.g.get();
            ibbm0.c();
            if(!ibbm0.h.get()) {
                Level level0 = Level.SEVERE;
                Logger logger0 = ibbn.b;
                if(logger0.isLoggable(level0)) {
                    LogRecord logRecord0 = new LogRecord(level0, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord0.setLoggerName(logger0.getName());
                    logRecord0.setParameters(new Object[]{ibbm0.f});
                    logRecord0.setThrown(runtimeException0);
                    logger0.log(logRecord0);
                }
            }
        }
    }

    private final void c() {
        super.clear();
        this.e.remove(this);
        this.g.clear();
    }

    @Override
    public final void clear() {
        this.c();
        ibbm.b(this.d);
    }
}

