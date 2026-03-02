import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.HashMap;

public final class azpj {
    public static final azqt a;
    public static final azqt b;
    private static final HashMap c;
    private final Context d;

    static {
        azqs azqs0 = new azqs();
        azqs0.a = "com.google.android.gms";
        azqs0.b = 204200000L;
        azqs0.c(gged_interceptors.n(azpy.f.hy(), azpy.d.hy(), azpy.b.hy()));
        azqs0.b(gged_interceptors.n(azpy.e.hy(), azpy.c.hy(), azpy.a.hy()));
        azpj.a = azqs0.a();
        azqs azqs1 = new azqs();
        azqs1.a = "com.android.vending";
        azqs1.b = 82240000L;
        azqs1.c(gged_interceptors.l(azpy.f.hy()));
        azqs1.b(gged_interceptors.m(azpy.e.hy(), azpy.c.hy()));
        azpj.b = azqs1.a();
        azpj.c = new HashMap();
    }

    public azpj(Context context0) {
        batl.s(context0);
        this.d = context0.getApplicationContext();
    }

    public final azpi a(azqt azqt0, boolean z) {
        azpi azpi0;
        azph azph0;
        String s = azqt0.a;
        Context context0 = this.d;
        if(!bbms.i(context0, s, azqt0.d)) {
            if(!bbms.i(context0, s, azqt0.c)) {
                return new azpi(false, 2);
            }
            if(!z) {
                return new azpi(false, 3);
            }
            ApplicationInfo applicationInfo0 = bbsr.b(context0).d(s, 0);
            if(applicationInfo0 != null && (applicationInfo0.flags & 0x81) != 0) {
                azqq azqq0 = this.b(s, azqt0.b, true).a();
                if(!azqq0.d()) {
                    if(azqq0.a == azqp.d) {
                        return new azpi(true, 4);
                    }
                    Log.w("GmsSignatureVerifier", "Stamp verification of debug key signed " + s + " failed. Error message: " + azqq0.c());
                    return new azpi(false, 3);
                }
                return new azpi(true, 5);
            }
            return new azpi(false, 6);
        }
        PackageInfo packageInfo0 = bbsr.b(context0).e(s, 0);
        long v = packageInfo0 == null ? 0x7FFFFFFFFFFFFFFFL : packageInfo0.getLongVersionCode();
        HashMap hashMap0 = azpj.c;
        synchronized(hashMap0) {
            azph0 = (azph)hashMap0.get(s);
        }
        if(azph0 != null && v == azph0.a) {
            return azph0.b;
        }
        azqq azqq1 = this.b(s, azqt0.b, false).a();
        if(azqq1.d()) {
            azpi0 = new azpi(true, 1);
        }
        else {
            Log.w("GmsSignatureVerifier", "Stamp verification of " + s + " failed. Error message: " + azqq1.c());
            azpi0 = new azpi(false, 1);
        }
        synchronized(hashMap0) {
            hashMap0.put(s, new azph(v, azpi0));
        }
        return azpi0;
    }

    final azqo b(String s, long v, boolean z) {
        return new azqo(this.d, s, v, z);
    }
}

