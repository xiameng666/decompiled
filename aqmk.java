import android.content.SharedPreferences.Editor;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.LockScreenRequiredException;
import java.security.UnrecoverableKeyException;

public final class aqmk {
    private static final baun a;
    private static final bboh b;
    private final aqle c;
    private final aqlm d;
    private final aqld e;

    static {
        aqmk.a = aqql.a("StartSecondaryKeyRotationTask");
        aqmk.b = bboh.b("StartSecondaryKeyRotationTask", bbcu.dF);
    }

    public aqmk(aqld aqld0, aqle aqle0, aqlm aqlm0) {
        this.e = aqld0;
        this.c = aqle0;
        this.d = aqlm0;
    }

    public final void a() {
        aqlk aqlk0;
        if(this.e.b()) {
            baun baun0 = aqmk.a;
            baun0.h("Attempting to initiate a secondary key rotation.", new Object[0]);
            aqle aqle0 = this.c;
            aqle0.h(System.currentTimeMillis());
            gfsx gfsx0 = aqle0.b();
            if(!gfsx0.i()) {
                baun0.m("No active current alias. Cannot trigger a secondary rotation.", new Object[0]);
                return;
            }
            String s = (String)gfsx0.d();
            gfsx gfsx1 = aqle0.c();
            if(gfsx1.i()) {
                String s1 = (String)gfsx1.d();
                if(s1.equals(s)) {
                    Exception exception0 = new Exception("Was already trying to rotate to what is already the active key.");
                    baun0.f(exception0.getMessage(), new Object[0]);
                    aqmk.b(exception0);
                }
                else {
                    baun0.m("Was already rotating to another key. Cancelling that.", new Object[0]);
                    try {
                        this.d.e(s1);
                    }
                    catch(Exception exception1) {
                        aqmk.a.p("Could not remove old key", exception1, new Object[0]);
                        aqmk.b(exception1);
                    }
                }
                this.c.e();
            }
            try {
                aqlk0 = this.d.a();
            }
            catch(LockScreenRequiredException lockScreenRequiredException0) {
                aqmk.a.g("No lock screen is set - cannot generate a new key to rotate to.", ((Throwable)lockScreenRequiredException0), new Object[0]);
                aqmk.b(((Exception)lockScreenRequiredException0));
                return;
            }
            catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
                aqmk.a.g("Internal error in Recovery Controller, failed to rotate key.", ((Throwable)internalRecoveryServiceException0), new Object[0]);
                aqmk.b(((Exception)internalRecoveryServiceException0));
                return;
            }
            catch(UnrecoverableKeyException unrecoverableKeyException0) {
                aqmk.a.g("Failed to get key after generating, failed to rotate", unrecoverableKeyException0, new Object[0]);
                aqmk.b(unrecoverableKeyException0);
                return;
            }
            String s2 = aqlk0.a;
            aqmk.a.h("Generated a new secondary key with alias \'%s\'", new Object[]{s2});
            try {
                this.c.d(s2);
                SharedPreferences.Editor sharedPreferences$Editor0 = this.c.c.edit();
                sharedPreferences$Editor0.putString("nextSecondary", s2);
                sharedPreferences$Editor0.apply();
                aqmk.a.h("Successfully set \'%s\' as next key to rotate to", new Object[]{s2});
            }
            catch(aqlh aqlh0) {
                aqmk.a.g("Unexpected error setting next alias", aqlh0, new Object[0]);
                aqmk.b(aqlh0);
                try {
                    this.d.e(s2);
                }
                catch(Exception exception2) {
                    aqmk.a.p("Failed to remove generated key after encountering error", exception2, new Object[0]);
                    aqmk.b(exception2);
                }
            }
        }
    }

    private static final void b(Exception exception0) {
        long v = hqhn.c();
        aqqo.a(aqmk.b, exception0, v);
    }
}

