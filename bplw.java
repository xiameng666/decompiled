import com.google.android.gms.findmydevice.spot.CachedSpotDevice;
import com.google.android.gms.findmydevice.spot.GetCachedDevicesResponse;

public final class bplw implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        CachedSpotDevice[] arr_cachedSpotDevice = (CachedSpotDevice[])ggch.j(((gged_interceptors)object0)).i(new bplu()).l(new bplv()).u(CachedSpotDevice.class);
        Object object1 = new GetCachedDevicesResponse();
        object1.a = arr_cachedSpotDevice;
        return object1;
    }
}

