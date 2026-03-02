import android.content.Context;
import android.net.wifi.WifiScanner.ScanSettings;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

public class fwwl extends fwwg {
    @Override  // fwwa
    protected final WifiScanner.ScanSettings a(boolean z, Context context0) {
        WifiScanner.ScanSettings wifiScanner$ScanSettings0 = super.a(z, context0);
        wifiScanner$ScanSettings0.ignoreLocationSettings = z;
        return wifiScanner$ScanSettings0;
    }

    @Override  // fwwg
    public final void e(Context context0, fwvz fwvz0, boolean z, fwyc fwyc0, fvwz fvwz0, Executor executor0) {
        super.e(context0, fwvz0, z, fwyc0, fvwz0, executor0);
    }

    @Override  // fwwn
    protected final fvtm f(List list0, long v, Collection collection0) {
        fvtm fvtm0 = super.f(list0, v, collection0);
        if(list0 == null) {
            return null;
        }
        ggdy ggdy0 = new ggdy();
        boolean z = false;
        CellInfoNr cellInfoNr0 = null;
        for(Object object0: list0) {
            CellInfo cellInfo0 = (CellInfo)object0;
            if(!(cellInfo0 instanceof CellInfoNr)) {
            }
            else if(((CellInfoNr)cellInfo0).isRegistered()) {
                cellInfoNr0 = (CellInfoNr)cellInfo0;
            }
            else {
                fvue fvue0 = fwtw.c(v, ((CellInfoNr)cellInfo0), fvtm.b);
                if(fvue0 == null) {
                    continue;
                }
                ggdy0.i(fvue0);
                z = true;
            }
        }
        if(cellInfoNr0 == null) {
            if(fvtm0 != null) {
                return z ? super.f(list0, v, ggdy0.h()) : fvtm0;
            }
            return null;
        }
        if(fvtm0 != null) {
            ggdy0.k(fvtm0.g);
            ggdy0.i(fvtm0);
        }
        return fwtw.c(v, cellInfoNr0, ggdy0.h());
    }
}

