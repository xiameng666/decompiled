import android.database.SQLException;

final class gbfp extends ibsl implements ibtw {
    int a;
    final gbfq b;
    final ibtw c;

    public gbfp(gbfq gbfq0, ibtw ibtw0, ibrl ibrl0) {
        this.b = gbfq0;
        this.c = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbfp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbfp(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        boolean z = true;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
                return Boolean.valueOf(true);
            }
            catch(SQLException unused_ex) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        ibnx.b(object0);
        gbfq gbfq0 = this.b;
        if(gbfq0.b) {
            try {
                this.a = 1;
                if(this.c.a(gbfq0.c, this) == object1) {
                    return object1;
                }
            }
            catch(SQLException unused_ex) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.valueOf(z);
    }
}

