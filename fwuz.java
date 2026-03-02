import android.net.wifi.ScanResult;
import android.net.wifi.WifiScanner.ScanData;
import android.net.wifi.WifiScanner.ScanListener;
import j..util.Objects;
import java.util.function.Consumer;

public final class fwuz implements WifiScanner.ScanListener {
    final fwva a;

    public fwuz(fwva fwva0) {
        Objects.requireNonNull(fwva0);
        this.a = fwva0;
        super();
    }

    public final void onFailure(int v, String s) {
    }

    public final void onFullResult(ScanResult scanResult0) {
    }

    public final void onPeriodChanged(int v) {
    }

    public final void onResults(WifiScanner.ScanData[] arr_wifiScanner$ScanData) {
        int v4;
        if(arr_wifiScanner$ScanData.length > 0) {
            WifiScanner.ScanData wifiScanner$ScanData0 = arr_wifiScanner$ScanData[arr_wifiScanner$ScanData.length - 1];
            fwva fwva0 = this.a;
            fwva0.e = wifiScanner$ScanData0.getScannedBands();
            ++fwva0.b;
            ggdy ggdy0 = new ggdy();
            ScanResult[] arr_scanResult = wifiScanner$ScanData0.getResults();
            int v = arr_scanResult.length;
            int v1 = 0;
            long v2 = -1L;
            while(v1 < v) {
                ScanResult scanResult0 = arr_scanResult[v1];
                if(scanResult0 == null) {
                    v4 = v;
                }
                else {
                    long v3 = scanResult0.BSSID == null ? -1L : gxtu.d(scanResult0.BSSID);
                    if(v3 != -1L && v3 != 0xFFFFFFFFFFFFL && (scanResult0.capabilities == null || !scanResult0.capabilities.contains("[IBSS]")) && fpwe.c(v3)) {
                        v4 = v;
                        long v5 = scanResult0.timestamp / 1000L;
                        if(scanResult0.SSID == null || !fpwe.a(v3, scanResult0.SSID)) {
                            if(v5 > v2) {
                                v2 = v5;
                            }
                            ggdy0.i(scanResult0);
                        }
                    }
                    else {
                        v4 = v;
                    }
                }
                ++v1;
                v = v4;
            }
            fwva0.d = ggdy0.h();
            Consumer consumer0 = fwva0.f;
            if(v2 != -1L && consumer0 != null) {
                fwva0.g.i(fwzf.v, 60000L, null);
                consumer0.accept(fwva0.a(fwva0.d, v2, 0x8000000000000000L));
                fwva0.g.j(fwzf.v);
            }
        }
    }

    public final void onSuccess() {
    }
}

