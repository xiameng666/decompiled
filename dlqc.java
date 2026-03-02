import java.io.IOException;

final class dlqc extends ibsl implements ibtw {
    int a;
    final dlqf b;
    final dlow c;

    public dlqc(dlqf dlqf0, dlow dlow0, ibrl ibrl0) {
        this.b = dlqf0;
        this.c = dlow0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlqc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlqc(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                this.a = 1;
                object0 = this.b.g.a(this.b.f, this);
                if(object0 == object1) {
                    return object1;
                }
            label_9:
                if(object0 != dxgb.b) {
                    icck icck0 = lsc.a(this.b);
                    this.b.c(icck0, new frxf[]{dlpv.a});
                    return ibom.a;
                }
                icbb.b(lsc.a(this.b), null, null, new dlqb(this.b, this.c, null), 3);
            }
            catch(IOException iOException0) {
                a.ae(dlqf.a.j(), "failed to fetch Pix education protoDataStore.", iOException0);
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(IOException iOException0) {
                a.ae(dlqf.a.j(), "failed to fetch Pix education protoDataStore.", iOException0);
                return ibom.a;
            }
        }
        goto label_9;
    }
}

