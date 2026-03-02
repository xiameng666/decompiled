import dagger.Lazy;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dlyp implements dmba {
    private static final bboh a;
    private final Lazy b;

    static {
        dlyp.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlyp(Lazy lazy0) {
        this.b = lazy0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        try {
            if(!((fcee)evrg.o(((fced)this.b.get()).g("com.google.android.location.fused.wearable.LOCATION_REQUESTOR_CAPABILITY", 0), 10L, TimeUnit.SECONDS)).b().isEmpty()) {
                return true;
            }
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            ((ggtj)dlyp.a.h()).x("Not showing because of fetching paired watch exception");
        }
        return false;
    }
}

