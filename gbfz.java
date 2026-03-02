import android.database.SQLException;

public final class gbfz extends ibsl implements ibtw {
    int a;
    final gbga b;
    final ibtw c;

    public gbfz(gbga gbga0, ibtw ibtw0, ibrl ibrl0) {
        this.b = gbga0;
        this.c = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbfz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbfz(this.b, this.c, ibrl0);
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
        try {
            this.a = 1;
            if(this.c.a(this.b.b, this) == object1) {
                return object1;
            }
        }
        catch(SQLException unused_ex) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

