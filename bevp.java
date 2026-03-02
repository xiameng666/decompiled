import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Locale;

public final class bevp extends tk {
    public gged_interceptors a;
    public final bfwi e;

    public bevp(bfwi bfwi0) {
        this.e = bfwi0;
    }

    @Override  // tk
    public final int b() {
        return this.a == null ? 0 : this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new bevo(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E087E, viewGroup0, false));  // layout:pwm_passkey_wizard_list_item
    }

    private static final void f(bevo bevo0, hhyo hhyo0, bedg bedg0) {
        String s = hhyo0.e;
        if(!gfta.c(s)) {
            bevo0.t.getContext();
            bevo0.t.a(s);
        }
        else if(bedg0.c.toLowerCase(Locale.US).startsWith("android://")) {
            bevo0.t.setImageResource(0x1080093);
        }
        else {
            bevo0.t.setImageResource(0x7F080CD1);  // drawable:quantum_ic_chrome_product_vd_theme_24
        }
        bevo0.u.setText(hhyo0.c);
        bevo0.u.setEllipsize(((hhyc.b(hhyo0.d) == null ? hhyc.a : hhyc.b(hhyo0.d)) == hhyc.b ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.END));
        bevo0.v.setText(bedg0.a);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        gftb.check(this.a);
        bevs bevs0 = (bevs)this.a.get(v);
        if((bevs0 instanceof bevr)) {
            bevp.f(((bevo)uq0), ((bevr)bevs0).b, ((bevr)bevs0).a);
            ((bevo)uq0).t.setAlpha(0.6f);
            ((bevo)uq0).u.setAlpha(0.6f);
            ((bevo)uq0).v.setAlpha(0.6f);
            ((bevo)uq0).w.setAlpha(0.6f);
            ((bevo)uq0).a.setOnClickListener(null);
            ((bevo)uq0).w.setOnClickListener(null);
            ((bevo)uq0).w.setImageResource(0x7F080804);  // drawable:ic_mtrl_checked_circle
            return;
        }
        if((this.a.get(v) instanceof bevq)) {
            bevp.f(((bevo)uq0), ((bevq)bevs0).b, ((bevq)bevs0).a);
            ((bevo)uq0).t.setAlpha(1.0f);
            ((bevo)uq0).u.setAlpha(1.0f);
            ((bevo)uq0).v.setAlpha(1.0f);
            ((bevo)uq0).w.setAlpha(1.0f);
            bevn bevn0 = new bevn(this, ((bevq)bevs0).c);
            ((bevo)uq0).a.setOnClickListener(bevn0);
            ((bevo)uq0).w.setOnClickListener(bevn0);
            ((bevo)uq0).w.setImageResource(0x7F0805E3);  // drawable:gs_open_in_new_vd_theme_24
        }
    }
}

