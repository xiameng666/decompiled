import com.google.android.gms.findmydevice.spot.GetCanonicDeviceIdFromAccountKeyResponse;

public final class boin implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((gfsx)object0).i()) {
            ((ggtj)boio.a.h()).x("Account key does not match any locally cached device");
            return boio.b;
        }
        Object object1 = new GetCanonicDeviceIdFromAccountKeyResponse();
        object1.a = ((fqun)((gfsx)object0).d()).f.name;
        object1.b = ((fqun)((gfsx)object0).d()).a.b;
        return object1;
    }
}

