import android.view.View;
import com.google.android.gms.pay.pass.common.template.closedloop.ClosedLoopCardTemplate;

public final class dxrp implements dqkq {
    public final dxrr a;

    public dxrp(dxrr dxrr0) {
        this.a = dxrr0;
    }

    @Override  // dqkq
    public final void a(Object object0) {
        fsyk fsyk0 = ((dqio)object0).a;
        gtum gtum0 = ((dqio)object0).b;
        hjwt hjwt0 = ((dqio)object0).c;
        hjqn hjqn0 = ((dqio)object0).d;
        dxrr dxrr0 = this.a;
        dxrr0.aO = fsyk0;
        if(dxrr0.aL == null) {
            dxrr0.aL = hjqn0;
        }
        dxrr0.aI = gtum0;
        dxrr0.aJ = dxrr0.y(fsyk0, gtum0);
        dxrr0.aM = (fsyk0.e == null ? gtkg.a : fsyk0.e).p;
        dxrr0.I();
        View view0 = dxrr0.aG;
        if(view0 != null) {
            view0.setVisibility((dxrr0.ab() ? 8 : 0));
            ClosedLoopCardTemplate closedLoopCardTemplate0 = (ClosedLoopCardTemplate)dxrr0.aG.findViewById(0x7F0B01EA);  // id:ClosedLoopCardTemplate
            closedLoopCardTemplate0.k(dxrr0);
            gtkg gtkg0 = fsyk0.e == null ? gtkg.a : fsyk0.e;
            gumi gumi0 = gtkg0.i == null ? gumi.a : gtkg0.i;
            gtkg gtkg1 = fsyk0.e == null ? gtkg.a : fsyk0.e;
            gumi gumi1 = gtkg1.i == null ? gumi.a : gtkg1.i;
            closedLoopCardTemplate0.x((gumi0.e == null ? gucl.a : gumi0.e), (gumi1.c == null ? gubi.a : gumi1.c), dxrr0.aD, dxrr0.aE, gfqx.a, false);
        }
        dxrr0.aK = hjwt0;
        dxrr0.D();
    }
}

