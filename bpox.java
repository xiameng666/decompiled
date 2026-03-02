import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.sync.DeviceSyncService;

public final class bpox implements glzn {
    public final DeviceSyncService a;
    public final Account b;
    public final booz c;

    public bpox(DeviceSyncService deviceSyncService0, booz booz0, Account account0) {
        this.a = deviceSyncService0;
        this.c = booz0;
        this.b = account0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        DeviceSyncService deviceSyncService0 = this.a;
        booz booz0 = this.c;
        if(((gged_interceptors)object0).isEmpty()) {
            return gdta.g(deviceSyncService0.e(booz0)).h(new bppb(), gmap.a);
        }
        gged_interceptors gged0 = ggch.j(((gged_interceptors)object0)).i(new bpon()).l(new bpoo()).n();
        gdta gdta0 = gdta.g(deviceSyncService0.c.r(this.b, gged0)).i(new bpop(deviceSyncService0, ((gged_interceptors)object0)), booz0.e()).i(new bpoq(deviceSyncService0, booz0), booz0.e()).i(new bpor(deviceSyncService0, this.b, ((gged_interceptors)object0), gged0, booz0), booz0.e()).h(new bpos(deviceSyncService0), gmap.a);
        bpot bpot0 = new bpot();
        return gdta0.e(Throwable.class, bpot0, gmap.a);
    }
}

