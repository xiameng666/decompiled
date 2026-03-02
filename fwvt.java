import android.net.wifi.rtt.RangingRequest;
import android.net.wifi.rtt.WifiRttManager;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class fwvt implements Callable {
    public final fwvx a;
    public final WifiRttManager b;
    public final RangingRequest c;
    public final fvtd d;

    public fwvt(fwvx fwvx0, WifiRttManager wifiRttManager0, RangingRequest rangingRequest0, fvtd fvtd0) {
        this.a = fwvx0;
        this.b = wifiRttManager0;
        this.c = rangingRequest0;
        this.d = fvtd0;
    }

    @Override
    public final Object call() {
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        AtomicReference atomicReference0 = new AtomicReference(this.d);
        fwvv fwvv0 = new fwvv(this.a, countDownLatch0, atomicReference0, this.d);
        this.b.startRanging(this.c, this.a.f.a, fwvv0);
        gmde.e(countDownLatch0, huvd.e(), TimeUnit.MILLISECONDS);
        return (fvtd)atomicReference0.get();
    }
}

