import android.net.nsd.NsdManager.ResolveListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build.VERSION;
import com.google.android.gms.home.stub.HubInfo;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class bwiq implements NsdManager.ResolveListener {
    final ichm a;

    public bwiq(ichm ichm0) {
        this.a = ichm0;
        super();
    }

    @Override  // android.net.nsd.NsdManager$ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo0, int v) {
        ibuq.f(nsdServiceInfo0, "serviceInfo");
        ((ggtj)bwiu.a.j()).z("GHP Hub resolve failed: %d", v);
        ichp.a(this.a);
    }

    @Override  // android.net.nsd.NsdManager$ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo0) {
        List list1;
        bwhm bwhm0;
        ibuq.f(nsdServiceInfo0, "serviceInfo");
        bboh bboh0 = bwiu.a;
        ((ggtj)bboh0.h()).B("GHP Hub found: %s", nsdServiceInfo0.getServiceName());
        Map map0 = nsdServiceInfo0.getAttributes();
        ibuq.e(map0, "getAttributes(...)");
        byte[] arr_b = (byte[])map0.get("rs");
        if(arr_b == null) {
            bwhm0 = bwhm.a;
        }
        else {
            bwhm0 = bwio.b(Integer.parseInt(ibzk.h(arr_b)));
            if(bwhm0 == null) {
                bwhm0 = bwhm.a;
            }
        }
        byte[] arr_b1 = (byte[])map0.get("p");
        String s = "UNKNOWN";
        String s1 = arr_b1 == null ? "UNKNOWN" : ibzk.h(arr_b1);
        byte[] arr_b2 = (byte[])map0.get("fn");
        if(arr_b2 != null) {
            s = ibzk.h(arr_b2);
        }
        byte[] arr_b3 = (byte[])map0.get("id");
        String s2 = null;
        String s3 = arr_b3 == null ? null : ibzk.h(arr_b3);
        byte[] arr_b4 = (byte[])map0.get("pid");
        String s4 = arr_b4 == null ? null : ibzk.h(arr_b4);
        if(Build.VERSION.SDK_INT >= 34) {
            List list0 = nsdServiceInfo0.getHostAddresses();
            ibuq.e(list0, "getHostAddresses(...)");
            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(((InetAddress)object0).getHostAddress());
            }
            list1 = ibpo.ag(arrayList0);
        }
        else {
            list1 = ibpo.ag(ibpo.b(nsdServiceInfo0.getHost().getHostAddress()));
        }
        byte[] arr_b5 = (byte[])map0.get("d");
        if(arr_b5 != null) {
            s2 = ibzk.h(arr_b5);
        }
        int v = nsdServiceInfo0.getPort();
        String s5 = nsdServiceInfo0.getServiceName();
        ibuq.e(s5, "getServiceName(...)");
        String s6 = nsdServiceInfo0.getServiceType();
        ibuq.e(s6, "getServiceType(...)");
        HubInfo hubInfo0 = new HubInfo(s3, s4, bwhm0, s1, s, list1, v, s5, s6, s2);
        Object object1 = this.a.b(hubInfo0);
        if(!icha.c(object1)) {
            a.e(bboh0.j(), "Failed to emit Hub info %s", hubInfo0, icha.b(object1));
        }
    }
}

