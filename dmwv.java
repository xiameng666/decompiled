import android.content.Intent;

public final class dmwv implements ibth {
    public final dmyx a;
    public final hknp b;

    public dmwv(dmyx dmyx0, hknp hknp0) {
        this.a = dmyx0;
        this.b = hknp0;
    }

    @Override  // ibth
    public final Object a() {
        hjqu hjqu0 = this.b.g == null ? hjqu.a : this.b.g;
        ibuq.e(hjqu0, "getGoogleTransactionId(...)");
        String s = hjqu0.c;
        String s1 = hjqu0.b;
        Intent intent0 = dlng.f(this.a.getContext(), s, s1);
        this.a.z().startActivity(intent0);
        return ibom.a;
    }
}

