import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import j..util.Objects;

final class eqav implements Runnable {
    final eqaw a;

    public eqav(eqaw eqaw0) {
        Objects.requireNonNull(eqaw0);
        this.a = eqaw0;
        super();
    }

    @Override
    public final void run() {
        Status status1;
        eqaw eqaw0 = this.a;
        batl.e(eqaw0.b.c);
        int v = 2;
        eqaw0.b.b.t(2);
        eqlz.a(eqaw0.b.b, 5);
        eqie eqie0 = eqaw0.e;
        batl.t(eqie0, "bootstrapListener should not be null.");
        eqik eqik0 = eqaw0.a;
        BootstrapConfigurations bootstrapConfigurations0 = eqaw0.d;
        eqao eqao0 = eqaw0.b.d;
        if(!eqao0.s()) {
            eqao.a.f("No connection established. Before bootstrapping, you should connect to the device", new Object[0]);
            eqao.g(eqik0, new Status(10567));
            return;
        }
        if(eqao0.g != null) {
            eqao.a.f("Bootstrap already in progress.", new Object[0]);
            eqao.g(eqik0, new Status(10561));
            return;
        }
        D2DDevice d2DDevice0 = eqaw0.c;
        if(d2DDevice0 != null) {
            batl.t(eqao0.j, "mTargetDevice should not be null!");
            if(!bata.b(d2DDevice0.d, eqao0.j.d)) {
                eqao.a.f("Device that should be bootstrapped does not match device we\'re currently connected to.", new Object[0]);
                eqao.g(eqik0, new Status(10568));
                return;
            }
        }
        Status status0 = new Status(8);
        try {
            eqao0.g = eqie0;
            D2DDevice d2DDevice1 = eqao0.j;
            if(d2DDevice1 != null) {
                v = d2DDevice1.b;
            }
            epzx epzx0 = ((eqaq)eqao0).k;
            if(epzx0 != null) {
                epzx0.p(bootstrapConfigurations0, v);
            }
            status1 = new Status(0);
        }
        catch(Throwable throwable0) {
            eqao.g(eqik0, status0);
            throw throwable0;
        }
        eqao.g(eqik0, status1);
    }
}

