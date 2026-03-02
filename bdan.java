import android.view.View.OnClickListener;
import android.view.View;

public final class bdan implements View.OnClickListener {
    public final bdau a;
    public final gqmd b;

    public bdan(bdau bdau0, gqmd gqmd0) {
        this.a = bdau0;
        this.b = gqmd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        hhyo hhyo0 = this.a.e.b;
        du du0 = this.a.f.d;
        fm fm0 = du0.getChildFragmentManager();
        if(fm0.h("PWMSharingFlowFragment") == null) {
            bfjv bfjv0 = (bfjv)new lso(du0).a(bfjv.class);
            ibuq.f(hhyo0, "groupBrandingInfo");
            ibuq.f(this.b, "group");
            bfjv0.g.e(gqtg.b);
            bfjv0.h = new bfjm(this.b, hhyo0);
            bfjv0.m.g(bfkc.a);
            bfjv0.n.g(bfjh.a);
            bfjv0.i = ibps.a;
            icbb.b(lsc.a(bfjv0), null, null, new bfjq(bfjv0, null), 3);
            bfjd bfjd0 = new bfjd();
            ca ca0 = new ca(fm0);
            ca0.z(0x7F0B201F, bfjd0, "PWMSharingFlowFragment");  // id:sharing_container
            ca0.w("PWMSharingFlowFragment");
            ca0.a();
        }
    }
}

