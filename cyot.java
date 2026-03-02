import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanSettings.Builder;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.nearby.fastpair.sass.device.connection.ble.SeekerToSeekerBleScanner.1;

public final class cyot {
    public final kba a;
    public final byte b;
    public kar c;
    private final Context d;
    private final esaa e;
    private final Handler f;
    private ScanCallback g;

    public cyot(Context context0, kba kba0, byte b) {
        this.f = new clht(Looper.getMainLooper());
        this.d = context0;
        this.a = kba0;
        this.b = b;
        this.e = new esaa(context0, 1, "SeekerToSeekerBleScanner::WakeLock", null, "com.google.android.gms");
    }

    public final void a(kar kar0) {
        if(this.g == null) {
            cupv cupv0 = cupv.a(this.d, "SeekerToSeekerBleScanner");
            if(cupv0 == null) {
                cyjh.a.g().x("SeekerToSeekerBleScanner: Error while initializing ble scanner.");
                return;
            }
            this.c = kar0;
            ScanSettings.Builder scanSettings$Builder0 = new ScanSettings.Builder().setReportDelay(0L);
            hvpg hvpg0 = hvpg.a;
            ScanSettings scanSettings0 = scanSettings$Builder0.setScanMode(((int)hvpg0.aY().dj())).setCallbackType(1).build();
            this.g = new SeekerToSeekerBleScanner.1(this);
            cust cust0 = cyjh.a;
            cust0.d().x("SeekerToSeekerBleScanner: Start ble scanning.");
            gged_interceptors gged0 = gged_interceptors.l(new ScanFilter.Builder().setServiceData(cyon.a, new byte[]{0}, new byte[]{0}).build());
            ScanCallback scanCallback0 = this.g;
            gfuy.e(scanCallback0);
            if(cupv0.b(gged0, scanSettings0, scanCallback0)) {
                cyos cyos0 = () -> {
                    if(this.g == null) {
                        cyjh.a.d().x("SeekerToSeekerBleScanner: ScanCallback is null.");
                        return;
                    }
                    cupv cupv0 = cupv.a(this.d, "SeekerToSeekerBleScanner");
                    if(cupv0 == null) {
                        cyjh.a.g().x("SeekerToSeekerBleScanner: Error while initializing ble scanner.");
                        return;
                    }
                    cyjh.a.d().x("SeekerToSeekerBleScanner: Stop ble scanning");
                    ScanCallback scanCallback0 = this.g;
                    gfuy.e(scanCallback0);
                    cupv0.d(scanCallback0);
                    this.c = null;
                    this.g = null;
                    this.e.g();
                };
                long v = hvpg.aj();
                this.f.postDelayed(cyos0, v);
                long v1 = hvpg.aj() + hvpg0.aY().cA();
                this.e.c(v1);
                return;
            }
            cust0.g().x("SeekerToSeekerBleScanner: Error while starting ble scanning.");
            return;
        }
        cyjh.a.d().x("SeekerToSeekerBleScanner: Another scanning is on progress. Skip this scan request");
    }

    // Detected as a lambda impl.
    public final void b() {
        if(this.g == null) {
            cyjh.a.d().x("SeekerToSeekerBleScanner: ScanCallback is null.");
            return;
        }
        cupv cupv0 = cupv.a(this.d, "SeekerToSeekerBleScanner");
        if(cupv0 == null) {
            cyjh.a.g().x("SeekerToSeekerBleScanner: Error while initializing ble scanner.");
            return;
        }
        cyjh.a.d().x("SeekerToSeekerBleScanner: Stop ble scanning");
        ScanCallback scanCallback0 = this.g;
        gfuy.e(scanCallback0);
        cupv0.d(scanCallback0);
        this.c = null;
        this.g = null;
        this.e.g();
    }
}

