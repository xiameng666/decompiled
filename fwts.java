import android.location.LocationListener;
import com.google.android.location.os.real.CallbackRunner.MyLocationListener.1;
import java.lang.ref.WeakReference;

public final class fwts {
    public final WeakReference a;
    public final int b;
    public final LocationListener c;

    public fwts(fwtu fwtu0, int v) {
        this.a = new WeakReference(fwtu0);
        this.b = v;
        this.c = new CallbackRunner.MyLocationListener.1(this);
    }
}

