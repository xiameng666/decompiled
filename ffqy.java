import java.io.IOException;

public final class ffqy extends ibsl implements ibtw {
    int a;
    final ffqz b;

    public ffqy(ffqz ffqz0, ibrl ibrl0) {
        this.b = ffqz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ffqy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ffqy(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
            }
            catch(IOException unused_ex) {
                ((ggtj)ffqz.a.j()).x("Unable to set status to featureStatusMap");
            }
            return ibom.a;
        }
        ibnx.b(object0);
        try {
            ffqx ffqx0 = new ffqx(this.b, null);
            this.a = 1;
            if(this.b.b.a(ffqx0, this) == object1) {
                return object1;
            }
        }
        catch(IOException unused_ex) {
            ((ggtj)ffqz.a.j()).x("Unable to set status to featureStatusMap");
        }
        return ibom.a;
    }
}

