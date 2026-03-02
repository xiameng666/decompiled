import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class fvfs {
    public final fvfr a;
    public final fvfr b;
    public final List c;

    public fvfs(fvfr fvfr0, fvfr fvfr1, List list0) {
        this.a = fvfr0;
        this.b = fvfr1;
        this.c = list0;
    }

    public static fvfs a(gxqj gxqj0) {
        if(((gxqj0.c == null ? gxsb.a : gxqj0.c).b & 1) != 0 && ((gxqj0.c == null ? gxsb.a : gxqj0.c).b & 2) != 0) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: gxqj0.d) {
                gxqh gxqh0 = ((gxrp)object0).b;
                if(gxqh0 == null) {
                    gxqh0 = gxqh.a;
                }
                arrayList0.add(fvfr.b(gxqh0));
            }
            gxsb gxsb0 = gxqj0.c == null ? gxsb.a : gxqj0.c;
            fvfr fvfr0 = fvfr.b((gxsb0.c == null ? gxqh.a : gxsb0.c));
            gxsb gxsb1 = gxqj0.c == null ? gxsb.a : gxqj0.c;
            return new fvfs(fvfr0, fvfr.b((gxsb1.d == null ? gxqh.a : gxsb1.d)), arrayList0);
        }
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return (object0 instanceof fvfs) ? this.a.equals(((fvfs)object0).a) && this.b.equals(((fvfs)object0).b) && this.c.equals(((fvfs)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}

