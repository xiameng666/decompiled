import android.content.Context;
import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dybv {
    public final frli a;
    private final Context b;

    public dybv() {
        Context context0 = AppContextProvider.a();
        this.b = context0;
        frce frce0 = new frce(context0);
        frce0.d("tapandpay");
        frce0.e("se_device_settings_datastore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dylw.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public final int a() {
        int v1;
        int v = 1;
        try {
            switch(((dylw)this.a.a().get(10L, TimeUnit.SECONDS)).d) {
                case 0: {
                    v1 = 2;
                    goto label_11;
                }
                case 1: {
                    v1 = 3;
                    goto label_11;
                }
                case 2: {
                    goto label_10;
                }
            }
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return 2;
        }
        v1 = 0;
        goto label_11;
    label_10:
        v1 = 4;
    label_11:
        if(v1 != 0) {
            v = v1;
        }
        return v == 2 ? 4 : v;
    }

    public final gmcd b(int v) {
        dybu dybu0 = new dybu(v);
        return this.a.b(dybu0, gmap.a);
    }
}

