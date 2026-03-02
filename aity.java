import com.google.android.gms.auth.blockstore.service.BlockstoreModuleInitIntentOperation;
import j..util.Objects;

public final class aity implements gmbg {
    public aity(BlockstoreModuleInitIntentOperation blockstoreModuleInitIntentOperation0) {
        Objects.requireNonNull(blockstoreModuleInitIntentOperation0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(BlockstoreModuleInitIntentOperation.a.i(), "scheduleOneOffTaskIfAlreadyScheduled failed.", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        ((ggtj)BlockstoreModuleInitIntentOperation.a.h()).x("scheduleOneOffTaskIfAlreadyScheduled finished");
    }
}

