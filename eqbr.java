import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import j..util.Objects;

final class eqbr implements Runnable {
    final eqbs a;

    public eqbr(eqbs eqbs0) {
        Objects.requireNonNull(eqbs0);
        this.a = eqbs0;
        super();
    }

    @Override
    public final void run() {
        Status status1;
        batl.e(this.a.b.c);
        this.a.b.b.t(2);
        eqlz.a(this.a.b.b, 9);
        eqik eqik0 = this.a.a;
        BootstrapConfigurations bootstrapConfigurations0 = this.a.c;
        eqao eqao0 = this.a.b.d;
        if(!eqao0.s()) {
            eqao.a.f("No connection established. Before bootstrapping, you should connect to the device", new Object[0]);
            eqao.g(eqik0, new Status(10567));
            return;
        }
        Status status0 = new Status(8);
        try {
            epzx epzx0 = ((eqaq)eqao0).k;
            if(epzx0 != null) {
                epzx.f.j("Updating BootstrapConfigurations.", new Object[0]);
                batl.t(bootstrapConfigurations0, "bootstrapConfigurations cannot be null.");
                epzx0.j = bootstrapConfigurations0;
                epzx0.r(bootstrapConfigurations0, true);
            }
            status1 = new Status(0);
        }
        catch(Throwable throwable0) {
            eqao.n(eqik0, status0);
            throw throwable0;
        }
        eqao.n(eqik0, status1);
    }
}

