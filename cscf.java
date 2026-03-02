import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class cscf implements View.OnClickListener {
    final cscg a;

    public cscf(cscg cscg0) {
        Objects.requireNonNull(cscg0);
        this.a = cscg0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        cscg cscg0 = this.a;
        if(cscg0.b.p()) {
            cscg0.b.l(hhct.ei);
            cscs cscs0 = new cscs();
            ca ca0 = new ca(cscg0.a.getSupportFragmentManager());
            ca0.j = 0x1003;
            ca0.C();
            ca0.z(0x7F0B0FCE, cscs0, "EsimPlanOffersFragment");  // id:container
            ca0.a();
            cscg0.a.getSupportFragmentManager().aq();
            return;
        }
        cscg0.b.i(cscg0.a, hhct.ei);
    }
}

