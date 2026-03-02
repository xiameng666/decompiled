import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dvsd implements evqc {
    public final dvsn a;
    public final ValuableGroup b;
    public final gged_interceptors c;
    public final Integer d;

    public dvsd(dvsn dvsn0, ValuableGroup valuableGroup0, gged_interceptors gged0, Integer integer0) {
        this.a = dvsn0;
        this.b = valuableGroup0;
        this.c = gged0;
        this.d = integer0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(dvsn.a.i(), "Failed to fetch valuables from database after delete, updating current view instead.", exception0);
        ValuableGroup valuableGroup0 = new ValuableGroup(gged_interceptors.h(gggq.d(this.b.a, new dvrw(this.c))));
        gfsx gfsx0 = gfsx.m(this.d);
        this.a.N(valuableGroup0, gfsx0);
        this.a.E();
    }
}

