import android.content.Intent;
import com.google.android.gms.pay.GooglePaymentMethodId;

public final class dmww implements ibth {
    public final dmyx a;

    public dmww(dmyx dmyx0) {
        this.a = dmyx0;
    }

    @Override  // ibth
    public final Object a() {
        dmre dmre0 = new dmre();
        dmre0.d(this.a.y());
        dmre0.h(2);
        dmre0.j(new GooglePaymentMethodId[]{this.a.A()});
        Intent intent0 = dmre0.c();
        this.a.z().startActivity(intent0);
        return ibom.a;
    }
}

