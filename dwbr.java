import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;

public final class dwbr implements View.OnClickListener {
    public final dwby a;

    public dwbr(dwby dwby0) {
        this.a = dwby0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dwby dwby0 = this.a;
        fhvw fhvw0 = dwby0.D();
        fhvv fhvv0 = fhvv.d();
        MaterialToolbar materialToolbar0 = dwby0.aq;
        if(materialToolbar0 == null) {
            ibuq.j("toolbar");
            materialToolbar0 = null;
        }
        fhvw0.a(fhvv0, materialToolbar0);
        dmqm dmqm0 = new dmqm();
        dmqm0.h(11);
        dwby0.startActivity(dmqm0.c().setFlags(0x4000000));
    }
}

