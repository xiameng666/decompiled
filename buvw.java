import android.os.Bundle;

public final class buvw extends ibsl implements ibts {
    final Bundle a;

    public buvw(Bundle bundle0, ibrl ibrl0) {
        this.a = bundle0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new buvw(this.a, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        int v = (int)htvb.a.c().a();
        this.a.putInt("alert_value", v);
        return ibom.a;
    }
}

