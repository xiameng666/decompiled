import android.net.wifi.ScanResult;
import java.util.List;
import java.util.function.Consumer;

public final class fwva {
    public int a;
    public int b;
    public int c;
    public gged_interceptors d;
    public int e;
    public Consumer f;
    public final fwzp g;

    public fwva(fwzp fwzp0) {
        this.g = fwzp0;
        this.d = ggna.a;
    }

    public final fvvj a(List list0, long v, long v1) {
        long v2 = 0x7FFFFFFFFFFFFFFFL;
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            long v3 = ((ScanResult)object0).timestamp / 1000L;
            if(v3 >= v1 && v3 < v2) {
                v2 = Math.min(v2, v3);
            }
        }
        if(Long.compare(v2, 0x7FFFFFFFFFFFFFFFL) == 0) {
            return new fvvb(v, 0).a(null);
        }
        gwql gwql0 = gwql.b(((ggna)list0).c).a();
        ggqk ggqk1 = ((gged_interceptors)list0).E();
        while(true) {
            long v4 = 0L;
            if(!ggqk1.hasNext()) {
                break;
            }
            Object object1 = ggqk1.next();
            ScanResult scanResult0 = (ScanResult)object1;
            if(scanResult0.BSSID != null) {
                v4 = gxtu.d(scanResult0.BSSID);
            }
            if(scanResult0.timestamp / 1000L >= v1) {
                gwql0.j(v4, scanResult0);
            }
        }
        gwqi gwqi0 = gwql0.f();
        fvvb fvvb0 = new fvvb(v2, gwqi0.size());
        fvvb0.c(this.e);
        gwqj gwqj0 = gwqi0.a();
        while(gwqj0.hasNext()) {
            Object object2 = gwqj0.next();
            ScanResult scanResult1 = (ScanResult)object2;
            fvvb0.b((scanResult1.BSSID == null ? 0L : gxtu.d(scanResult1.BSSID)), scanResult1.level, ((byte)(scanResult1.level + fvve.e)), scanResult1.frequency, scanResult1.timestamp / 1000L, 0, -1, -1, 0, 0, (scanResult1.SSID == null ? -1 : fvvf.a(scanResult1.SSID)), new byte[0]);
        }
        fvvj fvvj0 = fvvb0.a(null);
        if(((fvvc)fvvj0).d() > 0) {
            ++this.c;
        }
        return fvvj0;
    }
}

