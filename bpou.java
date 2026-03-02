import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.sync.DeviceSyncService;

public final class bpou implements glzn {
    public final DeviceSyncService a;
    public final gfsx b;
    public final booz c;

    public bpou(DeviceSyncService deviceSyncService0, gfsx gfsx0, booz booz0) {
        this.a = deviceSyncService0;
        this.b = gfsx0;
        this.c = booz0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            Object object1 = this.b.d();
            bpqt bpqt0 = (bpqt)this.c.d();
            return gdta.g(gdta.g(bpqt0.c.a()).i(new bppw(bpqt0), bpqt0.b).i(new bppx(bpqt0), bpqt0.b).i(new bppy(bpqt0), bpqt0.b).i(new bppz(bpqt0), bpqt0.b)).i(new bpox(this.a, this.c, ((Account)object1)), this.c.e());
        }
        return gmbu.i(Integer.valueOf(0));
    }
}

