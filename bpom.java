import com.google.android.gms.findmydevice.spot.sync.DeviceSyncService;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class bpom implements Function {
    public final DeviceSyncService a;

    public bpom(DeviceSyncService deviceSyncService0) {
        this.a = deviceSyncService0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        bppd bppd0 = (bppd)object0;
        return this.a.c.o(bppd0.a, bppd0.b);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

