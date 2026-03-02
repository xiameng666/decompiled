import java.util.concurrent.CancellationException;

final class dfrm implements icih {
    final ibvd a;
    final icck b;
    final dfrr c;

    public dfrm(ibvd ibvd0, icck icck0, dfrr dfrr0) {
        this.a = ibvd0;
        this.b = icck0;
        this.c = dfrr0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        int v = ((Number)((ibns)object0).a).intValue();
        int v1 = ((Number)((ibns)object0).b).intValue();
        cunf cunf0 = dcvz.a;
        cunf0.b().h("Foreground service agent got visibility %s", new Integer(v));
        if(v == 3) {
            cunf0.b().p("ForegroundServiceAgent registering foreground surface.", new Object[0]);
            dfrl dfrl0 = new dfrl(this.c, v1, null);
            this.a.a = icbb.b(this.b, null, null, dfrl0, 3);
            return ibom.a;
        }
        iced iced0 = (iced)this.a.a;
        if(iced0 != null) {
            iced0.x(new CancellationException("Visibility is not everyone."));
        }
        return ibom.a;
    }
}

