import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import j..util.Objects;

final class fczh implements Runnable {
    final CapabilityInfoParcelable a;
    final fczl b;

    public fczh(fczl fczl0, CapabilityInfoParcelable capabilityInfoParcelable0) {
        this.a = capabilityInfoParcelable0;
        Objects.requireNonNull(fczl0);
        this.b = fczl0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.b(this.a);
    }
}

