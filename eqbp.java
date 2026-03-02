import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class eqbp implements Runnable {
    final eqbq a;

    public eqbp(eqbq eqbq0) {
        Objects.requireNonNull(eqbq0);
        this.a = eqbq0;
        super();
    }

    @Override
    public final void run() {
        Status status1;
        batl.e(this.a.b.c);
        this.a.b.b.t(2);
        eqlz.a(this.a.b.b, 3);
        baun baun0 = eqao.a;
        baun0.d("Stopping scan for target devices.", new Object[0]);
        eqik eqik0 = this.a.a;
        eqao eqao0 = this.a.b.d;
        if(eqao0.i == null) {
            baun0.f("Source device is not scanning.", new Object[0]);
            eqao.m(eqik0, new Status(0x293F));
            return;
        }
        Status status0 = new Status(8);
        try {
            eqam.b.j("Stopping scan.", new Object[0]);
            ((eqam)eqao0.f).k();
            ((eqam)eqao0.f).n.clear();
            status1 = erqf.b(evrg.d(null)).e() ? new Status(0) : new Status(10557);
        }
        catch(Throwable throwable0) {
            eqao.m(eqik0, status0);
            eqao0.q();
            throw throwable0;
        }
        eqao.m(eqik0, status1);
        eqao0.q();
    }
}

