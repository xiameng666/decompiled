import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;

public final class cqmq implements evqf {
    public final cqne a;
    public final int b;

    public cqmq(cqne cqne0, int v) {
        this.a = cqne0;
        this.b = v;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        FindMyDeviceNetworkSettings findMyDeviceNetworkSettings0 = ((GetFindMyDeviceSettingsResponse)object0).c;
        int v = this.b;
        if(v != -1 && (findMyDeviceNetworkSettings0 == null || findMyDeviceNetworkSettings0.a != v)) {
            cqqt.a("Failed updating the FMDN state to %d", new Object[]{v});
            cqpp.a(this.a);
        }
    }
}

