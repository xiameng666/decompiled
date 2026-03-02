import android.content.Context;
import com.google.android.gms.common.api.Status;

final class bugo extends ibsl implements ibtw {
    int a;
    final bugp b;
    final Context c;

    public bugo(bugp bugp0, Context context0, ibrl ibrl0) {
        this.b = bugp0;
        this.c = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bugo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bugo(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            this.b.a.a.add(this.b.c);
            Object object2 = this.b.a.b(this.c, this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        this.b.b.a(Status.b);
        return ibom.a;
    }
}

