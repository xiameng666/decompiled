import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class eqbb implements Runnable {
    final eqbc a;

    public eqbb(eqbc eqbc0) {
        Objects.requireNonNull(eqbc0);
        this.a = eqbc0;
        super();
    }

    @Override
    public final void run() {
        Status status1;
        batl.e(this.a.b.c);
        this.a.b.b.t(2);
        eqlz.a(this.a.b.b, 6);
        eqik eqik0 = this.a.a;
        eqao eqao0 = this.a.b.d;
        if(!eqao0.s()) {
            eqao.a.f("No connection currently in progress.", new Object[0]);
            eqao.i(eqik0, new Status(10567));
            return;
        }
        Status status0 = new Status(8);
        try {
            status1 = erqf.b(eqao0.f.e()).e() ? new Status(0) : new Status(10557);
        }
        catch(Throwable throwable0) {
            eqao.i(eqik0, status0);
            throw throwable0;
        }
        eqao.i(eqik0, status1);
    }
}

