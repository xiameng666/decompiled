import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class eqez implements Runnable {
    final eqfa a;

    public eqez(eqfa eqfa0) {
        Objects.requireNonNull(eqfa0);
        this.a = eqfa0;
        super();
    }

    @Override
    public final void run() {
        this.a.b.a.E(2);
        eqmb.a(this.a.b.a, 8);
        eqeh eqeh0 = this.a.b.b;
        batl.s(this.a.a);
        eqiw eqiw0 = this.a.c;
        if(eqeh0.i && eqeh0.g != null) {
            try {
                eqdn eqdn0 = ((eqei)eqeh0).l;
                if(eqdn0 != null) {
                    batl.m(eqdn0.j, "Bootstrap needs to first be paused before it can be resumed.");
                    eqdn0.j = false;
                    eqdn0.u();
                }
            }
            finally {
                eqeh.i(eqiw0, new Status(0));
            }
            return;
        }
        eqeh.i(eqiw0, new Status(10552));
    }
}

