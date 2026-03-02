import android.content.Context;
import java.util.UUID;

final class bugq extends ibsl implements ibtw {
    int a;
    final bugr b;
    final Context c;
    final String d;

    public bugq(bugr bugr0, Context context0, String s, ibrl ibrl0) {
        this.b = bugr0;
        this.c = context0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bugq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bugq(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            UUID uUID0 = UUID.fromString(this.d);
            ibuq.e(uUID0, "fromString(...)");
            this.a = 1;
            if(this.b.a.c(this.c, uUID0, this.b.b.b, this.b.b.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

