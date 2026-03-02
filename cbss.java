import android.content.Context;
import android.net.ConnectivityManager;
import java.util.Objects;

final class cbss extends ibsl implements ibtw {
    int a;
    final cbte b;
    final Context c;

    public cbss(cbte cbte0, Context context0, ibrl ibrl0) {
        this.b = cbte0;
        this.c = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbss)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbss(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            String s = this.b.k();
            this.a = 1;
            object0 = this.b.d.b(this.c, s, this);
            if(object0 == object1) {
                return object1;
            }
        }
        cbte cbte0 = this.b;
        if(((cbpg)object0) == cbpg.a) {
            return cbuy.b;
        }
        Object object2 = cbte0.a().getSystemService("connectivity");
        ibuq.d(object2, "null cannot be cast to non-null type android.net.ConnectivityManager");
        if(((ConnectivityManager)object2).getActiveNetwork() != null) {
            switch(((cbpg)object0).ordinal()) {
                case 1: {
                    return cbuy.d;
                }
                case 2: {
                    return cbuy.f;
                }
                default: {
                    Objects.toString(((cbpg)object0));
                    throw new IllegalArgumentException("Unknown state: " + ((cbpg)object0));
                }
            }
        }
        return cbuy.e;
    }
}

