import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.LockScreenRequiredException;
import android.security.keystore.recovery.RecoveryController;
import java.security.UnrecoverableKeyException;

public final class aqmf {
    private static final baun a;
    private final Context b;
    private final aqle c;
    private final aqlm d;
    private final aqys e;
    private final Account f;
    private final aqlj g;

    static {
        aqmf.a = aqql.a("InitializeFolsomSecondaryKeyTask");
    }

    public aqmf(Context context0, aqle aqle0, aqlm aqlm0, aqlj aqlj0, aqys aqys0, Account account0) {
        this.b = context0;
        this.c = aqle0;
        this.d = aqlm0;
        this.g = aqlj0;
        this.e = aqys0;
        this.f = account0;
    }

    public final aqlk a() {
        RecoveryController recoveryController0 = RecoveryController.getInstance(this.b);
        aqmh aqmh0 = new aqmh(this.b, this.d, this.g, this.c, recoveryController0, this.f);
        synchronized(aqmh.class) {
            aqmh0.a();
        }
        return this.b();
    }

    private final aqlk b() {
        aqlk aqlk1;
        gfsx gfsx0 = this.c();
        if(gfsx0.i()) {
            aqlk aqlk0 = (aqlk)gfsx0.d();
            if(aqlk0.a(this.b) != 3) {
                Object[] arr_object = {((aqlk)gfsx0.d()).a};
                aqmf.a.d("Secondary key already initialized: %s", arr_object);
                return (aqlk)gfsx0.d();
            }
            this.e.g(21, 4);
            throw new aqlo("Key destroyed: " + aqlk0.a);
        }
        baun baun0 = aqmf.a;
        baun0.j("Initializing for crypto: generating a secondary key.", new Object[0]);
        try {
            aqlk1 = this.d.a();
        }
        catch(InternalRecoveryServiceException | LockScreenRequiredException | UnrecoverableKeyException throwable0) {
            this.e.g(26, 4);
            throw new aqme(throwable0);
        }
        String s = aqlk1.a;
        baun0.h("Generated new secondary key %s", new Object[]{s});
        try {
            this.g.a(this.f, s, ggnf.a);
            baun0.j("Successfully synced %s with server.", new Object[]{s});
        }
        catch(aqyc aqyc0) {
            throw new aqme(aqyc0);
        }
        try {
            batl.m(((boolean)(this.c.i() ^ 1)), "Attempting to initialize an already initialized settings.");
            this.c.f(s);
            SharedPreferences.Editor sharedPreferences$Editor0 = this.c.c.edit();
            sharedPreferences$Editor0.putBoolean("isInitialized", true);
            sharedPreferences$Editor0.apply();
            baun0.j("Successfully saved %s as active secondary to disk.", new Object[]{s});
            return aqlk1;
        }
        catch(aqlh aqlh0) {
            this.e.g(20, 4);
            throw new aqme(aqlh0);
        }
    }

    private final gfsx c() {
        gfsx gfsx1;
        aqle aqle0 = this.c;
        if(!aqle0.i()) {
            return gfqx.a;
        }
        gfsx gfsx0 = aqle0.b();
        if(gfsx0.i()) {
            String s = (String)gfsx0.d();
            try {
                gfsx1 = this.d.c(s);
            }
            catch(InternalRecoveryServiceException | UnrecoverableKeyException exception0) {
                this.e.g(24, 4);
                if(hqjb.k()) {
                    throw new aqlo(exception0);
                }
                throw new aqme(exception0);
            }
            if(gfsx1.i()) {
                return gfsx1;
            }
            this.e.g(23, 4);
            throw new aqln("Initialized with key but it was not in key store: " + s);
        }
        this.e.g(22, 4);
        throw new aqln("Settings said crypto was initialized, but there was no active secondary alias");
    }
}

