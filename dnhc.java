import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.GooglePaymentMethodId;

public final class dnhc implements View.OnClickListener {
    public final dnhi a;
    public final long b;

    public dnhc(dnhi dnhi0, long v) {
        this.a = dnhi0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dmre dmre0 = new dmre();
        dmre0.d(this.a.k);
        dmre0.h(2);
        dmre0.j(((GooglePaymentMethodId[])this.a.p.toArray(new GooglePaymentMethodId[0])));
        dmre0.k(this.b);
        Intent intent0 = dmre0.c();
        this.a.a.startActivity(intent0);
    }
}

