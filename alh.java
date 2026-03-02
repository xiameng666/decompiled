import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build.VERSION;
import android.util.Log;

public final class alh {
    private final BiometricManager a;
    private Boolean b;

    public alh(alg alg0) {
        this.b = null;
        this.a = ale.a(alg0.a);
    }

    @Deprecated
    public final int a() {
        return this.b(0xFF);
    }

    public final int b(int v) {
        if(!this.d() && v == 0x10000) {
            return 20;
        }
        BiometricManager biometricManager0 = this.a;
        if(biometricManager0 == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        int v1 = alf.a(biometricManager0, v);
        return v1 == 21 ? 1 : v1;
    }

    public static alh c(Context context0) {
        return new alh(new alg(context0));
    }

    public final boolean d() {
        Boolean boolean0 = this.b;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        if(Build.VERSION.SDK_INT >= 35) {
            BiometricManager biometricManager0 = this.a;
            if(biometricManager0 != null) {
                try {
                    alf.a(biometricManager0, 0x10000);
                    this.b = Boolean.valueOf(true);
                    return this.b.booleanValue();
                }
                catch(SecurityException unused_ex) {
                    this.b = Boolean.valueOf(false);
                    return this.b.booleanValue();
                }
            }
        }
        this.b = Boolean.valueOf(false);
        return this.b.booleanValue();
    }
}

