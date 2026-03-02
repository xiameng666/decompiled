import com.google.android.gms.nearby.sharing.TransferMetadata;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class dfzi extends dfzd {
    String a;
    dgap b;
    dfum c;
    dcnp d;
    String e;
    boolean f;
    boolean g;
    TransferMetadata i;
    float j;
    volatile boolean k;
    long l;
    cumn m;
    TransferMetadata n;
    int o;
    final ConcurrentMap p;

    public dfzi() {
        this.i = new dcnn(1000).a();
        this.j = 0.0f;
        this.k = false;
        this.p = new ConcurrentHashMap();
    }

    @Override
    public final String toString() {
        String s = this.a;
        boolean z = true;
        Boolean boolean0 = Boolean.valueOf(this.b != null);
        if(this.c == null) {
            z = false;
        }
        return String.format("IncomingShareTargetInfo<endpointId: %s, hasCertificate: %s, hasConnection: %s, isResumeTransferEnabled: %s, isCancellationInitiator: %s, hasSharedAccount: %s, isCancelled: %b, connectionMedium: %s>", s, boolean0, Boolean.valueOf(z), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(false), Boolean.valueOf(this.k), ((int)this.o));
    }
}

