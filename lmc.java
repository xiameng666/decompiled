import android.os.Bundle;

public final class lmc implements ibtw {
    public final Class a;
    public final hfc b;
    public final lmi c;
    public final Bundle d;
    public final ibts e;
    public final int f;
    public final int g;

    public lmc(Class class0, hfc hfc0, lmi lmi0, Bundle bundle0, ibts ibts0, int v, int v1) {
        this.a = class0;
        this.b = hfc0;
        this.c = lmi0;
        this.d = bundle0;
        this.e = ibts0;
        this.f = v;
        this.g = v1;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        lmf.a(this.a, this.b, this.c, this.d, this.e, ((goz)object0), gsc.a(this.f | 1), this.g);
        return ibom.a;
    }
}

