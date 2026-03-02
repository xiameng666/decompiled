import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.concurrent.Executor;

public final class cjbx {
    public final cjby a;
    public final alo b;
    private final Context c;

    private cjbx(Context context0, cjby cjby0, alo alo0) {
        this.c = context0;
        this.a = cjby0;
        this.b = alo0;
    }

    public static all a(Context context0) {
        all all0 = new all();
        all0.d = "Verify it\'s you";
        all0.f = "Identity Check is on and requires a biometric";
        all0.i = 0x10000;
        all0.g = "Cancel";
        return all0;
    }

    public static cjbx b(du du0, ali ali0) {
        return cjbx.c(du0, null, ali0);
    }

    public static cjbx c(du du0, Executor executor0, ali ali0) {
        Context context0 = du0.requireContext();
        cjby cjby0 = cjbx.d(du0);
        cjbk cjbk0 = new cjbk(du0.requireContext(), du0.getChildFragmentManager(), cjbx.d(du0), ali0);
        cjbx cjbx0 = new cjbx(context0, cjby0, (executor0 == null ? new alo(du0, cjbk0) : new alo(du0, executor0, cjbk0)));
        cjbx0.a.c.k(du0);
        cjbh cjbh0 = new cjbh(cjbx0, ali0);
        cjbx0.a.c.g(du0, cjbh0);
        return cjbx0;
    }

    public static cjby d(lsq lsq0) {
        if(lsq0 != null) {
            return (cjby)new lso(lsq0).a(cjby.class);
        }
        throw new IllegalStateException("GmsBiometricPrompt view model not found");
    }

    public final void e(alm alm0) {
        this.g(alm0);
        this.a.b(Boolean.valueOf(false));
        this.b.c(alm0);
    }

    public final void f() {
        this.a.b(Boolean.valueOf(true));
        fm fm0 = this.b.a;
        if(fm0 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        amf amf0 = alo.a(fm0);
        if(amf0 == null) {
            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
            return;
        }
        amf0.y(3);
    }

    public final void g(alm alm0) {
        boolean z = (alm0.j & 0x10000) != 0;
        this.a.a = z;
        if(z) {
            int v = bbmq.c(this.c, "com.google.android.gms");
            if(cjmf.c(this.c, "android.permission.LOCK_DEVICE", -1, v, "com.google.android.gms", null) != 0) {
                throw new IllegalStateException("If identity check is enabled, LOCK_DEVICE permission has to be granted");
            }
        }
    }

    public static boolean h(Context context0) {
        if(alh.c(context0).b(0x10000) != 20) {
            return bbqa.a() ? (Build.VERSION.SDK_INT >= 36 ? Build.VERSION.SDK_INT_FULL : Build.VERSION.SDK_INT * 100000) <= 3600000 : true;
        }
        return false;
    }
}

