import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import com.google.android.gms.chimera.modules.trustlet.onbody.AppContextProvider;
import java.lang.ref.WeakReference;

public final class ezki implements ezay {
    public static final bboh a;
    public final Object b;
    public boolean c;
    public SharedPreferences d;
    private static WeakReference e;
    private final Context f;
    private boolean g;
    private SharedPreferences.OnSharedPreferenceChangeListener h;
    private KeyguardManager i;

    static {
        ezki.a = bboh.b("Trustlet_Onbody", bbcu.eL);
        ezki.e = new WeakReference(null);
    }

    public ezki() {
        this.b = new Object();
        this.f = AppContextProvider.a();
    }

    @Override  // ezay
    public final gmcd a() {
        boolean z;
        synchronized(this.b) {
            ezcn.a().b();
            ((ggtj)ezki.a.h()).B("onbodyAlreadySet: %s", Boolean.valueOf(this.c));
            ((ggtj)ezki.a.h()).B("isOnbodySuggestionEnabledByPhenotype: %s", Boolean.valueOf(this.g()));
            ((ggtj)ezki.a.h()).B("isTrustAgentEnabled: %s", ezlj.a(this.f));
            ((ggtj)ezki.a.h()).B("isSupported: %s", Boolean.valueOf(ezlj.e(this.f)));
            ((ggtj)ezki.a.h()).B("isChromeOsDevice: %s", Boolean.valueOf(bbnp.e(this.f)));
            z = !this.c && this.g() && ezlj.e(this.f) && !bbnp.e(this.f);
        }
        return glzd.f(ezlj.a(this.f), new ezkf(z), gmap.a);
    }

    @Override  // ezay
    public final String b() {
        return "com.google.android.gms.trustlet.onbody.discovery.OnbodyPromotionActivity";
    }

    @Override  // ezay
    public final boolean c() {
        return !this.i.isDeviceSecure();
    }

    public static ezki d() {
        ezki ezki1;
        synchronized(ezki.class) {
            if(ezki.e.get() == null) {
                ezki ezki0 = new ezki();
                ezki0.d = ezcl.a(ezki0.f);
                ezki0.h = new ezkh(ezki0);
                ezki0.g = hzcj.c();
                ezki0.i = (KeyguardManager)ezki0.f.getSystemService("keyguard");
                synchronized(ezki0.b) {
                    ezki0.c = ezlj.b(ezki0.d);
                    ezki0.i.isDeviceSecure();
                }
                ezki0.d.registerOnSharedPreferenceChangeListener(ezki0.h);
                ezki0.e();
                ezki.e = new WeakReference(ezki0);
            }
            ezki1 = (ezki)ezki.e.get();
        }
        return ezki1;
    }

    public final void e() {
        boolean z = true;
        synchronized(this.b) {
            if(bbmq.a(this.f, "com.google.android.gms.trustlet.onbody.discovery.OnbodyPromotionActivity") != 1) {
                z = false;
            }
            gmbu.t(this.a(), new ezkg(this, z), gmap.a);
        }
    }

    final void f(boolean z) {
        bbmq.G(this.f, "com.google.android.gms.trustlet.onbody.discovery.OnbodyPromotionActivity", z);
    }

    private final boolean g() {
        boolean z = false;
        this.g = hzcj.c();
        synchronized(this.b) {
            if(!this.i.isDeviceSecure() && this.g) {
                z = true;
            }
        }
        return z;
    }
}

