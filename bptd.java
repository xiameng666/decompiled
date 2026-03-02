import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.UnprovisionWearableDeviceRequest;

public final class bptd implements bpnj {
    private final bpvx a;

    public bptd(bpvx bpvx0) {
        this.a = bpvx0;
    }

    @Override  // bpnj
    public final gmcd a(Object object0) {
        if(!hsxd.d()) {
            return gmbu.h(new aztb(Status.g));
        }
        String s = ((UnprovisionWearableDeviceRequest)object0).a;
        ((ggtj)bpxd.a.h()).x("Unprovisioning wearable device.");
        return gdta.g(gdta.g(((bpxd)this.a).b(s)).i(new bpwu(((bpxd)this.a), s), ((bpxd)this.a).h)).h(new bptc(), gmap.a);
    }
}

