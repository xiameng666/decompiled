import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

final class cbpz extends lh {
    public final ibts e;

    public cbpz(ibts ibts0) {
        super(cbpy.a);
        this.e = ibts0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E004A, viewGroup0, false);  // layout:action_item
        ibuq.c(view0);
        return new cbpx(this, view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(((cbpx)uq0), "holder");
        cbpv cbpv0 = (cbpv)this.c(v);
        ibuq.c(cbpv0);
        ibuq.f(cbpv0, "action");
        if(cbpv0.ordinal() != 0) {
            throw new ibnq();
        }
        ((cbpx)uq0).t.setText(0x7F1509BC);  // string:create_child_account "Create account for child"
        ((cbpx)uq0).u.setImageResource(0x7F080AE0);  // drawable:quantum_gm_ic_account_circle_vd_theme_24
        ((cbpx)uq0).a.setOnClickListener(new cbpw(((cbpx)uq0).v, cbpv0));
    }
}

