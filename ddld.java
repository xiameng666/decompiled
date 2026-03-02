import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation.6;

public final class ddld implements Runnable {
    public final FastInitiation.6 a;
    public final ScanResult b;
    public final dcbn c;

    public ddld(FastInitiation.6 fastInitiation$60, dcbn dcbn0, ScanResult scanResult0) {
        this.a = fastInitiation$60;
        this.c = dcbn0;
        this.b = scanResult0;
    }

    @Override
    public final void run() {
        this.a.a.o(this.c, this.b);
    }
}

