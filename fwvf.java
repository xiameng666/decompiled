import android.os.SystemClock;
import android.telephony.TelephonyManager;

public final class fwvf implements fwxw {
    public final fvwz a;
    public final fwtu b;
    public final boolean c;
    public final fwyj d;
    public final fwyb e;

    public fwvf(boolean z, fwtu fwtu0, fvwz fvwz0, fwyb fwyb0, fwyj fwyj0) {
        this.c = z;
        this.b = fwtu0;
        this.a = fvwz0;
        this.e = fwyb0;
        this.d = fwyj0;
    }

    @Override  // fwxw
    public final gmcd a(fwyc fwyc0) {
        TelephonyManager telephonyManager0 = (TelephonyManager)this.b.c.getSystemService("phone");
        if(telephonyManager0 == null) {
            return gmbu.i(new hecl(fvtm.h(SystemClock.elapsedRealtime())));
        }
        fwvd fwvd0 = new fwvd(this, SystemClock.elapsedRealtime(), telephonyManager0, fwyc0);
        return this.d.c.e(fwvd0);
    }

    @Override  // fwxw
    public final boolean b() {
        return this.c && !fwtu.o(this.b.c);
    }

    @Override  // fwxw
    public final boolean c() {
        return this.c;
    }
}

