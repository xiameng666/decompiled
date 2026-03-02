import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dmup implements View.OnClickListener {
    public final dmuy a;
    public final hkgs b;

    public dmup(dmuy dmuy0, hkgs hkgs0) {
        this.a = dmuy0;
        this.b = hkgs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fhvv fhvv0 = fhvv.d();
        this.a.h.a(fhvv0, view0);
        this.a.e.d(hami.C);
        Intent intent0 = edpi.a(this.b.d);
        this.a.a.startActivity(intent0);
    }
}

