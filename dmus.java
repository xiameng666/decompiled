import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dmus implements View.OnClickListener {
    public final dmuy a;
    public final hkgs b;
    public final hjqa c;
    public final hjwp d;

    public dmus(dmuy dmuy0, hkgs hkgs0, hjqa hjqa0, hjwp hjwp0) {
        this.a = dmuy0;
        this.b = hkgs0;
        this.c = hjqa0;
        this.d = hjwp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ibuq.f(view0, "view");
        fhvv fhvv0 = fhvv.d();
        this.a.h.a(fhvv0, view0);
        this.a.e.b(this.b);
        Intent intent0 = frxe.a(view0.getContext(), this.c.e, this.d.c, null, this.d.d);
        ibuq.e(intent0, "getAppIntent(...)");
        if(ibuq.m(this.c.e, "com.google.android.apps.nbu.paisa.user")) {
            intent0.setFlags(0x4000000);
            intent0.setPackage("com.google.android.apps.nbu.paisa.user");
        }
        view0.getContext().startActivity(intent0);
    }
}

