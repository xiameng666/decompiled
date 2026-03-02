import android.util.Log;
import j..util.Objects;

public final class felb implements Runnable {
    final felm a;

    public felb(felm felm0) {
        Objects.requireNonNull(felm0);
        this.a = felm0;
        super();
    }

    @Override
    public final void run() {
        felm felm0 = this.a;
        fejn fejn0 = felm0.m;
        if(fejn0 != null) {
            ffmm.a(fejn0);
            felm0.m = null;
        }
        feju feju0 = feka.a;
        if(feju0 != null) {
            ffmm.a(feju0);
            if(Log.isLoggable("BluetoothServerProvider", 4)) {
                Log.i("BluetoothServerProvider", "reset()");
            }
            feka.a = null;
        }
        femf femf0 = felm0.t;
        if(femf0 != null) {
            ffmm.a(femf0);
            felm0.t = null;
        }
        fees fees0 = felm0.n;
        if(fees0 != null) {
            fees0.n();
            felm0.n = null;
        }
    }
}

