import android.net.MacAddress;
import android.net.wifi.rtt.RangingResult;
import android.net.wifi.rtt.RangingResultCallback;
import android.os.SystemClock;
import java.util.List;

final class fwwe extends RangingResultCallback {
    private final fwvz a;
    private final int b;
    private final List c;
    private final fvwz d;
    private final int e;
    private final int f;
    private final int g;
    private final long h;

    public fwwe(fwvz fwvz0, int v, List list0, fvwz fvwz0, int v1, int v2, int v3) {
        this.a = fwvz0;
        this.b = v;
        this.c = list0;
        this.d = fvwz0;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = SystemClock.elapsedRealtime();
    }

    @Override  // android.net.wifi.rtt.RangingResultCallback
    public final void onRangingFailure(int v) {
        this.a.a(this.b, this.c, new fvvg[0], this.f, 0, -1, this.g);
    }

    @Override  // android.net.wifi.rtt.RangingResultCallback
    public final void onRangingResults(List list0) {
        int v = 0;
        if(list0 != null) {
            for(Object object0: list0) {
                RangingResult rangingResult0 = (RangingResult)object0;
                if(rangingResult0 != null && rangingResult0.getStatus() == 0) {
                    ++v;
                }
            }
        }
        fvvg[] arr_fvvg = new fvvg[v];
        if(list0 != null) {
            for(Object object1: list0) {
                RangingResult rangingResult1 = (RangingResult)object1;
                if(rangingResult1 != null && rangingResult1.getStatus() == 0) {
                    MacAddress macAddress0 = rangingResult1.getMacAddress();
                    if(macAddress0 != null) {
                        long v1 = gxtu.c(macAddress0.toByteArray());
                        int v2 = rangingResult1.getDistanceMm() / 10;
                        int v3 = rangingResult1.getDistanceStdDevMm() / 10;
                        int v4 = rangingResult1.getNumAttemptedMeasurements();
                        int v5 = rangingResult1.getNumSuccessfulMeasurements();
                        int v6 = rangingResult1.getRssi();
                        fvvg fvvg0 = new fvvg(v1, v6, v2, v3, v4, v5, 0);
                        fwso.j(this.d, v1, v6, v2, v3, v5);
                        fvvg0.b = rangingResult1.getRangingTimestampMillis() * 1000L;
                        --v;
                        arr_fvvg[v] = fvvg0;
                    }
                }
            }
        }
        long v7 = SystemClock.elapsedRealtime() - this.h;
        this.a.a(this.b, this.c, arr_fvvg, this.f, this.e, ((int)v7), this.g);
    }
}

