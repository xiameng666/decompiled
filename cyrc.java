import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import java.util.concurrent.CountDownLatch;

public final class cyrc implements AutoCloseable {
    public final ContentResolver a;
    public ContentObserver b;
    public final String c;
    public final Runnable d;
    public cyjq e;
    public CountDownLatch f;
    public boolean g;
    private final cyrp h;

    public cyrc(Context context0, String s, cyrp cyrp0, Runnable runnable0) {
        this.a = context0.getContentResolver();
        this.c = s;
        this.h = cyrp0;
        this.d = runnable0;
    }

    public final gmcd a(cyjq cyjq0) {
        cyjq cyjq1;
        if(!gfqz.e(cyjq0.c, this.c)) {
            throw new IllegalArgumentException("Update a sassDeviceSetting with different address!");
        }
        synchronized(this) {
            cyjq1 = this.e;
            if(hvpg.bJ()) {
                cyjh.a.d().X("LiveSassDeviceSetting: updateSettingsToStorage for %s from %s to %s", fgjo.c(cyjq0.c), cyrc.b(cyjq1), cyrc.b(cyjq0));
            }
            __monitor_enter(this);
            this.g = true;
            this.e = cyjq0;
        }
        cyrl cyrl0 = new cyrl(this.h, cyjq0);
        gmcd gmcd0 = this.h.c.b(cyrl0, this.h.b);
        gmcd0.hB(new cyrm(this.h, cyjq0), this.h.b);
        gmbu.t(gmcd0, new cyrb(this, cyjq1), gmap.a);
        return gmcd0;
    }

    public static String b(cyjq cyjq0) {
        if(cyjq0 == null) {
            return "sassDeviceSetting is empty";
        }
        gfuy.e(cyjq0);
        boolean z = cyjq0.d;
        gfuy.e(cyjq0);
        cyjp cyjp0 = cyjp.b(cyjq0.e) == null ? cyjp.b : cyjp.b(cyjq0.e);
        gfuy.e(cyjq0);
        int v = cyjq0.f;
        gfuy.e(cyjq0);
        boolean z1 = cyjq0.i;
        gfuy.e(cyjq0);
        return "Enabled:" + z + ", Device type:" + cyjp0.name() + ", Version code:" + v + ", Support OHD:" + z1 + ", OHD enabled:" + cyjq0.j;
    }

    public final void c(boolean z) {
        if(this.f != null) {
            cyjh.a.d().B("LiveSassDeviceSetting: Ignore updateSassDeviceSetting called for %s because is updating", fgjo.c(this.c));
            return;
        }
        synchronized(this) {
            if(this.g) {
                cyjh.a.d().B("LiveSassDeviceSetting: Ignore updateSassDeviceSetting called for %s because DataStoring", fgjo.c(this.c));
                return;
            }
        }
        cyjh.a.d().B("LiveSassDeviceSetting: updateSassDeviceSetting called for %s", fgjo.c(this.c));
        this.f = new CountDownLatch(1);
        gmbu.t(this.h.f(this.c), new cyra(this, z), gmap.a);
    }

    @Override
    public final void close() {
        this.a.unregisterContentObserver(this.b);
    }

    static void d(cyrc cyrc0) {
        cyrc0.g = false;
    }

    static void e(cyrc cyrc0) {
        cyrc0.f = null;
    }

    @Override
    public final String toString() {
        synchronized(this) {
        }
        return cyrc.b(this.e);
    }
}

