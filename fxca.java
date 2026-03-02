import j..util.Comparator.-CC;
import j..util.List.-EL;
import java.util.Comparator;

public final class fxca implements glzn {
    public final int a;
    public final fxdb b;

    public fxca(fxdb fxdb0, int v) {
        this.b = fxdb0;
        this.a = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        fxdb fxdb0 = this.b;
        int v = this.a;
        if(v != 3 && v != 4) {
            fvuo fvuo0 = fxdb0.b;
            gged_interceptors gged0 = ((fvtd)object0).b(fxdb0.a.f().b(), fxdb0.a.mH());
            fvuo0.a.addAll(gged0);
            Comparator comparator0 = Comparator.-CC.comparingLong(new fvun());
            List.-EL.sort(fvuo0.a, comparator0);
            fvuo fvuo1 = fxdb0.b;
            fxdb0.b = new fvuo();
            return gmbu.i(fvuo1);
        }
        return glzd.f(heci.c().a(((fvtd)object0), false, false, new fwrd(), new fwzy(6)), new fxda(fxdb0, v), fxdb0.a.mJ().a);
    }
}

