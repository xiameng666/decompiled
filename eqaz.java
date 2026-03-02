import android.os.Build.VERSION;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import j..util.Objects;

final class eqaz implements Runnable {
    final eqba a;

    public eqaz(eqba eqba0) {
        Objects.requireNonNull(eqba0);
        this.a = eqba0;
        super();
    }

    @Override
    public final void run() {
        Status status1;
        eqba eqba0 = this.a;
        batl.e(eqba0.b.c);
        eqba0.b.b.t(2);
        eqlz.a(eqba0.b.b, 4);
        D2DDevice d2DDevice0 = eqba0.c;
        batl.t(d2DDevice0, "device cannot be null.");
        eqih eqih0 = eqba0.e;
        batl.t(eqih0, "connectionListener cannot be null.");
        eqao eqao0 = eqba0.b.d;
        eqao0.h = eqih0;
        int v = d2DDevice0.b;
        String s = eqba0.d;
        if(v == 1) {
            eqao0.c.u(2);
        }
        else if(v == 2) {
            eqao0.c.u(4);
        }
        else {
            eqao.a.m(a.f(v, "Unsupported device protocol (", ") for logging device connection type!"), new Object[0]);
        }
        eqik eqik0 = eqba0.a;
        if(!eqao0.s()) {
            if(hyim.j()) {
                eqao0.e.d();
            }
            Status status0 = new Status(8);
            try {
                eqao0.j = d2DDevice0;
                if(d2DDevice0.b != 1 && d2DDevice0.b != 2) {
                    status1 = new Status(10560);
                }
                else {
                    eqao.a.d("Connecting to: " + d2DDevice0.c, new Object[0]);
                    eqao.a.j("Connecting using PIN: " + s, new Object[0]);
                    eqmj eqmj0 = eqao0.e(eqih0);
                    status0 = erqf.b(eqao0.f.d(d2DDevice0, eqmj0));
                    String s1 = d2DDevice0.b == 1 ? "NearbyBootstrap" : "NearbyConnections";
                    int v1 = Build.VERSION.SDK_INT;
                    ((frpe)eqao0.b.f.c.mr()).b(new Object[]{s1, v1, ((int)status0.i)});
                    status1 = status0;
                }
            }
            catch(Throwable throwable0) {
                if(!status0.e()) {
                    eqao.a.f("Connecting to %s failed %s", new Object[]{d2DDevice0.c, status0});
                    eqao0.c.c(status0.i);
                    eqao0.r();
                }
                eqao.h(eqik0, status0);
                throw throwable0;
            }
            if(!status1.e()) {
                eqao.a.f("Connecting to %s failed %s", new Object[]{d2DDevice0.c, status1});
                eqao0.c.c(status1.i);
                eqao0.r();
            }
            eqao.h(eqik0, status1);
            return;
        }
        eqao.a.f("Connection already in progress.", new Object[0]);
        eqao.h(eqik0, new Status(10566));
    }
}

