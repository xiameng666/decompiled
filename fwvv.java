import android.net.MacAddress;
import android.net.wifi.rtt.RangingResult;
import android.net.wifi.rtt.RangingResultCallback;
import android.os.SystemClock;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class fwvv extends RangingResultCallback {
    final fwvx a;
    private final CountDownLatch b;
    private final AtomicReference c;
    private final fvtd d;
    private final long e;

    public fwvv(fwvx fwvx0, CountDownLatch countDownLatch0, AtomicReference atomicReference0, fvtd fvtd0) {
        Objects.requireNonNull(fwvx0);
        this.a = fwvx0;
        super();
        this.b = countDownLatch0;
        this.c = atomicReference0;
        this.d = fvtd0;
        this.e = SystemClock.elapsedRealtime();
    }

    // String Decryptor: 2 succeeded, 0 failed
    private static final byte[] a() {
        return new byte[0];
    }

    @Override  // android.net.wifi.rtt.RangingResultCallback
    public final void onRangingFailure(int v) {
        this.b.countDown();
    }

    @Override  // android.net.wifi.rtt.RangingResultCallback
    public final void onRangingResults(List list0) {
        gwql gwql1;
        gwql gwql0 = gwql.b(list0.size()).a();
        for(Object object0: list0) {
            RangingResult rangingResult0 = (RangingResult)object0;
            if(rangingResult0.getStatus() == 0) {
                MacAddress macAddress0 = rangingResult0.getMacAddress();
                if(macAddress0 != null) {
                    long v = gxtu.c(macAddress0.toByteArray());
                    int v1 = rangingResult0.getDistanceMm() / 10;
                    int v2 = rangingResult0.getDistanceStdDevMm() / 10;
                    int v3 = rangingResult0.getNumSuccessfulMeasurements();
                    int v4 = rangingResult0.getRssi();
                    fwso.j(this.a.b, v, v4, v1, v2, v3);
                    gwql0.j(v, rangingResult0);
                }
            }
        }
        long v5 = SystemClock.elapsedRealtime() - this.e;
        int v6 = 0;
        fwso.k(this.a.b, v5, 0, 0x40000000);
        AtomicReference atomicReference0 = this.c;
        fvtd fvtd0 = this.d;
        if(!gwql0.isEmpty()) {
            SystemClock.elapsedRealtime();
            gged_interceptors gged0 = ((fvuo)fvtd0).c();
            int v7 = gged0.size();
            fvuo fvuo0 = new fvuo(v7);
            for(int v8 = 0; v8 < v7 - 1; ++v8) {
                fvuo0.e(((fvta)gged0.get(v8)));
            }
            fvta fvta0 = (fvta)gggq.p(gged0);
            fvvj fvvj0 = fvta0.a();
            gftb.check(fvvj0);
            fvvb fvvb0 = new fvvb(fvvj0.m(), fvvj0.d());
            while(v6 < fvvj0.d()) {
                long v9 = fvvj0.l(v6);
                RangingResult rangingResult1 = (RangingResult)gwql0.g(v9);
                if(rangingResult1 != null && rangingResult1.getStatus() == 0) {
                    gwql1 = gwql0;
                    fvvb0 = fvvb0;
                    fvvb0.b(v9, fvvj0.j(v6), fvvj0.b(v6), fvvj0.g(v6), fvvj0.n(v6), 0, rangingResult1.getDistanceMm() / 10, ((short)(rangingResult1.getDistanceStdDevMm() / 10)), ((short)rangingResult1.getNumSuccessfulMeasurements()), ((short)rangingResult1.getNumAttemptedMeasurements()), fvvj0.k(v6), new byte[0]);
                }
                else {
                    gwql1 = gwql0;
                    fvvb0.b(v9, fvvj0.j(v6), fvvj0.b(v6), fvvj0.g(v6), fvvj0.n(v6), 0, fvvj0.e(v6), ((short)fvvj0.f(v6)), ((short)fvvj0.i(v6)), ((short)fvvj0.h(v6)), fvvj0.k(v6), new byte[0]);
                }
                ++v6;
                gwql0 = gwql1;
            }
            fvuo0.e(new fvta(fvvb0.a(null), fvta0.b));
            fvtd0 = fvuo0;
        }
        atomicReference0.set(fvtd0);
        this.b.countDown();
    }
}

