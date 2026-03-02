import com.google.android.gms.smartdevice.d2d.AdvertisementOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import java.util.List;

public final class epxk {
    public static final BootstrapOptions a(int v, List list0, byte b, String s, boolean z, long v1, boolean z1, boolean z2, epzc epzc0, PostTransferAction postTransferAction0, AdvertisementOptions advertisementOptions0, List list1) {
        long v3;
        long v2;
        if(epzc0 == null) {
            v2 = 0L;
            v3 = 0L;
        }
        else {
            v3 = epzc0.b;
            v2 = epzc0.a;
        }
        BootstrapOptions bootstrapOptions0 = new BootstrapOptions();
        bootstrapOptions0.ak(1);
        bootstrapOptions0.c = v;
        bootstrapOptions0.a.add(Integer.valueOf(3));
        bootstrapOptions0.d = false;
        bootstrapOptions0.a.add(Integer.valueOf(4));
        bootstrapOptions0.e = list0;
        bootstrapOptions0.a.add(Integer.valueOf(5));
        bootstrapOptions0.t(b);
        bootstrapOptions0.s(s);
        bootstrapOptions0.h = null;
        bootstrapOptions0.a.add(Integer.valueOf(8));
        bootstrapOptions0.i = z;
        bootstrapOptions0.a.add(Integer.valueOf(9));
        bootstrapOptions0.u(-1);
        bootstrapOptions0.k = 1;
        bootstrapOptions0.a.add(Integer.valueOf(11));
        bootstrapOptions0.al(v1);
        bootstrapOptions0.an(z1);
        bootstrapOptions0.r(z2);
        bootstrapOptions0.w(0);
        bootstrapOptions0.ai(v2);
        bootstrapOptions0.y(v3);
        bootstrapOptions0.aj(postTransferAction0);
        bootstrapOptions0.am(null);
        bootstrapOptions0.au();
        bootstrapOptions0.x = advertisementOptions0;
        bootstrapOptions0.a.add(Integer.valueOf(24));
        bootstrapOptions0.x(0);
        bootstrapOptions0.A = null;
        bootstrapOptions0.a.add(Integer.valueOf(27));
        bootstrapOptions0.v(azpm.b);
        bootstrapOptions0.z = false;
        bootstrapOptions0.a.add(Integer.valueOf(26));
        bootstrapOptions0.q(list1);
        bootstrapOptions0.ap(null);
        return bootstrapOptions0;
    }
}

