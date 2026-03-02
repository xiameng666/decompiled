import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;

public final class aqyw extends aqyx {
    public final Context a;
    public final aqjl b;
    private static final baun c;
    private final aqle d;
    private final RecoveryController e;

    static {
        aqyw.c = aqql.a("PostPEncryptionSnapshotLogHelper");
    }

    public aqyw(Context context0, aqle aqle0) {
        this.a = context0;
        this.b = aqjl.a;
        this.d = aqle0;
        this.e = RecoveryController.getInstance(context0);
    }

    @Override  // aqyx
    public final gfsx a() {
        return gfsx.m(new aqzr(this.c(this.d.b()), this.c(this.d.c())));
    }

    private final int c(gfsx gfsx0) {
        int v;
        if(!gfsx0.i()) {
            return 3;
        }
        try {
            String s = (String)gfsx0.d();
            v = this.e.getRecoveryStatus(s);
        }
        catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
            aqyw.c.g("Exception getting recovery status", ((Throwable)internalRecoveryServiceException0), new Object[0]);
            return 2;
        }
        if(v == 0) {
            return 4;
        }
        return v == 1 ? 5 : 6;
    }
}

