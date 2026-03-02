import java.util.concurrent.CancellationException;

final class rxi extends ibsl implements ibtw {
    int a;
    final ibtw b;
    final String c;

    public rxi(ibtw ibtw0, String s, ibrl ibrl0) {
        this.b = ibtw0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rxi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rxi(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
                return ibom.a;
            }
            catch(Throwable throwable0) {
                goto label_9;
            }
        }
        ibnx.b(object0);
        try {
            this.a = 1;
            return icfh.a(this.b, this) == object1 ? object1 : ibom.a;
        }
        catch(Throwable throwable0) {
        label_9:
            if((throwable0 instanceof CancellationException)) {
                throw throwable0;
            }
            sct.f("OTMServiceBinder", "Supervised execution has failed: " + this.c, throwable0);
            return ibom.a;
        }
        return object1;
    }
}

