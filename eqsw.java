import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import j..util.Objects;

final class eqsw implements Runnable {
    final BootstrapConfigurations a;
    final eqsx b;

    public eqsw(eqsx eqsx0, BootstrapConfigurations bootstrapConfigurations0) {
        this.a = bootstrapConfigurations0;
        Objects.requireNonNull(eqsx0);
        this.b = eqsx0;
        super();
    }

    @Override
    public final void run() {
        eqcl eqcl0 = new eqcl(this.b.d);
        this.b.a.d(eqcl0, this.a, this.b.b, this.b.c);
    }
}

