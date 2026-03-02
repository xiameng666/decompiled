import android.content.Context;
import android.os.Build.VERSION;
import android.uwb.UwbManager.AdapterStateCallback;
import android.uwb.UwbManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class kdj {
    public int a;
    public final UwbManager b;
    public final kde c;
    public int d;
    public final boolean e;
    public final ExecutorService f;
    public final UwbManager.AdapterStateCallback g;
    private final boolean h;

    public kdj(Context context0, kde kde0) {
        this.a = 0;
        this.d = 0;
        ExecutorService executorService0 = Executors.newSingleThreadExecutor();
        this.f = executorService0;
        boolean z = context0.getPackageManager().hasSystemFeature("android.hardware.uwb");
        this.h = z;
        this.e = context0.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        this.c = kde0;
        kdi kdi0 = new kdi(this);
        this.g = kdi0;
        if(z) {
            UwbManager uwbManager0 = (UwbManager)context0.getSystemService(UwbManager.class);
            this.b = uwbManager0;
            if(uwbManager0 == null) {
                return;
            }
            if(Build.VERSION.SDK_INT >= 33) {
                this.a = uwbManager0.getAdapterState();
            }
            uwbManager0.registerAdapterStateCallback(executorService0, kdi0);
            return;
        }
        this.b = null;
    }

    public final boolean a() {
        return this.h && (this.a != 0 && this.a != 3);
    }
}

