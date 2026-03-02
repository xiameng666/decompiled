import com.google.android.gms.pay.GetWearClosedLoopCardsRequest;
import j..util.Objects;

final class dxrq implements dpue {
    final gtum a;
    final dxrr b;

    public dxrq(dxrr dxrr0, gtum gtum0) {
        this.a = gtum0;
        Objects.requireNonNull(dxrr0);
        this.b = dxrr0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        dxrr dxrr0 = this.b;
        if(dxrr0.aw()) {
            return;
        }
        dxrr0.U();
        dxrr0.T();
        dqjt dqjt0 = dxrr0.aA;
        dqjs dqjs0 = new dqjs();
        dqjs0.a(0x3FE);
        dqjs0.b = gfsx.m(ftqe.a(((MessageLite)this.a)));
        dqjt0.b(dpui0, dqjs0);
    }

    @Override  // dpug
    public final void b(Object object0) {
        gtuo gtuo0 = (gtuo)object0;
        dxrr dxrr0 = this.b;
        if(dxrr0.aw()) {
            return;
        }
        if(dxrr0.aa()) {
            azts azts0 = dxrr0.aP;
            GetWearClosedLoopCardsRequest getWearClosedLoopCardsRequest0 = new GetWearClosedLoopCardsRequest();
            getWearClosedLoopCardsRequest0.b = 2;
            getWearClosedLoopCardsRequest0.a = dxrr0.au;
            getWearClosedLoopCardsRequest0.c = dxrr0.aC;
            getWearClosedLoopCardsRequest0.d = dxrr0.aB;
            evql evql0 = azts0.aV(getWearClosedLoopCardsRequest0);
            xob xob0 = dxrr0.an();
            gftb.check(xob0);
            evql0.x(xob0, new dxrk(dxrr0));
            xob xob1 = dxrr0.an();
            gftb.check(xob1);
            evql0.u(xob1, new dxrl(dxrr0));
            return;
        }
        evql evql1 = dxrr0.aP.ax(dxrr0.au);
        xob xob2 = dxrr0.an();
        gftb.check(xob2);
        evql1.x(xob2, new dxrk(dxrr0));
        xob xob3 = dxrr0.an();
        gftb.check(xob3);
        evql1.u(xob3, new dxrl(dxrr0));
    }
}

