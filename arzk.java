import com.google.android.gms.backup.g1.restore.VerifyAutoRestoreIntentOperation;
import j..util.Objects;

public final class arzk implements gmbg {
    final VerifyAutoRestoreIntentOperation a;

    public arzk(VerifyAutoRestoreIntentOperation verifyAutoRestoreIntentOperation0) {
        Objects.requireNonNull(verifyAutoRestoreIntentOperation0);
        this.a = verifyAutoRestoreIntentOperation0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(hqje.a.m().C() && !((Boolean)object0).booleanValue()) {
            VerifyAutoRestoreIntentOperation.a.j("Not G1 user", new Object[0]);
            return;
        }
        this.a.a();
    }
}

