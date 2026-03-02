import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

@Deprecated
public final class aidv extends azts {
    static int a = 1;

    static {
    }

    public aidv(Context context0, GoogleSignInOptions googleSignInOptions0) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        super(context0, adsv.b, googleSignInOptions0, aztr0);
    }

    public final int b() {
        int v1;
        synchronized(this) {
            v1 = aidv.a;
            if(v1 == 1) {
                Context context0 = this.v;
                azpm azpm0 = azpm.a;
                int v2 = azpm0.m(context0);
                if(v2 == 0) {
                    v1 = 4;
                    aidv.a = 4;
                }
                else if(azpm0.k(context0, v2, null) == null && bjia.a(context0, "com.google.android.gms.auth.api.fallback") != 0) {
                    v1 = 3;
                    aidv.a = 3;
                }
                else {
                    v1 = 2;
                    aidv.a = 2;
                }
            }
        }
        return v1;
    }
}

