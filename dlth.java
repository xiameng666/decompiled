import java.io.IOException;

final class dlth extends ibsl implements ibtw {
    int a;
    final dlti b;
    private Object c;

    public dlth(dlti dlti0, ibrl ibrl0) {
        this.b = dlti0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlth)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dlth(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        Object object1 = ibrx.a;
        if(this.a != 0) {
            icck0 = (icck)this.c;
            try {
                ibnx.b(object0);
                goto label_15;
            }
            catch(IOException iOException0) {
                a.ae(dlti.a.j(), "failed to update Pix education protoDataStore.", iOException0);
                return ibom.a;
            }
        }
        ibnx.b(object0);
        icck icck1 = (icck)this.c;
        try {
            this.c = icck1;
            this.a = 1;
            dlor dlor0 = new dlor(this.b.d.b.a(this.b.c), null);
            Object object2 = icbd.a(this.b.d.a, dlor0, this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 != object1) {
                icck0 = icck1;
            label_15:
                ibuq.f(icck0, "<this>");
                this.b.b.b(icck0, new frxf[]{dltf.a});
                return ibom.a;
            }
            return object1;
        }
        catch(IOException iOException0) {
            a.ae(dlti.a.j(), "failed to update Pix education protoDataStore.", iOException0);
            return ibom.a;
        }
    }
}

