import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.GooglePaymentMethodId;

public final class dnio implements View.OnClickListener {
    public final dnjs a;

    public dnio(dnjs dnjs0) {
        this.a = dnjs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dmre dmre0 = new dmre();
        dnjs dnjs0 = this.a;
        dmre0.d(dnjs0.l);
        dmre0.h(2);
        dmre0.j(((GooglePaymentMethodId[])dnjs0.x.toArray(new GooglePaymentMethodId[0])));
        dxev dxev0 = dnjs0.p;
        long v = 0L;
        if(dxev0 != null) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            if(hkhr0 != null) {
                hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                if(hjwt0 != null) {
                    hjwv hjwv0 = hjwt0.c == null ? hjwv.a : hjwt0.c;
                    if(hjwv0 != null) {
                        v = hjwv0.b;
                    }
                }
            }
        }
        dmre0.k(v);
        Intent intent0 = dmre0.c();
        dnjs0.e.startActivity(intent0);
    }
}

