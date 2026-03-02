import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

public class cjky {
    public final Context a;
    public final ggsf b;

    public cjky(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
        this.b = ggsf.b("cjky");
    }

    public final evql a() {
        Boolean boolean0 = Boolean.valueOf(false);
        if(!this.b("com.google.android.apps.walletnfcrel") && !this.b("com.google.commerce.tapandpay.dev")) {
            ((ggsc)this.b.h().ar(6124)).x("No Wallet app installed, notification is not delegated.");
            return evrg.d(boolean0);
        }
        avzd avzd0 = new avzd();
        avzd0.a(dlde.a.a);
        Context context0 = this.a;
        if(avze.a(context0, avzd0) == 0) {
            return new etgl(context0).j().e(new cjkw(this)).e(new cjkx());
        }
        ((ggsc)this.b.h().ar(6123)).x("Pay module is not installed, notification is not delegated.");
        return evrg.d(boolean0);
    }

    private final boolean b(String s) {
        PackageManager packageManager0 = this.a.getPackageManager();
        try {
            packageManager0.getPackageInfo(s, 0x80);
            return true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            ((ggsc)this.b.h().ar(6122)).B("App %s is not installed", s);
            return false;
        }
    }
}

