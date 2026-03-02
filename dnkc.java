import android.content.Intent;

public final class dnkc implements ibth {
    public final dnkl a;
    public final dxev b;

    public dnkc(dnkl dnkl0, dxev dxev0) {
        this.a = dnkl0;
        this.b = dxev0;
    }

    @Override  // ibth
    public final Object a() {
        icck icck0 = lsc.a(this.a);
        frxf[] arr_frxf = new frxf[1];
        hkhr hkhr0 = this.b.c == null ? hkhr.b : this.b.c;
        ibuq.e(hkhr0, "getPaymentMethod(...)");
        dmqj dmqj0 = new dmqj();
        dmqj0.d(this.a.d);
        dmqj0.i((hkhr0.e == null ? hjqn.a : hkhr0.e).b);
        dmqj0.h((hkhr0.e == null ? hjqn.a : hkhr0.e).c);
        Intent intent0 = dmqj0.c();
        ibuq.e(intent0, "build(...)");
        arr_frxf[0] = new dncj(intent0);
        this.a.b(icck0, arr_frxf);
        return ibom.a;
    }
}

