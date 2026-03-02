import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public final class bvxd implements View.OnClickListener {
    public final bvxe a;
    public final hgmi b;
    public final boolean c;
    public final Button d;

    public bvxd(bvxe bvxe0, hgmi hgmi0, boolean z, Button button0) {
        this.a = bvxe0;
        this.b = hgmi0;
        this.c = z;
        this.d = button0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bvxe bvxe0 = this.a;
        hgmi hgmi0 = this.b;
        if((bvxe0.d.b & 2) != 0) {
            bvzg bvzg0 = (bvzg)bvxe0.j.a(bvzg.class);
            int v = hgmi0.f;
            String s = hgmi0.g;
            ibuq.e(s, "getFeatureName(...)");
            fhvv fhvv0 = bwbx.a(v, s, bvzg0.c);
            bvxe0.b.a(fhvv0, view0);
        }
        if(this.c) {
            bvxe0.a.a((hgmi0.d == null ? hgme.a : hgmi0.d), this.d);
        }
    }
}

