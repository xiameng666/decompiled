import android.content.Intent;

public final class dnop implements ibth {
    public final dnor a;

    public dnop(dnor dnor0) {
        this.a = dnor0;
    }

    @Override  // ibth
    public final Object a() {
        dnor dnor0 = this.a;
        dnor0.u.d(hami.F);
        dxev dxev0 = dnor0.z;
        dxev dxev1 = null;
        if(dxev0 == null) {
            ibuq.j("paymentMethodData");
            dxev0 = null;
        }
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hjqn hjqn0 = hkhr0.e == null ? hjqn.a : hkhr0.e;
        ibuq.e(hjqn0, "getGooglePaymentMethodId(...)");
        dmqk dmqk0 = new dmqk();
        dmqk0.d(dnor0.v);
        dmqk0.i(hjqn0.b);
        dmqk0.h(hjqn0.c);
        Intent intent0 = dmqk0.c();
        dxev dxev2 = dnor0.z;
        if(dxev2 == null) {
            ibuq.j("paymentMethodData");
        }
        else {
            dxev1 = dxev2;
        }
        hkhr hkhr1 = dxev1.c == null ? hkhr.b : dxev1.c;
        ibuq.e(hkhr1, "getPaymentMethod(...)");
        intent0.setAction((fscr.a(hkhr1) ? "com.google.android.gms.pay.fops.details.VIEW_BANK_ACCOUNT" : "com.google.android.gms.pay.fops.VIEW_FOP"));
        ibuq.c(intent0);
        dnor0.w.startActivityForResult(intent0, 1200);
        return ibom.a;
    }
}

