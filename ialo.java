import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

final class ialo {
    static final ialp a;

    static {
        ialp ialp0;
        AtomicReference atomicReference0 = new AtomicReference();
        try {
            ialp0 = (ialp)Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(ialp.class).getConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            atomicReference0.set(classNotFoundException0);
            ialp0 = new iapt();
        }
        catch(Exception exception0) {
            throw new RuntimeException("Storage override failed to initialize", exception0);
        }
        ialo.a = ialp0;
        Throwable throwable0 = (Throwable)atomicReference0.get();
        if(throwable0 != null) {
            ialq.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn\'t exist. Using default", throwable0);
        }
    }
}

