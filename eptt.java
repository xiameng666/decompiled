import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import j..util.Objects;

final class eptt extends epua {
    final evqp a;

    public eptt(eptv eptv0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(eptv0);
        super();
    }

    @Override  // epua
    public final void kB(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse0) {
        azzf.b(Status.b, recordConsentByConsentResultResponse0, this.a);
    }
}

