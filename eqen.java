import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class eqen implements Runnable {
    final eqeo a;

    public eqen(eqeo eqeo0) {
        Objects.requireNonNull(eqeo0);
        this.a = eqeo0;
        super();
    }

    @Override
    public final void run() {
        this.a.a.a.E(2);
        eqmb.a(this.a.a.a, 12);
        eqeh eqeh0 = this.a.a.b;
        eqiw eqiw0 = this.a.b;
        if(eqeh0.i) {
            eqea eqea0 = eqeh0.g;
            if(eqea0 != null) {
                eqea0.a().z(new eqee(eqeh0, eqiw0));
                return;
            }
        }
        eqeh.e(eqiw0, new Status(10552));
    }
}

