import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class cbvd extends lh {
    public cbvd() {
        super(cbvb.a);
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0042, viewGroup0, false);  // layout:accounts_removal_account_item
        ibuq.e(view0, "inflate(...)");
        return new cbvc(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        cbvc cbvc0 = (cbvc)uq0;
        ibuq.f(cbvc0, "holder");
        Object object0 = this.c(v);
        ibuq.e(object0, "getItem(...)");
        cbsq cbsq0 = (cbsq)object0;
        ibuq.f(cbsq0, "account");
        cbvc0.t.setText(cbsq0.a);
        cbvc0.u.setText(cbsq0.e);
        String s = bapl.a("mo-cc-rp", cbsq0.c).toString();
        ibuq.e(s, "toString(...)");
        cbaw.a(cbvc0.v, s);
        View view0 = cbvc0.a;
        view0.setClickable(false);
        view0.setEnabled(true);
        cbvc0.t.setTextColor(cbvc0.w);
        cbvc0.u.setTextColor(cbvc0.x);
    }
}

