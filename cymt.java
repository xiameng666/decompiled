import android.content.Intent;
import com.google.android.gms.nearby.fastpair.sass.device.SassDevice.1;

public final class cymt implements Runnable {
    public final SassDevice.1 a;
    public final Intent b;

    public cymt(SassDevice.1 sassDevice$10, Intent intent0) {
        this.a = sassDevice$10;
        this.b = intent0;
    }

    @Override
    public final void run() {
        gmcd gmcd0;
        cyjp cyjp0 = this.b.getBooleanExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ENABLE_MULTIPOINT", false) ? cyjp.e : cyjp.f;
        cyna cyna0 = this.a.b;
        cyjp cyjp1 = cyjp.b(cyna0.d().e);
        if(cyjp1 == null) {
            cyjp1 = cyjp.b;
        }
        if(cyjp1 == cyjp0) {
            ((ggtj)cyna0.o.d().ar(7870)).B("SassDevice: receiving ACTION_MULTI_POINT_CONFIG_CHANGE_BY_USER to %s, but it\'s the same as current, ignore", cyjp0.name());
            return;
        }
        ((ggtj)cyna0.o.d().ar(7869)).B("SassDevice: receiving ACTION_MULTI_POINT_CONFIG_CHANGE_BY_USER to %s", cyjp0.name());
        switch(cyjp0.ordinal()) {
            case 4: {
                ((ggtj)cyna0.o.d().ar(7915)).x("SassDevice: Update multipoint state to enabled");
                gmcd0 = cyna0.q.a(fgmh.d, fgtj.e);
                break;
            }
            case 5: {
                ((ggtj)cyna0.o.d().ar(7914)).x("SassDevice: Update multipoint state to disabled");
                gmcd0 = cyna0.q.a(fgmh.d, fgtj.f);
                break;
            }
            default: {
                ggtj ggtj0 = (ggtj)cyna0.o.g().ar(7913);
                cyjq cyjq0 = cyna0.k;
                gfuy.e(cyjq0);
                ggtj0.R("SassDevice: device type updated from %s to %s!", (cyjp.b(cyjq0.e) == null ? cyjp.b : cyjp.b(cyjq0.e)).name(), cyjp0.name());
                return;
            }
        }
        cyqk.a(gmcd0, new cylz(cyna0, cyjp0), cyna0.e);
    }
}

