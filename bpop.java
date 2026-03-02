import com.google.android.gms.findmydevice.spot.sync.DeviceSyncService;
import j..util.Collection.-EL;

public final class bpop implements glzn {
    public final DeviceSyncService a;
    public final gged_interceptors b;

    public bpop(DeviceSyncService deviceSyncService0, gged_interceptors gged0) {
        this.a = deviceSyncService0;
        this.b = gged0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        return gdtd.a(((Iterable)Collection.-EL.stream(this.b).filter(new bppc()).map(new bpol()).map(new bpom(this.a)).collect(ggaf.a)));
    }
}

