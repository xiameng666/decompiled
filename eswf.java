import android.content.Context;
import com.google.android.gms.tapandpay.hce.observemode.ClosedLoopCardsStateMonitor;

public final class eswf extends ibsl implements ibtw {
    int a;
    final ClosedLoopCardsStateMonitor b;
    final Context c;

    public eswf(ClosedLoopCardsStateMonitor closedLoopCardsStateMonitor0, Context context0, ibrl ibrl0) {
        this.b = closedLoopCardsStateMonitor0;
        this.c = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eswf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eswf(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(eswo.a.g(this.b.d, this) == object1) {
                return object1;
            }
        }
        boolean z = this.b.c.c();
        eswo.d(this.c, z);
        eswo.e(this.b.c.a());
        return ibom.a;
    }
}

