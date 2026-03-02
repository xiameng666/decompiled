import android.app.Application;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageInstaller;
import android.util.Log;
import java.util.Locale;
import java.util.function.Consumer;

public final class akou extends lny {
    public final akot a;
    public final akop b;
    public final clht c;
    public final lqi d;
    public final gfug e;
    public final gfug f;
    public final gfug g;
    public final gfug h;
    public final gfug i;
    public final gfug j;
    public int k;
    private final bbic l;
    private final gmcg m;
    private boolean n;

    public akou(Application application0) {
        super(application0);
        this.a = new akot(this);
        this.b = new akop(this);
        this.c = new clht();
        this.m = new bblp(0x7FFFFFFF, 9);
        this.n = false;
        this.d = new lqi(Boolean.valueOf(false));
        this.e = new gfug(gfqs.a);
        this.f = new gfug(gfqs.a);
        this.g = new gfug(gfqs.a);
        this.h = new gfug(gfqs.a);
        this.i = new gfug(gfqs.a);
        this.j = new gfug(gfqs.a);
        this.k = 0;
        this.l = bbic.a();
    }

    public final void b(String s) {
        if(hpyb.d()) {
            akog akog0 = new akog(this, s);
            ryx.a(akig.d, ibom.a, akog0);
            return;
        }
        this.c(s, new akoh());
    }

    public final void c(String s, Consumer consumer0) {
        akop akop0 = this.b;
        if(akop0.c) {
            Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] package install was already requested. Ignore");
            consumer0.accept(akrp.c);
            return;
        }
        akop0.a = s;
        akop0.b = consumer0;
        PackageInstaller packageInstaller0 = this.a().getPackageManager().getPackageInstaller();
        bbic bbic0 = this.l;
        Application application0 = this.a();
        ServiceConnection serviceConnection0 = akop0.f;
        if(!bbic0.d(application0, aknv.a, serviceConnection0, 1)) {
            Log.e("Auth", String.format(Locale.US, "[AuthManaged, PhoneskyDpcInstallViewModel] Failed to bind installPackage service."));
            bbic0.b(this.a(), serviceConnection0);
            akou.f(akop0.e, Integer.valueOf(-3), consumer0);
            return;
        }
        packageInstaller0.registerSessionCallback(new akoj(this, packageInstaller0, s, consumer0));
        Application application1 = this.a();
        IntentFilter intentFilter0 = new IntentFilter("com.google.android.finsky.installapi.ACTION_INSTALL_STATUS");
        jwe.b(application1, akop0.g, intentFilter0, 2);
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] Registered receiver for packageInstallSession.");
        this.n = true;
    }

    public final void e(Consumer consumer0) {
        akot akot0 = this.a;
        if(akot0.a) {
            Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] Ignore config change phonesky install.");
            consumer0.accept(akrp.c);
            return;
        }
        akot0.e = consumer0;
        PackageInstaller packageInstaller0 = this.a().getPackageManager().getPackageInstaller();
        bbic bbic0 = this.l;
        Application application0 = this.a();
        ServiceConnection serviceConnection0 = akot0.f;
        if(!bbic0.d(application0, aknv.a, serviceConnection0, 1)) {
            Log.e("Auth", String.format(Locale.US, "[AuthManaged, PhoneskyDpcInstallViewModel] Failed to bind installPhonesky service."));
            bbic0.b(this.a(), serviceConnection0);
            akou.f(akot0.d, Integer.valueOf(-3), consumer0);
            return;
        }
        packageInstaller0.registerSessionCallback(new akoi(this, packageInstaller0, consumer0));
    }

    public static void f(akok akok0, Integer integer0, Consumer consumer0) {
        akok0.b(integer0);
        if(hpwf.a.b().C() && consumer0 != null) {
            switch(((int)integer0)) {
                case -7: {
                    consumer0.accept(akrp.e);
                    return;
                }
                case -3: {
                    consumer0.accept(akrp.g);
                    return;
                }
                case -2: {
                    consumer0.accept(akrp.f);
                    return;
                }
                case -1: {
                    consumer0.accept(akrp.d);
                }
            }
        }
    }

    public static boolean g(Integer integer0) {
        return integer0 == null ? false : ((int)integer0) == -7 || ((int)integer0) == -3 || ((int)integer0) == -2 || ((int)integer0) == -1;
    }

    public final gmcd h(String s, yxh yxh0, akok akok0, Consumer consumer0) {
        if(yxh0 == null) {
            Log.e("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] IPlayInstallService.Stub.asInterface returned null");
            akou.f(akok0, Integer.valueOf(-2), consumer0);
            return gmbu.i(null);
        }
        return gmbu.l(new akob(this, yxh0, s, akok0, consumer0), this.m);
    }

    @Override  // lsb
    protected final void km() {
        if(this.n) {
            this.a().unregisterReceiver(this.b.g);
            Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] unregistered receiver");
        }
    }
}

