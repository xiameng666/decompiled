import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;

public final class equf implements azys {
    public final equi a;
    public final String b;
    public final String c;
    public final Bundle d;

    public equf(equi equi0, String s, Bundle bundle0) {
        this.a = equi0;
        this.b = s;
        this.c = "com.google.android.gms.esim.START_SOURCE_D2D_SERVICE";
        this.d = bundle0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        eqwa eqwa0 = (eqwa)object0;
        equg equg0 = new equg(this.a, ((evqp)object1));
        eqvz eqvz0 = (eqvz)eqwa0.H();
        ApiMetadata apiMetadata0 = cclr.a(eqwa0.r);
        eqvz0.a(equg0, this.b, this.c, this.d, apiMetadata0);
    }
}

