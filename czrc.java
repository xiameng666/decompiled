import android.bluetooth.le.ScanSettings;

public final class czrc implements Runnable {
    public final czrf a;
    public final cupv b;
    public final gmcu c;

    public czrc(czrf czrf0, cupv cupv0, gmcu gmcu0) {
        this.a = czrf0;
        this.b = cupv0;
        this.c = gmcu0;
    }

    @Override
    public final void run() {
        gmcu gmcu0 = this.c;
        cupv cupv0 = this.b;
        czrf czrf0 = this.a;
        if(czrf0.e != null && cupv0.c(czrf0.b, czrf0.c, czrf0.e, czrf0.d)) {
            gmcu0.q(null);
            return;
        }
        ScanSettings scanSettings0 = czrf0.c;
        if(cupv0.b(czrf0.b, scanSettings0, czrf0.d)) {
            gmcu0.q(null);
            return;
        }
        gmcu0.r(new RuntimeException("Failed to start BLE scanning with settings: " + czrf.c(scanSettings0)));
    }
}

