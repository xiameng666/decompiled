import com.google.android.gms.auth.blockstore.service.BlockstoreModuleInitIntentOperation;
import j..util.Objects;

public final class aitz implements gmbg {
    public aitz(BlockstoreModuleInitIntentOperation blockstoreModuleInitIntentOperation0) {
        Objects.requireNonNull(blockstoreModuleInitIntentOperation0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(BlockstoreModuleInitIntentOperation.a.i(), "cloudRestoreSourceId cleaning failed.", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        ((ggtj)BlockstoreModuleInitIntentOperation.a.h()).x("cloudRestoreSourceId cleared");
    }
}

