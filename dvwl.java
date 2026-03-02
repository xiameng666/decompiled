import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dvwl implements evqc {
    public final dvxj a;
    public final ValuableGroup b;
    public final gged_interceptors c;
    public final Integer d;

    public dvwl(dvxj dvxj0, ValuableGroup valuableGroup0, gged_interceptors gged0, Integer integer0) {
        this.a = dvxj0;
        this.b = valuableGroup0;
        this.c = gged0;
        this.d = integer0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(dvxj.a.i(), "Failed to fetch valuables from database after delete, updating current view instead.", exception0);
        ValuableGroup valuableGroup0 = new ValuableGroup(gged_interceptors.h(gggq.d(this.b.a, new dvxc(this.c))));
        gfsx gfsx0 = gfsx.m(this.d);
        this.a.V(valuableGroup0, gfsx0);
        this.a.I();
    }
}

