import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import j..util.Objects;

final class eqbn implements Runnable {
    final eqbo a;

    public eqbn(eqbo eqbo0) {
        Objects.requireNonNull(eqbo0);
        this.a = eqbo0;
        super();
    }

    @Override
    public final void run() {
        batl.e(this.a.c.c);
        this.a.c.b.t(2);
        eqlz.a(this.a.c.b, 2);
        eqiq eqiq0 = this.a.b;
        batl.t(eqiq0, "scanListener is null.");
        eqik eqik0 = this.a.a;
        eqao eqao0 = this.a.c.d;
        if(eqao0.i == null) {
            eqao0.i = new eqcs(eqiq0);
            Status status0 = eqao0.d.a(false, false);
            if(!status0.e()) {
                eqao.a.d("Failed to initialize resources.", new Object[0]);
                eqao0.i.c(status0.i);
                eqao0.q();
                if(!hyig.d()) {
                    eqao0.o();
                }
                eqao.l(eqik0, status0);
                return;
            }
            eqao.a.d("Scanning for target devices.", new Object[0]);
            eqcr eqcr0 = eqao0.i;
            eqam.b.j("Starting scan via Nearby Connections.", new Object[0]);
            ((eqam)eqao0.f).h = eqcr0;
            cuwm cuwm0 = new cuwm();
            cuwm0.j(eqam.a);
            DiscoveryOptions discoveryOptions0 = cuwm0.a();
            String s = hyim.f();
            Status status1 = erqf.b(((eqam)eqao0.f).c.o(s, ((eqam)eqao0.f).w, discoveryOptions0));
            if(!status1.e()) {
                status1 = new Status(10557);
            }
            eqao.l(eqik0, status1);
            return;
        }
        eqao.a.f("Source device is already scanning.", new Object[0]);
        eqao.l(eqik0, new Status(10558));
    }
}

