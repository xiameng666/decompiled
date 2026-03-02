import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class eqbd implements Runnable {
    final eqbe a;

    public eqbd(eqbe eqbe0) {
        Objects.requireNonNull(eqbe0);
        this.a = eqbe0;
        super();
    }

    @Override
    public final void run() {
        Status status2;
        batl.e(this.a.b.c);
        this.a.b.b.t(2);
        eqlz.a(this.a.b.b, 7);
        baun baun0 = eqao.a;
        baun0.d("Disconnecting", new Object[0]);
        eqik eqik0 = this.a.a;
        eqao eqao0 = this.a.b.d;
        if(!eqao0.s()) {
            baun0.f("No connection in progress.", new Object[0]);
            eqao.j(eqik0, new Status(10567));
            return;
        }
        Status status0 = new Status(8);
        try {
            Status status1 = erqf.b(eqao0.f.b());
            if(status1.e()) {
                status2 = new Status(0);
            }
            else {
                status2 = status1.i == 10567 ? new Status(10567) : new Status(10557);
            }
        }
        catch(Throwable throwable0) {
            eqao0.r();
            eqao.j(eqik0, status0);
            throw throwable0;
        }
        eqao0.r();
        eqao.j(eqik0, status2);
    }
}

