import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import j..util.Objects;

final class dxuy implements TextWatcher {
    final View a;
    final dxva b;

    public dxuy(dxva dxva0, View view0) {
        this.a = view0;
        Objects.requireNonNull(dxva0);
        this.b = dxva0;
        super();
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        dxva dxva0 = this.b;
        View view0 = this.a;
        dxva0.B(view0);
        ((TextView)view0.findViewById(0x7F0B0252)).setText(dxva0.A());  // id:CurrentBalance
        long v = dxva0.y();
        if(Long.compare(v, 0L) == 0) {
            dxva0.al = false;
            dxva0.ai.O();
            return;
        }
        fteb fteb0 = dxva0.d.p == null ? fteb.a : dxva0.d.p;
        if((dxva0.d.b & 0x1000) != 0) {
            long v1 = fteb0.c;
            if(v1 > 0L && v > v1) {
                dxva0.al = false;
                dxva0.D(view0, dxva0.getString(0x7F152249, new Object[]{fscd.c(dxva0.E(v1))}));  // string:pay_top_up_amount_too_high_error "Added amount can\'t exceed %1$s"
                return;
            }
            long v2 = fteb0.d;
            if(v < v2) {
                dxva0.al = false;
                dxva0.D(view0, dxva0.getString(0x7F15224A, new Object[]{fscd.c(dxva0.E(v2))}));  // string:pay_top_up_amount_too_low_error "Added amount must be at least %1$s"
                return;
            }
        }
        long v3 = dxva0.d.t;
        if(v3 > 0L && dxva0.d.f + v > v3) {
            dxva0.al = false;
            dxva0.ai.O();
            gtlg gtlg0 = edok.a(dxva0.d.t, dxva0.d.g);
            dxva0.D(view0, dxva0.getString(0x7F152248, new Object[]{dxva0.d.l, fscd.c(gtlg0)}));  // string:pay_top_up_amount_max_error "Total %1$s balance can\'t exceed %2$s"
            return;
        }
        dxva0.al = true;
        dxva0.ai.P();
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }
}

