import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.GooglePaymentMethodId;

public final class dmun implements View.OnClickListener {
    public final dmuy a;

    public dmun(dmuy dmuy0) {
        this.a = dmuy0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fhvv fhvv0 = fhvv.d();
        this.a.h.a(fhvv0, view0);
        dmre dmre0 = new dmre();
        dmre0.d(this.a.f);
        dmre0.h(2);
        dmre0.j(((GooglePaymentMethodId[])this.a.n.toArray(new GooglePaymentMethodId[0])));
        Intent intent0 = dmre0.c();
        this.a.a.startActivity(intent0);
    }
}

