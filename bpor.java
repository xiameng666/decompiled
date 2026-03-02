import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.sync.DeviceSyncService;

public final class bpor implements glzn {
    public final DeviceSyncService a;
    public final Account b;
    public final gged_interceptors c;
    public final gged_interceptors d;
    public final booz e;

    public bpor(DeviceSyncService deviceSyncService0, Account account0, gged_interceptors gged0, gged_interceptors gged1, booz booz0) {
        this.a = deviceSyncService0;
        this.b = account0;
        this.c = gged0;
        this.d = gged1;
        this.e = booz0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        gged_interceptors gged0 = this.c;
        gged_interceptors gged1 = ggch.j(gged0).i(new bpoy()).l(new bpoz()).n();
        DeviceSyncService deviceSyncService0 = this.a;
        Account account0 = this.b;
        deviceSyncService0.b.e(account0, gged1);
        if(!this.d.isEmpty()) {
            bprs.o(cljp.a(deviceSyncService0.getBaseContext()), account0);
        }
        if(gggq.v(gged0, new bppa())) {
            deviceSyncService0.e.a();
        }
        bpqt bpqt0 = (bpqt)this.e.d();
        return gdta.g(bpqt0.i.i(account0)).h(new bpqh(), gmap.a).i(new bpqi(bpqt0), bpqt0.b);
    }
}

