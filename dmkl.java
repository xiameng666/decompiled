import android.content.Context;
import android.os.SystemProperties;
import java.util.Locale;

public final class dmkl {
    public final Context a;
    fsis b;

    public dmkl(Context context0) {
        this.a = context0;
    }

    public final hjxa a() {
        fsis fsis0 = this.b;
        if(fsis0 == null) {
            domu.a(this.a);
            fsis0 = dolu.r();
            this.b = fsis0;
        }
        return fsis0.a(this.a);
    }

    public static String b() {
        return SystemProperties.get("ro.crypto.state", "");
    }

    public final String c() {
        return !hwjy.a.b().b() || hwjy.c().isEmpty() ? bapf.f(this.a, "device_country", "") : hwjy.c();
    }

    public final boolean d() {
        return this.a.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
    }

    public final boolean e() {
        return this.f("BR");
    }

    public final boolean f(String s) {
        return gfqz.e(this.c(), s);
    }

    public final boolean g() {
        return this.f("IN");
    }

    public final boolean h() {
        return this.f(Locale.JAPAN.getCountry());
    }

    public final boolean i() {
        return this.f("RU");
    }

    public final boolean j() {
        return !hwgk.a.l().ac() && this.d();
    }

    public final boolean k() {
        try {
            return this.a.getPackageManager().hasSystemFeature("android.hardware.nfc.ese");
        }
        catch(NoSuchMethodError unused_ex) {
            return false;
        }
    }

    public final boolean l() {
        try {
            return this.a.getPackageManager().hasSystemFeature("android.hardware.se.omapi.ese");
        }
        catch(NoSuchMethodError unused_ex) {
            return false;
        }
    }

    public final boolean m() {
        try {
            return bbmq.P() || this.a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
        }
        catch(NoSuchMethodError unused_ex) {
            return false;
        }
        return false;
    }
}

