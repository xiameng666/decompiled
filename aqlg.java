import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;

public final class aqlg implements aqlf {
    private static final baun a;
    private final RecoveryController b;
    private final aqld c;
    private final aqle d;
    private final aqqp e;

    static {
        aqlg.a = aqql.a("CryptoStatusFetcher");
    }

    public aqlg(RecoveryController recoveryController0, aqld aqld0, aqle aqle0, aqqp aqqp0) {
        this.e = aqqp0;
        batl.s(recoveryController0);
        this.b = recoveryController0;
        this.c = aqld0;
        this.d = aqle0;
    }

    @Override  // aqlf
    public final boolean a() {
        gfsx gfsx0 = this.d.b();
        if(!gfsx0.i()) {
            aqlg.a.d("Alias not present.", new Object[0]);
            return false;
        }
        try {
            return this.e(1, ((String)gfsx0.d()));
        }
        catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
            aqlg.a.g("Exception getting recovery status for active secondary key.", ((Throwable)internalRecoveryServiceException0), new Object[0]);
            return false;
        }
    }

    @Override  // aqlf
    public final boolean b() {
        aqlg.a.d("Checking whether any secondary key is synced.", new Object[0]);
        gfsx gfsx0 = this.d.b();
        gfsx gfsx1 = this.d.c();
        return this.f(gfsx0) || this.f(gfsx1);
    }

    @Override  // aqlf
    public final boolean c() {
        if(!this.c.b()) {
            aqlg.a.d("Encryption not initialized so no need to unlock", new Object[0]);
            return false;
        }
        gfsx gfsx0 = this.d.b();
        if(!gfsx0.i()) {
            aqlg.a.d("Initialized but no secondary key, user needs to unlock", new Object[0]);
            this.e.a(2);
            return true;
        }
        try {
            if(!this.e(0, ((String)gfsx0.d()))) {
                return true;
            }
        }
        catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
            aqlg.a.g("Exception getting recovery status so no need to unlock", ((Throwable)internalRecoveryServiceException0), new Object[0]);
        }
        return false;
    }

    public static aqlf d(Context context0) {
        return new aqlg(RecoveryController.getInstance(context0), new aqld(context0), aqle.a(context0), new aqqp(context0));
    }

    private final boolean e(int v, String s) {
        int v1 = this.b.getRecoveryStatus(s);
        if(v1 == 0) {
            aqlg.a.d("Secondary key synced.", new Object[0]);
            return 0 == v;
        }
        if(v1 == 1) {
            aqlg.a.d("Secondary key sync in progress.", new Object[0]);
            this.e.a(3);
            return 1 == v;
        }
        aqlg.a.f("Secondary key has bad sync status %d.", new Object[]{v1});
        this.e.a(4);
        return v1 == v;
    }

    private final boolean f(gfsx gfsx0) {
        if(!gfsx0.i()) {
            aqlg.a.d("Alias not present.", new Object[0]);
            return false;
        }
        try {
            return this.e(0, ((String)gfsx0.d()));
        }
        catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
            aqlg.a.g("Exception getting recovery status for active secondary key.", ((Throwable)internalRecoveryServiceException0), new Object[0]);
            return false;
        }
    }
}

