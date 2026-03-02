import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import com.google.android.gms.trustagent.activeunlock.common.bluetooth.BluetoothReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class eyaz {
    public static final ibxd[] a;
    public final BluetoothReceiver b;
    public final exyg c;
    public final bboh d;
    public final icck e;
    public iced f;
    public boolean g;
    public final ibvv h;
    public final BluetoothAdapter i;
    public final eyau j;
    public final List k;
    private final Context l;
    private final ibvv m;

    static {
        eyaz.a = new ibxd[]{new ibut(eyaz.class, "atLeastOneDeviceProximate", "getAtLeastOneDeviceProximate()Z", 0), new ibut(eyaz.class, "areDevicesProximate", "getAreDevicesProximate()Ljava/util/Map;", 0)};
    }

    public eyaz(BluetoothReceiver bluetoothReceiver0, exyg exyg0, bboh bboh0, icck icck0) {
        ibuq.f(bluetoothReceiver0, "bluetoothReceiver");
        super();
        this.b = bluetoothReceiver0;
        this.c = exyg0;
        this.d = bboh0;
        this.e = icck0;
        this.h = new eyax(Boolean.valueOf(false), this);
        Context context0 = AppContextProvider.a();
        this.l = context0;
        Object object0 = context0.getSystemService("bluetooth");
        ibuq.d(object0, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        this.i = ((BluetoothManager)object0).getAdapter();
        this.j = new eyau(this);
        this.m = new eyay(ibpt.a, this);
        this.k = new ArrayList();
    }

    public final Map a() {
        return (Map)this.m.a(this, eyaz.a[1]);
    }

    public final void b(Map map0) {
        this.m.c(eyaz.a[1], map0);
    }

    public final void c(boolean z) {
        this.h.c(eyaz.a[0], Boolean.valueOf(z));
    }
}

