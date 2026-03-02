import android.os.Build;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import j..util.Objects;

final class eqtc implements Runnable {
    final eqtd a;

    public eqtc(eqtd eqtd0) {
        Objects.requireNonNull(eqtd0);
        this.a = eqtd0;
        super();
    }

    @Override
    public final void run() {
        eqtd eqtd0 = this.a;
        eqfq eqfq0 = new eqfq(eqtd0.e);
        String s = Build.MODEL;
        boolean z = hygx.a.b().y();
        int v = eqtd0.a.a;
        if(v < 0) {
            throw new IllegalArgumentException("Must set flow type before building the DirectBuilder.");
        }
        BootstrapOptions bootstrapOptions0 = new BootstrapOptions();
        bootstrapOptions0.u(v);
        bootstrapOptions0.ak(0);
        bootstrapOptions0.s(s);
        bootstrapOptions0.an(false);
        bootstrapOptions0.r(z);
        bootstrapOptions0.w(0);
        bootstrapOptions0.v(azpm.b);
        bootstrapOptions0.al(-1L);
        bootstrapOptions0.au();
        eqtd0.d.c(eqfq0, bootstrapOptions0, eqtd0.b, eqtd0.c);
    }
}

